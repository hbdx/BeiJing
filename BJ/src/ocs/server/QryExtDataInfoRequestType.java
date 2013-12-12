/**
 * QryExtDataInfoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class QryExtDataInfoRequestType  implements java.io.Serializable {
    private java.lang.String acctId;

    private java.lang.String beginMonth;

    private java.lang.String endMonth;

    private java.lang.String interfaceId;

    public QryExtDataInfoRequestType() {
    }

    public QryExtDataInfoRequestType(
           java.lang.String acctId,
           java.lang.String beginMonth,
           java.lang.String endMonth,
           java.lang.String interfaceId) {
           this.acctId = acctId;
           this.beginMonth = beginMonth;
           this.endMonth = endMonth;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the acctId value for this QryExtDataInfoRequestType.
     * 
     * @return acctId
     */
    public java.lang.String getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this QryExtDataInfoRequestType.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.String acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the beginMonth value for this QryExtDataInfoRequestType.
     * 
     * @return beginMonth
     */
    public java.lang.String getBeginMonth() {
        return beginMonth;
    }


    /**
     * Sets the beginMonth value for this QryExtDataInfoRequestType.
     * 
     * @param beginMonth
     */
    public void setBeginMonth(java.lang.String beginMonth) {
        this.beginMonth = beginMonth;
    }


    /**
     * Gets the endMonth value for this QryExtDataInfoRequestType.
     * 
     * @return endMonth
     */
    public java.lang.String getEndMonth() {
        return endMonth;
    }


    /**
     * Sets the endMonth value for this QryExtDataInfoRequestType.
     * 
     * @param endMonth
     */
    public void setEndMonth(java.lang.String endMonth) {
        this.endMonth = endMonth;
    }


    /**
     * Gets the interfaceId value for this QryExtDataInfoRequestType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this QryExtDataInfoRequestType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QryExtDataInfoRequestType)) return false;
        QryExtDataInfoRequestType other = (QryExtDataInfoRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.beginMonth==null && other.getBeginMonth()==null) || 
             (this.beginMonth!=null &&
              this.beginMonth.equals(other.getBeginMonth()))) &&
            ((this.endMonth==null && other.getEndMonth()==null) || 
             (this.endMonth!=null &&
              this.endMonth.equals(other.getEndMonth()))) &&
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getBeginMonth() != null) {
            _hashCode += getBeginMonth().hashCode();
        }
        if (getEndMonth() != null) {
            _hashCode += getEndMonth().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QryExtDataInfoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "QryExtDataInfoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endMonth"));
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
