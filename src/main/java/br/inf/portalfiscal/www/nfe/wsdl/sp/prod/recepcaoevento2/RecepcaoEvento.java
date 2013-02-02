/**
 * RecepcaoEvento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2;

public interface RecepcaoEvento extends javax.xml.rpc.Service {

/**
 * Serviço destinado ao envio de mensagens de eventos da NF-e.
 */
    public java.lang.String getRecepcaoEventoSoap12Address();

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12 getRecepcaoEventoSoap12() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12 getRecepcaoEventoSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
