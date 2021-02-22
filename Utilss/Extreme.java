package Utilss;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import java.security.cert.X509Certificate;

import java.util.Base64;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

import org.apache.http.HttpHost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import org.json.JSONObject;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.eclipse.rap.rwt.internal.util.HTTP;

import org.json.JSONString;

import app.resources.HttpComponentsClientHttpRequestFactoryBasicAuth;
import cronapi.CronapiMetaData;
import cronapi.CronapiMetaData.ObjectType;
import cronapi.ParamMetaData;
import cronapi.Var;

//import static org.junit.Assert.assertEquals;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
//import org.junit.Test;


/**
 * New functions for system ...
 * 
 * @author Diana Arcanjo
 * @version 1.0
 * @since 2019-07-24
 *
 */
 
@CronapiMetaData(categoryName = "Extreme") 
public class Extreme {

	@CronapiMetaData(type = "function", name = "Download PDF From URL Authentication", nameTags = {
			"Auth Basic" }, description = "Requisição PDF", returnType = ObjectType.JSON)

	public static final Var downlaodPDF(
		@ParamMetaData(type = ObjectType.STRING, description = "Caminho requisição") Var url, 
		@ParamMetaData(type = ObjectType.STRING, description = "Nome de usuário") Var username,		
		@ParamMetaData(type = ObjectType.STRING, description = "Senha de usuário") Var password,
		@ParamMetaData(type = ObjectType.STRING, description = "Nome PDF (por padrão colocar o codigo do aluno)") Var codAluno)
		throws Exception {


		String urlResource = Var.valueOf(url).toString();
		String userResource = Var.valueOf(username).toString();
		String passResource = Var.valueOf(password).toString();
		String codigoAluno = Var.valueOf(codAluno).toString();		
		
		String bucketName = CommonConstants.BUCKET_NAME;
	    String objectName = "Contratos/Contrato_" + codigoAluno + ".pdf";
		

		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
	
		HttpHost host = HttpHost.create(urlResource);

		final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
		
    	RestTemplate restTemplate = new RestTemplate(requestFactory);
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(userResource, passResource));
			
		AWSCredentials credentials = new BasicAWSCredentials(CommonConstants.ACCESS_KEY_ID, CommonConstants.ACCESS_SEC_KEY);

		
		try {			
			((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);
			ResponseEntity<byte[]> response = restTemplate.getForEntity(urlResource, byte[].class);				
			byte[] content = response.getBody();
			InputStream stream = new ByteArrayInputStream(content);
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentLength(content.length);
			meta.setContentType("contrato/pdf");

			AmazonS3 s3client = AmazonS3ClientBuilder
				  .standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .withRegion(Regions.US_EAST_1)
				  .build();

			s3client.putObject(new PutObjectRequest(bucketName, objectName, stream, meta));

	        System.out.println("Arquivo transferido para o S3 Amazon"); 			
				
			return Var.valueOf(response.getBody());			
				
		}catch(AmazonServiceException e) {
            // The call was transmitted successfully, but Amazon S3 couldn't process 
            System.out.println(e);
            e.printStackTrace();
        }         

		return Var.valueOf("OK");		

	}

	// REQUICAO GET PARA TRATA ERRO 500
	@CronapiMetaData(type = "function", name = "Basic Auth error 500", nameTags = {
			"Auth Basic" }, description = "Basic Auth error 500", returnType = ObjectType.JSON)
	
	public static final Var basicAuthRequisition(
		@ParamMetaData(type = ObjectType.STRING, description = "Caminho requisição") Var url, @ParamMetaData(type = ObjectType.STRING, description = "Nome de usuário") Var username,
		
		@ParamMetaData(type = ObjectType.STRING, description = "Senha de usuário") Var password)
		throws Exception {


		String urlResource = Var.valueOf(url).toString();
		String userResource = Var.valueOf(username).toString();
		String passResource = Var.valueOf(password).toString();
		

		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
	
		HttpHost host = HttpHost.create(urlResource);


		final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
		
    	RestTemplate restTemplate = new RestTemplate(requestFactory);
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(userResource, passResource)); 
		JSONObject obj = new JSONObject();
		obj.put("mensagemDetalhada", "Prezado aluno não é possivel realizar sua matricula por esse canal, por favor procure a secretaria.");	
		obj.put("contexto", "500");
		//System.out.println(obj);	

		
		try {
			((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);
			System.out.println(httpClient);
			ResponseEntity<String> response = restTemplate.getForEntity(urlResource, String.class);
									
			return Var.valueOf(response.getBody());
			
		} catch (HttpStatusCodeException  exception) {
			try {
				int statusCode = exception.getStatusCode().value();
				if(statusCode == 500){
					System.out.println("\n ************* Exception ************");
					System.out.println(exception);
					System.out.println("\n ************* FImException ************");
					System.out.println(statusCode);
					return Var.valueOf(obj.toString());
					}				
			} catch (Exception exc) {
				return Var.valueOf(exc);
			}
			return Var.valueOf("OK");			
		}			

		
	}

