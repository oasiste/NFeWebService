/**
 * NfeRetRecepcao2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferetrecepcao2;

public interface NfeRetRecepcao2 extends javax.xml.rpc.Service {

/**
 * Servico destinado a retornar o resultado do processamento do lote
 * de NF-e.
 */
    public java.lang.String getNfeRetRecepcaoServicePortAddress();

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferetrecepcao2.NfeRetRecepcao2Soap12 getNfeRetRecepcaoServicePort() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferetrecepcao2.NfeRetRecepcao2Soap12 getNfeRetRecepcaoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
