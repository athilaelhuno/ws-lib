/**
 * SRegistroMercantilQuitoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SRegistroMercantilQuitoLocator extends org.apache.axis.client.Service implements org.tempuri.SRegistroMercantilQuito {

    public SRegistroMercantilQuitoLocator() {
    }


    public SRegistroMercantilQuitoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SRegistroMercantilQuitoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IsRegistroMercantilQuito
    private java.lang.String BasicHttpBinding_IsRegistroMercantilQuito_address = "http://186.101.75.53/ServicioSNRM/ServiciosWeb/sRegistroMercantilQuito.svc";

    public java.lang.String getBasicHttpBinding_IsRegistroMercantilQuitoAddress() {
        return BasicHttpBinding_IsRegistroMercantilQuito_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IsRegistroMercantilQuitoWSDDServiceName = "BasicHttpBinding_IsRegistroMercantilQuito";

    public java.lang.String getBasicHttpBinding_IsRegistroMercantilQuitoWSDDServiceName() {
        return BasicHttpBinding_IsRegistroMercantilQuitoWSDDServiceName;
    }

    public void setBasicHttpBinding_IsRegistroMercantilQuitoWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IsRegistroMercantilQuitoWSDDServiceName = name;
    }

    public org.tempuri.IsRegistroMercantilQuito getBasicHttpBinding_IsRegistroMercantilQuito() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IsRegistroMercantilQuito_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IsRegistroMercantilQuito(endpoint);
    }

    public org.tempuri.IsRegistroMercantilQuito getBasicHttpBinding_IsRegistroMercantilQuito(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IsRegistroMercantilQuitoStub _stub = new org.tempuri.BasicHttpBinding_IsRegistroMercantilQuitoStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IsRegistroMercantilQuitoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IsRegistroMercantilQuitoEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IsRegistroMercantilQuito_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IsRegistroMercantilQuito.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IsRegistroMercantilQuitoStub _stub = new org.tempuri.BasicHttpBinding_IsRegistroMercantilQuitoStub(new java.net.URL(BasicHttpBinding_IsRegistroMercantilQuito_address), this);
                _stub.setPortName(getBasicHttpBinding_IsRegistroMercantilQuitoWSDDServiceName());
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
        if ("BasicHttpBinding_IsRegistroMercantilQuito".equals(inputPortName)) {
            return getBasicHttpBinding_IsRegistroMercantilQuito();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "sRegistroMercantilQuito");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IsRegistroMercantilQuito"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IsRegistroMercantilQuito".equals(portName)) {
            setBasicHttpBinding_IsRegistroMercantilQuitoEndpointAddress(address);
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
