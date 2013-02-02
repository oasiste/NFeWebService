/**
 * NfeConsulta2Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.scan.hom.NfeConsulta2;

public interface NfeConsulta2Soap extends java.rmi.Remote {

    /**
     * Serviço destinado ao atendimento de solicitações de consulta
     * da situação atual da NF-e na Base de Dados do Portal da Sefaz Virtual
     * do Ambiente Nacional
     */
    public br.inf.portalfiscal.www.nfe.wsdl.scan.hom.NfeConsulta2.NfeConsultaNF2Result nfeConsultaNF2(br.inf.portalfiscal.www.nfe.wsdl.scan.hom.NfeConsulta2.NfeDadosMsg nfeDadosMsg) throws java.rmi.RemoteException;
}
