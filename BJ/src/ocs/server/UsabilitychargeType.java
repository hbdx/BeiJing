/**
 * UsabilitychargeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class UsabilitychargeType  implements java.io.Serializable {
    private java.lang.String requestSerial;

    private java.lang.String requestTime;

    private java.lang.String accNbr;

    private java.lang.String agentCode;

    private int rechargeAmount;

    private java.lang.String invoiceFlag;

    private java.lang.String useFlag;

    private java.lang.String managecode;

    private java.lang.String interfaceId;

    public UsabilitychargeType() {
    }

    public UsabilitychargeType(
           java.lang.String requestSerial,
           java.lang.String requestTime,
           java.lang.String accNbr,
           java.lang.String agentCode,
           int rechargeAmount,
           java.lang.String invoiceFlag,
           java.lang.String useFlag,
           java.lang.String managecode,
           java.lang.String interfaceId) {
           this.requestSerial = requestSerial;
           this.requestTime = requestTime;
           this.accNbr = accNbr;
           this.agentCode = agentCode;
           this.rechargeAmount = rechargeAmount;
           this.invoiceFlag = invoiceFlag;
           this.useFlag = useFlag;
           this.managecode = managecode;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the requestSerial value for this UsabilitychargeType.
     * 
     * @return requestSerial
     */
    public java.lang.String getRequestSerial() {
        return requestSerial;
    }


    /**
     * Sets the requestSerial value for this UsabilitychargeType.
     * 
     * @param requestSerial
     */
    public void setRequestSerial(java.lang.String requestSerial) {
        this.requestSerial = requestSerial;
    }


    /**
     * Gets the requestTime value for this UsabilitychargeType.
     * 
     * @return requestTime
     */
    public java.lang.String getRequestTime() {
        return requestTime;
    }


    /**
     * Sets the requestTime value for this UsabilitychargeType.
     * 
     * @param requestTime
     */
    public void setRequestTime(java.lang.String requestTime) {
        this.requestTime = requestTime;
    }


    /**
     * Gets the accNbr value for this UsabilitychargeType.
     * 
     * @return accNbr
     */
    public java.lang.String getAccNbr() {
        return accNbr;
    }


    /**
     * Sets the accNbr value for this UsabilitychargeType.
     * 
     * @param accNbr
     */
    public void setAccNbr(java.lang.String accNbr) {
        this.accNbr = accNbr;
    }


    /**
     * Gets the agentCode value for this UsabilitychargeType.
     * 
     * @return agentCode
     */
    public java.lang.String getAgentCode() {
        return agentCode;
    }


    /**
     * Sets the agentCode value for this UsabilitychargeType.
     * 
     * @param agentCode
     */
    public void setAgentCode(java.lang.String agentCode) {
        this.agentCode = agentCode;
    }


    /**
     * Gets the rechargeAmount value for this UsabilitychargeType.
     * 
     * @return rechargeAmount
     */
    public int getRechargeAmount() {
        return rechargeAmount;
    }


    /**
     * Sets the rechargeAmount value for this UsabilitychargeType.
     * 
     * @param rechargeAmount
     */
    public void setRechargeAmount(int rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }


    /**
     * Gets the invoiceFlag value for this UsabilitychargeType.
     * 
     * @return invoiceFlag
     */
    public java.lang.String getInvoiceFlag() {
        return invoiceFlag;
    }


    /**
     * Sets the invoiceFlag value for this UsabilitychargeType.
     * 
     * @param invoiceFlag
     */
    public void setInvoiceFlag(java.lang.String invoiceFlag) {
        this.invoiceFlag = invoiceFlag;
    }


    /**
     * Gets the useFlag value for this UsabilitychargeType.
     * 
     * @return useFlag
     */
    public java.lang.String getUseFlag() {
        return useFlag;
    }


    /**
     * Sets the useFlag value for this UsabilitychargeType.
     * 
     * @param useFlag
     */
    public void setUseFlag(java.lang.String useFlag) {
        this.useFlag = useFlag;
    }


    /**
     * Gets the managecode value for this UsabilitychargeType.
     * 
     * @return managecode
     */
    public java.lang.String getManagecode() {
        return managecode;
    }


    /**
     * Sets the managecode value for this UsabilitychargeType.
     * 
     * @param managecode
     */
    public void setManagecode(java.lang.String managecode) {
        this.managecode = managecode;
    }


    /**
     * Gets the interfaceId value for this UsabilitychargeType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this UsabilitychargeType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsabilitychargeType)) return false;
        UsabilitychargeType other = (UsabilitychargeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestSerial==null && other.getRequestSerial()==null) || 
             (this.requestSerial!=null &&
              this.requestSerial.equals(other.getRequestSerial()))) &&
            ((this.requestTime==null && other.getRequestTime()==null) || 
             (this.requestTime!=null &&
              this.requestTime.equals(other.getRequestTime()))) &&
            ((this.accNbr==null && other.getAccNbr()==null) || 
             (this.accNbr!=null &&
              this.accNbr.equals(other.getAccNbr()))) &&
            ((this.agentCode==null && other.getAgentCode()==null) || 
             (this.agentCode!=null &&
              this.agentCode.equals(other.getAgentCode()))) &&
            this.rechargeAmount == other.getRechargeAmount() &&
            ((this.invoiceFlag==null && other.getInvoiceFlag()==null) || 
             (this.invoiceFlag!=null &&
              this.invoiceFlag.equals(other.getInvoiceFlag()))) &&
            ((this.useFlag==null && other.getUseFlag()==null) || 
             (this.useFlag!=null &&
              this.useFlag.equals(other.getUseFlag()))) &&
            ((this.managecode==null && other.getManagecode()==null) || 
             (this.managecode!=null &&
              this.managecode.equals(other.getManagecode()))) &&
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
        if (getRequestSerial() != null) {
            _hashCode += getRequestSerial().hashCode();
        }
        if (getRequestTime() != null) {
            _hashCode += getRequestTime().hashCode();
        }
        if (getAccNbr() != null) {
            _hashCode += getAccNbr().hashCode();
        }
        if (getAgentCode() != null) {
            _hashCode += getAgentCode().hashCode();
        }
        _hashCode += getRechargeAmount();
        if (getInvoiceFlag() != null) {
            _hashCode += getInvoiceFlag().hashCode();
        }
        if (getUseFlag() != null) {
            _hashCode += getUseFlag().hashCode();
        }
        if (getManagecode() != null) {
            _hashCode += getManagecode().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsabilitychargeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "UsabilitychargeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestSerial"));
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
        elemField.setFieldName("agentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managecode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "managecode"));
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
