/**
 * ConferInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class ConferInfoType  implements java.io.Serializable {
    private java.lang.String activeName;

    private int balanceType;

    private int factCharge;

    public ConferInfoType() {
    }

    public ConferInfoType(
           java.lang.String activeName,
           int balanceType,
           int factCharge) {
           this.activeName = activeName;
           this.balanceType = balanceType;
           this.factCharge = factCharge;
    }


    /**
     * Gets the activeName value for this ConferInfoType.
     * 
     * @return activeName
     */
    public java.lang.String getActiveName() {
        return activeName;
    }


    /**
     * Sets the activeName value for this ConferInfoType.
     * 
     * @param activeName
     */
    public void setActiveName(java.lang.String activeName) {
        this.activeName = activeName;
    }


    /**
     * Gets the balanceType value for this ConferInfoType.
     * 
     * @return balanceType
     */
    public int getBalanceType() {
        return balanceType;
    }


    /**
     * Sets the balanceType value for this ConferInfoType.
     * 
     * @param balanceType
     */
    public void setBalanceType(int balanceType) {
        this.balanceType = balanceType;
    }


    /**
     * Gets the factCharge value for this ConferInfoType.
     * 
     * @return factCharge
     */
    public int getFactCharge() {
        return factCharge;
    }


    /**
     * Sets the factCharge value for this ConferInfoType.
     * 
     * @param factCharge
     */
    public void setFactCharge(int factCharge) {
        this.factCharge = factCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConferInfoType)) return false;
        ConferInfoType other = (ConferInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activeName==null && other.getActiveName()==null) || 
             (this.activeName!=null &&
              this.activeName.equals(other.getActiveName()))) &&
            this.balanceType == other.getBalanceType() &&
            this.factCharge == other.getFactCharge();
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
        if (getActiveName() != null) {
            _hashCode += getActiveName().hashCode();
        }
        _hashCode += getBalanceType();
        _hashCode += getFactCharge();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConferInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "conferInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "factCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
