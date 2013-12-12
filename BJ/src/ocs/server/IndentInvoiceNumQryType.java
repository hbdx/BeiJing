/**
 * IndentInvoiceNumQryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class IndentInvoiceNumQryType  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String requestTime;

    private java.lang.String platId;

    private int cycleId;

    private java.lang.String staffId;

    private int invoiceType;

    private java.lang.String interfaceId;

    public IndentInvoiceNumQryType() {
    }

    public IndentInvoiceNumQryType(
           java.lang.String requestId,
           java.lang.String requestTime,
           java.lang.String platId,
           int cycleId,
           java.lang.String staffId,
           int invoiceType,
           java.lang.String interfaceId) {
           this.requestId = requestId;
           this.requestTime = requestTime;
           this.platId = platId;
           this.cycleId = cycleId;
           this.staffId = staffId;
           this.invoiceType = invoiceType;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the requestId value for this IndentInvoiceNumQryType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this IndentInvoiceNumQryType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the requestTime value for this IndentInvoiceNumQryType.
     * 
     * @return requestTime
     */
    public java.lang.String getRequestTime() {
        return requestTime;
    }


    /**
     * Sets the requestTime value for this IndentInvoiceNumQryType.
     * 
     * @param requestTime
     */
    public void setRequestTime(java.lang.String requestTime) {
        this.requestTime = requestTime;
    }


    /**
     * Gets the platId value for this IndentInvoiceNumQryType.
     * 
     * @return platId
     */
    public java.lang.String getPlatId() {
        return platId;
    }


    /**
     * Sets the platId value for this IndentInvoiceNumQryType.
     * 
     * @param platId
     */
    public void setPlatId(java.lang.String platId) {
        this.platId = platId;
    }


    /**
     * Gets the cycleId value for this IndentInvoiceNumQryType.
     * 
     * @return cycleId
     */
    public int getCycleId() {
        return cycleId;
    }


    /**
     * Sets the cycleId value for this IndentInvoiceNumQryType.
     * 
     * @param cycleId
     */
    public void setCycleId(int cycleId) {
        this.cycleId = cycleId;
    }


    /**
     * Gets the staffId value for this IndentInvoiceNumQryType.
     * 
     * @return staffId
     */
    public java.lang.String getStaffId() {
        return staffId;
    }


    /**
     * Sets the staffId value for this IndentInvoiceNumQryType.
     * 
     * @param staffId
     */
    public void setStaffId(java.lang.String staffId) {
        this.staffId = staffId;
    }


    /**
     * Gets the invoiceType value for this IndentInvoiceNumQryType.
     * 
     * @return invoiceType
     */
    public int getInvoiceType() {
        return invoiceType;
    }


    /**
     * Sets the invoiceType value for this IndentInvoiceNumQryType.
     * 
     * @param invoiceType
     */
    public void setInvoiceType(int invoiceType) {
        this.invoiceType = invoiceType;
    }


    /**
     * Gets the interfaceId value for this IndentInvoiceNumQryType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this IndentInvoiceNumQryType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndentInvoiceNumQryType)) return false;
        IndentInvoiceNumQryType other = (IndentInvoiceNumQryType) obj;
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
            ((this.platId==null && other.getPlatId()==null) || 
             (this.platId!=null &&
              this.platId.equals(other.getPlatId()))) &&
            this.cycleId == other.getCycleId() &&
            ((this.staffId==null && other.getStaffId()==null) || 
             (this.staffId!=null &&
              this.staffId.equals(other.getStaffId()))) &&
            this.invoiceType == other.getInvoiceType() &&
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
        if (getPlatId() != null) {
            _hashCode += getPlatId().hashCode();
        }
        _hashCode += getCycleId();
        if (getStaffId() != null) {
            _hashCode += getStaffId().hashCode();
        }
        _hashCode += getInvoiceType();
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndentInvoiceNumQryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "IndentInvoiceNumQryType"));
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
        elemField.setFieldName("platId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "platId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
