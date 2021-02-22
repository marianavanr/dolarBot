package Utilss;

import java.io.BufferedReader;

// XML GET VALUE
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

//AMAZON
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.google.gson.Gson;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.rap.json.JsonObject;
import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;
import org.w3c.css.sac.InputSource;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// CRONAPI 
import cronapi.CronapiMetaData;
import cronapi.CronapiMetaData.ObjectType;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import cronapi.ParamMetaData;
import cronapi.Var;

import java.io.StringWriter;

//SOAP
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.soap.*;
import javax.xml.soap.MessageFactory;


import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import javax.xml.transform.*; 




/**
 * Classe de requisições XMl e tratamento de dados...
 * 
 * @author Diana Arcanjo
 * @version 1.0
 * @since 2019-10-28
 *
 */
 
@CronapiMetaData(categoryName = "Soap") 
public class Soap {

	// FUNÇÃO PARA FAZER REQUISIÇÕES SOAP COM AUTENTICAÇÃO 
	@CronapiMetaData(type = "function", name = "Requisição SOAP Basic Auth", nameTags = {
			"Auth Basic" }, description = "Requisição XML", returnType = ObjectType.XML)
	public static final String requisiçãoSOAP( 
		@ParamMetaData(type = ObjectType.STRING, description = "Soap Action ") Var soapAction,
		@ParamMetaData(type = ObjectType.STRING, description = "Usuário ") Var user,
		@ParamMetaData(type = ObjectType.STRING, description = "Senha ") Var senha,		
		@ParamMetaData(type = ObjectType.STRING, description = "Parâmetros (XML) ") Var xmlBody)
		throws IOException, SOAPException {
			
			String username = Var.valueOf(user).toString();
			String password = Var.valueOf(senha).toString();
			String userCredentials = username+":"+password;
   			String basicAuth = "Basic " + new String(new Base64().encode(userCredentials.getBytes()));
			String urlCaminhoSoapAction = Var.valueOf(soapAction).toString();
			String xmlSoapEnv = Var.valueOf(xmlBody).toString();
			String strCurrentLine;
			String strCurrentLineError;
			Var valueTag;
			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";
			String messagemSoapError = "";

			try{		 			
				
				//URL url = new URL("http://pseletivohomologacao.suafaculdade.com.br/webservices/ServicoProcessoSeletivo");
				//https://wslyceummatricula.unip.br/webservices/ServicoProcessoSeletivo
		
				URL url = new URL("https://wslyceummatricula.unip.br/webservices/ServicoProcessoSeletivo");
				HttpURLConnection connection = (HttpURLConnection)url.openConnection(); 
				connection.setRequestProperty ("Authorization", basicAuth);                        
	            connection.setDoOutput(true);
   				connection.setDoInput(true);
	            connection.setRequestProperty("SOAPAction", urlCaminhoSoapAction); 
	            connection.setRequestProperty("Type","Request-Response");
	            connection.setRequestProperty("Content-Type", "text/plain");

				DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			    String xml = xmlSoapEnv;
    			wr.writeBytes(xml);
    			wr.flush();
    			wr.close();

				int responseCode = connection.getResponseCode();				
				System.out.println("Response Code : " + responseCode);				

				BufferedReader response = null;	
				if (connection.getResponseCode() == 200) {
					Charset charset = Charset.forName("ISO-8859-1");
					response = new BufferedReader(new InputStreamReader(connection.getInputStream(), charset));
				
						while ((strCurrentLine = response.readLine()) != null) {
							
						
							return Var.valueOf(strCurrentLine).toString();
							
						}
			   } else {
				   		Charset charset = Charset.forName("ISO-8859-1");
						response = new BufferedReader(new InputStreamReader(connection.getErrorStream(), charset));					
						while ((strCurrentLineError = response.readLine()) != null) {
						Var.valueOf(strCurrentLineError).toString();

						MessageFactory factory = MessageFactory.newInstance();
	    				SOAPMessage message = factory.createMessage(
						new MimeHeaders(),
						new ByteArrayInputStream(strCurrentLineError.getBytes(Charset
						.forName("UTF-8"))));

						System.out.println("MESSAGE: " + message.getSOAPBody());

						SOAPBody body = message.getSOAPBody();

						NodeList returnList = body.getElementsByTagName("mensagem");
						
						for (int k = 0; k < returnList.getLength(); ) {
						
						NodeList innerResultList = returnList.item(k).getChildNodes();
						messagemSoapError = Var.valueOf(innerResultList.item(k).getTextContent()).toString();

						MessageFactory factory2 = MessageFactory.newInstance();			
						SOAPMessage soapMsg = factory2.createMessage();
						soapMsg.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");
						SOAPPart part = soapMsg.getSOAPPart();

						//CRIAÇÃO DO ENVELOPE	
						SOAPEnvelope envelope = part.getEnvelope(); 
						envelope.setPrefix("soapenv");						          
						envelope.addNamespaceDeclaration(servico, serverURI);
						
						// CRIAÇÃO DO HEADER		 	
						SOAPHeader header = envelope.getHeader();
						header.setPrefix("soapenv");
						
						//CRIAÇÃO DO BODY
						SOAPBody soapBody = envelope.getBody();
						soapBody.setPrefix("soapenv");

						//ELEMENTOS
						SOAPFactory soapFactory = SOAPFactory.newInstance();

						//ELEMENTO ALTERAR PESSOA CANDIDATO	       	
						Name bodyName  = soapFactory.createName("AlterarDadosCandidato","ser","");
						SOAPBodyElement ObterLogradouroPorCep = soapBody.addBodyElement(bodyName);
						ObterLogradouroPorCep.addChildElement("mensagem").addTextNode(messagemSoapError);

						ByteArrayOutputStream stream = new ByteArrayOutputStream();	
						soapMsg.writeTo(stream);	
						String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

						System.out.println(xmlFinaly);

						return Var.valueOf(xmlFinaly).toString();
						}
								
			    }
						
			} 
				
				}catch (NullPointerException  exception) {
                	System.out.println("VISH!! : " + exception);
						return Var.valueOf("OK").toString();
                    
        }   
            return Var.valueOf("OK").toString();
        
    }	


// FUNÇÃO PARA FAZER REQUISIÇÕES SOAP COM AUTENTICAÇÃO 'EFETIVAR' 
	@CronapiMetaData(type = "function", name = "Requisição SOAP EFETIVAR", nameTags = {
			"Auth Basic" }, description = "Requisição XML", returnType = ObjectType.XML)
	public static final String requisiçãoSOAPContrato( 		
		@ParamMetaData(type = ObjectType.STRING, description = "Parâmetros (XML) ") Var xmlBody)
		throws IOException, SOAPException {

			String xmlRequest = Var.valueOf(xmlBody).toString();
			

			try{		 			
				OkHttpClient client = new OkHttpClient().newBuilder()
				.connectTimeout(100, TimeUnit.SECONDS)
        		.writeTimeout(100, TimeUnit.SECONDS)
        		.readTimeout(300, TimeUnit.SECONDS)
  				.build();
				MediaType mediaType = MediaType.parse("application/xml");
				RequestBody body = RequestBody.create(mediaType, xmlRequest);
				Request request = new Request.Builder()
				.url("https://wslyceummatricula.unip.br/webservices/ServicoProcessoSeletivo")
				.method("POST", body)
				.addHeader("Content-Type", "application/xml")
				.addHeader("SOAPAction", "http://servicos/ServicoProcessoSeletivo/EfetivarIngressoCandidato")
				.build();
				Response response = client.newCall(request).execute();
				String responseBody = response.body().string();

				return Var.valueOf(responseBody).toString();
				
						
			} catch (Exception exception) {
                	System.out.println("VISH!! : " + exception);
						return Var.valueOf("OK").toString();
                    
        }   
           
        
    }


// FUNÇÃO PARA FAZER REQUISIÇÕES SOAP COM AUTENTICAÇÃO 'GERAR CONTRATO' 
	@CronapiMetaData(type = "function", name = "Requisição SOAP GERAR CONTRATO", nameTags = {
			"Auth Basic" }, description = "Requisição XML", returnType = ObjectType.XML)
	public static final String requisiçãoSOAPGerarContrato( 		
		@ParamMetaData(type = ObjectType.STRING, description = "Parâmetros (XML) ") Var xmlBody)
		throws IOException, SOAPException {

			String xmlRequest = Var.valueOf(xmlBody).toString();
			

			try{		 			
				OkHttpClient client = new OkHttpClient().newBuilder()
				.connectTimeout(100, TimeUnit.SECONDS)
        		.writeTimeout(100, TimeUnit.SECONDS)
        		.readTimeout(300, TimeUnit.SECONDS)
  				.build();
				MediaType mediaType = MediaType.parse("application/xml");
				RequestBody body = RequestBody.create(mediaType, xmlRequest);
				Request request = new Request.Builder()
				.url("https://wslyceummatricula.unip.br/webservices/ServicoProcessoSeletivo")
				.method("POST", body)
				.addHeader("Content-Type", "application/xml")
				.addHeader("SOAPAction", "http://servicos/ServicoProcessoSeletivo/GeraContradoAlunoParaAceite")
				.build();
				Response response = client.newCall(request).execute();
				String responseBody = response.body().string();

				return Var.valueOf(responseBody).toString();
				
						
			} catch (Exception exception) {
                	System.out.println("VISH!! : " + exception);
						return Var.valueOf("OK").toString();
                    
        }   
           
        
    }	

