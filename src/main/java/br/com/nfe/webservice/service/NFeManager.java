package br.com.nfe.webservice.service;

public class NFeManager {
	
	private static NFeServiceImpl nfeService;
	
	public static NFeServiceImpl getInstance(){
		if(NFeManager.nfeService == null){
			nfeService = new NFeServiceImpl();
		}
		return nfeService;
	}
	
}
