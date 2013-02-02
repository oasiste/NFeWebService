package br.com.nfe.webservice.v2;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.xmlbeans.XmlException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.Retorno;
import br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.*;

public abstract class NfeDownloadNf implements WebService {
	
	protected String xmlDownloadNf; 
	
	public NfeDownloadNf(String xmlDownloadNf) {
		this.xmlDownloadNf = xmlDownloadNf;
	}
	
	public Retorno getRetorno() throws ServiceException, SAXException, IOException, ParserConfigurationException, XmlException {
		
		
		
		return null;
	}

}
