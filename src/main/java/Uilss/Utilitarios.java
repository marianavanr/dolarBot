package Utilss;


import java.io.File;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.InputMismatchException;
import javax.net.ssl.SSLContext;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;
import com.google.gson.JsonElement;
import cronapi.CronapiMetaData;
import cronapi.ParamMetaData;
import cronapi.Var;
import cronapi.CronapiMetaData.ObjectType;
import cronapi.rest.DownloadREST;
import java.lang.String;
import java.lang.Exception;
import java.lang.System;
import org.apache.http.HttpHost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import antlr.StringUtils;
import app.resources.HttpComponentsClientHttpRequestFactoryBasicAuth;


import java.util.ArrayList;


/**
 * Function that extract digits from an string ...
 * 
 * @author Rodrigo Reis
 * @version 1.0
 * @since 2018-06-22
 *
 */


@CronapiMetaData(categoryName = "Utilitarios")
public class Utilitarios {

	private static final String SENHA_DE_USUÁRIO = "Senha de usuário";

	@CronapiMetaData(type = "function", name = "eExtractDigitsFromString", description = "Function that extract digits from an string", returnType = ObjectType.STRING)
	public static Var eExtractDigitsFromString(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
		return Var.valueOf(input.toString().replaceAll("\\D", ""));
	}

	@CronapiMetaData(type = "function", name = "urlEncode", description = "Função que faz encode de um texto", returnType = ObjectType.STRING)
	public static Var UrlEncode(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
		return Var.valueOf(URLEncoder.encode(input.toString(), "UTF-8"));
	}

