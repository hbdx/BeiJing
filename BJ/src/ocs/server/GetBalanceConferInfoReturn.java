/**
 * GetBalanceConferInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class GetBalanceConferInfoReturn  implements java.io.Serializable {
    private java.lang.String responseId;

    private java.lang.String responseTime;

    private java.lang.String result;

    private java.lang.String errorCode;

    private java.lang.String errorMessage;

    private int retrunDetailCnt;

    private ocs.server.ReturnDetailType[] returnDetail;

    public GetBalanceConferInfoReturn() {
    }

    public GetBalanceConferInfoReturn(
           java.lang.String responseId,
           java.lang.String responseTime,
           java.lang.String result,
           java.lang.String errorCode,
           java.lang.String errorMessage,
           int retrunDetailCnt,
           ocs.server.ReturnDetailType[] returnDetail) {
           this.responseId = responseId;
           this.responseTime = responseTime;
           this.result = result;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.retrunDetailCnt = retrunDetailCnt;
           this.returnDetail = returnDetail;
    }


    /**
     * Gets the responseId value for this GetBalanceConferInfoReturn.
     * 
     * @return responseId
     */
    public java.lang.String getResponseId() {
        return responseId;
    }


    /**
     * Sets the responseId value for this GetBalanceConferInfoReturn.
     * 
     * @param responseId
     */
    public void setResponseId(java.lang.String responseId) {
        this.responseId = responseId;
    }


    /**
     * Gets the responseTime value for this GetBalanceConferInfoReturn.
     * 
     * @return responseTime
     */
    public java.lang.String getResponseTime() {
        return responseTime;
    }


    /**
     * Sets the responseTime value for this GetBalanceConferInfoReturn.
     * 
     * @param responseTime
     */
    public void setResponseTime(java.lang.String responseTime) {
        this.responseTime = responseTime;
    }


    /**
     * Gets the result value for this GetBalanceConferInfoReturn.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this GetBalanceConferInfoReturn.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the errorCode value for this GetBalanceConferInfoReturn.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetBalanceConferInfoReturn.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this GetBalanceConferInfoReturn.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this GetBalanceConferInfoReturn.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the retrunDetailCnt value for this GetBalanceConferInfoReturn.
     * 
     * @return retrunDetailCnt
     */
    public int getRetrunDetailCnt() {
        return retrunDetailCnt;
    }


    /**
     * Sets the retrunDetailCnt value for this GetBalanceConferInfoReturn.
     * 
     * @param retrunDetailCnt
     */
    public void setRetrunDetailCnt(int retrunDetailCnt) {
        this.retrunDetailCnt = retrunDetailCnt;
    }


    /**
     * Gets the returnDetail value for this GetBalanceConferInfoReturn.
     * 
     * @return returnDetail
     */
    public ocs.server.ReturnDetailType[] getReturnDetail() {
        return returnDetail;
    }


    /**
     * Sets the returnDetail value for this GetBalanceConferInfoReturn.
     * 
     * @param returnDetail
     */
    public void setReturnDetail(ocs.server.ReturnDetailType[] returnDetail) {
        this.returnDetail = returnDetail;
    }

    public ocs.server.ReturnDetailType getReturnDetail(int i) {
        return this.returnDetail[i];
    }

    public void setReturnDetail(int i, ocs.server.ReturnDetailType _value) {
        this.returnDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBalanceConferInfoReturn)) return false;
        GetBalanceConferInfoReturn other = (GetBalanceConferInfoReturn) obj;
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
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            this.retrunDetailCnt == other.getRetrunDetailCnt() &&
            ((this.returnDetail==null && other.getReturnDetail()==null) || 
             (this.returnDetail!=null &&
              java.util.Arrays.equals(this.returnDetail, other.getReturnDetail())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        _hashCode += getRetrunDetailCnt();
        if (getReturnDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBalanceConferInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "GetBalanceConferInfoReturn"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrunDetailCnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrunDetailCnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "ReturnDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
