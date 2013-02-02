package br.com.nfe.webservice.v2.scan;

import br.com.nfe.webservice.WebService;
import br.com.nfe.webservice.WebServiceUF;
import br.com.nfe.webservice.v2.scan.hom.NFeRecepcao2ScanHom;
import br.com.nfe.webservice.v2.scan.hom.NFeRetRecepcao2ScanHom;
import br.com.nfe.webservice.v2.scan.hom.NfeCancelamento2ScanHom;
import br.com.nfe.webservice.v2.scan.prod.NFeRecepcao2ScanProd;
import br.com.nfe.webservice.v2.scan.prod.NFeRetRecepcao2ScanProd;
import br.com.nfe.webservice.v2.scan.prod.NfeCancelamento2ScanProd;

public class WebService2Scan extends WebServiceUF {
	
	private String uf;
	
	public WebService2Scan(String uf) {
		this.uf = uf;
	}

	@Override
	public WebService getNfeRecepcao(Integer ambiente, String xmlRecepcao) {
		if(ambiente==1){
			return new NFeRecepcao2ScanProd(xmlRecepcao);
		}else{
			return new NFeRecepcao2ScanHom(xmlRecepcao);
		}
		
	}

	@Override
	public WebService getNfeRetRecepcao(Integer ambiente, String xmlRetRecepcao) {
		if(ambiente==1){
			return new NFeRetRecepcao2ScanProd(xmlRetRecepcao);
		}else{
			return new NFeRetRecepcao2ScanHom(xmlRetRecepcao);
		}
	}

	@Override
	public WebService getNfeStatusServico(Integer ambiente, String xmlStatusServ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebService getNfeCancelamento(Integer ambiente, String xmlCanc) {
		if(ambiente==1){
			return new NfeCancelamento2ScanProd(xmlCanc);
		}else{
			return new NfeCancelamento2ScanHom(xmlCanc);
		}
	}

	@Override
	public WebService getNfeInutilizacao(Integer ambiente, String xmlNFeInut) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebService getCartaCorrecao(Integer ambiente, String xmlCartaCorrecao) {
		// TODO Auto-generated method stub
		return null;
	}

}
