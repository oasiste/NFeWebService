/**
 * RecepcaoEventoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2;

public class RecepcaoEventoLocator extends org.apache.axis.client.Service implements br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEvento {

/**
 * Servico destinado a recepcao de mensagens de evento de NF-e.
 */

    public RecepcaoEventoLocator() {
    }


    public RecepcaoEventoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RecepcaoEventoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RecepcaoEventoSoap
//    private java.lang.String RecepcaoEventoSoap_address = "https://ssefa00013.fazenda.pr.gov.br:8543/nfe-evento/NFeRecepcaoEvento";
    private java.lang.String RecepcaoEventoSoap_address = "https://nfe2.fazenda.pr.gov.br/nfe-evento/NFeRecepcaoEvento";

    public java.lang.String getRecepcaoEventoSoapAddress() {
        return RecepcaoEventoSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RecepcaoEventoSoapWSDDServiceName = "RecepcaoEventoSoap";

    public java.lang.String getRecepcaoEventoSoapWSDDServiceName() {
        return RecepcaoEventoSoapWSDDServiceName;
    }

    public void setRecepcaoEventoSoapWSDDServiceName(java.lang.String name) {
        RecepcaoEventoSoapWSDDServiceName = name;
    }

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoap getRecepcaoEventoSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RecepcaoEventoSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRecepcaoEventoSoap(endpoint);
    }

    public br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoap getRecepcaoEventoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
        	br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoapStub(portAddress, this);
            _stub.setPortName(getRecepcaoEventoSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRecepcaoEventoSoapEndpointAddress(java.lang.String address) {
        RecepcaoEventoSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
            	br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoapStub _stub = new br.inf.portalfiscal.www.nfe.wsdl.pr.prod.nferecepcaoevento2.RecepcaoEventoSoapStub(new java.net.URL(RecepcaoEventoSoap_address), this);
                _stub.setPortName(getRecepcaoEventoSoapWSDDServiceName());
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
        if ("RecepcaoEventoSoap".equals(inputPortName)) {
            return getRecepcaoEventoSoap();
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
            ports.add(new javax.xml.namespace.QName("http://www.portalfiscal.inf.br/nfe/wsdl/RecepcaoEvento", "RecepcaoEventoSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RecepcaoEventoSoap".equals(portName)) {
            setRecepcaoEventoSoapEndpointAddress(address);
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
