package br.com.nfe.webservice.v2.go;

import br.com.nfe.webservice.WebService;
import br.com.nfe.webservice.WebServiceUF;
import br.com.nfe.webservice.v2.go.hom.NFeRecepcao2GOHom;
import br.com.nfe.webservice.v2.go.hom.NFeRetRecepcao2GOHom;
import br.com.nfe.webservice.v2.go.hom.NfeCancelamento2GOHom;
import br.com.nfe.webservice.v2.go.prod.NFeRecepcao2GOProd;
import br.com.nfe.webservice.v2.go.prod.NFeRetRecepcao2GOProd;
import br.com.nfe.webservice.v2.go.prod.NfeCancelamento2GOProd;
import br.com.nfe.webservice.v2.go.prod.NfeRecepcaoEvento2GOProd;

public class WebService2GO extends WebServiceUF {

	@Override
	public WebService getNfeCancelamento(Integer ambiente, String xmlCanc) {
		if(ambiente.equals(1)){
			return new NfeCancelamento2GOProd(xmlCanc);
		}else{
			return new NfeCancelamento2GOHom(xmlCanc);
		}
	}

	

	@Override
	public WebService getNfeInutilizacao(Integer ambiente, String xmlNFeInut) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebService getNfeRecepcao(Integer ambiente, String xmlRecepcao) {
		if(ambiente.equals(1)){
			return new NFeRecepcao2GOProd(xmlRecepcao);
		}else{
			return new NFeRecepcao2GOHom(xmlRecepcao);
		}
	}

	@Override
	public WebService getNfeRetRecepcao(Integer ambiente, String xmlRetRecepcao) {
		if(ambiente.equals(1)){
			return new NFeRetRecepcao2GOProd(xmlRetRecepcao);
		}else{
			return new NFeRetRecepcao2GOHom(xmlRetRecepcao);
		}
	}

	@Override
	public WebService getNfeStatusServico(Integer ambiente, String xmlStatusServ) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public WebService getCartaCorrecao(Integer ambiente, String xmlCartaCorrecao) {
		
		if(ambiente.intValue() == 1){
			return new NfeRecepcaoEvento2GOProd(xmlCartaCorrecao);
		}
		
		return null;
	}

 
}
 
