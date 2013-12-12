/**
 * RechargeForTmallReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class RechargeForTmallReturn  implements java.io.Serializable {
    private java.lang.String is_succes;

    private java.lang.String error;

    private java.lang.String sign_type;

    private java.lang.String sign;

    private ocs.server.RechargeForTmallResponseType response;

    public RechargeForTmallReturn() {
    }

    public RechargeForTmallReturn(
           java.lang.String is_succes,
           java.lang.String error,
           java.lang.String sign_type,
           java.lang.String sign,
           ocs.server.RechargeForTmallResponseType response) {
           this.is_succes = is_succes;
           this.error = error;
           this.sign_type = sign_type;
           this.sign = sign;
           this.response = response;
    }


    /**
     * Gets the is_succes value for this RechargeForTmallReturn.
     * 
     * @return is_succes
     */
    public java.lang.String getIs_succes() {
        return is_succes;
    }


    /**
     * Sets the is_succes value for this RechargeForTmallReturn.
     * 
     * @param is_succes
     */
    public void setIs_succes(java.lang.String is_succes) {
        this.is_succes = is_succes;
    }


    /**
     * Gets the error value for this RechargeForTmallReturn.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this RechargeForTmallReturn.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the sign_type value for this RechargeForTmallReturn.
     * 
     * @return sign_type
     */
    public java.lang.String getSign_type() {
        return sign_type;
    }


    /**
     * Sets the sign_type value for this RechargeForTmallReturn.
     * 
     * @param sign_type
     */
    public void setSign_type(java.lang.String sign_type) {
        this.sign_type = sign_type;
    }


    /**
     * Gets the sign value for this RechargeForTmallReturn.
     * 
     * @return sign
     */
    public java.lang.String getSign() {
        return sign;
    }


    /**
     * Sets the sign value for this RechargeForTmallReturn.
     * 
     * @param sign
     */
    public void setSign(java.lang.String sign) {
        this.sign = sign;
    }


    /**
     * Gets the response value for this RechargeForTmallReturn.
     * 
     * @return response
     */
    public ocs.server.RechargeForTmallResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this RechargeForTmallReturn.
     * 
     * @param response
     */
    public void setResponse(ocs.server.RechargeForTmallResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeForTmallReturn)) return false;
        RechargeForTmallReturn other = (RechargeForTmallReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.is_succes==null && other.getIs_succes()==null) || 
             (this.is_succes!=null &&
              this.is_succes.equals(other.getIs_succes()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.sign_type==null && other.getSign_type()==null) || 
             (this.sign_type!=null &&
              this.sign_type.equals(other.getSign_type()))) &&
            ((this.sign==null && other.getSign()==null) || 
             (this.sign!=null &&
              this.sign.equals(other.getSign()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getIs_succes() != null) {
            _hashCode += getIs_succes().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getSign_type() != null) {
            _hashCode += getSign_type().hashCode();
        }
        if (getSign() != null) {
            _hashCode += getSign().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeForTmallReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "RechargeForTmallReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_succes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_succes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sign_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "RechargeForTmallResponseType"));
        elemField.setMinOccurs(0);
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
