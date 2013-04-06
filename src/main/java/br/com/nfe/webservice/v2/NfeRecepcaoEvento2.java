package br.com.nfe.webservice.v2;

import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.RetEnvEvento;
import br.com.usicamp.nfe.core.dto.Retorno;
import br.inf.portalfiscal.nfe.cancelamento.TRetEvento;
import br.inf.portalfiscal.nfe.cancelamento.RetEnvEventoDocument;

public abstract class NfeRecepcaoEvento2 implements WebService {

	protected RetEnvEventoDocument  envEventoDocument;
	
	public Retorno getRetorno() {
		
		if(envEventoDocument==null)
			return null;
		
		RetEnvEvento retEnvEvento = new RetEnvEvento();
		retEnvEvento.setcStat(envEventoDocument.getRetEnvEvento().getCStat());
		if(envEventoDocument.getRetEnvEvento().getCOrgao()!=null)
			retEnvEvento.setcUF(envEventoDocument.getRetEnvEvento().getCOrgao().toString());
		
		retEnvEvento.setxMotivo(envEventoDocument.getRetEnvEvento().getXMotivo());
		retEnvEvento.setXmlRetorno(envEventoDocument.toString());
		if(envEventoDocument.getRetEnvEvento().getTpAmb()!=null)
			retEnvEvento.setTpAmb(envEventoDocument.getRetEnvEvento().getTpAmb().toString());
		
		retEnvEvento.setIdLote(envEventoDocument.getRetEnvEvento().getIdLote());
		
		for(TRetEvento tretEvento: envEventoDocument.getRetEnvEvento().getRetEventoArray()){
			RetEnvEvento.RetEvento retEvento = retEnvEvento.new RetEvento();
			retEvento.setVersao(tretEvento.getVersao());
			retEvento.getInfEvento().setChNFe(tretEvento.getInfEvento().getChNFe());
			retEvento.getInfEvento().setCNPJDest(tretEvento.getInfEvento().getCNPJDest());
			if(tretEvento.getInfEvento().getNSeqEvento()!=null)
				retEvento.getInfEvento().setnSeqEvento(Integer.parseInt(tretEvento.getInfEvento().getNSeqEvento()) );
			if(tretEvento.getInfEvento().getCStat()!=null)
				retEvento.getInfEvento().setcStat(Integer.parseInt(tretEvento.getInfEvento().getCStat()));
			retEvento.getInfEvento().setxMotivo(tretEvento.getInfEvento().getXMotivo());
			retEnvEvento.getRetEventos().add(retEvento);
		}
		
		return retEnvEvento;
	}


}