	// FUNÇÃO PARA FAZER REQUISIÇÕES SOAP COM AUTENTICAÇÃO 'GERAR BOLETO' 
	@CronapiMetaData(type = "function", name = "Requisição SOAP GERAR BOLETO", nameTags = {
			"Auth Basic" }, description = "Requisição XML", returnType = ObjectType.XML)
	public static final String requisiçãoSOAPGerarArquivoBoleto( 		
		@ParamMetaData(type = ObjectType.STRING, description = "Parâmetros (XML) ") Var xmlBody)
		throws IOException, SOAPException {

			String xmlRequest = Var.valueOf(xmlBody).toString();
			

			try{		 			
				OkHttpClient client = new OkHttpClient().newBuilder()
				.connectTimeout(100, TimeUnit.SECONDS)
        		.writeTimeout(100, TimeUnit.SECONDS)
        		.readTimeout(300, TimeUnit.SECONDS)
  				.build();
				MediaType mediaType = MediaType.parse("application/xml");
				RequestBody body = RequestBody.create(mediaType, xmlRequest);
				Request request = new Request.Builder()
				.url("https://wslyceummatricula.unip.br/webservices/ServicoProcessoSeletivo")
				.method("POST", body)
				.addHeader("Content-Type", "application/xml")
				.addHeader("SOAPAction", "http://servicos/ServicoProcessoSeletivo/GerarArquivoBoleto")
				.build();
				Response response = client.newCall(request).execute();
				String responseBody = response.body().string();

				return Var.valueOf(responseBody).toString();
				
						
			} catch (Exception exception) {
                	System.out.println("VISH!! : " + exception);
						return Var.valueOf("OK").toString();
                    
        }   
           
        
    }			

