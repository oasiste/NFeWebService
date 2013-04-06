package br.com.nfe.webservice.service;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.xml.sax.SAXException;

import br.com.usicamp.nfe.core.certificado.Certificado;
import br.com.usicamp.nfe.core.dto.EnvNFe;
import br.com.usicamp.nfe.core.dto.RetCancNFe;
import br.com.usicamp.nfe.core.dto.RetConsReciNFe;
import br.com.usicamp.nfe.core.dto.RetEnvEvento;
import br.com.usicamp.nfe.core.dto.RetEnviNFe;
import br.com.usicamp.nfe.core.dto.RetInutNFe;

public interface NFeService {
	RetEnviNFe enviaLoteNFe(EnvNFe envNFe) throws SAXException, IOException, ParserConfigurationException, ServiceException, SOAPException,Exception;
	RetConsReciNFe consReciNFe(String cUF,Integer ambiente,String numeroReciboString) throws SAXException, IOException, ParserConfigurationException, ServiceException, SOAPException,Exception;
	
	public RetCancNFe cancelaNFe(String cUF,Integer ambiente,String xmlCancelamento) throws SAXException, IOException, ParserConfigurationException, ServiceException, SOAPException,Exception; 
	RetInutNFe inutilizaNFe(String cUF,Integer ambiente,String xmlInut,Certificado certificado) throws SAXException, IOException, ParserConfigurationException, ServiceException, SOAPException,Exception;
	
	RetEnvEvento enviaEvento(String cUF,String xmlEvento) throws Exception ;
	
}
