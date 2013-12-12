/**
 * UpdateCertificateFlagType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class UpdateCertificateFlagType  implements java.io.Serializable {
    private java.lang.String custId;

    private java.lang.String servId;

    private java.lang.String acc_nbr;

    private java.lang.String interfaceId;

    public UpdateCertificateFlagType() {
    }

    public UpdateCertificateFlagType(
           java.lang.String custId,
           java.lang.String servId,
           java.lang.String acc_nbr,
           java.lang.String interfaceId) {
           this.custId = custId;
           this.servId = servId;
           this.acc_nbr = acc_nbr;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the custId value for this UpdateCertificateFlagType.
     * 
     * @return custId
     */
    public java.lang.String getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this UpdateCertificateFlagType.
     * 
     * @param custId
     */
    public void setCustId(java.lang.String custId) {
        this.custId = custId;
    }


    /**
     * Gets the servId value for this UpdateCertificateFlagType.
     * 
     * @return servId
     */
    public java.lang.String getServId() {
        return servId;
    }


    /**
     * Sets the servId value for this UpdateCertificateFlagType.
     * 
     * @param servId
     */
    public void setServId(java.lang.String servId) {
        this.servId = servId;
    }


    /**
     * Gets the acc_nbr value for this UpdateCertificateFlagType.
     * 
     * @return acc_nbr
     */
    public java.lang.String getAcc_nbr() {
        return acc_nbr;
    }


    /**
     * Sets the acc_nbr value for this UpdateCertificateFlagType.
     * 
     * @param acc_nbr
     */
    public void setAcc_nbr(java.lang.String acc_nbr) {
        this.acc_nbr = acc_nbr;
    }


    /**
     * Gets the interfaceId value for this UpdateCertificateFlagType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this UpdateCertificateFlagType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateCertificateFlagType)) return false;
        UpdateCertificateFlagType other = (UpdateCertificateFlagType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.servId==null && other.getServId()==null) || 
             (this.servId!=null &&
              this.servId.equals(other.getServId()))) &&
            ((this.acc_nbr==null && other.getAcc_nbr()==null) || 
             (this.acc_nbr!=null &&
              this.acc_nbr.equals(other.getAcc_nbr()))) &&
            ((this.interfaceId==null && other.getInterfaceId()==null) || 
             (this.interfaceId!=null &&
              this.interfaceId.equals(other.getInterfaceId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getServId() != null) {
            _hashCode += getServId().hashCode();
        }
        if (getAcc_nbr() != null) {
            _hashCode += getAcc_nbr().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateCertificateFlagType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "UpdateCertificateFlagType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acc_nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acc_nbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
