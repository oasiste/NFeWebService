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

import br.com.nfe.webservice.v2.NFeRetRecepcao2;
import br.com.usicamp.nfe.core.dto.RetConsReciNFe;
import br.inf.portalfiscal.nfe.RetConsReciNFeDocument;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferetrecepcao2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferetrecepcao2.NfeDadosMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferetrecepcao2.NfeRetRecepcao2;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferetrecepcao2.NfeRetRecepcao2Locator;
import br.inf.portalfiscal.www.nfe.wsdl.go.hom.nferetrecepcao2.NfeRetRecepcao2Result;

public class NFeRetRecepcao2GOHom extends NFeRetRecepcao2 {
	
	private String xmlRetRecepcao;

	public NFeRetRecepcao2GOHom(String xmlRetRecepcao) {
		super();
		this.xmlRetRecepcao = xmlRetRecepcao;
	}

	public void envia() {
		NfeRetRecepcao2 nfeRecepcaoGO = new NfeRetRecepcao2Locator();
        NfeCabecMsg cabecMsg = new NfeCabecMsg("52", "2.00");
        
        MessageElement[] messageElements = new MessageElement[1];
        Document XMLDoc;
        RetConsReciNFe retConsReciNFe = new RetConsReciNFe();
        
			try {
				
				XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(xmlRetRecepcao)));
				Element element = XMLDoc.getDocumentElement();
		        messageElements[0] = new MessageElement(element);
		        NfeDadosMsg dadosMsg = new NfeDadosMsg(messageElements);
		        NfeRetRecepcao2Result lote2Result =  nfeRecepcaoGO.getNfeRetRecepcaoServicePort().nfeRetRecepcao2(cabecMsg, dadosMsg);
		        
		        RetConsReciNFeDocument retConsReciNFeDocument = null;
		        for (MessageElement me : lote2Result.get_any()) {
		        	retConsReciNFeDocument = RetConsReciNFeDocument.Factory.parse(me.toString());
		        	retConsReciNFe.setXmlRetorno(me.toString());
		        }
		        
		        this.retConsReciNFeDocument = retConsReciNFeDocument;
		        
			} catch (SAXException e) {
				retConsReciNFe.setcStat(0);
				retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
				e.printStackTrace();
			} catch (IOException e) {
				retConsReciNFe.setcStat(0);
				retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				retConsReciNFe.setcStat(0);
				retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
				e.printStackTrace();
			} catch (ServiceException e) {
				retConsReciNFe.setcStat(0);
				retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
				e.printStackTrace();
			} catch (XmlException e) {
				retConsReciNFe.setcStat(0);
				retConsReciNFe.setxMotivo("Erro: "+e.getMessage()+((e.getCause().getMessage())!=null?" "+e.getCause().getMessage():""));
				e.printStackTrace();
			}
			
	}
 
}
 