	@CronapiMetaData(type = "function", name = "Escrever PDF", nameTags = {
			"Auth Basic" }, description = "Escrever PDF", returnType = ObjectType.JSON)

	public static byte[] convertObjectToByteArray(Object object) {
        byte[] bytes = null;

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
			System.out.println("objecOut = " +  objectOutputStream.toString());
            objectOutputStream.flush();
            objectOutputStream.close();
            byteArrayOutputStream.close();
			System.out.println(" bytes = " + byteArrayOutputStream.toByteArray());
            bytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bytes;
    }

	@CronapiMetaData(type = "function", name = "POST Download PDF From URL Authentication", nameTags = {
			"Auth Basic" }, description = "Realizar um post de uma url autenticada e realizar o download de arquivo pdf", returnType = ObjectType.JSON)
	public static final Var RequisitionPostWithDownload(
		@ParamMetaData(type = ObjectType.STRING, description = "Caminho requisição") Var url, 
		@ParamMetaData(type = ObjectType.STRING, description = "Nome de usuário") Var username,		
		@ParamMetaData(type = ObjectType.STRING, description = "Senha de usuário") Var password,
		@ParamMetaData(type = ObjectType.STRING, description = "Nome PDF (por padrão colocar o codigo do aluno)") Var codAluno,
		@ParamMetaData(type = ObjectType.JSON, description = "Parâmetros (JSON)") Var parametros,
		@ParamMetaData(type = ObjectType.STRING, description = "Content-Type") Var type)
		throws Exception {

		
		String urlResource = Var.valueOf(url).toString();
		String userResource = Var.valueOf(username).toString();
		String passResource = Var.valueOf(password).toString();
		String codigoAluno = Var.valueOf(codAluno).toString();		
		
		String bucketName = CommonConstants.BUCKET_NAME;
	    String objectName = "ContratosRematricula/ContratoRematricula_" + codigoAluno + ".pdf";
		
		HttpHeaders headers = new HttpHeaders();

		if (Var.valueOf(type).toString().equalsIgnoreCase("JSON")) {
			headers.setContentType(MediaType.APPLICATION_JSON);
		} else if (Var.valueOf(type).toString().equalsIgnoreCase("x_www_form_urlencoded")) {
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		}

		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
	
		HttpHost host = HttpHost.create(urlResource);

		HttpEntity<String> request = new HttpEntity<String>(Var.valueOf(parametros).toString(),headers);

		final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
		
    	RestTemplate restTemplate = new RestTemplate(requestFactory);
		restTemplate.getMessageConverters()
        .add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(userResource, passResource));		

