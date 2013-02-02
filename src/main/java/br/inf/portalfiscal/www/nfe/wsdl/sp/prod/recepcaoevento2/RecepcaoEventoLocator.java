/**
 * RecepcaoEventoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2;

public class RecepcaoEventoLocator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEvento {

/**
 * Serviço destinado ao envio de mensagens de eventos da NF-e.
 */

    public RecepcaoEventoLocator() {
    }


    public RecepcaoEventoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RecepcaoEventoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RecepcaoEventoSoap12
    private java.lang.String RecepcaoEventoSoap12_address = "https://nfe.fazenda.sp.gov.br/eventosWEB/services/RecepcaoEvento.asmx";

    public java.lang.String getRecepcaoEventoSoap12Address() {
        return RecepcaoEventoSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RecepcaoEventoSoap12WSDDServiceName = "RecepcaoEventoSoap12";

    public java.lang.String getRecepcaoEventoSoap12WSDDServiceName() {
        return RecepcaoEventoSoap12WSDDServiceName;
    }

    public void setRecepcaoEventoSoap12WSDDServiceName(java.lang.String name) {
        RecepcaoEventoSoap12WSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12 getRecepcaoEventoSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RecepcaoEventoSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRecepcaoEventoSoap12(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12 getRecepcaoEventoSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12Stub(portAddress, this);
            _stub.setPortName(getRecepcaoEventoSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRecepcaoEventoSoap12EndpointAddress(java.lang.String address) {
        RecepcaoEventoSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12.class.isAssignableFrom(serviceEndpointInterface)) {
                br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12Stub _stub = new br.inf.portalfiscal.www.nfe.wsdl.sp.prod.recepcaoevento2.RecepcaoEventoSoap12Stub(new java.net.URL(RecepcaoEventoSoap12_address), this);
                _stub.setPortName(getRecepcaoEventoSoap12WSDDServiceName());
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
        if ("RecepcaoEventoSoap12".equals(inputPortName)) {
            return getRecepcaoEventoSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/RecepcaoEvento", "RecepcaoEvento");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/RecepcaoEvento", "RecepcaoEventoSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RecepcaoEventoSoap12".equals(portName)) {
            setRecepcaoEventoSoap12EndpointAddress(address);
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
