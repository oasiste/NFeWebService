package br.com.nfe.webservice.v2.go.prod;


import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.apache.xmlbeans.XmlException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.com.nfe.webservice.v2.NFeRecepcao2;
import br.com.usicamp.nfe.core.dto.RetEnviNFe;
import br.inf.portalfiscal.nfe.RetEnviNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcao2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcao2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcao2.NfeRecepcao2;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcao2.NfeRecepcao2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcao2.NfeRecepcaoLote2Result;

public class NFeRecepcao2GOProd extends NFeRecepcao2 {
	
	String xmlEnviNFe = null;
	
	

	public NFeRecepcao2GOProd(String xmlEnviNFe) {
		super();
		this.xmlEnviNFe = xmlEnviNFe;
	}



	public void envia() {
		NfeRecepcao2 nfeRecepcaoGO = new NfeRecepcao2Locator();
        NfeCabecMsg cabecMsg = new NfeCabecMsg("52", "2.00");
        
        MessageElement[] messageElements = new MessageElement[1];
        Document XMLDoc;
        RetEnviNFe retEnvNFe = new RetEnviNFe();
	
		try {
			XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlEnviNFe)));
			Element element = XMLDoc.getDocumentElement();
	        messageElements[0] = new MessageElement(element);
	        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
	        NfeRecepcaoLote2Result lote2Result =  nfeRecepcaoGO.getNfeRecepcaoServicePort().nfeRecepcaoLote2(cabecMsg, dadosMsg);
	        
	        RetEnviNFeDocument retEnviNFeDocument = null;
	        for (MessageElement me : lote2Result.get_any()) {
	            retEnviNFeDocument = RetEnviNFeDocument.Factory.parse(me.toString());
	        }
	        
	        this.retEnviNFeDocument = retEnviNFeDocument;
	        
		} catch (SAXException e) {
			retEnvNFe.setcStat(0);
			retEnvNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (IOException e) {
			retEnvNFe.setcStat(0);
			retEnvNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			retEnvNFe.setcStat(0);
			retEnvNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (ServiceException e) {
			retEnvNFe.setcStat(0);
			retEnvNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (XmlException e) {
			retEnvNFe.setcStat(0);
			retEnvNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		}
	}
 
}
 
