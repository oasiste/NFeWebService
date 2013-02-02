/**
 * NfeRetRecepcao2Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.scan.hom.NfeRetRecepcao2;

public interface NfeRetRecepcao2Soap extends java.rmi.Remote {

    /**
     * Serviço destinado a retornar o resultado do processamento do
     * lote de NF-e
     */
    public br.inf.portalfiscal.www.nfe.wsdl.scan.hom.NfeRetRecepcao2.NfeRetRecepcao2Result nfeRetRecepcao2(br.inf.portalfiscal.www.nfe.wsdl.scan.hom.NfeRetRecepcao2.NfeDadosMsg nfeDadosMsg) throws java.rmi.RemoteException;
}
