package br.com.nfe.webservice.v2.pr.prod;

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

import br.com.nfe.webservice.v2.NfeRecepcaoEvento2;
import br.inf.portalfiscal.nfe.RetEnvEventoDocument;
import br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.*;

public class NfeRecepcaoEvento2PRProd extends NfeRecepcaoEvento2 {
	
	private String xmlEvento; 
	
	public NfeRecepcaoEvento2PRProd(String xmlEvento) {
		this.xmlEvento = xmlEvento;
	}
	

	public void envia() throws SAXException, IOException,
			ParserConfigurationException, ServiceException, XmlException,
			SOAPException {

		RecepcaoEvento nfeRecepcaoEvento = new RecepcaoEventoLocator();
        NfeCabecMsg cabecMsg = new NfeCabecMsg( "1.00","41");
        
        MessageElement[] messageElements = new MessageElement[1];
        Document XMLDoc;
    
		try {
			SOAPHeaderElement oHeaderElement = new SOAPHeaderElement(NfeCabecMsg.getTypeDesc().getXmlType(),cabecMsg);

			br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoapStub nfeRecepcao2Soap12Stub = null;
			nfeRecepcao2Soap12Stub = (br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoapStub) nfeRecepcaoEvento.getRecepcaoEventoSoap();
			nfeRecepcao2Soap12Stub.setHeader(oHeaderElement);
			
			XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlEvento)));
			Element element = XMLDoc.getDocumentElement();
	        messageElements[0] = new MessageElement(element);
	        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
	        NfeRecepcaoEventoResult lote2Result =  nfeRecepcao2Soap12Stub.nfeRecepcaoEvento(dadosMsg);// nfeRecepcaoEvento(cabecMsg, dadosMsg);  //getNfeRetRecepcaoServicePort().nfeRetRecepcao2(cabecMsg, dadosMsg);
	        
	        for (MessageElement me : lote2Result.get_any()) {
	        	this.envEventoDocument = RetEnvEventoDocument.Factory.parse(me.toString());//RetConsReciNFeDocument.Factory.parse(me.toString());
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
