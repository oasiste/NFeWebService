/**
 * NfeStatusServico2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2;

public class NfeStatusServico2Locator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServico2 {

    public NfeStatusServico2Locator() {
    }


    public NfeStatusServico2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NfeStatusServico2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NfeStatusServicoServicePort
    private java.lang.String NfeStatusServicoServicePort_address = "https://nfe.sefaz.go.gov.br/nfe/services/v2/NfeStatusServico2";

    public java.lang.String getNfeStatusServicoServicePortAddress() {
        return NfeStatusServicoServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NfeStatusServicoServicePortWSDDServiceName = "NfeStatusServicoServicePort";

    public java.lang.String getNfeStatusServicoServicePortWSDDServiceName() {
        return NfeStatusServicoServicePortWSDDServiceName;
    }

    public void setNfeStatusServicoServicePortWSDDServiceName(java.lang.String name) {
        NfeStatusServicoServicePortWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServicoService getNfeStatusServicoServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NfeStatusServicoServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNfeStatusServicoServicePort(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServicoService getNfeStatusServicoServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServicoServiceBindingStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServicoServiceBindingStub(portAddress, this);
            _stub.setPortName(getNfeStatusServicoServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNfeStatusServicoServicePortEndpointAddress(java.lang.String address) {
        NfeStatusServicoServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServicoService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServicoServiceBindingStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.go.prod.nfestatusservico2.NfeStatusServicoServiceBindingStub(new java.net.URL(NfeStatusServicoServicePort_address), this);
                _stub.setPortName(getNfeStatusServicoServicePortWSDDServiceName());
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
        if ("NfeStatusServicoServicePort".equals(inputPortName)) {
            return getNfeStatusServicoServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", "NfeStatusServico2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico2", "NfeStatusServicoServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NfeStatusServicoServicePort".equals(portName)) {
            setNfeStatusServicoServicePortEndpointAddress(address);
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
