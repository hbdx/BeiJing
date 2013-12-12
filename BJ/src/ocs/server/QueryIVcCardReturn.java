/**
 * QueryIVcCardReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class QueryIVcCardReturn  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String payment_mode;

    private java.lang.String ivccard_flag;

    public QueryIVcCardReturn() {
    }

    public QueryIVcCardReturn(
           java.lang.String result,
           java.lang.String payment_mode,
           java.lang.String ivccard_flag) {
           this.result = result;
           this.payment_mode = payment_mode;
           this.ivccard_flag = ivccard_flag;
    }


    /**
     * Gets the result value for this QueryIVcCardReturn.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this QueryIVcCardReturn.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the payment_mode value for this QueryIVcCardReturn.
     * 
     * @return payment_mode
     */
    public java.lang.String getPayment_mode() {
        return payment_mode;
    }


    /**
     * Sets the payment_mode value for this QueryIVcCardReturn.
     * 
     * @param payment_mode
     */
    public void setPayment_mode(java.lang.String payment_mode) {
        this.payment_mode = payment_mode;
    }


    /**
     * Gets the ivccard_flag value for this QueryIVcCardReturn.
     * 
     * @return ivccard_flag
     */
    public java.lang.String getIvccard_flag() {
        return ivccard_flag;
    }


    /**
     * Sets the ivccard_flag value for this QueryIVcCardReturn.
     * 
     * @param ivccard_flag
     */
    public void setIvccard_flag(java.lang.String ivccard_flag) {
        this.ivccard_flag = ivccard_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryIVcCardReturn)) return false;
        QueryIVcCardReturn other = (QueryIVcCardReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.payment_mode==null && other.getPayment_mode()==null) || 
             (this.payment_mode!=null &&
              this.payment_mode.equals(other.getPayment_mode()))) &&
            ((this.ivccard_flag==null && other.getIvccard_flag()==null) || 
             (this.ivccard_flag!=null &&
              this.ivccard_flag.equals(other.getIvccard_flag())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getPayment_mode() != null) {
            _hashCode += getPayment_mode().hashCode();
        }
        if (getIvccard_flag() != null) {
            _hashCode += getIvccard_flag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryIVcCardReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "QueryIVcCardReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ivccard_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivccard_flag"));
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
