package br.com.nfe.webservice.v2.go.hom;

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
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferecepcao2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferecepcao2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferecepcao2.NfeRecepcao2;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferecepcao2.NfeRecepcao2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferecepcao2.NfeRecepcaoLote2Result;

public class NFeRecepcao2GOHom extends NFeRecepcao2 {
	
	String xmlEnviNFe = null;
	
	public NFeRecepcao2GOHom(String xmlEnviNFe) {
		super();
		this.xmlEnviNFe = xmlEnviNFe;
	}

	public void envia() throws SAXException, IOException, ParserConfigurationException, ServiceException, XmlException {
		NfeRecepcao2 nfeRecepcaoGO = new NfeRecepcao2Locator();
        NfeCabecMsg cabecMsg = new NfeCabecMsg("52", "2.00");
        
        MessageElement[] messageElements = new MessageElement[1];
        Document XMLDoc;
        RetEnviNFe retEnvNFe = new RetEnviNFe();

		XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlEnviNFe)));
		Element element = XMLDoc.getDocumentElement();
        messageElements[0] = new MessageElement(element);
        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
        NfeRecepcaoLote2Result lote2Result =  nfeRecepcaoGO.getNfeRecepcaoServicePort().nfeRecepcaoLote2(cabecMsg, dadosMsg);
        
        RetEnviNFeDocument retEnviNFeDocument = null;
        for (MessageElement me : lote2Result.get_any()) {
            retEnviNFeDocument = RetEnviNFeDocument.Factory.parse(me.toString());
            retEnvNFe.setXmlRetorno(me.toString());
        }
        this.retEnviNFeDocument = retEnviNFeDocument;
	}
 
}
 
