package br.com.nfe.webservice.v2.scan.prod;

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

import br.com.nfe.webservice.v2.NfeDownloadNf;
import br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeDownloadNFLocator;
import br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeDownloadNFResult;
import br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeDownloadNFSoapStub;

public class NfeDownloadNfScanProd extends NfeDownloadNf {
	

	public NfeDownloadNfScanProd(String xmlDownloadNf) {
		super(xmlDownloadNf);
	}

	public void envia() throws SAXException, IOException,
			ParserConfigurationException, ServiceException, XmlException,
			SOAPException {
		
		NfeCabecMsg cabecMsg = new NfeCabecMsg("41", "2.00");
		
        SOAPHeaderElement oHeaderElement = new SOAPHeaderElement(NfeCabecMsg.getTypeDesc().getXmlType(),cabecMsg);
        br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeDownloadNF nfeDownloadnNF = new NfeDownloadNFLocator();
		
        NfeDownloadNFSoapStub nfeDownloadNFSoapStub= null;
        nfeDownloadNFSoapStub = (NfeDownloadNFSoapStub) nfeDownloadnNF.getNfeDownloadNFSoap();
        nfeDownloadNFSoapStub.setHeader(oHeaderElement);
		
		MessageElement[] messageElements = new MessageElement[1];
        Document documentDados = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlDownloadNf)));
		Element elementDados = documentDados.getDocumentElement();
        messageElements[0] = new MessageElement(elementDados);
        
        NfeDadosMsg nfeDadosMsg = new NfeDadosMsg(messageElements);
        NfeDownloadNFResult lote2Result = nfeDownloadNFSoapStub.nfeDownloadNF(nfeDadosMsg);
        
        for (MessageElement me : lote2Result.get_any()) {
//            this.retEnviNFeDocument = RetEnviNFeDocument.Factory.parse(me.toString());
        }
	}

}
