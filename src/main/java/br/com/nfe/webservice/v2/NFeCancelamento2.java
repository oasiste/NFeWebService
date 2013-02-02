package br.com.nfe.webservice.v2;

import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.RetCancNFe;
import br.com.usicamp.nfe.core.dto.Retorno;
import br.inf.portalfiscal.nfe.RetCancNFeDocument;

public abstract class NFeCancelamento2 implements WebService{
	
	protected RetCancNFeDocument retCancNFeDocument;
	
	public Retorno getRetorno() {
		RetCancNFe retCancNFe = new RetCancNFe();
        retCancNFe.setVersao(retCancNFeDocument.getRetCancNFe().getVersao());
        retCancNFe.setTpAmb(Integer.parseInt(retCancNFeDocument.getRetCancNFe().getInfCanc().getTpAmb().toString()));
        retCancNFe.setVerAplic(retCancNFeDocument.getRetCancNFe().getInfCanc().getVerAplic());
        retCancNFe.setcStat(Integer.parseInt(retCancNFeDocument.getRetCancNFe().getInfCanc().getCStat()));
        retCancNFe.setxMotivo(retCancNFeDocument.getRetCancNFe().getInfCanc().getXMotivo());
        retCancNFe.setcUF(Integer.parseInt(retCancNFeDocument.getRetCancNFe().getInfCanc().getCUF().toString()));
        retCancNFe.setChNFe(retCancNFeDocument.getRetCancNFe().getInfCanc().getChNFe());
    //    retCancNFe.setDhRecbto(new SimpleDateFormat("dd/MM/yyyy").format(retCancNFeDocument.getRetCancNFe().getInfCanc().getDhRecbto().getTime()));
        retCancNFe.setnProtCancelamento(retCancNFeDocument.getRetCancNFe().getInfCanc().getNProt());
        retCancNFe.setXmlRetorno(retCancNFeDocument.toString());
		return retCancNFe;
	}
	
}
