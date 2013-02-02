package br.com.nfe.webservice.v2.sp;

import br.com.nfe.webservice.WebService;
import br.com.nfe.webservice.WebServiceUF;
import br.com.nfe.webservice.v2.sp.hom.NFeRecepcao2SPHom;
import br.com.nfe.webservice.v2.sp.hom.NFeRetRecepcao2SPHom;
import br.com.nfe.webservice.v2.sp.hom.NfeCancelamento2SPHom;
import br.com.nfe.webservice.v2.sp.prod.NFeRecepcao2SPProd;
import br.com.nfe.webservice.v2.sp.prod.NFeRetRecepcao2SPProd;
import br.com.nfe.webservice.v2.sp.prod.NfeCancelamento2SPProd;
import br.com.nfe.webservice.v2.sp.prod.NfeRecepcaoEvento2SPProd;

public class WebService2SP extends WebServiceUF {

	@Override
	public WebService getNfeRecepcao(Integer ambiente, String xmlRecepcao) {
		if(ambiente==1){
			return new NFeRecepcao2SPProd(xmlRecepcao);
		}else{
			return new NFeRecepcao2SPHom(xmlRecepcao);
		}
	}

	@Override
	public WebService getNfeRetRecepcao(Integer ambiente, String xmlRetRecepcao) {
		if(ambiente==1){
			return new NFeRetRecepcao2SPProd(xmlRetRecepcao);
		}else{
			return new NFeRetRecepcao2SPHom(xmlRetRecepcao);
		}
	}

	@Override
	public WebService getNfeStatusServico(Integer ambiente, String xmlStatusServ) {
		return null;
	}

	@Override
	public WebService getNfeCancelamento(Integer ambiente, String xmlCanc) {
		if(ambiente==1){
			return new NfeCancelamento2SPProd(xmlCanc);
		}else{
			return new NfeCancelamento2SPHom(xmlCanc);
		}
	}

	@Override
	public WebService getNfeInutilizacao(Integer ambiente, String xmlNFeInut) {
		return null;
	}

	@Override
	public WebService getCartaCorrecao(Integer ambiente, String xmlCartaCorrecao) {
		
		if(ambiente==1)
			return new NfeRecepcaoEvento2SPProd(xmlCartaCorrecao);
		
		return null;
	}

}
