package br.com.nfe.webservice.v2.sp.prod;

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

import br.com.nfe.webservice.v2.NFeRetRecepcao2;
import br.inf.portalfiscal.nfe.RetConsReciNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Result;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12Stub;

public class NFeRetRecepcao2SPProd extends NFeRetRecepcao2 {

	private String xmlRetRecepcao;

	public NFeRetRecepcao2SPProd(String xmlRetRecepcao) {
		super();
		this.xmlRetRecepcao = xmlRetRecepcao;
	}

	public void envia() throws ServiceException, SAXException, IOException, ParserConfigurationException, XmlException {
		NfeRetRecepcao2 nfeRetRecepcaoSP = new NfeRetRecepcao2Locator();

		NfeCabecMsg cabecMsg = new NfeCabecMsg("35", "2.00");

		SOAPHeaderElement oHeaderElement = new SOAPHeaderElement(NfeCabecMsg.getTypeDesc().getXmlType(),cabecMsg);


		NfeRetRecepcao2Soap12Stub nfeRetRecepcao2Soap12Stub = (NfeRetRecepcao2Soap12Stub) nfeRetRecepcaoSP.getNfeRetRecepcao2Soap12();


		nfeRetRecepcao2Soap12Stub.setHeader(oHeaderElement);

		MessageElement[] messageElements = new MessageElement[1];
		Document XMLDoc;

		XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlRetRecepcao)));
		Element element = XMLDoc.getDocumentElement();
		messageElements[0] = new MessageElement(element);
		NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
		NfeRetRecepcao2Result lote2Result =  nfeRetRecepcao2Soap12Stub.nfeRetRecepcao2(dadosMsg);

		for (MessageElement me : lote2Result.get_any()) {
			this.retConsReciNFeDocument = RetConsReciNFeDocument.Factory.parse(me.toString());
		}

	}

}

