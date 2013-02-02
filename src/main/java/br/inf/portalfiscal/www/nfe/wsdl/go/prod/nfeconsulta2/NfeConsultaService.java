/**
 * NfeConsultaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfeconsulta2;

import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfeconsulta2.NfeCabecMsg;
import br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfeconsulta2.NfeDadosMsg;

public interface NfeConsultaService extends java.rmi.Remote {
    public br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfeconsulta2.NfeConsultaNF2Result nfeConsultaNF2(NfeCabecMsg nfeCabecMsg, NfeDadosMsg nfeDadosMsg) throws java.rmi.RemoteException;
}