	// FUNÇÃO PARA FAZER REQUISIÇÕES SOAP COM AUTENTICAÇÃO 'OBTER CANDIDATO' 
	@CronapiMetaData(type = "function", name = "Requisição SOAP OBTER CANDIDATO", nameTags = {
			"Auth Basic" }, description = "Requisição XML", returnType = ObjectType.XML)
	public static final String requisiçãoSOAPObterCandidato( 		
		@ParamMetaData(type = ObjectType.STRING, description = "Parâmetros (XML) ") Var xmlBody)
		throws IOException, SOAPException {

			String xmlRequest = Var.valueOf(xmlBody).toString();
			

			try{		 			
				OkHttpClient client = new OkHttpClient().newBuilder()
				.connectTimeout(100, TimeUnit.SECONDS)
        		.writeTimeout(100, TimeUnit.SECONDS)
        		.readTimeout(300, TimeUnit.SECONDS)
  				.build();
				MediaType mediaType = MediaType.parse("application/xml");
				RequestBody body = RequestBody.create(mediaType, xmlRequest);
				Request request = new Request.Builder()
				.url("https://wslyceummatricula.unip.br/webservices/ServicoProcessoSeletivo")
				.method("POST", body)
				.addHeader("Content-Type", "application/xml")
				.addHeader("SOAPAction", "http://servicos/ServicoProcessoSeletivo/ObterCandidato")
				.build();
				Response response = client.newCall(request).execute();
				String responseBody = response.body().string();

				return Var.valueOf(responseBody).toString();
				
						
			} catch (Exception exception) {
                	System.out.println("VISH!! : " + exception);
						return Var.valueOf("OK").toString();
                    
        }   
           
        
    }		

