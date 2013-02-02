package br.com.nfe.webservice.v2.sp.hom;

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

import br.com.nfe.webservice.v2.NFeRecepcao2;
import br.inf.portalfiscal.nfe.RetEnviNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.sp.hom.NfeRecepcao2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.sp.hom.NfeRecepcao2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.sp.hom.NfeRecepcao2.NfeRecepcao2;
import br.inf.portalfiscal.www.nfe.wsdl.sp.hom.NfeRecepcao2.NfeRecepcao2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.sp.hom.NfeRecepcao2.NfeRecepcao2Soap12Stub;
import br.inf.portalfiscal.www.nfe.wsdl.sp.hom.NfeRecepcao2.NfeRecepcaoLote2Result;

//import consv2.br.inf.portalfiscal.nfe.Factory;

//import v2.br.inf.portalfiscal.nfe.RetEnviNFeDocument;

public class NFeRecepcao2SPHom extends NFeRecepcao2 {

	String xmlEnviNFe = null;


	public NFeRecepcao2SPHom(String xmlEnviNFe) {
		super();
		this.xmlEnviNFe = xmlEnviNFe;
	}

	public void envia() throws SAXException, IOException, ParserConfigurationException, SOAPException, XmlException, ServiceException {

		NfeCabecMsg cabecMsg = new NfeCabecMsg("35", "2.00");
        SOAPHeaderElement oHeaderElement = new SOAPHeaderElement(NfeCabecMsg.getTypeDesc().getXmlType(),cabecMsg);

		NfeRecepcao2 nfeRecepcaoSP = new NfeRecepcao2Locator();
		
		NfeRecepcao2Soap12Stub nfeRecepcao2Soap12Stub = null; //new NfeRecepcao2Soap12Stub();
		nfeRecepcao2Soap12Stub = (NfeRecepcao2Soap12Stub) nfeRecepcaoSP.getNfeRecepcao2Soap12();// getNfeRecepcaoServicePort();
		nfeRecepcao2Soap12Stub.setHeader(oHeaderElement);
		
		
		MessageElement[] messageElements = new MessageElement[1];
        Document documentDados = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlEnviNFe)));
		Element elementDados = documentDados.getDocumentElement();
        messageElements[0] = new MessageElement(elementDados);
        
        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
		
        NfeRecepcaoLote2Result lote2Result = nfeRecepcao2Soap12Stub.nfeRecepcaoLote2(dadosMsg);

        for (MessageElement me : lote2Result.get_any()) {
            this.retEnviNFeDocument = RetEnviNFeDocument.Factory.parse(me.toString());
        }


	}

}