		AWSCredentials credentials = new BasicAWSCredentials(CommonConstants.ACCESS_KEY_ID, CommonConstants.ACCESS_SEC_KEY);

		
		try {
			
				((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);
				ResponseEntity<String> response = restTemplate.postForEntity(urlResource, request, String.class);	
				JSONObject jo = new JSONObject(response.getBody());
				String contratoPDF = jo.get("contratoPDF").toString(); 
				
				String contratoPDFDecoder = contratoPDF;			

					byte[] decoder = Base64.getDecoder().decode(contratoPDFDecoder);	
					InputStream stream = new ByteArrayInputStream(decoder);
					ObjectMetadata meta = new ObjectMetadata();
					meta.setContentLength(decoder.length);
					meta.setContentType("pdf/pdf");			

					AmazonS3 s3client = AmazonS3ClientBuilder
					  .standard()
					  .withCredentials(new AWSStaticCredentialsProvider(credentials))
					  .withRegion(Regions.US_EAST_1)
					  .build();

					s3client.putObject(new PutObjectRequest(bucketName, objectName, stream, meta));

	        	System.out.println("Arquivo transferido para o S3 Amazon"); 		

				return Var.valueOf(response.getBody());							
			
		} catch (Exception e) {
			try {
				((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);						
				ResponseEntity<String> response = restTemplate.postForEntity(urlResource, request, String.class);	
				return Var.valueOf(response.getBody());
			} catch (Exception exc) {
				return Var.valueOf(exc);
			}
	
		}      

	}

	// REQUIcAO GET PARA TRATA ERRO 500 2
    @CronapiMetaData(type = "function", name = "Basic Auth error 500 Rematricula", nameTags = {
            "Auth Basic" }, description = "Basic Auth error 500", returnType = ObjectType.JSON)
    
    public static final Var basicAuthRequisition500(
        @ParamMetaData(type = ObjectType.STRING, description = "Caminho requisição") Var url, @ParamMetaData(type = ObjectType.STRING, description = "Nome de usuário") Var username,
        
        @ParamMetaData(type = ObjectType.STRING, description = "Senha de usuário") Var password)
        throws Exception {

        String urlResource = Var.valueOf(url).toString();
        String userResource = Var.valueOf(username).toString();
        String passResource = Var.valueOf(password).toString();
        

        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
    
        HttpHost host = HttpHost.create(urlResource);

        final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
        
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(userResource, passResource)); 
        
        try {
            ((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);
            ResponseEntity<String> response = restTemplate.getForEntity(urlResource, String.class);     

            return Var.valueOf(response.getBody());
            
        } catch (HttpStatusCodeException  exception) {
             if (exception.getStatusCode() ==  HttpStatus.INTERNAL_SERVER_ERROR) {

                String responseString = exception.getResponseBodyAsString();
                return Var.valueOf(responseString);
          } 
                    
        }   
            return Var.valueOf("OK");
        
    }

	// FUNÇÃO PARA REQUISIÇÕES POST JSON COM SESSION ID E VALIDAÇĀO DO RETORNO
	@CronapiMetaData(type = "function", name = "Requisition POST Form Urlencoded", nameTags = {
			"Auth Basic" }, description = "Requisition POST", returnType = ObjectType.JSON)
	public static final String requisitionPostValidation(
		@ParamMetaData(type = ObjectType.STRING, description = "Url ") Var inputUrl,
		@ParamMetaData(type = ObjectType.STRING, description = "Key") Var inputKey,
		@ParamMetaData(type = ObjectType.STRING, description = "Value") Var inputValue,
		@ParamMetaData(type = ObjectType.STRING, description = "Params ") Var inputParams)
		
		throws Exception {

		String urlResource = Var.valueOf(inputUrl).toString();
		String key = Var.valueOf(inputKey).toString();
		String value = Var.valueOf(inputValue).toString();
		String paramans = Var.valueOf(inputParams).toString();
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();


		try {

			HttpPost request = new HttpPost(urlResource);
			StringEntity params = new StringEntity(paramans);
			request.addHeader("content-type", "application/json");
			request.setHeader(key, value);
			request.setEntity(params);
 			HttpResponse response = httpClient.execute(request);
			String contentReturn = EntityUtils.toString(response.getEntity(), HTTP.CHARSET_UTF_8);

			return Var.valueOf(contentReturn).toString();


   		 }catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } 

		return null;	

	}

	@CronapiMetaData(type = "function", name = "Requisição GET Basic Auth", nameTags = {
			"Auth Basic" }, description = "Função para fazer requisição GET com Basic Auth", returnType = ObjectType.JSON)
	
	public static final Var GetRequisition(
		@ParamMetaData(type = ObjectType.STRING, description = "Caminho requisição") Var url, @ParamMetaData(type = ObjectType.STRING, description = "Nome de usuário") Var username,
		
		@ParamMetaData(type = ObjectType.STRING, description = "Senha de usuário") Var password)
		throws Exception {


		String urlResource = Var.valueOf(url).toString();
		String userResource = Var.valueOf(username).toString();
		String passResource = Var.valueOf(password).toString();

		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
	
		HttpHost host = HttpHost.create(urlResource);


		final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
		
    	RestTemplate restTemplate = new RestTemplate(requestFactory);
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(userResource, passResource)); 					

		
		try {

			((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);	
			ResponseEntity<String> response = restTemplate.getForEntity(urlResource, String.class);
			
			return Var.valueOf(response.getBody());
			
		} catch (HttpStatusCodeException exception) {
			
			if (exception.getStatusCode() ==  HttpStatus.INTERNAL_SERVER_ERROR) {

                String responseString = exception.getResponseBodyAsString();
				System.out.println("Entrou 500 " + responseString);
                return Var.valueOf(responseString);
          	}
			if (exception.getStatusCode() ==  HttpStatus.NOT_FOUND) {

                String responseString = exception.getResponseBodyAsString();
				System.out.println("Entrou 404 " + responseString);
                return Var.valueOf(responseString);
          	}	

			 return Var.valueOf("OK");				
		}	

	}

@CronapiMetaData(type = "function", name = "Requisição POST Basic Auth", nameTags = {
			"Auth Basic" }, description = "Requisição POST Basic Auth", returnType = ObjectType.JSON)

