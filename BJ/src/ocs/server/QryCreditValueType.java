/**
 * QryCreditValueType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class QryCreditValueType  implements java.io.Serializable {
    private long servId;

    private java.lang.String interfaceId;

    public QryCreditValueType() {
    }

    public QryCreditValueType(
           long servId,
           java.lang.String interfaceId) {
           this.servId = servId;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the servId value for this QryCreditValueType.
     * 
     * @return servId
     */
    public long getServId() {
        return servId;
    }


    /**
     * Sets the servId value for this QryCreditValueType.
     * 
     * @param servId
     */
    public void setServId(long servId) {
        this.servId = servId;
    }


    /**
     * Gets the interfaceId value for this QryCreditValueType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this QryCreditValueType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QryCreditValueType)) return false;
        QryCreditValueType other = (QryCreditValueType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.servId == other.getServId() &&
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
        _hashCode += new Long(getServId()).hashCode();
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QryCreditValueType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "QryCreditValueType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
