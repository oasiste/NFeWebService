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

import br.com.nfe.webservice.v2.NFeRecepcao2;
import br.inf.portalfiscal.nfe.RetEnviNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferecepcao2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferecepcao2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferecepcao2.NfeRecepcao2;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferecepcao2.NfeRecepcao2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferecepcao2.NfeRecepcao2Soap12Stub;
import br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferecepcao2.NfeRecepcaoLote2Result;

public class NFeRecepcao2SPProd extends NFeRecepcao2 {

	private String xmlEnviNFe = null;


	public NFeRecepcao2SPProd(String xmlEnviNFe) {
		super();
		this.xmlEnviNFe = xmlEnviNFe;
	}

	public void envia() throws ServiceException, SAXException, IOException, ParserConfigurationException, XmlException {
	
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