	// FUNÇÃO PARA FAZER REQUISIÇÕES SOAP COM AUTENTICAÇÃO 'INCLUIR ACEITE CONTRATO' 
	@CronapiMetaData(type = "function", name = "Requisição SOAP INCLUIR ACEITE CONTRATO", nameTags = {
			"Auth Basic" }, description = "Requisição XML", returnType = ObjectType.XML)
	public static final String requisiçãoSOAPIncluirAceiteContrato( 		
		@ParamMetaData(type = ObjectType.STRING, description = "Parâmetros (XML) ") Var xmlBody)
		throws IOException, SOAPException {

			String xmlRequest = Var.valueOf(xmlBody).toString();
			

			try{		 			
				OkHttpClient client = new OkHttpClient().newBuilder()
				.connectTimeout(100, TimeUnit.SECONDS)
        		.writeTimeout(100, TimeUnit.SECONDS)
        		.readTimeout(300, TimeUnit.SECONDS)
  				.build();
				MediaType mediaType = MediaType.parse("application/xml");
				RequestBody body = RequestBody.create(mediaType, xmlRequest);
				Request request = new Request.Builder()
				.url("https://wslyceummatricula.unip.br/webservices/ServicoProcessoSeletivo")
				.method("POST", body)
				.addHeader("Content-Type", "application/xml")
				.addHeader("SOAPAction", "http://servicos/ServicoProcessoSeletivo/IncluirAceiteDeContratoAluno")
				.build();
				Response response = client.newCall(request).execute();
				String responseBody = response.body().string();

				return Var.valueOf(responseBody).toString();
				
						
			} catch (Exception exception) {
                	System.out.println("VISH!! : " + exception);
						return Var.valueOf("OK").toString();
                    
        }   
           
        
    }				
	


// FUNÇÃO PARA PEGAR VALORES DENTRO DA TAG NO XML
@CronapiMetaData(type = "function", name = "Pegar valores Xml", nameTags = {
			"Auth Basic" }, description = "Pegar valor de uma tag xml", returnType = ObjectType.XML)
	public static final Var getValueXml(
		@ParamMetaData(type = ObjectType.STRING, description = "Xml") Var xml,
		@ParamMetaData(type = ObjectType.STRING, description = "nome da tag ") Var tag) throws IOException, SOAPException {
		
		 try {

	    String xmlInput = Var.valueOf(xml).toString();
		String tagInput = Var.valueOf(tag).toString();		

	    MessageFactory factory = MessageFactory.newInstance();
	    SOAPMessage message = factory.createMessage(
	            new MimeHeaders(),
	            new ByteArrayInputStream(xmlInput.getBytes(Charset
				.forName("UTF-8"))));

	    SOAPBody body = message.getSOAPBody();

	    NodeList returnList = body.getElementsByTagName(tagInput);

	    for (int k = 0; k < returnList.getLength(); ) {
				NodeList innerResultList = returnList.item(k).getChildNodes();	
				return Var.valueOf(innerResultList.item(k).getTextContent());
		}
			
		 } catch (NullPointerException e) {			
				return Var.valueOf("");			           
	}
				return Var.valueOf("");   
  } 



	// FUNÇÃO PARA REALIZAR DOWNLOAD DO BOLETO
	@CronapiMetaData(type = "function", name = "Download Boleto PDF", nameTags = {
			"Auth Basic" }, description = "Requisição PDF", returnType = ObjectType.JSON)

