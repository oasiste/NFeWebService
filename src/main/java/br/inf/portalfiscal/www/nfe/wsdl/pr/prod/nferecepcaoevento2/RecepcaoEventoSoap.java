/**
 * RecepcaoEventoSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2;

public interface RecepcaoEventoSoap extends java.rmi.Remote {

    /**
     * Recepção de mensagem de Evento da NF-e.
     */
    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.NfeRecepcaoEventoResult nfeRecepcaoEvento(br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.NfeDadosMsg nfeDadosMsg) throws java.rmi.RemoteException;
}
