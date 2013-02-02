/**
 * NfeRetRecepcao2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2;

public class NfeRetRecepcao2Locator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2 {

/**
 * Serviço destinado a retornar o resultado do processamento do lote
 * de NF-e.
 */

    public NfeRetRecepcao2Locator() {
    }


    public NfeRetRecepcao2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NfeRetRecepcao2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NfeRetRecepcao2Soap12
    private java.lang.String NfeRetRecepcao2Soap12_address = "https://nfe.fazenda.sp.gov.br/nfeweb/services/nferetrecepcao2.asmx";

    public java.lang.String getNfeRetRecepcao2Soap12Address() {
        return NfeRetRecepcao2Soap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NfeRetRecepcao2Soap12WSDDServiceName = "NfeRetRecepcao2Soap12";

    public java.lang.String getNfeRetRecepcao2Soap12WSDDServiceName() {
        return NfeRetRecepcao2Soap12WSDDServiceName;
    }

    public void setNfeRetRecepcao2Soap12WSDDServiceName(java.lang.String name) {
        NfeRetRecepcao2Soap12WSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12 getNfeRetRecepcao2Soap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NfeRetRecepcao2Soap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNfeRetRecepcao2Soap12(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12 getNfeRetRecepcao2Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12Stub(portAddress, this);
            _stub.setPortName(getNfeRetRecepcao2Soap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNfeRetRecepcao2Soap12EndpointAddress(java.lang.String address) {
        NfeRetRecepcao2Soap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.sp.prod.nferetrecepcao2.NfeRetRecepcao2Soap12Stub(new java.net.URL(NfeRetRecepcao2Soap12_address), this);
                _stub.setPortName(getNfeRetRecepcao2Soap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NfeRetRecepcao2Soap12".equals(inputPortName)) {
            return getNfeRetRecepcao2Soap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRetRecepcao2", "NfeRetRecepcao2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRetRecepcao2", "NfeRetRecepcao2Soap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NfeRetRecepcao2Soap12".equals(portName)) {
            setNfeRetRecepcao2Soap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
