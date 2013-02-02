package br.com.nfe.webservice.v2.pr;

import br.com.nfe.webservice.WebService;
import br.com.nfe.webservice.WebServiceUF;
import br.com.nfe.webservice.v2.pr.hom.NFeRecepcao2PRHom;
import br.com.nfe.webservice.v2.pr.hom.NFeRetRecepcao2PRHom;
import br.com.nfe.webservice.v2.pr.hom.NfeCancelamento2PRHom;
import br.com.nfe.webservice.v2.pr.hom.NfeInutilizacao2PRHom;
import br.com.nfe.webservice.v2.pr.prod.NFeRecepcao2PRProd;
import br.com.nfe.webservice.v2.pr.prod.NFeRetRecepcao2PRProd;
import br.com.nfe.webservice.v2.pr.prod.NfeCancelamento2PRProd;
import br.com.nfe.webservice.v2.pr.prod.NfeRecepcaoEvento2PRProd;

public class WebService2PR extends WebServiceUF{

	@Override
	public WebService getNfeRecepcao(Integer ambiente, String xmlRecepcao) {
		
		if(ambiente == 1){
			return new NFeRecepcao2PRProd(xmlRecepcao);
		}else{
			return new NFeRecepcao2PRHom(xmlRecepcao);
		}
	}

	@Override
	public WebService getNfeRetRecepcao(Integer ambiente, String xmlRetRecepcao) {
		if(ambiente==1){
			return new NFeRetRecepcao2PRProd(xmlRetRecepcao);
		}else{
			return new NFeRetRecepcao2PRHom(xmlRetRecepcao);
		}
	}

	@Override
	public WebService getNfeStatusServico(Integer ambiente, String xmlStatusServ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebService getNfeCancelamento(Integer ambiente, String xmlCanc) {
		if(ambiente == 1){
			return new NfeCancelamento2PRProd(xmlCanc);
		}else{
			return new NfeCancelamento2PRHom(xmlCanc);
		}
	}

	@Override
	public WebService getNfeInutilizacao(Integer ambiente, String xmlNFeInut) {
		if(ambiente == 1){
			return null;
		}else{
			return new NfeInutilizacao2PRHom(xmlNFeInut);
		}
	}

	@Override
	public WebService getCartaCorrecao(Integer ambiente, String xmlCartaCorrecao) {
		if(ambiente == 1){
			return new NfeRecepcaoEvento2PRProd(xmlCartaCorrecao);
		}else{
			return null;
		}
	}

}
