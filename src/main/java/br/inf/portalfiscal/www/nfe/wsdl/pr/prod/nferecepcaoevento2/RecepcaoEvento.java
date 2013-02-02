/**
 * RecepcaoEvento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2;

public interface RecepcaoEvento extends javax.xml.rpc.Service {

/**
 * Servico destinado a recepcao de mensagens de evento de NF-e.
 */
    public java.lang.String getRecepcaoEventoSoapAddress();

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoap getRecepcaoEventoSoap() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoap getRecepcaoEventoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