	public static final Var downlaodBoleto(
		@ParamMetaData(type = ObjectType.STRING, description = "Boleto") Var inputBoleto,
		@ParamMetaData(type = ObjectType.STRING, description = "Código") Var inputCodigo)
		throws Exception {

		String boleto = Var.valueOf(inputBoleto).toString();
		String codigo = Var.valueOf(inputCodigo).toString();
								
		String bucketName = CommonConstants.BUCKET_NAME;
		String objectName = "BoletosMatricula/Boleto_" + codigo + ".pdf";
				
		AWSCredentials credentials = new BasicAWSCredentials(CommonConstants.ACCESS_KEY_ID, CommonConstants.ACCESS_SEC_KEY);

		try {		

			byte[] content = java.util.Base64.getDecoder().decode(boleto);					
			InputStream stream = new ByteArrayInputStream(content);
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentLength(content.length);
			meta.setContentType("boleto/pdf");

				AmazonS3 s3client = AmazonS3ClientBuilder
					.standard()
					.withCredentials(new AWSStaticCredentialsProvider(credentials))
					.withRegion(Regions.US_EAST_1)
					.build();

				s3client.putObject(new PutObjectRequest(bucketName, objectName, stream, meta));

	        System.out.println("Arquivo transferido para o S3 Amazon"); 			
				
			return Var.valueOf(content);			
				
		}catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }         

		return Var.valueOf("OK");		

	}



