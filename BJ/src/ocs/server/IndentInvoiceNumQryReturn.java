/**
 * IndentInvoiceNumQryReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class IndentInvoiceNumQryReturn  implements java.io.Serializable {
    private java.lang.String responseId;

    private java.lang.String responseTime;

    private int result;

    private java.lang.String invoiceNbr;

    public IndentInvoiceNumQryReturn() {
    }

    public IndentInvoiceNumQryReturn(
           java.lang.String responseId,
           java.lang.String responseTime,
           int result,
           java.lang.String invoiceNbr) {
           this.responseId = responseId;
           this.responseTime = responseTime;
           this.result = result;
           this.invoiceNbr = invoiceNbr;
    }


    /**
     * Gets the responseId value for this IndentInvoiceNumQryReturn.
     * 
     * @return responseId
     */
    public java.lang.String getResponseId() {
        return responseId;
    }


    /**
     * Sets the responseId value for this IndentInvoiceNumQryReturn.
     * 
     * @param responseId
     */
    public void setResponseId(java.lang.String responseId) {
        this.responseId = responseId;
    }


    /**
     * Gets the responseTime value for this IndentInvoiceNumQryReturn.
     * 
     * @return responseTime
     */
    public java.lang.String getResponseTime() {
        return responseTime;
    }


    /**
     * Sets the responseTime value for this IndentInvoiceNumQryReturn.
     * 
     * @param responseTime
     */
    public void setResponseTime(java.lang.String responseTime) {
        this.responseTime = responseTime;
    }


    /**
     * Gets the result value for this IndentInvoiceNumQryReturn.
     * 
     * @return result
     */
    public int getResult() {
        return result;
    }


    /**
     * Sets the result value for this IndentInvoiceNumQryReturn.
     * 
     * @param result
     */
    public void setResult(int result) {
        this.result = result;
    }


    /**
     * Gets the invoiceNbr value for this IndentInvoiceNumQryReturn.
     * 
     * @return invoiceNbr
     */
    public java.lang.String getInvoiceNbr() {
        return invoiceNbr;
    }


    /**
     * Sets the invoiceNbr value for this IndentInvoiceNumQryReturn.
     * 
     * @param invoiceNbr
     */
    public void setInvoiceNbr(java.lang.String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndentInvoiceNumQryReturn)) return false;
        IndentInvoiceNumQryReturn other = (IndentInvoiceNumQryReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseId==null && other.getResponseId()==null) || 
             (this.responseId!=null &&
              this.responseId.equals(other.getResponseId()))) &&
            ((this.responseTime==null && other.getResponseTime()==null) || 
             (this.responseTime!=null &&
              this.responseTime.equals(other.getResponseTime()))) &&
            this.result == other.getResult() &&
            ((this.invoiceNbr==null && other.getInvoiceNbr()==null) || 
             (this.invoiceNbr!=null &&
              this.invoiceNbr.equals(other.getInvoiceNbr())));
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
        if (getResponseId() != null) {
            _hashCode += getResponseId().hashCode();
        }
        if (getResponseTime() != null) {
            _hashCode += getResponseTime().hashCode();
        }
        _hashCode += getResult();
        if (getInvoiceNbr() != null) {
            _hashCode += getInvoiceNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndentInvoiceNumQryReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "IndentInvoiceNumQryReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNbr"));
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
