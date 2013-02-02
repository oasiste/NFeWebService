package br.com.nfe.webservice.v2;

import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.RetInutNFe;
import br.com.usicamp.nfe.core.dto.Retorno;
import br.inf.portalfiscal.nfe.RetInutNFeDocument;

public abstract class NFeInutilizacao2 implements WebService{
	
	
	protected RetInutNFeDocument retInutNFeDocument = null;
	
	
	public Retorno getRetorno() {
		RetInutNFe retInutNFe = new RetInutNFe();
		retInutNFeDocument.getRetInutNFe().getInfInut().getCNPJ();
		retInutNFe.setcStat(retInutNFeDocument.getRetInutNFe().getInfInut().getCStat());
		retInutNFe.setxMotivo(retInutNFeDocument.getRetInutNFe().getInfInut().getXMotivo());
		retInutNFe.setcUF(retInutNFeDocument.getRetInutNFe().getInfInut().getCUF().toString());
		retInutNFe.setTpAmb(retInutNFeDocument.getRetInutNFe().getInfInut().getTpAmb().toString());
		retInutNFe.setXmlRetorno(retInutNFeDocument.getRetInutNFe().toString());
		retInutNFe.setAno(retInutNFeDocument.getRetInutNFe().getInfInut().getAno());
		retInutNFe.setCnpj(retInutNFeDocument.getRetInutNFe().getInfInut().getCNPJ());
		retInutNFe.setId(retInutNFeDocument.getRetInutNFe().getInfInut().getId());
		retInutNFe.setMod(retInutNFeDocument.getRetInutNFe().getInfInut().getMod().toString());
		retInutNFe.setNNFFin(retInutNFeDocument.getRetInutNFe().getInfInut().getNNFFin());
		retInutNFe.setNNFIni(retInutNFeDocument.getRetInutNFe().getInfInut().getNNFIni());
		retInutNFe.setNProt(retInutNFeDocument.getRetInutNFe().getInfInut().getNProt());
		retInutNFe.setSerie(retInutNFeDocument.getRetInutNFe().getInfInut().getSerie());
		return retInutNFe;
	}
	
}
