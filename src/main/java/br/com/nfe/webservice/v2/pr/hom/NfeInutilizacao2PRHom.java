package br.com.nfe.webservice.v2.pr.hom;

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

import br.com.nfe.webservice.v2.NFeInutilizacao2;
import br.inf.portalfiscal.nfe.RetInutNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeInutilizacao2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeInutilizacao2Soap12Stub;
import br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeInutilizacaoNF2Result;

public class NfeInutilizacao2PRHom extends NFeInutilizacao2 {

	private String xmlInutilizacao;
	
	public NfeInutilizacao2PRHom(String xmlInutilizacao) {
		this.xmlInutilizacao = xmlInutilizacao;
	}
	
	public void envia() throws ServiceException, SAXException, IOException, ParserConfigurationException, XmlException {		
		NfeCabecMsg cabecMsg = new NfeCabecMsg("41", "2.00");
        SOAPHeaderElement oHeaderElement = new SOAPHeaderElement(NfeCabecMsg.getTypeDesc().getXmlType(),cabecMsg);
		
        br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeInutilizacao2 nfeInutilizacao =  new NfeInutilizacao2Locator();
		NfeInutilizacao2Soap12Stub nfeInutilizacao2Soap12Stub = null;
		nfeInutilizacao2Soap12Stub = (NfeInutilizacao2Soap12Stub) nfeInutilizacao.getNfeInutilizacaoServicePort();// getNfeRecepcaoServicePort();
		nfeInutilizacao2Soap12Stub.setHeader(oHeaderElement);
		
		MessageElement[] messageElements = new MessageElement[1];
        Document documentDados = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlInutilizacao)));
		Element elementDados = documentDados.getDocumentElement();
        messageElements[0] = new MessageElement(elementDados);
        
        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
        NfeInutilizacaoNF2Result inutilizacaoNF2Result=    nfeInutilizacao2Soap12Stub.nfeInutilizacaoNF2(dadosMsg);

        for (MessageElement me : inutilizacaoNF2Result.get_any()) {
            this.retInutNFeDocument   =  RetInutNFeDocument.Factory.parse(me.toString());
        }
	}
 
}
 
