/**
 * ABMWebservice_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public interface ABMWebservice_Service extends javax.xml.rpc.Service {
    public java.lang.String getABMWebserviceSOAPAddress();

    public ocs.server.ABMWebservice_PortType getABMWebserviceSOAP() throws javax.xml.rpc.ServiceException;

    public ocs.server.ABMWebservice_PortType getABMWebserviceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