// FUNÇÃO PARA REALIZAR DOWNLOAD DO CONTRATO
	@CronapiMetaData(type = "function", name = "Download Contrato PDF", nameTags = {
			"Auth Basic" }, description = "Requisição PDF", returnType = ObjectType.JSON)

	public static final Var downlaodContratoPDF(
		@ParamMetaData(type = ObjectType.STRING, description = "Contrato") Var inputBoleto,
		@ParamMetaData(type = ObjectType.STRING, description = "Código") Var inputCodigo)
		throws Exception {

			String codigo = Var.valueOf(inputCodigo).toString();
			String textStrng = Var.valueOf(inputBoleto).toString();
								
			String bucketName = CommonConstants.BUCKET_NAME;
			String objectName = "ContratoMatricula/Contrato_" + codigo + ".pdf";
				
		AWSCredentials credentials = new BasicAWSCredentials(CommonConstants.ACCESS_KEY_ID, CommonConstants.ACCESS_SEC_KEY);

		try {


			ByteArrayOutputStream streamByte = new ByteArrayOutputStream();		
			com.itextpdf.text.Document document = new com.itextpdf.text.Document();
			PdfWriter writer = PdfWriter.getInstance(document, streamByte);
         	document.open();
			HTMLWorker htmlWorker = new HTMLWorker(document);
    		htmlWorker.parse(new StringReader(textStrng));
         	document.close();
         	writer.close();
			
			byte[] content = streamByte.toByteArray();					
			InputStream stream = new ByteArrayInputStream(content);
			ObjectMetadata meta = new ObjectMetadata();
			meta.setContentLength(content.length);
			meta.setContentType("pdf/pdf");

				AmazonS3 s3client = AmazonS3ClientBuilder
					.standard()
					.withCredentials(new AWSStaticCredentialsProvider(credentials))
					.withRegion(Regions.US_EAST_1)
					.build();

				s3client.putObject(new PutObjectRequest(bucketName, objectName, stream, meta));

	        System.out.println("Arquivo transferido para o S3 Amazon"); 			
				
			return Var.valueOf(content);			
				
		}catch(Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }         

		return Var.valueOf("OK");		

	}


	//* FUNÇÃO PARA REALIZAR CONVERTER XML PARA JSON
  @CronapiMetaData(type = "function", name = "Converter XML para JSON", nameTags = {
			"Auth Basic" }, description = "Converter XML para JSON" , returnType = ObjectType.STRING)
	public static String ConvertXMLTOJSON(@ParamMetaData(type = ObjectType.STRING, description = "XML") String inputstrXml) throws JSONException  {

    if (inputstrXml != null && !inputstrXml.isEmpty()) {
        try {			
			
			System.out.println(XML.toJSONObject(inputstrXml));
			
			return XML.toJSONObject(inputstrXml).toString();	
			
    	
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    return null;
	}

	//* FUNÇÃO PARA REMOVER O BRACKETS DO JSON
	@CronapiMetaData(type = "function", name = "Remove Brackets Json", nameTags = {
			"Auth Basic" }, description = "Remove Brackets Json" , returnType = ObjectType.STRING)
	
	public static String RemoveListJson(@ParamMetaData(type = ObjectType.STRING, description = "JSON") String inputJson) throws JSONException  {

        try {			
			String strBrackets = Var.valueOf(inputJson).toString();
			//*String strBrackets2;
			strBrackets = strBrackets.replaceAll("\\[","").replaceAll("\\]", "");
			//strBrackets2 = strBrackets.replaceAll("\\{","").replaceAll("\\}", "");

			return Var.valueOf(strBrackets).toString();	
			
    	
        } catch (JSONException e) {
            e.printStackTrace();
        }
    		return null;
	}

// FUNÇÃO REMOVER TAG NO XML
@CronapiMetaData(type = "function", name = "Remover Tags Xml", nameTags = {
			"Auth Basic" }, description = "Remover Tags Xml", returnType = ObjectType.XML)
	public static final String removeTagXml(
		@ParamMetaData(type = ObjectType.STRING, description = "Xml") Var inputxml,
		@ParamMetaData(type = ObjectType.STRING, description = "Tag") Var inputTag1,
		@ParamMetaData(type = ObjectType.STRING, description = "Tag") Var inputTag2,
		@ParamMetaData(type = ObjectType.STRING, description = "Tag") Var inputTag3) throws Exception {

				String xml = Var.valueOf(inputxml).toString();
				String tag1 = Var.valueOf(inputTag1).toString();
				String tag2 = Var.valueOf(inputTag2).toString();
				String tag3 = Var.valueOf(inputTag3).toString();
				
		 try {

			    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    			factory.setNamespaceAware(true);
    			DocumentBuilder builder = factory.newDocumentBuilder();

				org.w3c.dom.Document doc = builder.parse(new ByteArrayInputStream(xml.getBytes()));	
				Element element = (Element) doc.getElementsByTagName(tag1).item(0);
				Element element2 = (Element) doc.getElementsByTagName(tag2).item(0);
				Element element3 = (Element) doc.getElementsByTagName(tag3).item(0);

				org.w3c.dom.Node parent = element.getParentNode();
				parent.removeChild(element);
				parent.removeChild(element2);
				parent.removeChild(element3);
				parent.normalize();
				toString(doc);


				StringWriter sw = new StringWriter();
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer transformer = tf.newTransformer();
				transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
				transformer.setOutputProperty(OutputKeys.METHOD, "xml");
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

				transformer.transform(new DOMSource(doc), new StreamResult(sw));
				return Var.valueOf(sw).toString();
								
		 } catch (Exception e) {
			 	e.printStackTrace();				
				return Var.valueOf(e).toString();			           
	}
			   
  }

	// FUNÇÃO PARA CONVERTER STRING PARA DOCUMENT
  private static void toString(org.w3c.dom.Document doc) throws Exception{
    DOMSource domSource = new DOMSource(doc);
    Transformer transformer = TransformerFactory.newInstance().newTransformer();
    StringWriter sw = new StringWriter();
    StreamResult sr = new StreamResult(sw);
    transformer.transform(domSource, sr);

    System.out.println(sw.toString());  
  }


  	// SEPARAR PALAVRAS DE DENTRO DE UM ARRAY 
	@CronapiMetaData(type = "function", name = "Selecionar Palavra uma string", description = "Selecionar Palavra uma string", returnType = ObjectType.STRING)
	public static String SelecionarPalavraString(@ParamMetaData(type = ObjectType.STRING, description = "texto") Var input) throws Exception {
	
	 try {
	  // PRIMEIRA PARTE
	  String x = Var.valueOf(input).toString();	
	  String[] textoSeparado = x.split("=");

	  // SEGUNDA PARTE	
	  String textoArray = textoSeparado[1];
	  String[] textoSeparado2 = textoArray.split("&");
	  // CONSTRUINDO O JSON
	  JSONObject json = new JSONObject();
	   json.put("CodConcurso", textoSeparado[2]);
	   json.put("CodCandidato", textoSeparado2[0]);
	   
	   return json.toString();

	}catch (Exception e) {
			 	e.printStackTrace();				
				return e.toString();			           
	    }

	}
}
	

  
 






































