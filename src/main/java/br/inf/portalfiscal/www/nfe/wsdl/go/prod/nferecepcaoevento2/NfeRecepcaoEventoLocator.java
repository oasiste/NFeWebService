/**
 * NfeRecepcaoEventoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2;

public class NfeRecepcaoEventoLocator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEvento {

    public NfeRecepcaoEventoLocator() {
    }


    public NfeRecepcaoEventoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NfeRecepcaoEventoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NfeRecepcaoEventoServicePort
    private java.lang.String NfeRecepcaoEventoServicePort_address = "https://nfe.sefaz.go.gov.br/nfe/services/v2/NfeRecepcaoEvento";

    public java.lang.String getNfeRecepcaoEventoServicePortAddress() {
        return NfeRecepcaoEventoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NfeRecepcaoEventoServicePortWSDDServiceName = "NfeRecepcaoEventoServicePort";

    public java.lang.String getNfeRecepcaoEventoServicePortWSDDServiceName() {
        return NfeRecepcaoEventoServicePortWSDDServiceName;
    }

    public void setNfeRecepcaoEventoServicePortWSDDServiceName(java.lang.String name) {
        NfeRecepcaoEventoServicePortWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoService getNfeRecepcaoEventoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NfeRecepcaoEventoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNfeRecepcaoEventoServicePort(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoService getNfeRecepcaoEventoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoServiceBindingStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoServiceBindingStub(portAddress, this);
            _stub.setPortName(getNfeRecepcaoEventoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNfeRecepcaoEventoServicePortEndpointAddress(java.lang.String address) {
        NfeRecepcaoEventoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoServiceBindingStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.go.prod.nferecepcaoevento2.NfeRecepcaoEventoServiceBindingStub(new java.net.URL(NfeRecepcaoEventoServicePort_address), this);
                _stub.setPortName(getNfeRecepcaoEventoServicePortWSDDServiceName());
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
        if ("NfeRecepcaoEventoServicePort".equals(inputPortName)) {
            return getNfeRecepcaoEventoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcaoEvento", "NfeRecepcaoEvento");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcaoEvento", "NfeRecepcaoEventoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NfeRecepcaoEventoServicePort".equals(portName)) {
            setNfeRecepcaoEventoServicePortEndpointAddress(address);
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
