package br.com.nfe.webservice.v1;


import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.RetEnviNFe;
import br.com.usicamp.nfe.core.dto.Retorno;
import br.inf.portalfiscal.nfe.RetEnviNFeDocument;

public abstract class NFeRecepcao implements WebService{

	public RetEnviNFeDocument retEnviNFeDocument;

	public Retorno getRetorno() {
		RetEnviNFe retEnvNFe = new RetEnviNFe();
		retEnvNFe.setVersao(retEnviNFeDocument.getRetEnviNFe().getVersao());
		retEnvNFe.setTpAmb(Integer.parseInt(retEnviNFeDocument.getRetEnviNFe().getTpAmb().toString()));
		retEnvNFe.setVerAplic(retEnviNFeDocument.getRetEnviNFe().getVerAplic());
		retEnvNFe.setcStat(Integer.parseInt(retEnviNFeDocument.getRetEnviNFe().getCStat()));
		retEnvNFe.setxMotivo(retEnviNFeDocument.getRetEnviNFe().getXMotivo());
		retEnvNFe.setcUF(Integer.parseInt(retEnviNFeDocument.getRetEnviNFe().getCUF().toString()));
		if (retEnviNFeDocument.getRetEnviNFe().getInfRec() != null) {
			retEnvNFe.setnRec(retEnviNFeDocument.getRetEnviNFe().getInfRec().getNRec());
		}
		retEnvNFe.setXmlRetorno(retEnviNFeDocument.toString());
		return retEnvNFe;
	}
	
}
