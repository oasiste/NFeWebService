/**
 * NfeStatusServico2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nfestatusservico2;

public interface NfeStatusServico2 extends javax.xml.rpc.Service {

/**
 * Serviço destinado à consulta do status do serviço prestado pelo
 * Portal da Secretaria de Fazenda Estadual.
 */
    public java.lang.String getNfeStatusServico2Soap12Address();

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nfestatusservico2.NfeStatusServico2Soap12 getNfeStatusServico2Soap12() throws javax.xml.rpc.ServiceException;

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nfestatusservico2.NfeStatusServico2Soap12 getNfeStatusServico2Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
