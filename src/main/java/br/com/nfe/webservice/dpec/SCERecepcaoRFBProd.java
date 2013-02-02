package br.com.nfe.webservice.dpec;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.nfe.webservice.WebService;
import br.com.usicamp.nfe.core.dto.Retorno;


public class SCERecepcaoRFBProd implements WebService {
	
	private String xmlDpecString;

	public SCERecepcaoRFBProd(String xmlDpecString) {
		super();
		this.xmlDpecString = xmlDpecString;
	}

	public void envia() throws RemoteException, ServiceException {
		
	}

	public Retorno getRetorno() {
		// TODO Auto-generated method stub
		return null;
	}

}
