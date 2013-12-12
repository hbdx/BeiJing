/**
 * ABMWebservice_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class ABMWebservice_ServiceLocator extends org.apache.axis.client.Service implements ocs.server.ABMWebservice_Service {

    public ABMWebservice_ServiceLocator() {
    }


    public ABMWebservice_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ABMWebservice_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ABMWebserviceSOAP
    private java.lang.String ABMWebserviceSOAP_address = "http://server.ocs";

    public java.lang.String getABMWebserviceSOAPAddress() {
        return ABMWebserviceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ABMWebserviceSOAPWSDDServiceName = "ABMWebserviceSOAP";

    public java.lang.String getABMWebserviceSOAPWSDDServiceName() {
        return ABMWebserviceSOAPWSDDServiceName;
    }

    public void setABMWebserviceSOAPWSDDServiceName(java.lang.String name) {
        ABMWebserviceSOAPWSDDServiceName = name;
    }

    public ocs.server.ABMWebservice_PortType getABMWebserviceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ABMWebserviceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getABMWebserviceSOAP(endpoint);
    }

    public ocs.server.ABMWebservice_PortType getABMWebserviceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ocs.server.ABMWebserviceSOAPStub _stub = new ocs.server.ABMWebserviceSOAPStub(portAddress, this);
            _stub.setPortName(getABMWebserviceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setABMWebserviceSOAPEndpointAddress(java.lang.String address) {
        ABMWebserviceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ocs.server.ABMWebservice_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ocs.server.ABMWebserviceSOAPStub _stub = new ocs.server.ABMWebserviceSOAPStub(new java.net.URL(ABMWebserviceSOAP_address), this);
                _stub.setPortName(getABMWebserviceSOAPWSDDServiceName());
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
        if ("ABMWebserviceSOAP".equals(inputPortName)) {
            return getABMWebserviceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.ocs", "ABMWebservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.ocs", "ABMWebserviceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ABMWebserviceSOAP".equals(portName)) {
            setABMWebserviceSOAPEndpointAddress(address);
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
