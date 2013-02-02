package br.com.nfe.webservice.v2.pr.prod;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.xmlbeans.XmlException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import br.com.nfe.webservice.v2.NFeCancelamento2;
import br.inf.portalfiscal.nfe.RetCancNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeCancelamento2;
import br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeCancelamento2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeCancelamento2Soap12Stub;
import br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeCancelamentoNF2Result;
import br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeDadosMsg;

public class NfeCancelamento2PRProd extends NFeCancelamento2 {
	
	private String xmlCancelamento;
	
	public NfeCancelamento2PRProd(String xmlCancelamento) {
		this.xmlCancelamento = xmlCancelamento;
	}

	public void envia() throws ServiceException, SAXException, IOException, ParserConfigurationException, XmlException {	
		
		NfeCabecMsg cabecMsg = new NfeCabecMsg("41", "2.00");
		
        SOAPHeaderElement oHeaderElement = new SOAPHeaderElement(NfeCabecMsg.getTypeDesc().getXmlType(),cabecMsg);
        NfeCancelamento2 nfeCancelamentoPR = new NfeCancelamento2Locator();
		
		NfeCancelamento2Soap12Stub nfeCancelamento2Soap12Stub = null;
		nfeCancelamento2Soap12Stub = (NfeCancelamento2Soap12Stub) nfeCancelamentoPR.getNfeCancelamentoServicePort();
		nfeCancelamento2Soap12Stub.setHeader(oHeaderElement);
		
		MessageElement[] messageElements = new MessageElement[1];
        Document documentDados = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlCancelamento)));
		Element elementDados = documentDados.getDocumentElement();
        messageElements[0] = new MessageElement(elementDados);
        
        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
        NfeCancelamentoNF2Result lote2Result = nfeCancelamento2Soap12Stub.nfeCancelamentoNF2(dadosMsg);
        
        for (MessageElement me : lote2Result.get_any()) {
            this.retCancNFeDocument  = RetCancNFeDocument.Factory.parse(me.toString());
        }
		
	}
	
}
 
