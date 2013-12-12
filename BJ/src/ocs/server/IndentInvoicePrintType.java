/**
 * IndentInvoicePrintType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class IndentInvoicePrintType  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String requestTime;

    private java.lang.String accNbr;

    private java.lang.String paymentId;

    private java.lang.String accountMonth;

    private java.lang.String staffId;

    private int printType;

    private int invoiceType;

    private java.lang.String invoiceId;

    private java.lang.String interfaceId;

    public IndentInvoicePrintType() {
    }

    public IndentInvoicePrintType(
           java.lang.String requestId,
           java.lang.String requestTime,
           java.lang.String accNbr,
           java.lang.String paymentId,
           java.lang.String accountMonth,
           java.lang.String staffId,
           int printType,
           int invoiceType,
           java.lang.String invoiceId,
           java.lang.String interfaceId) {
           this.requestId = requestId;
           this.requestTime = requestTime;
           this.accNbr = accNbr;
           this.paymentId = paymentId;
           this.accountMonth = accountMonth;
           this.staffId = staffId;
           this.printType = printType;
           this.invoiceType = invoiceType;
           this.invoiceId = invoiceId;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the requestId value for this IndentInvoicePrintType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this IndentInvoicePrintType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the requestTime value for this IndentInvoicePrintType.
     * 
     * @return requestTime
     */
    public java.lang.String getRequestTime() {
        return requestTime;
    }


    /**
     * Sets the requestTime value for this IndentInvoicePrintType.
     * 
     * @param requestTime
     */
    public void setRequestTime(java.lang.String requestTime) {
        this.requestTime = requestTime;
    }


    /**
     * Gets the accNbr value for this IndentInvoicePrintType.
     * 
     * @return accNbr
     */
    public java.lang.String getAccNbr() {
        return accNbr;
    }


    /**
     * Sets the accNbr value for this IndentInvoicePrintType.
     * 
     * @param accNbr
     */
    public void setAccNbr(java.lang.String accNbr) {
        this.accNbr = accNbr;
    }


    /**
     * Gets the paymentId value for this IndentInvoicePrintType.
     * 
     * @return paymentId
     */
    public java.lang.String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this IndentInvoicePrintType.
     * 
     * @param paymentId
     */
    public void setPaymentId(java.lang.String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the accountMonth value for this IndentInvoicePrintType.
     * 
     * @return accountMonth
     */
    public java.lang.String getAccountMonth() {
        return accountMonth;
    }


    /**
     * Sets the accountMonth value for this IndentInvoicePrintType.
     * 
     * @param accountMonth
     */
    public void setAccountMonth(java.lang.String accountMonth) {
        this.accountMonth = accountMonth;
    }


    /**
     * Gets the staffId value for this IndentInvoicePrintType.
     * 
     * @return staffId
     */
    public java.lang.String getStaffId() {
        return staffId;
    }


    /**
     * Sets the staffId value for this IndentInvoicePrintType.
     * 
     * @param staffId
     */
    public void setStaffId(java.lang.String staffId) {
        this.staffId = staffId;
    }


    /**
     * Gets the printType value for this IndentInvoicePrintType.
     * 
     * @return printType
     */
    public int getPrintType() {
        return printType;
    }


    /**
     * Sets the printType value for this IndentInvoicePrintType.
     * 
     * @param printType
     */
    public void setPrintType(int printType) {
        this.printType = printType;
    }


    /**
     * Gets the invoiceType value for this IndentInvoicePrintType.
     * 
     * @return invoiceType
     */
    public int getInvoiceType() {
        return invoiceType;
    }


    /**
     * Sets the invoiceType value for this IndentInvoicePrintType.
     * 
     * @param invoiceType
     */
    public void setInvoiceType(int invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * Gets the invoiceId value for this IndentInvoicePrintType.
     * 
     * @return invoiceId
     */
    public java.lang.String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this IndentInvoicePrintType.
     * 
     * @param invoiceId
     */
    public void setInvoiceId(java.lang.String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the interfaceId value for this IndentInvoicePrintType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this IndentInvoicePrintType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndentInvoicePrintType)) return false;
        IndentInvoicePrintType other = (IndentInvoicePrintType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.requestTime==null && other.getRequestTime()==null) || 
             (this.requestTime!=null &&
              this.requestTime.equals(other.getRequestTime()))) &&
            ((this.accNbr==null && other.getAccNbr()==null) || 
             (this.accNbr!=null &&
              this.accNbr.equals(other.getAccNbr()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.accountMonth==null && other.getAccountMonth()==null) || 
             (this.accountMonth!=null &&
              this.accountMonth.equals(other.getAccountMonth()))) &&
            ((this.staffId==null && other.getStaffId()==null) || 
             (this.staffId!=null &&
              this.staffId.equals(other.getStaffId()))) &&
            this.printType == other.getPrintType() &&
            this.invoiceType == other.getInvoiceType() &&
            ((this.invoiceId==null && other.getInvoiceId()==null) || 
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
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
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getRequestTime() != null) {
            _hashCode += getRequestTime().hashCode();
        }
        if (getAccNbr() != null) {
            _hashCode += getAccNbr().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getAccountMonth() != null) {
            _hashCode += getAccountMonth().hashCode();
        }
        if (getStaffId() != null) {
            _hashCode += getStaffId().hashCode();
        }
        _hashCode += getPrintType();
        _hashCode += getInvoiceType();
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndentInvoicePrintType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "IndentInvoicePrintType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceId"));
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
