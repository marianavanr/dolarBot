package Utilss;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.swing.text.MaskFormatter;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.ParseException;
import cronapi.CronapiMetaData;
import cronapi.Var;
import cronapi.CronapiMetaData.ObjectType;	
import cronapi.ParamMetaData;
import java.sql.Timestamp;  
import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

import com.google.gson.Gson;

import java.text.NumberFormat; 


/**
 * Tasks of System ...
 * 
 * @author Diana Arcanjo
 * @version 1.0
 * @since 2019-07-24
 *
 */
 
@CronapiMetaData(categoryName = "Tasks        ") 
public class Tasks {

   // FUNCTION FOR REMOVE FILS PDF ON FOLDER 
	@CronapiMetaData(type = "function", name = "Remove Files PDF", description = "Função Para Excluir Arquivos PDF da Pasta", returnType = ObjectType.STRING)
	public static Var FunctionTasks(@ParamMetaData(type = ObjectType.STRING, description = "File Path") Var folder,
									@ParamMetaData(type = ObjectType.STRING, description = "Name PDF") Var nameFile) throws Exception {

		File pasta = new File(Var.valueOf(folder).toString());    
		File[] arquivos = pasta.listFiles();    
    
		for(File arquivo : arquivos) {
    		if(arquivo.getName().endsWith("Contrato_" + Var.valueOf(nameFile).toString() + ".pdf")) {
        		arquivo.delete();
    	}
}
		System.out.println("Arquivo PDF Foram Deletados com Sucesso");

		return Var.valueOf(folder);
	}

	// FUNCTION FOR GET FIRST NAME OF STRING AND REMOVE SPACES AND ALTER THE FIRST LETTER OF NAME FOR UPPERCASE AND REST TINY. 
	@CronapiMetaData(type = "function", name = "Get Fist Name and Remove Spaces", description = "Função para pegar o primeiro nome da range de strings", returnType = ObjectType.STRING)
	public static Var FunctionFistName(@ParamMetaData(type = ObjectType.STRING, description = "Name") Var name) throws Exception {
	
	String fullName = Var.valueOf(name).toString();

	String firstName = "";
    for(int i = 0; i < fullName.length(); i++){
        if(fullName.charAt(i) == ' '){
           break;
        } else {
            firstName += fullName.charAt(i);
        }
	}

	String alterName = firstName; 
	firstName = alterName.toLowerCase();  
	firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
	firstName.trim();

		return Var.valueOf(firstName);
	}


	// FUNCTION TO FORMATTER DATE
	@CronapiMetaData(type = "function", name = "Convert Timestamp to Date", description = "Função para converter a data timestamp para Date dd/MM/yyyy", returnType = ObjectType.STRING)
	public static Var FunctionFormatDate(@ParamMetaData(type = ObjectType.STRING, description = "Date") Var date) throws Exception {
	
				Long dateJson = Long.parseLong(Var.valueOf(date).toString());
				Timestamp stamp = new Timestamp(dateJson);
				Date dateFormat = new Date(stamp.getTime());
				SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");

		return Var.valueOf(fd.format(dateFormat));
	}

