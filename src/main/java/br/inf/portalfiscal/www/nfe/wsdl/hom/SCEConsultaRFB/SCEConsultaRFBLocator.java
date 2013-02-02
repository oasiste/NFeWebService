/**
 * SCEConsultaRFBLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB;

public class SCEConsultaRFBLocator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFB {

    public SCEConsultaRFBLocator() {	
    }


    public SCEConsultaRFBLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SCEConsultaRFBLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SCEConsultaRFBSoap
    private java.lang.String SCEConsultaRFBSoap_address = "https://hom.nfe.fazenda.gov.br/SCEConsultaRFB/SCEConsultaRFB.asmx";

    public java.lang.String getSCEConsultaRFBSoapAddress() {
        return SCEConsultaRFBSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SCEConsultaRFBSoapWSDDServiceName = "SCEConsultaRFBSoap";

    public java.lang.String getSCEConsultaRFBSoapWSDDServiceName() {
        return SCEConsultaRFBSoapWSDDServiceName;
    }

    public void setSCEConsultaRFBSoapWSDDServiceName(java.lang.String name) {
        SCEConsultaRFBSoapWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap getSCEConsultaRFBSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SCEConsultaRFBSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSCEConsultaRFBSoap(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap getSCEConsultaRFBSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoapStub(portAddress, this);
            _stub.setPortName(getSCEConsultaRFBSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSCEConsultaRFBSoapEndpointAddress(java.lang.String address) {
        SCEConsultaRFBSoap_address = address;
    }


    // Use to get a proxy class for SCEConsultaRFBSoap12
    private java.lang.String SCEConsultaRFBSoap12_address = "https://hom.nfe.fazenda.gov.br/SCEConsultaRFB/SCEConsultaRFB.asmx";

    public java.lang.String getSCEConsultaRFBSoap12Address() {
        return SCEConsultaRFBSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SCEConsultaRFBSoap12WSDDServiceName = "SCEConsultaRFBSoap12";

    public java.lang.String getSCEConsultaRFBSoap12WSDDServiceName() {
        return SCEConsultaRFBSoap12WSDDServiceName;
    }

    public void setSCEConsultaRFBSoap12WSDDServiceName(java.lang.String name) {
        SCEConsultaRFBSoap12WSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap getSCEConsultaRFBSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SCEConsultaRFBSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSCEConsultaRFBSoap12(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap getSCEConsultaRFBSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap12Stub(portAddress, this);
            _stub.setPortName(getSCEConsultaRFBSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSCEConsultaRFBSoap12EndpointAddress(java.lang.String address) {
        SCEConsultaRFBSoap12_address = address;
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
            if (br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoapStub(new java.net.URL(SCEConsultaRFBSoap_address), this);
                _stub.setPortName(getSCEConsultaRFBSoapWSDDServiceName());
                return _stub;
            }
            if (br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.hom.SCEConsultaRFB.SCEConsultaRFBSoap12Stub(new java.net.URL(SCEConsultaRFBSoap12_address), this);
                _stub.setPortName(getSCEConsultaRFBSoap12WSDDServiceName());
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
        if ("SCEConsultaRFBSoap".equals(inputPortName)) {
            return getSCEConsultaRFBSoap();
        }
        else if ("SCEConsultaRFBSoap12".equals(inputPortName)) {
            return getSCEConsultaRFBSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "SCEConsultaRFB");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "SCEConsultaRFBSoap"));
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "SCEConsultaRFBSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SCEConsultaRFBSoap".equals(portName)) {
            setSCEConsultaRFBSoapEndpointAddress(address);
        }
        else 
if ("SCEConsultaRFBSoap12".equals(portName)) {
            setSCEConsultaRFBSoap12EndpointAddress(address);
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
