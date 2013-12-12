/**
 * GetBalanceConferInfoByMonthType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class GetBalanceConferInfoByMonthType  implements java.io.Serializable {
    private java.lang.String requestId;

    private java.lang.String requestTime;

    private java.lang.String objType;

    private java.lang.String destinationId;

    private java.lang.String queryFlag;

    private int month;

    private java.lang.String interfaceId;

    public GetBalanceConferInfoByMonthType() {
    }

    public GetBalanceConferInfoByMonthType(
           java.lang.String requestId,
           java.lang.String requestTime,
           java.lang.String objType,
           java.lang.String destinationId,
           java.lang.String queryFlag,
           int month,
           java.lang.String interfaceId) {
           this.requestId = requestId;
           this.requestTime = requestTime;
           this.objType = objType;
           this.destinationId = destinationId;
           this.queryFlag = queryFlag;
           this.month = month;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the requestId value for this GetBalanceConferInfoByMonthType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this GetBalanceConferInfoByMonthType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the requestTime value for this GetBalanceConferInfoByMonthType.
     * 
     * @return requestTime
     */
    public java.lang.String getRequestTime() {
        return requestTime;
    }


    /**
     * Sets the requestTime value for this GetBalanceConferInfoByMonthType.
     * 
     * @param requestTime
     */
    public void setRequestTime(java.lang.String requestTime) {
        this.requestTime = requestTime;
    }


    /**
     * Gets the objType value for this GetBalanceConferInfoByMonthType.
     * 
     * @return objType
     */
    public java.lang.String getObjType() {
        return objType;
    }


    /**
     * Sets the objType value for this GetBalanceConferInfoByMonthType.
     * 
     * @param objType
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }


    /**
     * Gets the destinationId value for this GetBalanceConferInfoByMonthType.
     * 
     * @return destinationId
     */
    public java.lang.String getDestinationId() {
        return destinationId;
    }


    /**
     * Sets the destinationId value for this GetBalanceConferInfoByMonthType.
     * 
     * @param destinationId
     */
    public void setDestinationId(java.lang.String destinationId) {
        this.destinationId = destinationId;
    }


    /**
     * Gets the queryFlag value for this GetBalanceConferInfoByMonthType.
     * 
     * @return queryFlag
     */
    public java.lang.String getQueryFlag() {
        return queryFlag;
    }


    /**
     * Sets the queryFlag value for this GetBalanceConferInfoByMonthType.
     * 
     * @param queryFlag
     */
    public void setQueryFlag(java.lang.String queryFlag) {
        this.queryFlag = queryFlag;
    }


    /**
     * Gets the month value for this GetBalanceConferInfoByMonthType.
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this GetBalanceConferInfoByMonthType.
     * 
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the interfaceId value for this GetBalanceConferInfoByMonthType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this GetBalanceConferInfoByMonthType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBalanceConferInfoByMonthType)) return false;
        GetBalanceConferInfoByMonthType other = (GetBalanceConferInfoByMonthType) obj;
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
            ((this.objType==null && other.getObjType()==null) || 
             (this.objType!=null &&
              this.objType.equals(other.getObjType()))) &&
            ((this.destinationId==null && other.getDestinationId()==null) || 
             (this.destinationId!=null &&
              this.destinationId.equals(other.getDestinationId()))) &&
            ((this.queryFlag==null && other.getQueryFlag()==null) || 
             (this.queryFlag!=null &&
              this.queryFlag.equals(other.getQueryFlag()))) &&
            this.month == other.getMonth() &&
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
        if (getObjType() != null) {
            _hashCode += getObjType().hashCode();
        }
        if (getDestinationId() != null) {
            _hashCode += getDestinationId().hashCode();
        }
        if (getQueryFlag() != null) {
            _hashCode += getQueryFlag().hashCode();
        }
        _hashCode += getMonth();
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBalanceConferInfoByMonthType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "GetBalanceConferInfoByMonthType"));
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
        elemField.setFieldName("objType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
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
