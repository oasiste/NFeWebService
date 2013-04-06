package br.com.nfe.webservice.v2.go.prod;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.MessageElement;
import org.apache.xmlbeans.XmlException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.com.nfe.webservice.v2.NfeRecepcaoEvento2;
import br.inf.portalfiscal.nfe.RetEnvEventoDocument;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEvento;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoLocator;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoResult;

public class NfeRecepcaoEvento2GOProd extends NfeRecepcaoEvento2 {
	
	private String xmlEvento; 
	
	public NfeRecepcaoEvento2GOProd(String xmlEvento) {
		this.xmlEvento = xmlEvento;
	}
	

	public void envia() throws SAXException, IOException,
			ParserConfigurationException, ServiceException, XmlException,
			SOAPException {

		NfeRecepcaoEvento nfeRecepcaoEvento = new NfeRecepcaoEventoLocator();
        NfeCabecMsg cabecMsg = new NfeCabecMsg("52", "1.00");
        
        MessageElement[] messageElements = new MessageElement[1];
        Document XMLDoc;
//        RetConsReciNFe retConsReciNFe = new RetConsReciNFe();
    
		try {
			
			XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlEvento)));
			Element element = XMLDoc.getDocumentElement();
	        messageElements[0] = new MessageElement(element);
	        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
	        NfeRecepcaoEventoResult lote2Result =  nfeRecepcaoEvento.getNfeRecepcaoEventoServicePort().nfeRecepcaoEvento(cabecMsg, dadosMsg);  //getNfeRetRecepcaoServicePort().nfeRetRecepcao2(cabecMsg, dadosMsg);
	        
	        for (MessageElement me : lote2Result.get_any()) {
	        	this.envEventoDocument = br.inf.portalfiscal.nfe.cancelamento.RetEnvEventoDocument.Factory.parse(me.toString());//RetConsReciNFeDocument.Factory.parse(me.toString());
	        	System.out.println(me.toString());
//	        	retConsReciNFe.setXmlRetorno(me.toString());
	        }
	        
		} catch (SAXException e) {
//			retConsReciNFe.setcStat(0);
//			retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (IOException e) {
//			retConsReciNFe.setcStat(0);
//			retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
//			retConsReciNFe.setcStat(0);
//			retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (ServiceException e) {
//			retConsReciNFe.setcStat(0);
//			retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} 
		
	}

}