	public static final Var basicAuthRequisitionPost(
		@ParamMetaData(type = ObjectType.STRING, description = "Caminho requisição") Var url, @ParamMetaData(type = ObjectType.STRING, description = "Nome de usuário") Var username,		
		@ParamMetaData(type = ObjectType.STRING, description = "Senha de usuário") Var password, @ParamMetaData(type = ObjectType.JSON, description = "Parâmetros (JSON)") Var parametros,
		@ParamMetaData(type = ObjectType.STRING, description = "Content-Type") Var type)
		throws Exception {

		HttpHeaders headers = new HttpHeaders();
		

		if (Var.valueOf(type).toString().equalsIgnoreCase("JSON")) {
			headers.setContentType(MediaType.APPLICATION_JSON);
		} else if (Var.valueOf(type).toString().equalsIgnoreCase("x_www_form_urlencoded")) {
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		}

		String urlResource = Var.valueOf(url).toString();
		String userResource = Var.valueOf(username).toString();
		String passResource = Var.valueOf(password).toString();

		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();

		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();
	
		HttpHost host = HttpHost.create(urlResource);

		HttpEntity<String> request = new HttpEntity<String>(Var.valueOf(parametros).toString(),headers);

		final ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactoryBasicAuth(host);
		
    	RestTemplate restTemplate = new RestTemplate(requestFactory);
		restTemplate.getMessageConverters()
        .add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
		restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(userResource, passResource));		

		
		try {
			((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);
			ResponseEntity<String> response = restTemplate.postForEntity(urlResource, request, String.class);
			return Var.valueOf(response.getBody());
			
		} catch (HttpStatusCodeException exception) {
			
			if (exception.getStatusCode() ==  HttpStatus.INTERNAL_SERVER_ERROR) {

                String responseString = exception.getResponseBodyAsString();
                return Var.valueOf(responseString);
          	}
			if (exception.getStatusCode() ==  HttpStatus.NOT_FOUND) {

                String responseString = exception.getResponseBodyAsString();
                return Var.valueOf(responseString);
          	}	

			 return Var.valueOf("ERR");				
		}

	}
/*
// FUNÇÕES PARA CERTIFICADOS

	public static DefaultHttpClient httpClientTrustingAllSSLCerts() 
	 	
	throws NoSuchAlgorithmException, KeyManagementException {
        	
	DefaultHttpClient httpclient = new DefaultHttpClient();

    SSLContext sc = SSLContext.getInstance("SSL");
    sc.init(null, getTrustingManager(), new java.security.SecureRandom());

        SSLSocketFactory socketFactory = new SSLSocketFactory(sc);
        Scheme sch = new Scheme("https", 443, socketFactory);
        httpclient.getConnectionManager().getSchemeRegistry().register(sch);
        return httpclient;
    }
	

	// FUNÇÕES PARA CERTIFICADOS
	 public static TrustManager[] getTrustingManager() {
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
                // Do nothing
            }

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
                // Do nothing
            }

        } };
        return trustAllCerts;
    }]
	*/


    // FUNÇÃO PARA REQUISIÇÕES POST JSON COM SESSION ID
	@CronapiMetaData(type = "function", name = "Requisition POST Token", nameTags = {
			"Auth Basic" }, description = "Requisition POST", returnType = ObjectType.JSON)
	public static final Var requisitionPost(
		@ParamMetaData(type = ObjectType.STRING, description = "Url ") Var inputUrl,
		@ParamMetaData(type = ObjectType.STRING, description = "Key ") Var inputKey,
		@ParamMetaData(type = ObjectType.STRING, description = "Value ") Var inputValue,
		@ParamMetaData(type = ObjectType.STRING, description = "Body ") Var inputBody)

		
		
