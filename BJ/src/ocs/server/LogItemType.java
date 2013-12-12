/**
 * LogItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class LogItemType  implements java.io.Serializable {
    private java.lang.String serialId;

    private java.lang.String accNbr;

    private java.lang.String preAccNbr;

    private java.lang.String amount;

    private java.lang.String preTime;

    public LogItemType() {
    }

    public LogItemType(
           java.lang.String serialId,
           java.lang.String accNbr,
           java.lang.String preAccNbr,
           java.lang.String amount,
           java.lang.String preTime) {
           this.serialId = serialId;
           this.accNbr = accNbr;
           this.preAccNbr = preAccNbr;
           this.amount = amount;
           this.preTime = preTime;
    }


    /**
     * Gets the serialId value for this LogItemType.
     * 
     * @return serialId
     */
    public java.lang.String getSerialId() {
        return serialId;
    }


    /**
     * Sets the serialId value for this LogItemType.
     * 
     * @param serialId
     */
    public void setSerialId(java.lang.String serialId) {
        this.serialId = serialId;
    }


    /**
     * Gets the accNbr value for this LogItemType.
     * 
     * @return accNbr
     */
    public java.lang.String getAccNbr() {
        return accNbr;
    }


    /**
     * Sets the accNbr value for this LogItemType.
     * 
     * @param accNbr
     */
    public void setAccNbr(java.lang.String accNbr) {
        this.accNbr = accNbr;
    }


    /**
     * Gets the preAccNbr value for this LogItemType.
     * 
     * @return preAccNbr
     */
    public java.lang.String getPreAccNbr() {
        return preAccNbr;
    }


    /**
     * Sets the preAccNbr value for this LogItemType.
     * 
     * @param preAccNbr
     */
    public void setPreAccNbr(java.lang.String preAccNbr) {
        this.preAccNbr = preAccNbr;
    }


    /**
     * Gets the amount value for this LogItemType.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this LogItemType.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the preTime value for this LogItemType.
     * 
     * @return preTime
     */
    public java.lang.String getPreTime() {
        return preTime;
    }


    /**
     * Sets the preTime value for this LogItemType.
     * 
     * @param preTime
     */
    public void setPreTime(java.lang.String preTime) {
        this.preTime = preTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogItemType)) return false;
        LogItemType other = (LogItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serialId==null && other.getSerialId()==null) || 
             (this.serialId!=null &&
              this.serialId.equals(other.getSerialId()))) &&
            ((this.accNbr==null && other.getAccNbr()==null) || 
             (this.accNbr!=null &&
              this.accNbr.equals(other.getAccNbr()))) &&
            ((this.preAccNbr==null && other.getPreAccNbr()==null) || 
             (this.preAccNbr!=null &&
              this.preAccNbr.equals(other.getPreAccNbr()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.preTime==null && other.getPreTime()==null) || 
             (this.preTime!=null &&
              this.preTime.equals(other.getPreTime())));
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
        if (getSerialId() != null) {
            _hashCode += getSerialId().hashCode();
        }
        if (getAccNbr() != null) {
            _hashCode += getAccNbr().hashCode();
        }
        if (getPreAccNbr() != null) {
            _hashCode += getPreAccNbr().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPreTime() != null) {
            _hashCode += getPreTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "logItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialId"));
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
        elemField.setFieldName("preAccNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preAccNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preTime"));
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
