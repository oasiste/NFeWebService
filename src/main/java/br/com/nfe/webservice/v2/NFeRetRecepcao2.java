package br.com.nfe.webservice.v2;

import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.ProtNfe;
import br.com.usicamp.nfe.core.dto.RetConsReciNFe;
import br.com.usicamp.nfe.core.dto.Retorno;
import br.inf.portalfiscal.nfe.RetConsReciNFeDocument;
import br.inf.portalfiscal.nfe.TProtNFe;

public abstract class NFeRetRecepcao2 implements WebService{
	
	protected RetConsReciNFeDocument retConsReciNFeDocument;
	
	public Retorno getRetorno() {
		RetConsReciNFe retConsReciNFe = new RetConsReciNFe();
		retConsReciNFe.setcMsg(retConsReciNFeDocument.getRetConsReciNFe().getCMsg());
		retConsReciNFe.setcStat(retConsReciNFeDocument.getRetConsReciNFe().getCStat());
		retConsReciNFe.setcUF(retConsReciNFeDocument.getRetConsReciNFe().getCUF().toString());
		retConsReciNFe.setnRec(retConsReciNFeDocument.getRetConsReciNFe().getNRec());
		retConsReciNFe.setTpAmb(retConsReciNFeDocument.getRetConsReciNFe().getTpAmb().toString());
		retConsReciNFe.setVersao(retConsReciNFeDocument.getRetConsReciNFe().getVerAplic());
		retConsReciNFe.setXmlRetorno(retConsReciNFeDocument.toString());
		retConsReciNFe.setxMotivo(retConsReciNFeDocument.getRetConsReciNFe().getXMotivo());
		retConsReciNFe.setXmlRetorno(retConsReciNFeDocument.xmlText());
		
		for(TProtNFe protNFeTProtNFe: retConsReciNFeDocument.getRetConsReciNFe().getProtNFeArray()){
			ProtNfe protNfe = new ProtNfe();
			protNfe.setChNFe(protNFeTProtNFe.getInfProt().getChNFe());
			protNfe.setcStat(protNFeTProtNFe.getInfProt().getCStat());
			protNfe.setId(protNFeTProtNFe.getInfProt().getId());
			protNfe.setTpAmb(protNFeTProtNFe.getInfProt().getTpAmb().toString());
			protNfe.setnProt(protNFeTProtNFe.getInfProt().getNProt());
			protNfe.setVerAplic(protNFeTProtNFe.getInfProt().getVerAplic());
			protNfe.setXmlRetorno(protNFeTProtNFe.getInfProt().xmlText());
			protNfe.setxMotivo(protNFeTProtNFe.getInfProt().getXMotivo());
			protNfe.setDhRecbto(protNFeTProtNFe.getInfProt().getDhRecbto());
			protNfe.setDigVal(protNFeTProtNFe.getInfProt().getDigVal());  
			retConsReciNFe.addProtNFe(protNfe);
		}
		
		return retConsReciNFe;
	}
}
