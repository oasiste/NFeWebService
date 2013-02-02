package br.com.nfe.webservice.service;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.xml.sax.SAXException;

import br.com.nfe.webservice.WebService;
import br.com.nfe.webservice.WebServiceUF;
import br.com.usicamp.nfe.core.certificado.Certificado;
import br.com.usicamp.nfe.core.dto.EnvNFe;
import br.com.usicamp.nfe.core.dto.RetCancNFe;
import br.com.usicamp.nfe.core.dto.RetConsReciNFe;
import br.com.usicamp.nfe.core.dto.RetEnvEvento;
import br.com.usicamp.nfe.core.dto.RetEnviNFe;
import br.com.usicamp.nfe.core.dto.RetInutNFe;


public class NFeServiceImpl implements NFeService{
			
	protected NFeServiceImpl() {
	}
	
	public RetEnviNFe enviaLoteNFe(EnvNFe envNFe) throws Exception {	
		WebServiceUF serviceUF = WebServiceUF.getInstance(envNFe.getUf());
		WebService webService = serviceUF.getNfeRecepcao(envNFe.getAmbiente(),  envNFe.getXmlEnvNFeString());	
		webService.envia();		
		return (RetEnviNFe) webService.getRetorno();
	}
	
	public RetConsReciNFe consReciNFe(String cUF,Integer ambiente,String xmlConsReciNFe) throws SAXException, IOException, ParserConfigurationException, ServiceException, SOAPException,Exception {
		WebServiceUF webServiceUF = WebServiceUF.getInstance(cUF);
		WebService webService = webServiceUF.getNfeRetRecepcao(ambiente, xmlConsReciNFe);
		webService.envia();
		return (RetConsReciNFe) webService.getRetorno();
	}
	
	public RetCancNFe cancelaNFe(String cUF,Integer ambiente,String xmlCancelamento) throws SAXException, IOException, ParserConfigurationException, ServiceException, SOAPException,Exception {
		WebService webService = WebServiceUF.getInstance( cUF).getNfeCancelamento(ambiente,xmlCancelamento);
		webService.envia();
		return (RetCancNFe) webService.getRetorno();
	}
	
	public RetInutNFe inutilizaNFe(String cUF,Integer ambiente,String xmlInut,Certificado certificado) throws SAXException, IOException, ParserConfigurationException, ServiceException, SOAPException,Exception {
//		String xmlInut = XMLv2.getXmlInutNFe(inutNFeDTO);
		xmlInut = certificado.assinarRaiz(xmlInut);
		WebService webService = WebServiceUF.getInstance(cUF).getNfeInutilizacao(ambiente, xmlInut); 
		webService.envia();
		return (RetInutNFe) webService.getRetorno();
	}

	public RetEnvEvento enviaCartaCorrecao(String cUF,String xmlCartaCorrecao) throws SAXException, IOException,
			ParserConfigurationException, ServiceException, SOAPException,
			Exception {
//		String xmlCartaCorrecao = XMLv2.getXmlCartaCorrecao(envEventoDTO);
//		xmlCartaCorrecao = certificado.assinarRaiz(xmlCartaCorrecao);
		WebService webService = WebServiceUF.getInstance(cUF).getCartaCorrecao(1, xmlCartaCorrecao);
		webService.envia();
		return (RetEnvEvento)webService.getRetorno();
	}

}
