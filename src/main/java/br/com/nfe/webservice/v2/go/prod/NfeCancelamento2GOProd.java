package br.com.nfe.webservice.v2.go.prod;

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
import br.com.usicamp.nfe.core.dto.RetCancNFe;
import br.inf.portalfiscal.nfe.RetCancNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfecancelamento2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfecancelamento2.NfeCancelamento2;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfecancelamento2.NfeCancelamento2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfecancelamento2.NfeCancelamentoNF2Result;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfecancelamento2.NfeDadosMsg;


public class NfeCancelamento2GOProd extends NFeCancelamento2 {
	
	
	private String xmlCancNfe;
	

	public NfeCancelamento2GOProd(String xmlCancNfe) {
		super();
		this.xmlCancNfe = xmlCancNfe;
	}


	public void envia() {
		NfeCancelamento2 nfeRecepcaoGO = new NfeCancelamento2Locator();
        NfeCabecMsg cabecMsg = new NfeCabecMsg("52", "2.00");
        
        MessageElement[] messageElements = new MessageElement[1];
        Document XMLDoc;
        RetCancNFe retCancNFe = new RetCancNFe();
	
		try {
			XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlCancNfe)));
			Element element = XMLDoc.getDocumentElement();
	        messageElements[0] = new MessageElement(element);
	        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
	        NfeCancelamentoNF2Result nfeCancelamentoNF2Result=  nfeRecepcaoGO.getNfeCancelamentoServicePort().nfeCancelamentoNF2(cabecMsg, dadosMsg);
	        
	        RetCancNFeDocument retCancNFeDocument = null;
	        for (MessageElement me : nfeCancelamentoNF2Result.get_any()) {
	            retCancNFeDocument = RetCancNFeDocument.Factory.parse(me.toString());
	            retCancNFe.setXmlRetorno(me.toString());
	        }
	        this.retCancNFeDocument = retCancNFeDocument;
	        
		} catch (SAXException e) {
			retCancNFe.setcStat(0);
			retCancNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (IOException e) {
			retCancNFe.setcStat(0);
			retCancNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			retCancNFe.setcStat(0);
			retCancNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (ServiceException e) {
			retCancNFe.setcStat(0);
			retCancNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		} catch (XmlException e) {
			retCancNFe.setcStat(0);
			retCancNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
			e.printStackTrace();
		}
		
	}
 
}
 
