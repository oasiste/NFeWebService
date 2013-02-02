/**
 * NfeConsulta2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nfeconsulta2;

public interface NfeConsulta2 extends javax.xml.rpc.Service {

/**
 * Serviço destinado ao atendimento de solicitações de consulta da
 * situação atual da NF-e na Base de Dados do Portal da Secretaria de
 * Fazenda Estadual.
 */
    public java.lang.String getNfeConsulta2Soap12Address();

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nfeconsulta2.NfeConsulta2Soap12 getNfeConsulta2Soap12() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nfeconsulta2.NfeConsulta2Soap12 getNfeConsulta2Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
