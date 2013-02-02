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

import br.com.nfe.webservice.v2.NFeCancelamento2;
import br.inf.portalfiscal.nfe.RetCancNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nfecancelamento2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nfecancelamento2.NfeCancelamento2;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nfecancelamento2.NfeCancelamento2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nfecancelamento2.NfeCancelamentoNF2Result;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nfecancelamento2.NfeDadosMsg;

public class NfeCancelamento2GOHom extends NFeCancelamento2 {

	private String xmlCancNfe;


	public NfeCancelamento2GOHom(String xmlCancNfe) {
		super();
		this.xmlCancNfe = xmlCancNfe;
	}


	public void envia() throws SAXException, IOException, ParserConfigurationException, ServiceException, XmlException {
		NfeCancelamento2 nfeRecepcaoGO = new NfeCancelamento2Locator();
		NfeCabecMsg cabecMsg = new NfeCabecMsg("52", "2.00");

		MessageElement[] messageElements = new MessageElement[1];
		Document XMLDoc;

		XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlCancNfe)));
		Element element = XMLDoc.getDocumentElement();
		messageElements[0] = new MessageElement(element);
		NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
		NfeCancelamentoNF2Result nfeCancelamentoNF2Result=  nfeRecepcaoGO.getNfeCancelamentoServicePort().nfeCancelamentoNF2(cabecMsg, dadosMsg);

		RetCancNFeDocument retCancNFeDocument = null;
		for (MessageElement me : nfeCancelamentoNF2Result.get_any()) {
			retCancNFeDocument = RetCancNFeDocument.Factory.parse(me.toString());
		}

		this.retCancNFeDocument = retCancNFeDocument;

	}

}

