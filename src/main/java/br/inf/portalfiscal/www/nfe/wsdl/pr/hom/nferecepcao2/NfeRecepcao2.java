/**
 * NfeRecepcao2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nferecepcao2;

public interface NfeRecepcao2 extends javax.xml.rpc.Service {

/**
 * Servico destinado a recepcao de mensagens de lote de NF-e.
 */
    public java.lang.String getNfeRecepcaoServicePortAddress();

    public br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nferecepcao2.NfeRecepcao2Soap12 getNfeRecepcaoServicePort() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.pr.hom.nferecepcao2.NfeRecepcao2Soap12 getNfeRecepcaoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
