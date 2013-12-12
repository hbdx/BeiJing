/**
 * ExtDataInfoSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class ExtDataInfoSet  implements java.io.Serializable {
    private java.lang.String charge;

    private java.lang.String billingCycleId;

    private java.lang.String state;

    private java.lang.String createDate;

    private java.lang.String operDate;

    private java.lang.String paymentDay;

    private java.lang.String printFlag;

    private java.lang.String collectInfo;

    public ExtDataInfoSet() {
    }

    public ExtDataInfoSet(
           java.lang.String charge,
           java.lang.String billingCycleId,
           java.lang.String state,
           java.lang.String createDate,
           java.lang.String operDate,
           java.lang.String paymentDay,
           java.lang.String printFlag,
           java.lang.String collectInfo) {
           this.charge = charge;
           this.billingCycleId = billingCycleId;
           this.state = state;
           this.createDate = createDate;
           this.operDate = operDate;
           this.paymentDay = paymentDay;
           this.printFlag = printFlag;
           this.collectInfo = collectInfo;
    }


    /**
     * Gets the charge value for this ExtDataInfoSet.
     * 
     * @return charge
     */
    public java.lang.String getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this ExtDataInfoSet.
     * 
     * @param charge
     */
    public void setCharge(java.lang.String charge) {
        this.charge = charge;
    }


    /**
     * Gets the billingCycleId value for this ExtDataInfoSet.
     * 
     * @return billingCycleId
     */
    public java.lang.String getBillingCycleId() {
        return billingCycleId;
    }


    /**
     * Sets the billingCycleId value for this ExtDataInfoSet.
     * 
     * @param billingCycleId
     */
    public void setBillingCycleId(java.lang.String billingCycleId) {
        this.billingCycleId = billingCycleId;
    }


    /**
     * Gets the state value for this ExtDataInfoSet.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ExtDataInfoSet.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the createDate value for this ExtDataInfoSet.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ExtDataInfoSet.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the operDate value for this ExtDataInfoSet.
     * 
     * @return operDate
     */
    public java.lang.String getOperDate() {
        return operDate;
    }


    /**
     * Sets the operDate value for this ExtDataInfoSet.
     * 
     * @param operDate
     */
    public void setOperDate(java.lang.String operDate) {
        this.operDate = operDate;
    }


    /**
     * Gets the paymentDay value for this ExtDataInfoSet.
     * 
     * @return paymentDay
     */
    public java.lang.String getPaymentDay() {
        return paymentDay;
    }


    /**
     * Sets the paymentDay value for this ExtDataInfoSet.
     * 
     * @param paymentDay
     */
    public void setPaymentDay(java.lang.String paymentDay) {
        this.paymentDay = paymentDay;
    }


    /**
     * Gets the printFlag value for this ExtDataInfoSet.
     * 
     * @return printFlag
     */
    public java.lang.String getPrintFlag() {
        return printFlag;
    }


    /**
     * Sets the printFlag value for this ExtDataInfoSet.
     * 
     * @param printFlag
     */
    public void setPrintFlag(java.lang.String printFlag) {
        this.printFlag = printFlag;
    }


    /**
     * Gets the collectInfo value for this ExtDataInfoSet.
     * 
     * @return collectInfo
     */
    public java.lang.String getCollectInfo() {
        return collectInfo;
    }


    /**
     * Sets the collectInfo value for this ExtDataInfoSet.
     * 
     * @param collectInfo
     */
    public void setCollectInfo(java.lang.String collectInfo) {
        this.collectInfo = collectInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtDataInfoSet)) return false;
        ExtDataInfoSet other = (ExtDataInfoSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.billingCycleId==null && other.getBillingCycleId()==null) || 
             (this.billingCycleId!=null &&
              this.billingCycleId.equals(other.getBillingCycleId()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.operDate==null && other.getOperDate()==null) || 
             (this.operDate!=null &&
              this.operDate.equals(other.getOperDate()))) &&
            ((this.paymentDay==null && other.getPaymentDay()==null) || 
             (this.paymentDay!=null &&
              this.paymentDay.equals(other.getPaymentDay()))) &&
            ((this.printFlag==null && other.getPrintFlag()==null) || 
             (this.printFlag!=null &&
              this.printFlag.equals(other.getPrintFlag()))) &&
            ((this.collectInfo==null && other.getCollectInfo()==null) || 
             (this.collectInfo!=null &&
              this.collectInfo.equals(other.getCollectInfo())));
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
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getBillingCycleId() != null) {
            _hashCode += getBillingCycleId().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getOperDate() != null) {
            _hashCode += getOperDate().hashCode();
        }
        if (getPaymentDay() != null) {
            _hashCode += getPaymentDay().hashCode();
        }
        if (getPrintFlag() != null) {
            _hashCode += getPrintFlag().hashCode();
        }
        if (getCollectInfo() != null) {
            _hashCode += getCollectInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtDataInfoSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "ExtDataInfoSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCycleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCycleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectInfo"));
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
