/**
 * NEDPersonV3ServiceagentLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.xmlns._1343670296756;

public class NEDPersonV3ServiceagentLocator extends org.apache.axis.client.Service implements com.example.xmlns._1343670296756.NEDPersonV3Serviceagent {

    public NEDPersonV3ServiceagentLocator() {
    }


    public NEDPersonV3ServiceagentLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NEDPersonV3ServiceagentLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PortTypeEndpoint0
    private java.lang.String PortTypeEndpoint0_address = "https://soa.nih.gov:443/NEDPerson/NEDPersonV3/NEDPersonV3.serviceagent/PortTypeEndpoint0";

    public java.lang.String getPortTypeEndpoint0Address() {
        return PortTypeEndpoint0_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PortTypeEndpoint0WSDDServiceName = "PortTypeEndpoint0";

    public java.lang.String getPortTypeEndpoint0WSDDServiceName() {
        return PortTypeEndpoint0WSDDServiceName;
    }

    public void setPortTypeEndpoint0WSDDServiceName(java.lang.String name) {
        PortTypeEndpoint0WSDDServiceName = name;
    }

    public com.example.xmlns._1343670296756.PortType getPortTypeEndpoint0() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PortTypeEndpoint0_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPortTypeEndpoint0(endpoint);
    }

    public com.example.xmlns._1343670296756.PortType getPortTypeEndpoint0(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.xmlns._1343670296756.PortTypeEndpoint0BindingStub _stub = new com.example.xmlns._1343670296756.PortTypeEndpoint0BindingStub(portAddress, this);
            _stub.setPortName(getPortTypeEndpoint0WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPortTypeEndpoint0EndpointAddress(java.lang.String address) {
        PortTypeEndpoint0_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.xmlns._1343670296756.PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.xmlns._1343670296756.PortTypeEndpoint0BindingStub _stub = new com.example.xmlns._1343670296756.PortTypeEndpoint0BindingStub(new java.net.URL(PortTypeEndpoint0_address), this);
                _stub.setPortName(getPortTypeEndpoint0WSDDServiceName());
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
        if ("PortTypeEndpoint0".equals(inputPortName)) {
            return getPortTypeEndpoint0();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlns.example.com/1343670296756", "NEDPersonV3.serviceagent");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xmlns.example.com/1343670296756", "PortTypeEndpoint0"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PortTypeEndpoint0".equals(portName)) {
            setPortTypeEndpoint0EndpointAddress(address);
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
