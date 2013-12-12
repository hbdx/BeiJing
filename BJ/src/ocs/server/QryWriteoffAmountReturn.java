/**
 * QryWriteoffAmountReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class QryWriteoffAmountReturn  implements java.io.Serializable {
    private java.lang.String resultCode;

    private int writeOffAmount;

    private int payFee;

    public QryWriteoffAmountReturn() {
    }

    public QryWriteoffAmountReturn(
           java.lang.String resultCode,
           int writeOffAmount,
           int payFee) {
           this.resultCode = resultCode;
           this.writeOffAmount = writeOffAmount;
           this.payFee = payFee;
    }


    /**
     * Gets the resultCode value for this QryWriteoffAmountReturn.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this QryWriteoffAmountReturn.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the writeOffAmount value for this QryWriteoffAmountReturn.
     * 
     * @return writeOffAmount
     */
    public int getWriteOffAmount() {
        return writeOffAmount;
    }


    /**
     * Sets the writeOffAmount value for this QryWriteoffAmountReturn.
     * 
     * @param writeOffAmount
     */
    public void setWriteOffAmount(int writeOffAmount) {
        this.writeOffAmount = writeOffAmount;
    }


    /**
     * Gets the payFee value for this QryWriteoffAmountReturn.
     * 
     * @return payFee
     */
    public int getPayFee() {
        return payFee;
    }


    /**
     * Sets the payFee value for this QryWriteoffAmountReturn.
     * 
     * @param payFee
     */
    public void setPayFee(int payFee) {
        this.payFee = payFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QryWriteoffAmountReturn)) return false;
        QryWriteoffAmountReturn other = (QryWriteoffAmountReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            this.writeOffAmount == other.getWriteOffAmount() &&
            this.payFee == other.getPayFee();
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        _hashCode += getWriteOffAmount();
        _hashCode += getPayFee();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QryWriteoffAmountReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "QryWriteoffAmountReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeOffAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writeOffAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payFee"));
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
