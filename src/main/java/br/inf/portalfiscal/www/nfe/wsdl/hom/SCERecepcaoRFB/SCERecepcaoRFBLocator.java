/**
 * SCERecepcaoRFBLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB;

public class SCERecepcaoRFBLocator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFB {

    public SCERecepcaoRFBLocator() {
    }

    public SCERecepcaoRFBLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SCERecepcaoRFBLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SCERecepcaoRFBSoap12
    private java.lang.String SCERecepcaoRFBSoap12_address = "https://hom.nfe.fazenda.gov.br/SCERecepcaoRFB/SCERecepcaoRFB.asmx";

    public java.lang.String getSCERecepcaoRFBSoap12Address() {
        return SCERecepcaoRFBSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SCERecepcaoRFBSoap12WSDDServiceName = "SCERecepcaoRFBSoap12";

    public java.lang.String getSCERecepcaoRFBSoap12WSDDServiceName() {
        return SCERecepcaoRFBSoap12WSDDServiceName;
    }

    public void setSCERecepcaoRFBSoap12WSDDServiceName(java.lang.String name) {
        SCERecepcaoRFBSoap12WSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap getSCERecepcaoRFBSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SCERecepcaoRFBSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSCERecepcaoRFBSoap12(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap getSCERecepcaoRFBSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap12Stub(portAddress, this);
            _stub.setPortName(getSCERecepcaoRFBSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSCERecepcaoRFBSoap12EndpointAddress(java.lang.String address) {
        SCERecepcaoRFBSoap12_address = address;
    }
    // Use to get a proxy class for SCERecepcaoRFBSoap
    private java.lang.String SCERecepcaoRFBSoap_address = "https://hom.nfe.fazenda.gov.br/SCERecepcaoRFB/SCERecepcaoRFB.asmx";

    public java.lang.String getSCERecepcaoRFBSoapAddress() {
        return SCERecepcaoRFBSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SCERecepcaoRFBSoapWSDDServiceName = "SCERecepcaoRFBSoap";

    public java.lang.String getSCERecepcaoRFBSoapWSDDServiceName() {
        return SCERecepcaoRFBSoapWSDDServiceName;
    }

    public void setSCERecepcaoRFBSoapWSDDServiceName(java.lang.String name) {
        SCERecepcaoRFBSoapWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap getSCERecepcaoRFBSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SCERecepcaoRFBSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSCERecepcaoRFBSoap(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap getSCERecepcaoRFBSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoapStub(portAddress, this);
            _stub.setPortName(getSCERecepcaoRFBSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSCERecepcaoRFBSoapEndpointAddress(java.lang.String address) {
        SCERecepcaoRFBSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap12Stub(new java.net.URL(SCERecepcaoRFBSoap12_address), this);
                _stub.setPortName(getSCERecepcaoRFBSoap12WSDDServiceName());
                return _stub;
            }
            if (br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCERecepcaoRFB.SCERecepcaoRFBSoapStub(new java.net.URL(SCERecepcaoRFBSoap_address), this);
                _stub.setPortName(getSCERecepcaoRFBSoapWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
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
        if ("SCERecepcaoRFBSoap12".equals(inputPortName)) {
            return getSCERecepcaoRFBSoap12();
        } else if ("SCERecepcaoRFBSoap".equals(inputPortName)) {
            return getSCERecepcaoRFBSoap();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCERecepcaoRFB", "SCERecepcaoRFB");
    }
    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCERecepcaoRFB", "SCERecepcaoRFBSoap12"));
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCERecepcaoRFB", "SCERecepcaoRFBSoap"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("SCERecepcaoRFBSoap12".equals(portName)) {
            setSCERecepcaoRFBSoap12EndpointAddress(address);
        } else if ("SCERecepcaoRFBSoap".equals(portName)) {
            setSCERecepcaoRFBSoapEndpointAddress(address);
        } else { // Unknown Port Name
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
