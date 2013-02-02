/**
 * NfeInutilizacao2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2;

public interface NfeInutilizacao2 extends javax.xml.rpc.Service {

/**
 * Servico destinado ao atendimento de solicitacoes de inutilizacao
 * de numeracao.
 */
    public java.lang.String getNfeInutilizacaoServicePortAddress();

    public br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeInutilizacao2Soap12 getNfeInutilizacaoServicePort() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nfeinutilizacao2.NfeInutilizacao2Soap12 getNfeInutilizacaoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