		throws Exception {

		String urlResource = Var.valueOf(inputUrl).toString();
		String body = Var.valueOf(inputBody).toString();
		String key = Var.valueOf(inputKey).toString();
		String value = Var.valueOf(inputValue).toString();
		//CloseableHttpClient httpclient = HttpClientBuilder.create().build();
		DefaultHttpClient client = new DefaultHttpClient();

		HostnameVerifier hostnameVerifier = org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
		SchemeRegistry registry = new SchemeRegistry();
		SSLSocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
		socketFactory.setHostnameVerifier((X509HostnameVerifier) hostnameVerifier);
		registry.register(new Scheme("https", socketFactory, 443));
		SingleClientConnManager mgr = new SingleClientConnManager(client.getParams(), registry);
		DefaultHttpClient httpClient = new DefaultHttpClient(mgr, client.getParams());
		
		try {
			HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
			HttpPost request = new HttpPost(urlResource);
			StringEntity params = new StringEntity(body);
			request.addHeader("content-type", "application/json");
			request.setHeader(key, value);
			request.setEntity(params);
 			HttpResponse response = httpClient.execute(request);
			String contentReturn = EntityUtils.toString(response.getEntity(), HTTP.CHARSET_UTF_8);

			return Var.valueOf(contentReturn);


   		 }catch (HttpStatusCodeException exception) {
			
			if (exception.getStatusCode() ==  HttpStatus.INTERNAL_SERVER_ERROR) {

                String responseError = exception.getResponseBodyAsString();
                return Var.valueOf(responseError);
          	}
			if (exception.getStatusCode() ==  HttpStatus.NOT_FOUND) {

                String responseError = exception.getResponseBodyAsString();
                return Var.valueOf(responseError);
          	}					
		}catch(Exception e){
			System.out.println(">>>>>>>>>>>>>>>>>> PRINT EXCEPTION <<<<<<<<<<<<<<");
			System.out.println(e);
		}

		return null;	

	}

	

	// FUNÇÃO PARA REQUISIÇÕES GET
	@CronapiMetaData(type = "function", name = "Requisition GET Token", nameTags = {
			"Auth Basic" }, description = "Requisition GET", returnType = ObjectType.JSON)
	public static final Var requisitionGet(
		@ParamMetaData(type = ObjectType.STRING, description = "Url ") Var inputUrl,
		@ParamMetaData(type = ObjectType.STRING, description = "Key ") Var inputKey,
		@ParamMetaData(type = ObjectType.STRING, description = "Value ") Var inputValue)
		
		throws Exception {

		String urlResource = Var.valueOf(inputUrl).toString();
		String key = Var.valueOf(inputKey).toString();
		String value = Var.valueOf(inputValue).toString();
				
		try {

			URL url = new URL(urlResource);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty(key, value);							
			
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            output = br.readLine();
            conn.disconnect();

			return Var.valueOf(output);

        } catch (HttpStatusCodeException exception) {
			
			if (exception.getStatusCode() ==  HttpStatus.INTERNAL_SERVER_ERROR) {

                String responseError = exception.getResponseBodyAsString();
                return Var.valueOf(responseError);
          	}
			if (exception.getStatusCode() ==  HttpStatus.NOT_FOUND) {

                String responseError = exception.getResponseBodyAsString();
                return Var.valueOf(responseError);
          	}					
		}	
		
		return Var.valueOf("OK");	

	}

	// FUNÇÃO PARA REQUISIÇÕES GET SEM AUTENTICAÇÃO
	@CronapiMetaData(type = "function", name = "Requisition GET Sem Autenticação", nameTags = {
			"Auth Basic" }, description = "Requisition GET", returnType = ObjectType.JSON)
	public static final Var requisitionGetNotAut(
		@ParamMetaData(type = ObjectType.STRING, description = "Url ") Var inputUrl)
		
		throws Exception {

		String urlResource = Var.valueOf(inputUrl).toString();
				
		try {

			URL url = new URL(urlResource);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Connection", "Keep-Alive");	
			conn.setRequestProperty("User-Agent", urlResource);						
			
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            output = br.readLine();
            conn.disconnect();

			return Var.valueOf(output);

        } catch (HttpStatusCodeException exception) {
			
			if (exception.getStatusCode() ==  HttpStatus.INTERNAL_SERVER_ERROR) {

                String responseError = exception.getResponseBodyAsString();
                return Var.valueOf(responseError);
          	}
			if (exception.getStatusCode() ==  HttpStatus.NOT_FOUND) {

                String responseError = exception.getResponseBodyAsString();
                return Var.valueOf(responseError);
          	}					
		}	
		
		return Var.valueOf("OK");	

	}


