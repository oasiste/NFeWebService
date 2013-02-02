package br.com.nfe.webservice;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.apache.xmlbeans.XmlException;
import org.xml.sax.SAXException;

import br.com.usicamp.nfe.core.dto.Retorno;

public interface WebService {
 
	public void envia() throws SAXException, IOException, ParserConfigurationException,ServiceException,XmlException, SOAPException;
	public Retorno getRetorno() throws ServiceException, SAXException, IOException, ParserConfigurationException, XmlException; 
}
 
