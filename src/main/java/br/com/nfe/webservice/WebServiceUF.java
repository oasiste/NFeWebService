package br.com.nfe.webservice;

import br.com.nfe.webservice.v2.go.WebService2GO;
import br.com.nfe.webservice.v2.pr.WebService2PR;
import br.com.nfe.webservice.v2.scan.WebService2Scan;
import br.com.nfe.webservice.v2.sp.WebService2SP;

public abstract class WebServiceUF {
  
	public static WebServiceUF getInstance(String uf) {
		
		if(uf==null) return null;
		
		if(uf.equals("PR")||uf.equals("44")){
			return new WebService2PR();
		}
		if(uf.equals("SP")||uf.equals("11")){
			return new WebService2SP();
		}
		if(uf.equals("GO")||uf.equals("52")){
			return new WebService2GO();
		}
		if(uf.toUpperCase().equals("SCAN")){
			return new WebService2Scan(uf);
		}
		return null;	
	}
	
	public abstract WebService getNfeRecepcao(Integer ambiente,String xmlRecepcao);
	public abstract WebService getNfeRetRecepcao(Integer ambiente,String xmlRetRecepcao);
	public abstract WebService getNfeStatusServico(Integer ambiente,String xmlStatusServ);
	public abstract WebService getNfeCancelamento(Integer ambiente,String xmlCanc);
	public abstract WebService getNfeInutilizacao(Integer ambiente,String xmlNFeInut);
	public abstract WebService getCartaCorrecao(Integer ambiente,String xmlCartaCorrecao);
	 
}
 