	@CronapiMetaData(type = "function", name = "Gerar Imagem Base64", nameTags = {
			"Auth Basic" }, description = "Gerar Imagem Base64", returnType = ObjectType.JSON)

	public static final Var downlaodImage(		
		@ParamMetaData(type = ObjectType.STRING, description = "Base64") Var dadosBase64,
		@ParamMetaData(type = ObjectType.STRING, description = "Nome Imagem (por padrão colocar o codigo do aluno)") Var codAluno)
		throws Exception {

		String base64 = Var.valueOf(dadosBase64).toString();
		String codigoAluno = Var.valueOf(codAluno).toString();		
		
		String bucketName = CommonConstants.BUCKET_NAME;
	    String objectName = "Pix/Imagens_" + codigoAluno + ".png";		
			
		AWSCredentials credentials = new BasicAWSCredentials(CommonConstants.ACCESS_KEY_ID, CommonConstants.ACCESS_SEC_KEY);

		
		try {	
			//org.apache.commons.codec.binary.Base64.decodeBase64((base64.substring(base64.indexOf(",")+1)).getBytes());
			//		
			byte[] decoder = Base64.getDecoder().decode(base64);		
			InputStream stream = new ByteArrayInputStream(decoder);
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentLength(decoder.length);
			meta.setContentType("image/png");

			AmazonS3 s3client = AmazonS3ClientBuilder
				  .standard()
				  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				  .withRegion(Regions.US_EAST_1)
				  .build();

			s3client.putObject(new PutObjectRequest(bucketName, objectName, stream, meta));

	        System.out.println("Arquivo transferido para o S3 Amazon"); 			
				
			return Var.valueOf("OK OK");			
				
		}catch(AmazonServiceException e) {
            // The call was transmitted successfully, but Amazon S3 couldn't process 
            System.out.println(e);
            e.printStackTrace();
        }         

		return Var.valueOf("OK");		

	}

	// FUNÇÃO PARA REQUISIÇÕES POST SEM AUTENTICAÇÃO
	@CronapiMetaData(type = "function", name = "Requisition POST Sem Autenticação", nameTags = {
			"Auth Basic" }, description = "Requisition POST", returnType = ObjectType.JSON)
	public static final String requisitionPostNotValidation(
		@ParamMetaData(type = ObjectType.STRING, description = "Url ") Var inputUrl,
		@ParamMetaData(type = ObjectType.STRING, description = "Params ") Var inputParams)
		
		throws Exception {

		String urlResource = Var.valueOf(inputUrl).toString();
		String paramans = Var.valueOf(inputParams).toString();
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();


		try {

			HttpPost request = new HttpPost(urlResource);
			StringEntity params = new StringEntity(paramans);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
 			HttpResponse response = httpClient.execute(request);
			String contentReturn = EntityUtils.toString(response.getEntity(), HTTP.CHARSET_UTF_8);

			return Var.valueOf(contentReturn).toString();


   		 }catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } 

		return null;	

	}

	// FUNÇÃO PARA REQUISIÇÕES PUT SEM AUTENTICAÇÃO
	@CronapiMetaData(type = "function", name = "Requisition PUT Sem Autenticação", nameTags = {
			"Auth Basic" }, description = "Requisition PUT", returnType = ObjectType.JSON)
	public static final String requisitionPutNotValidation(
		@ParamMetaData(type = ObjectType.STRING, description = "Url ") Var inputUrl,
		@ParamMetaData(type = ObjectType.STRING, description = "Params ") Var inputParams)
		
		throws Exception {

		String urlResource = Var.valueOf(inputUrl).toString();
		String paramans = Var.valueOf(inputParams).toString();
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();


		try {

			HttpPut request = new HttpPut(urlResource);
			StringEntity params = new StringEntity(paramans);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
 			HttpResponse response = httpClient.execute(request);
			String contentReturn = EntityUtils.toString(response.getEntity(), HTTP.CHARSET_UTF_8);

			return Var.valueOf(contentReturn).toString();


   		 }catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } 

		return null;	

	}



	

}