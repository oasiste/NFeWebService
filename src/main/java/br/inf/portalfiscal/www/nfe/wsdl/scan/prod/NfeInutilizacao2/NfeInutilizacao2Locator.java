/**
 * NfeInutilizacao2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2;

public class NfeInutilizacao2Locator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2 {

    public NfeInutilizacao2Locator() {
    }


    public NfeInutilizacao2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NfeInutilizacao2Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NfeInutilizacao2Soap12
    private java.lang.String NfeInutilizacao2Soap12_address = "https://www.scan.fazenda.gov.br/NfeInutilizacao2/NfeInutilizacao2.asmx";

    public java.lang.String getNfeInutilizacao2Soap12Address() {
        return NfeInutilizacao2Soap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NfeInutilizacao2Soap12WSDDServiceName = "NfeInutilizacao2Soap12";

    public java.lang.String getNfeInutilizacao2Soap12WSDDServiceName() {
        return NfeInutilizacao2Soap12WSDDServiceName;
    }

    public void setNfeInutilizacao2Soap12WSDDServiceName(java.lang.String name) {
        NfeInutilizacao2Soap12WSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap getNfeInutilizacao2Soap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NfeInutilizacao2Soap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNfeInutilizacao2Soap12(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap getNfeInutilizacao2Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap12Stub(portAddress, this);
            _stub.setPortName(getNfeInutilizacao2Soap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNfeInutilizacao2Soap12EndpointAddress(java.lang.String address) {
        NfeInutilizacao2Soap12_address = address;
    }


    // Use to get a proxy class for NfeInutilizacao2Soap
    private java.lang.String NfeInutilizacao2Soap_address = "https://www.scan.fazenda.gov.br/NfeInutilizacao2/NfeInutilizacao2.asmx";

    public java.lang.String getNfeInutilizacao2SoapAddress() {
        return NfeInutilizacao2Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NfeInutilizacao2SoapWSDDServiceName = "NfeInutilizacao2Soap";

    public java.lang.String getNfeInutilizacao2SoapWSDDServiceName() {
        return NfeInutilizacao2SoapWSDDServiceName;
    }

    public void setNfeInutilizacao2SoapWSDDServiceName(java.lang.String name) {
        NfeInutilizacao2SoapWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap getNfeInutilizacao2Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NfeInutilizacao2Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNfeInutilizacao2Soap(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap getNfeInutilizacao2Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2SoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2SoapStub(portAddress, this);
            _stub.setPortName(getNfeInutilizacao2SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNfeInutilizacao2SoapEndpointAddress(java.lang.String address) {
        NfeInutilizacao2Soap_address = address;
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
            if (br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap12Stub(new java.net.URL(NfeInutilizacao2Soap12_address), this);
                _stub.setPortName(getNfeInutilizacao2Soap12WSDDServiceName());
                return _stub;
            }
            if (br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2SoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.scan.prod.NfeInutilizacao2.NfeInutilizacao2SoapStub(new java.net.URL(NfeInutilizacao2Soap_address), this);
                _stub.setPortName(getNfeInutilizacao2SoapWSDDServiceName());
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
        if ("NfeInutilizacao2Soap12".equals(inputPortName)) {
            return getNfeInutilizacao2Soap12();
        }
        else if ("NfeInutilizacao2Soap".equals(inputPortName)) {
            return getNfeInutilizacao2Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeInutilizacao2", "NfeInutilizacao2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeInutilizacao2", "NfeInutilizacao2Soap12"));
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeInutilizacao2", "NfeInutilizacao2Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NfeInutilizacao2Soap12".equals(portName)) {
            setNfeInutilizacao2Soap12EndpointAddress(address);
        }
        else 
if ("NfeInutilizacao2Soap".equals(portName)) {
            setNfeInutilizacao2SoapEndpointAddress(address);
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