	@CronapiMetaData(type = "function", name = "xmlToJSON", description = "Converte xml para json", returnType = ObjectType.STRING)
	public static Var xmlToJSON(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {

		JSONObject soapDatainJsonObject = XML.toJSONObject(input.getObjectAsString());
		System.out.println(soapDatainJsonObject);
		return Var.valueOf(Var.valueOf(soapDatainJsonObject));
	}

	@CronapiMetaData(type = "function", name = "checkIfIsString", description = "Checar se o valor é String", returnType = ObjectType.BOOLEAN)
	public static Var checkIfIsString(
			@ParamMetaData(type = ObjectType.OBJECT, description = "Parâmetro: Descrição do parâmetro") Object input)
			throws Exception {
		return new Var(input instanceof String);
	}

	@CronapiMetaData(type = "function", name = "isNull", description = "Checar se o valor é null", returnType = ObjectType.BOOLEAN)
	public static Var isNull(
			@ParamMetaData(type = ObjectType.OBJECT, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
		return new Var(input.toString().equals("null"));
	}

	@CronapiMetaData(type = "function", name = "validarSomenteNumeros", description = "Checar se o valor é String", returnType = ObjectType.BOOLEAN)
	public static Var validarSomenteNumeros(
			@ParamMetaData(type = ObjectType.OBJECT, description = "Parâmetro: Descrição do parâmetro") Object input)
			throws Exception {
		if (input.toString().matches("[^0-9")) {
			return Var.valueOf(false);
		}
		return Var.valueOf(true);
	}

	@CronapiMetaData(type = "function", name = "removerCampoJson", description = "Remove o campo informado de um Json", returnType = ObjectType.BOOLEAN)
	public static JsonElement removerCampoJson(
			@ParamMetaData(type = ObjectType.JSON, description = "Json: Objeto Json") Var json, 	@ParamMetaData(type = ObjectType.STRING, description = "Campo: Campo a ser removido do Json") String campo)
			throws Exception {
		return json.getObjectAsJson().getAsJsonObject().remove(campo);
	}

	
/*	@CronapiMetaData(type = "function", name = "printTraceException", description = "Print trace excpetion")
	public static Var printTraceException(Var campo)
			throws Exception {
			  if(){
			    
			  }
			  campo.getType()
			  return Var.VAR_EMPTY;
	}*/

	@CronapiMetaData(type = "function", name = "validarCPF", description = "Verifica se o CPF é válido e retorna tipo boolean", returnType = ObjectType.STRING)
	public static Var validarCPF(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
		String CPF = eExtractDigitsFromString(input).toString();
		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11)) {
			return Var.valueOf(false);
		}

		char dig10, dig11;
		int sm, i, r, num, peso;

		try {
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48);

			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
				return Var.valueOf(true);
			} else {
				return Var.valueOf(false);
			}
		} catch (InputMismatchException erro) {
			return Var.valueOf(false);
		}
	}

	@CronapiMetaData(type = "function", name = "Mascara CPF", description = "Coloca mascara para 000.000.000-00", returnType = ObjectType.STRING)
	public static Var colocarMascaraCPF(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
		input = eExtractDigitsFromString(input);
		return Var.valueOf(input.toString().substring(0, 3) + "." + input.toString().substring(3, 6) + "."
				+ input.toString().substring(6, 9) + "-" + input.toString().substring(9, 11));
	}

	@CronapiMetaData(type = "function", name = "Mascara RG", description = "Coloca mascara para 00.000.000-00", returnType = ObjectType.STRING)
	public static Var colocarMascaraRG(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
	  try{
  		input = eExtractDigitsFromString(input);
  		String ultimoDigito = new String();
  		switch(input.toString().length()){
  		  case 8:
  		    ultimoDigito = "x";
  		    break;
  		  case 9:
  		    ultimoDigito = input.toString().substring(8, 9);
  		    break;
  		  case 10:
  		    ultimoDigito = input.toString().substring(8, 10);
  		    break;
  		}
  		return Var.valueOf(input.toString().substring(0, 2) + "." + input.toString().substring(2, 5) + "."
  				+ input.toString().substring(5, 8) + "-" + ultimoDigito);
	  }catch(Exception e){
	    System.out.println(e.toString());
	    return input;
	  }
	  
	}

	@CronapiMetaData(type = "function", name = "Mascara Data dd/mm/aaaa", description = "Coloca mascara para dd/mm/aaaa", returnType = ObjectType.STRING)
	public static Var colocarMascaraData(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Data só números (ddmmaaaa)") Var input)
			throws Exception {
			  input = eExtractDigitsFromString(input);
		return Var.valueOf(input.toString().substring(0, 2) + "/" + input.toString().substring(2, 4) + "/"
				+ input.toString().substring(4, 8));
	}

	@CronapiMetaData(type = "function", name = "colocarMascaraHora", description = "Coloca mascara para hh:mm", returnType = ObjectType.STRING)
	public static Var colocarMascaraHora(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Hora só números (hhmm)") Var input)
			throws Exception {
			  input = eExtractDigitsFromString(input);
		return Var.valueOf(input.toString().substring(0, 2) + ":" + input.toString().substring(2, 4));
	}

	@CronapiMetaData(type = "function", name = "Validador de Email", description = "Validador de Email", returnType = ObjectType.STRING)
	public static Var isValidEmail(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
		String regex1 = "[A-Za-z0-9\\._-]+@[A-Za-z]+[0-9A-Za-z]\\.[A-Za-z]+\\.[A-Za-z]+";
		String regex2 = "[A-Za-z0-9\\._-]+@[A-Za-z]+[0-9A-Za-z]\\.[A-Za-z]+";
		return Var.valueOf(input.getObjectAsString().matches(regex1) || input.getObjectAsString().matches(regex2));

	}

	@CronapiMetaData(type = "function", name = "Create Download URL", nameTags = { "download",
			"url" }, description = "Function to create a download url from a file path")
	public static Var createDownloadLink(@ParamMetaData(type = ObjectType.STRING, description = "File Path") Var file) {
		return Var.valueOf(DownloadREST.getDownloadUrl(new File(file.toString())));
	}




	@CronapiMetaData(type = "function", name = "Download URL to File", nameTags = {
			"download" }, description = "Download URL to File", returnType = ObjectType.BOOLEAN)
	public static final Var downloadUrltoFile(
			@ParamMetaData(type = ObjectType.STRING, description = "File Path") Var urlAddress, Var file)
			throws Exception {
		java.net.URL url = new java.net.URL(urlAddress.getObjectAsString());

		URLConnection urlConnection = url.openConnection();

		// Pattern pattern = Pattern.compile("https?:\\/\\/(.?):(.?)@.*");
		// Matcher matcher = pattern.matcher(urlAddress.getObjectAsString());

		// if (matcher.find()) {
			String user = "apiuser";
			String pass = "apiuser@123";
			String header = "Basic " + new String(Base64.getEncoder().encode((user + ":" + pass).getBytes()));
			urlConnection.addRequestProperty("Authorization", header);
		// }

		File outFile = new File(file.getObjectAsString());
		if (outFile.exists()) {
			outFile.delete();
		}

		try (java.io.InputStream is = urlConnection.getInputStream()) {
			try (java.io.FileOutputStream fos = new java.io.FileOutputStream(outFile)) {
				IOUtils.copy(is, fos);
			}
		}

		return new Var(true);
	}

	@CronapiMetaData(type = "function", name = "Requisição GET Basic Auth", nameTags = {
			"Auth Basic" }, description = "Requisição GET Basic Auth", returnType = ObjectType.JSON)
	
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

		
		try {
			ResponseEntity<String> response = restTemplate.getForEntity(urlResource, String.class);
			
			System.out.println("retorno body " + response.getBody());

			return Var.valueOf(response.getBody());
			
		} catch (Exception e) {
			try {
				((HttpComponentsClientHttpRequestFactory) requestFactory).setHttpClient(httpClient);						
				ResponseEntity<String> response = restTemplate.getForEntity(urlResource, String.class);	

				System.out.println("retorno body " + response.getBody());
							
				return Var.valueOf(response.getBody());
			} catch (Exception exc) {
				return Var.valueOf(exc);
			}
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
			ResponseEntity<String> response = restTemplate.postForEntity(urlResource, request, String.class);
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

@CronapiMetaData(type = "function", name = "Contém texto", description = "Função que retorna 1 se os dois textos tem compatibilidade em mais de 80%", returnType = ObjectType.STRING)
public static Var conteemNotexto(
 @ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Texto de entrada") Var input, @ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Texto de busca") Var texto)
throws Exception {


int tamanhoDoInput = input.length();
int tamanhoDOTexto = texto.length();
int corteDoInput = 2;
int corteDoTexto = 2;
double porcentagemMatch = 0.0;
double tamanhoVetorA = 0;
double tamanhoVetorB = 0;
double quantidadeContem = 0;
int retorno = 0;

ArrayList < String > vetA = new ArrayList < String > ();
ArrayList < String > vetB = new ArrayList < String > ();


for (int i = 0; i <= tamanhoDoInput; i++) {

    if (corteDoInput <= tamanhoDoInput) {
        vetA.add(input.toString().substring(i, corteDoInput));
        corteDoInput++;
    }
}
vetA.remove(null);
tamanhoVetorA = vetA.size();

for (int i = 0; i <= tamanhoDOTexto; i++) {

    if (corteDoTexto <= tamanhoDOTexto) {
        vetB.add(texto.toString().substring(i, corteDoTexto));
        corteDoTexto++;
    }
}

vetB.remove(null);
tamanhoVetorB = vetB.size();

for (int i = 0; i < tamanhoVetorA; i++) {
    for (int j = 0; j < tamanhoVetorB; j++) {
        if (vetA.get(i).contains(vetB.get(j))) {
            quantidadeContem++;
        }
    }
}

if (tamanhoVetorB != 0 && quantidadeContem != 0) {
    porcentagemMatch = (quantidadeContem / tamanhoVetorB);
}


if (porcentagemMatch > 0.6) {

    corteDoInput = 3;
    corteDoTexto = 3;

    for (int i = 0; i <= tamanhoDoInput; i++) {

        if (corteDoInput <= tamanhoDoInput) {
            vetA.add(input.toString().substring(i, corteDoInput));
            corteDoInput++;
        }
    }
    vetA.remove(null);
    tamanhoVetorA = vetA.size();

    for (int i = 0; i <= tamanhoDOTexto; i++) {

        if (corteDoTexto <= tamanhoDOTexto) {
            vetB.add(texto.toString().substring(i, corteDoTexto));
            corteDoTexto++;
        }
    }

    vetB.remove(null);
    tamanhoVetorB = vetB.size();

    for (int i = 0; i < tamanhoVetorA; i++) {
        for (int j = 0; j < tamanhoVetorB; j++) {
            if (vetA.get(i).contains(vetB.get(j))) {
                quantidadeContem++;
            }
        }
    }

}

if (porcentagemMatch > 0.6) {
    retorno = 1;
}

return Var.valueOf(retorno);

}

    @CronapiMetaData(type = "function", name = "Valida nome", description = "Regex para validar", returnType = ObjectType.STRING)
    public static Var validaNome(@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Nome") String nome)

    throws Exception {
					nome = nome.replace("\\s+", " ");
					String stringResultante = nome.trim();
					String[] palavra = stringResultante.split(" ");
					String regexNome = "[A-Za-zÀ-ú']{2,19}";
					String regexSobrenome = "^[\\p{L} .'-]+${1,19}";

					if (palavra.length <= 1 || palavra == null) {
						return Var.valueOf(false);


					} else if (palavra.length == 2) {

						if ((!palavra[0].matches(regexNome)) || (!palavra[1].matches(regexNome))) {
							return Var.valueOf(false);

						} else {
							return Var.valueOf(true);
						}
					} else if (palavra.length == 3) {
						if (!palavra[0].matches(regexNome) || !palavra[1].matches(regexSobrenome) || !palavra[2].matches(regexNome)) {
							return Var.valueOf(false);
						} else {
							return Var.valueOf(true);
						}

					} else if (palavra.length == 4) {
						if (!palavra[0].matches(regexNome) || !palavra[1].matches(regexSobrenome) || !palavra[2].matches(regexSobrenome) ||
							!palavra[3].matches(regexSobrenome)) {
							return Var.valueOf(false);
						} else {
							return Var.valueOf(true);
						}

					} else if (palavra.length == 5) {
						if (!palavra[0].matches(regexNome) || !palavra[1].matches(regexSobrenome) || !palavra[2].matches(regexSobrenome) ||
							!palavra[3].matches(regexSobrenome) || !palavra[4].matches(regexNome)) {
							return Var.valueOf(false);
						} else {
							return Var.valueOf(true);
						}

					} else if (palavra.length == 6) {
						if (!palavra[0].matches(regexNome) || !palavra[1].matches(regexSobrenome) || !palavra[2].matches(regexSobrenome) ||
							!palavra[3].matches(regexSobrenome) || !palavra[4].matches(regexSobrenome) || !palavra[5].matches(regexNome)) {
							return Var.valueOf(false);
						} else {
							return Var.valueOf(true);
						}

					} else if (palavra.length == 7) {
						if (!palavra[0].matches(regexNome) || !palavra[1].matches(regexSobrenome) || !palavra[2].matches(regexSobrenome) ||
							!palavra[3].matches(regexSobrenome) || !palavra[4].matches(regexSobrenome) || !palavra[5].matches(regexSobrenome) || !palavra[6].matches(regexNome)) {
							return Var.valueOf(false);
						} else {
							return Var.valueOf(true);
						}

					} else {
						return Var.valueOf(false);
					}

    }
	@CronapiMetaData(type = "function", name = "SubtraiDataHora", description = "Função para pegar a data e hora atual e subtrair a hora. ", returnType = ObjectType.STRING)
	public static Var SubtraiDataHora(
		@ParamMetaData(type = ObjectType.STRING, description = "Valor a ser subtraído") Long hora
	)
        throws Exception {
		
		LocalDateTime horaAtual = LocalDateTime.now();
       		LocalDateTime horaPedidoSubtraida = horaAtual.minusHours(hora);
			DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("hh:mm");
		String dataFormatada = horaPedidoSubtraida.format(formatterData);
		String horaFormatada = horaPedidoSubtraida.format(formatterHora);
  
	

        return Var.valueOf(dataFormatada+" "+horaFormatada);
	}

	
}