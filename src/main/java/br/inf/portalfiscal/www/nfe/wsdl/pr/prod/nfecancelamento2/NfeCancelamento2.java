/**
 * NfeCancelamento2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2;

public interface NfeCancelamento2 extends javax.xml.rpc.Service {

/**
 * Servico destinado ao atendimento de solicitacoes de cancelamento
 * de Notas Fiscais Eletronicas.
 */
    public java.lang.String getNfeCancelamentoServicePortAddress();

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeCancelamento2Soap12 getNfeCancelamentoServicePort() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nfecancelamento2.NfeCancelamento2Soap12 getNfeCancelamentoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
