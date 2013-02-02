/**
 * NfeDownloadNFSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf;

public interface NfeDownloadNFSoap extends java.rmi.Remote {

    /**
     * Serviço destinado ao atendimento de solicitações de download
     * de Notas Fiscais Eletrônicas por seus destinatários.
     */
    public br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeDownloadNFResult nfeDownloadNF(br.inf.portalfiscal.www.nfe.wsdl.scan.prod.nfedownloadnf.NfeDadosMsg nfeDadosMsg) throws java.rmi.RemoteException;
}
