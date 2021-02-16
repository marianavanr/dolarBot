package Utilss;

// XML GET VALUE
import java.io.ByteArrayOutputStream;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;

//SOAP

import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPPart;
import javax.xml.soap.*;

// CRONAPI 
import cronapi.CronapiMetaData;
import cronapi.CronapiMetaData.ObjectType;
import cronapi.ParamMetaData;
import cronapi.Var;


/**
 * Classe funções para criação de arquivos xml no formato SOAP ENV ...
 * 
 * @author Diana Arcanjo
 * @version 1.0
 * @since 2019-11-01
 *
 */
 
@CronapiMetaData(categoryName = "Soap Create") 
public class CreateSoapEnv {

	// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ObterLogradouroPorCep
@CronapiMetaData(type = "function", name = "Xml ObterLogradouroPorCep ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createObterLogradouroPorCep(			
		@ParamMetaData(type = ObjectType.STRING, description = "Cep") Var inputCep) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String cep = Var.valueOf(inputCep).toString();	

			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("ObterLogradouroPorCep","ser","");
			SOAPBodyElement ObterLogradouroPorCep = soapBody.addBodyElement(bodyName);
			ObterLogradouroPorCep.addChildElement("cep").addTextNode(cep);

			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}

	// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ObterCandidato
@CronapiMetaData(type = "function", name = "Xml ObterCandidato ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createObterCandidato(			
		@ParamMetaData(type = ObjectType.STRING, description = "codCandidato") Var inputCodCandidato,
		@ParamMetaData(type = ObjectType.STRING, description = "codConcurso") Var inputCodConcurso) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String codCandidato = Var.valueOf(inputCodCandidato).toString();	
			String codConcurso = Var.valueOf(inputCodConcurso).toString();	


			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("ObterCandidato","ser","");
			SOAPBodyElement obterCandidato = soapBody.addBodyElement(bodyName);
			obterCandidato.addChildElement("codCandidato").addTextNode(codCandidato);
			obterCandidato.addChildElement("codConcurso").addTextNode(codConcurso);

			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ListarPlanosOfertadosResponse
@CronapiMetaData(type = "function", name = "Xml ObterCandidato ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createListarPlanosOfertadosResponse(			
		@ParamMetaData(type = ObjectType.STRING, description = "codCandidato") Var inputCodCandidato,
		@ParamMetaData(type = ObjectType.STRING, description = "codConcurso") Var inputCodConcurso) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String codCandidato = Var.valueOf(inputCodCandidato).toString();	
			String codConcurso = Var.valueOf(inputCodConcurso).toString();	


			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name ListarPlanosOfertadosResponse  = soapFactory.createName("ListarPlanosOfertadosResponse","ns2","");
			SOAPBodyElement listaPlanosOfertadosDto = soapBody.addBodyElement(ListarPlanosOfertadosResponse);
			listaPlanosOfertadosDto.addChildElement("codCandidato").addTextNode(codCandidato);
			listaPlanosOfertadosDto.addChildElement("codConcurso").addTextNode(codConcurso);

			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}



// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ObterConfiguracaoDocumentosPorProcessoDoConcurso
@CronapiMetaData(type = "function", name = "Xml ObterConfiguracaoDocumentosPorProcessoDoConcurso ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createObterConfiguracaoDocumentosPorProcessoDoConcurso(			
		@ParamMetaData(type = ObjectType.STRING, description = "concurso ") Var inputCodigoConcurso) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String concurso = Var.valueOf(inputCodigoConcurso).toString();	

			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("ObterConfiguracaoDocumentosPorProcessoDoConcurso","ser","");
			SOAPBodyElement ObterConfiguracaoDocumentosPorProcessoDoConcurso = soapBody.addBodyElement(bodyName);
			ObterConfiguracaoDocumentosPorProcessoDoConcurso.addChildElement("concurso").addTextNode(concurso);

			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ObterDadosOfertaIngressoCandidato