	//formata numero
	@CronapiMetaData(type = "function", name = "replaceDotWithComma", description = "function replaces ',' with '.'", returnType = ObjectType.STRING)
	public static Var eExtractDigitsFromString(
			@ParamMetaData(type = ObjectType.DATETIME, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {

			String saida = input.toString();
			saida = saida.replace(",", ".");
			return Var.valueOf(saida);
	}

	// FUNCTION FOR GET FIRST NAME OF STRING AND REMOVE SPACES AND ALTER THE FIRST LETTER OF NAME FOR UPPERCASE AND REST TINY. 
	@CronapiMetaData(type = "function", name = "Format Value", description = "Função para formatar valores em Reais", returnType = ObjectType.STRING)
	public static String FunctionFormatValue(@ParamMetaData(type = ObjectType.STRING, description = "Value R$") Var value) throws Exception {
	
				String number = Var.valueOf(value).toString();
				double doubleNumber = Double.parseDouble(number);  	
				Locale.setDefault(new Locale("pt", "BR"));  // mudança global
 
				DecimalFormat df = new DecimalFormat();
				df.applyPattern("#,##0.00");
				
				return df.format(doubleNumber);
	}

	//TOLOWERCASE FIRST CAPITAL LETTER 
	@CronapiMetaData(type = "function", name = "toLowerCase", description = "toLowerCase deixando a primeira lentra maiuscula", returnType = ObjectType.STRING)
	public static Var toLowerCase(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var input)
			throws Exception {
				String text = input.toString();
				text = text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
			
			return Var.valueOf(text);
	}


	//toLowerCase com primeira maiuscula 
	@CronapiMetaData(type = "function", name = "Formatar CPF", description = "Formatar CPF", returnType = ObjectType.STRING)
	public static String formatDateBR(
			@ParamMetaData(type = ObjectType.STRING, description = "Parâmetro: Descrição do parâmetro") Var inputCpf)

			throws Exception {

					String value = Var.valueOf(inputCpf).toString();
					MaskFormatter mask;
					
				try {
						mask = new MaskFormatter("###.###.###-##");
						mask.setValueContainsLiteralCharacters(false);
						return mask.valueToString(value);
					}catch(ParseException e) {
						throw new RuntimeException(e);
				}

			}

    // FUNCTION TO FORMATTER DATE
	@CronapiMetaData(type = "function", name = "Formmatter Date to MM/yyyy", description = "Função para converter a data timestamp para Date MM/yyyy", returnType = ObjectType.STRING)
	public static Var FunctionFormatDateMesAno(@ParamMetaData(type = ObjectType.STRING, description = "Date") Var date) throws Exception {
	
				Long dateJson = Long.parseLong(Var.valueOf(date).toString());
				Timestamp stamp = new Timestamp(dateJson);
				Date dateFormat = new Date(stamp.getTime());
				SimpleDateFormat fd = new SimpleDateFormat("MM/yyyy");

		return Var.valueOf(fd.format(dateFormat));
	}

    // FUNCTION FORMAT SPECIAL CHARACTERS
	@CronapiMetaData(type = "function", name = "Format Special Characters ", description = "format special characters", returnType = ObjectType.STRING)
	public static String FunctionRemoverCaracteresEspecial(
		@ParamMetaData(type = ObjectType.STRING, description = "Words") Var inputString) throws Exception {

			 String str = Var.valueOf(inputString).toString();
			
			 System.out.println("FUNÇÃO REMOVER CARACTERES: " + RemoveEspecial(str));

			 return str;

	}

	public static String RemoveEspecial(String str) throws Exception {

			String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
        	Pattern pattern = Pattern.compile("\\p+");
        	return pattern.matcher(nfdNormalizedString).replaceAll("");

	}

	
	// RETURN LETTER OF STRING 
	@CronapiMetaData(type = "function", name = "Primeiro caracter string", description = "funcao para retorna primeiro caracter da string", returnType = ObjectType.STRING)
	public static Var PrimeiraLetra(@ParamMetaData(type = ObjectType.STRING, description = "texto") Var texto) throws Exception {

		
		return Var.valueOf(texto.toString().charAt(0));
	}


	// retorna primeira letra da string 
	@CronapiMetaData(type = "function", name = "Mascara de Valores", description = "Mascara de Valores", returnType = ObjectType.STRING)
	public static Var mascaraValores(@ParamMetaData(type = ObjectType.STRING, description = "valor") Var valor) throws Exception {

		   String valorFormatado = NumberFormat.getCurrencyInstance().format(valor);
		   System.out.println(valorFormatado);
		
		   return Var.valueOf(valorFormatado);
	}

	// remover \n ou \r
	@CronapiMetaData(type = "function", name = "Remover barra n ou barra r da string", description = "funcao para remvoer barra n ou barra r", returnType = ObjectType.STRING)
	public static Var RemoverBarraNouR(@ParamMetaData(type = ObjectType.STRING, description = "texto") Var texto) throws Exception {
		
		String frase = texto.toString().replace("\\n", "").replace("\\r", "");
		
		return Var.valueOf(frase);
	}

	// remover \n ou \r
	@CronapiMetaData(type = "function", name = "Remover Traços e Pontos", description = "funcao para remvoer traços ou pontos de uma string", returnType = ObjectType.STRING)
	public static Var RemoverTracoPonto(@ParamMetaData(type = ObjectType.STRING, description = "texto") Var input) throws Exception {
		
		String retorno = input.toString().replace("-", "").replace(".", "");
				
		return Var.valueOf(retorno);
	}							

		// função para converter para base 64
	@CronapiMetaData(type = "function", name = "Converter base 64", description = "Converter base 64", returnType = ObjectType.STRING)
	public static Var Converter64(@ParamMetaData(type = ObjectType.STRING, description = "conteudo") Var conteudo) throws Exception {
		

		String originalInput = conteudo.toString();
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
	  


		return Var.valueOf(encodedString);
	}

		// função para converter para base 64
	@CronapiMetaData(type = "function", name = "Remover Caracteres Especiais CNPJ", description = "Remover Caracteres Especiais CNPJ", returnType = ObjectType.STRING)
	public static Var RetirarCaracteresEspeciais(@ParamMetaData(type = ObjectType.STRING, description = "String ") Var inputString) throws Exception {
		

		String originalInput = inputString.toString();
		originalInput = originalInput.replace( " " , ""); //tira espaço em branco
		originalInput = originalInput.replace( "." , ""); //tira ponto
		originalInput = originalInput.replace( "/" , ""); //tira barra
		originalInput = originalInput.replace( "-" , ""); //tira hífen

		return Var.valueOf(originalInput);

	}

		// função para converter para base 64
	@CronapiMetaData(type = "function", name = "Senha Encoded", description = "Senha Encoded", returnType = ObjectType.STRING)
	public static Var urlEncoded(@ParamMetaData(type = ObjectType.STRING, description = "Senha ") String inputUrl) throws Exception {
		
		//URL originalUrl = new URL(inputUrl);
		//URI uri = new URI(originalUrl.getProtocol(), originalUrl.getUserInfo(), originalUrl.getHost(), originalUrl.getPort(), originalUrl.getPath(), originalUrl.getQuery(), originalUrl.getRef());
		//System.out.println(uri);
		String urlOriginal = inputUrl;
		String url = URLEncoder.encode(urlOriginal, StandardCharsets.UTF_8.toString());

		return Var.valueOf(url);

	}

			// função para converter para base 64
	@CronapiMetaData(type = "function", name = "Primeira String Maiuscula", description = "Deixa a Primeira Letra da String Maiuscula", returnType = ObjectType.STRING)
	public static String PrimeiraStringMaiuscula(@ParamMetaData(type = ObjectType.STRING, description = "String ") String inputString) throws Exception {

	String[] words = inputString.split("\\s");
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < words.length; i++){
        sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase());
        sb.append(" ");
    	}

    		return sb.toString();

	}




}