@CronapiMetaData(type = "function", name = "Xml ObterDadosOfertaIngressoCandidato ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createObterDadosOfertaIngressoCandidato(			
		@ParamMetaData(type = ObjectType.STRING, description = "codCandidato") Var inputCodCandidato,
		@ParamMetaData(type = ObjectType.STRING, description = "codConcurso") Var inputCodConcurso) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String codCandidato = Var.valueOf(inputCodCandidato).toString();	
			String codConcurso = Var.valueOf(inputCodConcurso).toString();	


			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("ObterDadosOfertaIngressoCandidato","ser","");
			SOAPBodyElement obterCandidato = soapBody.addBodyElement(bodyName);

			//CANDIDATO PESSOA DTO
			Name filtroDadosOfertaIngressoCandidato = envelope.createName("filtroDadosOfertaIngressoCandidato");
			SOAPElement elemento1 = obterCandidato.addChildElement(filtroDadosOfertaIngressoCandidato);
			elemento1.addChildElement("codCandidato").addTextNode(codCandidato);
			elemento1.addChildElement("codConcurso").addTextNode(codConcurso);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}

// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ObterDadosOfertaCurso
@CronapiMetaData(type = "function", name = "Xml ObterDadosOfertaCurso ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createObterDadosOfertaCurso(			
		@ParamMetaData(type = ObjectType.STRING, description = "oferta_de_curso") Var inputOfertaDeCurso) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String oferta_de_curso = Var.valueOf(inputOfertaDeCurso).toString();

			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("ObterDadosOfertaCurso","ser","");
			SOAPBodyElement obterCandidato = soapBody.addBodyElement(bodyName);

			//CANDIDATO PESSOA DTO
			Name filtroOfertaCursoDto = envelope.createName("filtroOfertaCursoDto");
			SOAPElement elemento1 = obterCandidato.addChildElement(filtroOfertaCursoDto);
			elemento1.addChildElement("oferta_de_curso").addTextNode(oferta_de_curso);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}




// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ListarPlanosOfertados
@CronapiMetaData(type = "function", name = "Xml ListarPlanosOfertados ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createListarPlanosOfertados(			
		@ParamMetaData(type = ObjectType.STRING, description = "ofertaDeCurso") Var inputOfertaCurso) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String ofertaDeCurso = Var.valueOf(inputOfertaCurso).toString();	


			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("ListarPlanosOfertados","ser","");
			SOAPBodyElement ListarPlanosOfertados = soapBody.addBodyElement(bodyName);

			//CANDIDATO PESSOA DTO
			Name filtroPlanosOfertadosDto = envelope.createName("filtroPlanosOfertadosDto");
			SOAPElement elemento1 = ListarPlanosOfertados.addChildElement(filtroPlanosOfertadosDto);
			elemento1.addChildElement("ofertaDeCurso").addTextNode(ofertaDeCurso);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:GerarArquivoBoleto
@CronapiMetaData(type = "function", name = "Xml GerarArquivoBoleto ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createGerarArquivoBoleto(			
		@ParamMetaData(type = ObjectType.STRING, description = "CodigoAluno") Var inputCodigoAluno,
		@ParamMetaData(type = ObjectType.STRING, description = "CodigoBoleto") Var inputCodigoBoleto) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String codigoAluno = Var.valueOf(inputCodigoAluno).toString();
			String codigoBoleto = Var.valueOf(inputCodigoBoleto).toString();	


			try {

			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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

			//ELEMENTO GerarArquivoBoleto	
			Name bodyName  = soapFactory.createName("GerarArquivoBoleto","ser","");
			SOAPBodyElement GerarArquivoBoleto = soapBody.addBodyElement(bodyName);	
			GerarArquivoBoleto.addChildElement("CodigoAluno").addTextNode(codigoAluno);
			GerarArquivoBoleto.addChildElement("CodigoBoleto").addTextNode(codigoBoleto);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }

		return Var.valueOf("ok");
}

// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:GeraContradoAlunoParaAceite
@CronapiMetaData(type = "function", name = "Xml GeraContradoAlunoParaAceite ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createGeraContradoAlunoParaAceite(			
		@ParamMetaData(type = ObjectType.STRING, description = "CodigoAluno") Var inputCodigoAluno) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String codigoAluno = Var.valueOf(inputCodigoAluno).toString();

			try {

			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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

			//ELEMENTO GerarArquivoBoleto	
			Name bodyName  = soapFactory.createName("GeraContradoAlunoParaAceite","ser","");
			SOAPBodyElement GeraContradoAlunoParaAceite = soapBody.addBodyElement(bodyName);	
			GeraContradoAlunoParaAceite.addChildElement("codigoAluno").addTextNode(codigoAluno);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }

		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:IncluirAceiteDeContratoAluno
@CronapiMetaData(type = "function", name = "Xml IncluirAceiteDeContratoAluno ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createIncluirAceiteDeContratoAluno(			
		@ParamMetaData(type = ObjectType.STRING, description = "Codigo Aluno ") Var inputCodigoAluno,	
		@ParamMetaData(type = ObjectType.STRING, description = "Documento HTML") Var inputDocumentoHtml,
		@ParamMetaData(type = ObjectType.STRING, description = "Contrato Aceito") Var inputContratoAceito,
		@ParamMetaData(type = ObjectType.STRING, description = "Ano ") Var inputAno,
		@ParamMetaData(type = ObjectType.STRING, description = "Periodo ") Var inputPeriodo) { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";


			//VARIAVEIS DE INPUT
			String codigoAluno = Var.valueOf(inputCodigoAluno).toString();
			String documentoHtml = Var.valueOf(inputDocumentoHtml).toString();
			String contratoAceito = Var.valueOf(inputContratoAceito).toString();				
			String ano = Var.valueOf(inputAno).toString();
			String periodo = Var.valueOf(inputPeriodo).toString();

			try {

			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("IncluirAceiteDeContratoAluno","ser","");
			SOAPBodyElement IncluirAceiteDeContratoAluno = soapBody.addBodyElement(bodyName);

			//CANDIDATO PESSOA DTO
			Name contratoDto = envelope.createName("contratoDto");
			SOAPElement elemento1 = IncluirAceiteDeContratoAluno.addChildElement(contratoDto);
			elemento1.addChildElement("codigoAluno").addTextNode(codigoAluno);
			elemento1.addChildElement("documentoHtml").addTextNode(documentoHtml);
			elemento1.addChildElement("contratoAceito").addTextNode(contratoAceito);
			elemento1.addChildElement("ano").addTextNode(ano);
			elemento1.addChildElement("periodo").addTextNode(periodo);
			
			
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }

		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:ListarPlanosOfertadosPadrao
@CronapiMetaData(type = "function", name = "Xml ListarPlanosOfertadosPadrao ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createListarPlanosOfertadosPadrao() { 


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";

			try {
			MessageFactory factory = MessageFactory.newInstance();			
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("ListarPlanosOfertadosPadrao","ser","");
			SOAPBodyElement ListarPlanosOfertadosPadrao = soapBody.addBodyElement(bodyName);

			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println(xmlFinaly);

			return Var.valueOf(xmlFinaly);
   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:AlterarPessoaCandidato
@CronapiMetaData(type = "function", name = "Criar Xml AlterarPessoaCandidato ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createAlterarPessoaCandidato(
		@ParamMetaData(type = ObjectType.STRING, description = "Código Candidato") Var inputCodigoCandidato,
		@ParamMetaData(type = ObjectType.STRING, description = "Código Concurso ") Var inputCodigoConcurso,
		@ParamMetaData(type = ObjectType.STRING, description = "Código Pessoa ") Var inputCodigoPessoaDTO,
		@ParamMetaData(type = ObjectType.STRING, description = "Nome Completo ") Var inputNomeCompleto,		
		@ParamMetaData(type = ObjectType.STRING, description = "Data de Nascimento ") Var inputDataNascimento,	
		@ParamMetaData(type = ObjectType.STRING, description = "Nacionalidade ") Var inputNacionalidade,
		@ParamMetaData(type = ObjectType.STRING, description = "Sexo ") Var inputSexo, 
		@ParamMetaData(type = ObjectType.STRING, description = "Estado Civil ") Var inputEstadoCivil,
		@ParamMetaData(type = ObjectType.STRING, description = "Endereço ") Var inputEndereco,
		@ParamMetaData(type = ObjectType.STRING, description = "Numero ") Var inputNumero,
		@ParamMetaData(type = ObjectType.STRING, description = "Complemento ") Var inputComplemento,
		@ParamMetaData(type = ObjectType.STRING, description = "Bairro ") Var inputBairro,
		@ParamMetaData(type = ObjectType.STRING, description = "Código Municipio ") Var inputCodigoMunicipio,
		@ParamMetaData(type = ObjectType.STRING, description = "Nome Municipio ") Var inputNomeMunicipio,	
		@ParamMetaData(type = ObjectType.STRING, description = "Uf Municipio ") Var inputUfMunicipio,
		@ParamMetaData(type = ObjectType.STRING, description = "Cep Municipio ") Var inputCepMunicipio,
		@ParamMetaData(type = ObjectType.STRING, description = "Cep ") Var inputCep,
		@ParamMetaData(type = ObjectType.STRING, description = "Telefone ") Var inputTelefone,
		@ParamMetaData(type = ObjectType.STRING, description = "Cpf ") Var inputCpf,
		@ParamMetaData(type = ObjectType.STRING, description = "Celular ") Var inputCelular,		
		@ParamMetaData(type = ObjectType.STRING, description = "Email Pessoal ") Var inputEmailPessoal,
		@ParamMetaData(type = ObjectType.STRING, description = "Ddd Fone ") Var inputDddFone,
		@ParamMetaData(type = ObjectType.STRING, description = "Ddd Fone Celular ") Var inputDddFoneCelular) {


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";			

			// VARIAVEIS PARA O XML
			String codigoCandidato = Var.valueOf(inputCodigoCandidato).toString();
			String codigoConcurso = Var.valueOf(inputCodigoConcurso).toString();
			String codigoPessoaDTO = Var.valueOf(inputCodigoPessoaDTO).toString();
			String nomeCompleto = Var.valueOf(inputNomeCompleto).toString();
			String dataNascimento = Var.valueOf(inputDataNascimento).toString();
			String nacionalidade = Var.valueOf(inputNacionalidade).toString();			
			String sexo = Var.valueOf(inputSexo).toString();	
			String estadoCivil = Var.valueOf(inputEstadoCivil).toString();		
			String endereco = Var.valueOf(inputEndereco).toString();			
			String numero = Var.valueOf(inputNumero).toString();
			String complemento = Var.valueOf(inputComplemento).toString();
			String bairro = Var.valueOf(inputBairro).toString();
			String codigoMunicipio = Var.valueOf(inputCodigoMunicipio).toString();
			String nomeMunicipio = Var.valueOf(inputNomeMunicipio).toString();
			String ufMunicipio = Var.valueOf(inputUfMunicipio).toString();		
			String cep = Var.valueOf(inputCep).toString();
			String telefone = Var.valueOf(inputTelefone).toString();
			String cpf = Var.valueOf(inputCpf).toString();
			String celular = Var.valueOf(inputCelular).toString();		
			String emailPessoal = Var.valueOf(inputEmailPessoal).toString();
			String dddFone = Var.valueOf(inputDddFone).toString();
			String dddFoneCelular = Var.valueOf(inputDddFoneCelular).toString();		

		

			try {
			MessageFactory factory = MessageFactory.newInstance();
			SOAPMessage soapMsg = factory.createMessage();
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
			Name bodyName  = soapFactory.createName("AlterarPessoaCandidato","ser","");
			SOAPBodyElement purchaseLineItems = soapBody.addBodyElement(bodyName);			

			//CANDIDATO PESSOA DTO
			Name candidatoPessoaDto = envelope.createName("candidatoPessoaDto");
			SOAPElement elemento1 = purchaseLineItems.addChildElement(candidatoPessoaDto);
			elemento1.addChildElement("codigoCandidato").addTextNode(codigoCandidato);
			elemento1.addChildElement("codigoConcurso").addTextNode(codigoConcurso);

			//PESSOA DTO
			Name pessoaDto = envelope.createName("pessoaDto");
			SOAPElement elemento2 = elemento1.addChildElement(pessoaDto);
			elemento2.addChildElement("codigo").addTextNode(codigoPessoaDTO);
			elemento2.addChildElement("nomeCompleto").addTextNode(nomeCompleto);
			elemento2.addChildElement("nomeAbreviado").addTextNode(nomeCompleto);	
			elemento2.addChildElement("dataNascimento").addTextNode(dataNascimento);		

			// CONTIUAÇÃO PESSOA DTO - ELEMENTO 2		
			elemento2.addChildElement("nacionalidade").addTextNode(nacionalidade);			
			elemento2.addChildElement("sexo").addTextNode(sexo);
			elemento2.addChildElement("estadoCivil").addTextNode(estadoCivil);
			elemento2.addChildElement("endereco").addTextNode(endereco);
			elemento2.addChildElement("numero").addTextNode(numero);
			elemento2.addChildElement("complemento").addTextNode(complemento);
			elemento2.addChildElement("bairro").addTextNode(bairro);

			//MUNICIPIO - ELEMENTO 2
			Name municipio = envelope.createName("municipio");
			SOAPElement elemento4 = elemento2.addChildElement(municipio);
			elemento4.addChildElement("codigo").addTextNode(codigoMunicipio);
			elemento4.addChildElement("nome").addTextNode(nomeMunicipio);
			elemento4.addChildElement("uf").addTextNode(ufMunicipio);
			elemento4.addChildElement("cep").addTextNode(cep);

			// CONTIUAÇÃO PESSOA DTO - ELEMENTO 2	
			elemento2.addChildElement("cep").addTextNode(cep);
			elemento2.addChildElement("telefone").addTextNode(telefone);

			// CONTIUAÇÃO PESSOA DTO - ELEMENTO 2
			elemento2.addChildElement("cpf").addTextNode(cpf);	
			elemento2.addChildElement("celular").addTextNode(celular);
			elemento2.addChildElement("emailPessoal").addTextNode(emailPessoal);		
			elemento2.addChildElement("dddFone").addTextNode(dddFone);
			elemento2.addChildElement("dddFoneCelular").addTextNode(dddFoneCelular);			
			
			//soapMsg.saveChanges();

			System.out.println("PRINT XML SOAP");
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println("Resultado do xml >>>> " + xmlFinaly);

			return Var.valueOf(xmlFinaly);

   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:EfetivarIngressoCandidato
@CronapiMetaData(type = "function", name = "Criar Xml EfetivarIngressoCandidato ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createEfetivarIngressoCandidato(
		@ParamMetaData(type = ObjectType.STRING, description = "Código Concurso") Var inputCodigoConcurso,
		@ParamMetaData(type = ObjectType.STRING, description = "Código Candidato ") Var inputCodigoCandidato,
		@ParamMetaData(type = ObjectType.STRING, description = "Tipo Pagamento ") Var inputTipoPagamento,
		@ParamMetaData(type = ObjectType.STRING, description = "Plano Escolhido " ) Var inputPlanoEscolhido
		) {


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";			

			// VARIAVEIS PARA efetivacaoIngressoCandidato
			String codigoConcurso = Var.valueOf(inputCodigoConcurso).toString();
			String codigoCandidato = Var.valueOf(inputCodigoCandidato).toString();
			String tipoPagamento = Var.valueOf(inputTipoPagamento).toString();
			String planoEscolhido = Var.valueOf(inputPlanoEscolhido).toString();
			String ehEnsinoBasico = Var.valueOf("false").toString();
			
			try {
			MessageFactory factory = MessageFactory.newInstance();
			SOAPMessage soapMsg = factory.createMessage();
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

			//ELEMENTO EfetivarIngressoCandidato
			Name bodyName  = soapFactory.createName("EfetivarIngressoCandidato","ser","");
			SOAPBodyElement purchaseLineItems = soapBody.addBodyElement(bodyName);			

			//efetivacaoIngressoCandidato
			Name efetivacaoIngressoCandidato = envelope.createName("efetivacaoIngressoCandidato");
			SOAPElement elemento1 = purchaseLineItems.addChildElement(efetivacaoIngressoCandidato);
			elemento1.addChildElement("codigoConcurso").addTextNode(codigoConcurso);
			elemento1.addChildElement("codigoCandidato").addTextNode(codigoCandidato);	
			elemento1.addChildElement("tipoPagamento").addTextNode(tipoPagamento);
			elemento1.addChildElement("planoEscolhido").addTextNode(planoEscolhido);
			elemento1.addChildElement("ehEnsinoBasico").addTextNode(ehEnsinoBasico);
			elemento1.addChildElement("tipoRespFinan").addTextNode("Pessoa");			

			//soapMsg.saveChanges();

			System.out.println("PRINT XML SOAP");
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			return Var.valueOf(xmlFinaly);

   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}



// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:EfetivarIngressoCandidatoOutraPessoa
@CronapiMetaData(type = "function", name = "Criar Xml EfetivarIngressoCandidatoOutraPessoa ", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createEfetivarIngressoCandidatoRespFinanceiro(
		@ParamMetaData(type = ObjectType.STRING, description = "Código Concurso") Var inputCodigoConcurso,
		@ParamMetaData(type = ObjectType.STRING, description = "Código Candidato ") Var inputCodigoCandidato,
		@ParamMetaData(type = ObjectType.STRING, description = "Tipo Pagamento ") Var inputTipoPagamento,
		@ParamMetaData(type = ObjectType.STRING, description = "Plano Escolhido ") Var inputPlanoEscolhido,
		@ParamMetaData(type = ObjectType.STRING, description = "Titular ") Var inputTitular,
		@ParamMetaData(type = ObjectType.STRING, description = "Cpf ") Var inputCpf,
		@ParamMetaData(type = ObjectType.STRING, description = "Endereço ") Var inputEndereco,
		@ParamMetaData(type = ObjectType.STRING, description = "Numero ") Var inputNumeroEndereco,
		@ParamMetaData(type = ObjectType.STRING, description = "Complemento ") Var inputComplementoEndereco,
		@ParamMetaData(type = ObjectType.STRING, description = "Bairro ") Var inputBairro,
		@ParamMetaData(type = ObjectType.STRING, description = "Municipio ") Var inputMunicipio,		
		@ParamMetaData(type = ObjectType.STRING, description = "Cep ") Var inputCep,
		@ParamMetaData(type = ObjectType.STRING, description = "Estado ") Var inputEstado,
		@ParamMetaData(type = ObjectType.STRING, description = "Data Nascimento ") Var inputDataNascimento,
		@ParamMetaData(type = ObjectType.STRING, description = "Email ") Var inputEmail,
		@ParamMetaData(type = ObjectType.STRING, description = "Estado Civil ") Var inputEstadoCivil,
		@ParamMetaData(type = ObjectType.STRING, description = "Rg ") Var inputRgNumero,	
		@ParamMetaData(type = ObjectType.STRING, description = "Sexo ") Var inputSexo) {


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";			

			// VARIAVEIS PARA efetivacaoIngressoCandidato
			String codigoConcurso = Var.valueOf(inputCodigoConcurso).toString();
			String codigoCandidato = Var.valueOf(inputCodigoCandidato).toString();
			String tipoPagamento = Var.valueOf(inputTipoPagamento).toString();
			String planoEscolhido = Var.valueOf(inputPlanoEscolhido).toString();

			// VARIAVEIS PARA responsavelFinanceiroTD
			String titular = Var.valueOf(inputTitular).toString();
			String cpf = Var.valueOf(inputCpf).toString();
			String endereco = Var.valueOf(inputEndereco).toString();
			String numeroEndereco = Var.valueOf(inputNumeroEndereco).toString();
			String complementoEndereco = Var.valueOf(inputComplementoEndereco).toString();
			String bairro = Var.valueOf(inputBairro).toString();
			String municipio = Var.valueOf(inputMunicipio).toString();
			String cep = Var.valueOf(inputCep).toString();
			String estado = Var.valueOf(inputEstado).toString();
			String dataNascimento = Var.valueOf(inputDataNascimento).toString();
			String email = Var.valueOf(inputEmail).toString();
			String estadoCivil = Var.valueOf(inputEstadoCivil).toString();	
			String rgNumero = Var.valueOf(inputRgNumero).toString();					
			String sexo = Var.valueOf(inputSexo).toString();
			
			try {
			MessageFactory factory = MessageFactory.newInstance();
			SOAPMessage soapMsg = factory.createMessage();
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

			//ELEMENTO EfetivarIngressoCandidato
			Name bodyName  = soapFactory.createName("EfetivarIngressoCandidato","ser","");
			SOAPBodyElement purchaseLineItems = soapBody.addBodyElement(bodyName);			

			//efetivacaoIngressoCandidato
			Name efetivacaoIngressoCandidato = envelope.createName("efetivacaoIngressoCandidato");
			SOAPElement elemento1 = purchaseLineItems.addChildElement(efetivacaoIngressoCandidato);
			elemento1.addChildElement("codigoConcurso").addTextNode(codigoConcurso);
			elemento1.addChildElement("codigoCandidato").addTextNode(codigoCandidato);
			elemento1.addChildElement("tipoPagamento").addTextNode(tipoPagamento);	
			elemento1.addChildElement("planoEscolhido").addTextNode(planoEscolhido);
			elemento1.addChildElement("tipoRespFinan").addTextNode("OutraPessoa");

			//PESSOA DTO
			Name responsavelFinanceiroTD = envelope.createName("responsavelFinanceiroTD");
			SOAPElement elemento2 = elemento1.addChildElement(responsavelFinanceiroTD);
			elemento2.addChildElement("titular").addTextNode(titular);
			elemento2.addChildElement("cpf").addTextNode(cpf);
			elemento2.addChildElement("endereco").addTextNode(endereco);
			elemento2.addChildElement("numeroEndereco").addTextNode(numeroEndereco);
			elemento2.addChildElement("complementoEndereco").addTextNode(complementoEndereco);
			elemento2.addChildElement("bairro").addTextNode(bairro);
			elemento2.addChildElement("municipio").addTextNode(municipio);			
			elemento2.addChildElement("cep").addTextNode(cep);	
			elemento2.addChildElement("estado").addTextNode(estado);					
			elemento2.addChildElement("dataNascimento").addTextNode(dataNascimento);			
			elemento2.addChildElement("email").addTextNode(email);			
			elemento2.addChildElement("estadoCivil").addTextNode(estadoCivil);	
			elemento2.addChildElement("rgNumero").addTextNode(rgNumero);					
			elemento2.addChildElement("sexo").addTextNode(sexo);	

			//soapMsg.saveChanges();

			System.out.println("PRINT XML SOAP");
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println("Resultado do xml >>>> " + xmlFinaly);

			return Var.valueOf(xmlFinaly);

   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}


// FUNÇÃO ESCREVER XML NO FORMATO SOAP ENV DO SERVIÇO ser:EfetivarIngressoCandidatoEmpresa
@CronapiMetaData(type = "function", name = "Criar Xml EfetivarIngressoCandidatoEmpresa", nameTags = {
			"Auth Basic" }, description = "função para escrever xml no formato soap env", returnType = ObjectType.STRING)
	public static final Var createEfetivarIngressoCandidatoRespFinanceiroEmpresa(
		@ParamMetaData(type = ObjectType.STRING, description = "Código Concurso") Var inputCodigoConcurso,
		@ParamMetaData(type = ObjectType.STRING, description = "Código Candidato ") Var inputCodigoCandidato,
		@ParamMetaData(type = ObjectType.STRING, description = "Plano Escolhido ") Var inputPlanoEscolhido,
		@ParamMetaData(type = ObjectType.STRING, description = "Tipo Pagamento ") Var inputTipoPagamento,
		@ParamMetaData(type = ObjectType.STRING, description = "Titular ") Var inputTitular,
		@ParamMetaData(type = ObjectType.STRING, description = "Cnpj ") Var inputCnpj,
		@ParamMetaData(type = ObjectType.STRING, description = "Endereço ") Var inputEndereco,
		@ParamMetaData(type = ObjectType.STRING, description = "Numero ") Var inputNumeroEndereco,
		@ParamMetaData(type = ObjectType.STRING, description = "Complemento ") Var inputComplementoEndereco,
		@ParamMetaData(type = ObjectType.STRING, description = "Bairro ") Var inputBairro,
		@ParamMetaData(type = ObjectType.STRING, description = "Municipio ") Var inputMunicipio,		
		@ParamMetaData(type = ObjectType.STRING, description = "Cep ") Var inputCep,
		@ParamMetaData(type = ObjectType.STRING, description = "Estado ") Var inputEstado) {


			String servico = "ser";	
			String serverURI = "http://servicos.webservices.lyceum.techne/";			

			// VARIAVEIS PARA efetivacaoIngressoCandidato
			String codigoConcurso = Var.valueOf(inputCodigoConcurso).toString();
			String codigoCandidato = Var.valueOf(inputCodigoCandidato).toString();
			String tipoPagamento = Var.valueOf(inputTipoPagamento).toString();
			String planoEscolhido = Var.valueOf(inputPlanoEscolhido).toString();

			// VARIAVEIS PARA responsavelFinanceiroTD
			String titular = Var.valueOf(inputTitular).toString();
			String cnpj = Var.valueOf(inputCnpj).toString();
			String endereco = Var.valueOf(inputEndereco).toString();
			String numeroEndereco = Var.valueOf(inputNumeroEndereco).toString();
			String complementoEndereco = Var.valueOf(inputComplementoEndereco).toString();
			String bairro = Var.valueOf(inputBairro).toString();
			String municipio = Var.valueOf(inputMunicipio).toString();
			String cep = Var.valueOf(inputCep).toString();
			String estado = Var.valueOf(inputEstado).toString();
			
			try {
			MessageFactory factory = MessageFactory.newInstance();
			SOAPMessage soapMsg = factory.createMessage();
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

			//ELEMENTO EfetivarIngressoCandidato
			Name bodyName  = soapFactory.createName("EfetivarIngressoCandidato","ser","");
			SOAPBodyElement purchaseLineItems = soapBody.addBodyElement(bodyName);			

			//efetivacaoIngressoCandidato
			Name efetivacaoIngressoCandidato = envelope.createName("efetivacaoIngressoCandidato");
			SOAPElement elemento1 = purchaseLineItems.addChildElement(efetivacaoIngressoCandidato);
			elemento1.addChildElement("codigoConcurso").addTextNode(codigoConcurso);
			elemento1.addChildElement("codigoCandidato").addTextNode(codigoCandidato);
			elemento1.addChildElement("tipoPagamento").addTextNode(tipoPagamento);		
			elemento1.addChildElement("planoEscolhido").addTextNode(planoEscolhido);
			elemento1.addChildElement("tipoRespFinan").addTextNode("Empresa");

			//PESSOA DTO
			Name responsavelFinanceiroTD = envelope.createName("responsavelFinanceiroTD");
			SOAPElement elemento2 = elemento1.addChildElement(responsavelFinanceiroTD);	
			elemento2.addChildElement("titular").addTextNode(titular);
			elemento2.addChildElement("cnpj").addTextNode(cnpj);
			elemento2.addChildElement("endereco").addTextNode(endereco);
			elemento2.addChildElement("numeroEndereco").addTextNode(numeroEndereco);
			elemento2.addChildElement("complementoEndereco").addTextNode(complementoEndereco);
			elemento2.addChildElement("bairro").addTextNode(bairro);
			elemento2.addChildElement("municipio").addTextNode(municipio);		
			elemento2.addChildElement("cep").addTextNode(cep);	
			elemento2.addChildElement("estado").addTextNode(estado);		

			//soapMsg.saveChanges();

			System.out.println("PRINT XML SOAP");
			ByteArrayOutputStream stream = new ByteArrayOutputStream();	
            soapMsg.writeTo(stream);	
			String xmlFinaly = new String(stream.toByteArray(), "utf-8"); 

			System.out.println("Resultado do xml >>>> " + xmlFinaly);

			return Var.valueOf(xmlFinaly);

   
        }catch(Exception e){

            e.printStackTrace();

        }	
		return Var.valueOf("ok");
}



}





