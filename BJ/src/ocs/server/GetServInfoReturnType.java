/**
 * GetServInfoReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class GetServInfoReturnType  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String errorCode;

    private java.lang.String errorMessage;

    private int realCharge;

    private int creditValue;

    private int curBalance;

    private int paymentInfoCount;

    private ocs.server.PaymentInfoSetType1[] paymentInfoSet;

    private int servimmuInfoCount;

    private ocs.server.ServimmuInfoSetType[] servimmuInfoSet;

    private int billInfoCount;

    private ocs.server.BillInfoSetType1[] billInfoSet;

    private int totalAmount;

    private java.lang.String paymentMethod;

    public GetServInfoReturnType() {
    }

    public GetServInfoReturnType(
           java.lang.String result,
           java.lang.String errorCode,
           java.lang.String errorMessage,
           int realCharge,
           int creditValue,
           int curBalance,
           int paymentInfoCount,
           ocs.server.PaymentInfoSetType1[] paymentInfoSet,
           int servimmuInfoCount,
           ocs.server.ServimmuInfoSetType[] servimmuInfoSet,
           int billInfoCount,
           ocs.server.BillInfoSetType1[] billInfoSet,
           int totalAmount,
           java.lang.String paymentMethod) {
           this.result = result;
           this.errorCode = errorCode;
           this.errorMessage = errorMessage;
           this.realCharge = realCharge;
           this.creditValue = creditValue;
           this.curBalance = curBalance;
           this.paymentInfoCount = paymentInfoCount;
           this.paymentInfoSet = paymentInfoSet;
           this.servimmuInfoCount = servimmuInfoCount;
           this.servimmuInfoSet = servimmuInfoSet;
           this.billInfoCount = billInfoCount;
           this.billInfoSet = billInfoSet;
           this.totalAmount = totalAmount;
           this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the result value for this GetServInfoReturnType.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this GetServInfoReturnType.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the errorCode value for this GetServInfoReturnType.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this GetServInfoReturnType.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the errorMessage value for this GetServInfoReturnType.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this GetServInfoReturnType.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the realCharge value for this GetServInfoReturnType.
     * 
     * @return realCharge
     */
    public int getRealCharge() {
        return realCharge;
    }


    /**
     * Sets the realCharge value for this GetServInfoReturnType.
     * 
     * @param realCharge
     */
    public void setRealCharge(int realCharge) {
        this.realCharge = realCharge;
    }


    /**
     * Gets the creditValue value for this GetServInfoReturnType.
     * 
     * @return creditValue
     */
    public int getCreditValue() {
        return creditValue;
    }


    /**
     * Sets the creditValue value for this GetServInfoReturnType.
     * 
     * @param creditValue
     */
    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }


    /**
     * Gets the curBalance value for this GetServInfoReturnType.
     * 
     * @return curBalance
     */
    public int getCurBalance() {
        return curBalance;
    }


    /**
     * Sets the curBalance value for this GetServInfoReturnType.
     * 
     * @param curBalance
     */
    public void setCurBalance(int curBalance) {
        this.curBalance = curBalance;
    }


    /**
     * Gets the paymentInfoCount value for this GetServInfoReturnType.
     * 
     * @return paymentInfoCount
     */
    public int getPaymentInfoCount() {
        return paymentInfoCount;
    }


    /**
     * Sets the paymentInfoCount value for this GetServInfoReturnType.
     * 
     * @param paymentInfoCount
     */
    public void setPaymentInfoCount(int paymentInfoCount) {
        this.paymentInfoCount = paymentInfoCount;
    }


    /**
     * Gets the paymentInfoSet value for this GetServInfoReturnType.
     * 
     * @return paymentInfoSet
     */
    public ocs.server.PaymentInfoSetType1[] getPaymentInfoSet() {
        return paymentInfoSet;
    }


    /**
     * Sets the paymentInfoSet value for this GetServInfoReturnType.
     * 
     * @param paymentInfoSet
     */
    public void setPaymentInfoSet(ocs.server.PaymentInfoSetType1[] paymentInfoSet) {
        this.paymentInfoSet = paymentInfoSet;
    }

    public ocs.server.PaymentInfoSetType1 getPaymentInfoSet(int i) {
        return this.paymentInfoSet[i];
    }

    public void setPaymentInfoSet(int i, ocs.server.PaymentInfoSetType1 _value) {
        this.paymentInfoSet[i] = _value;
    }


    /**
     * Gets the servimmuInfoCount value for this GetServInfoReturnType.
     * 
     * @return servimmuInfoCount
     */
    public int getServimmuInfoCount() {
        return servimmuInfoCount;
    }


    /**
     * Sets the servimmuInfoCount value for this GetServInfoReturnType.
     * 
     * @param servimmuInfoCount
     */
    public void setServimmuInfoCount(int servimmuInfoCount) {
        this.servimmuInfoCount = servimmuInfoCount;
    }


    /**
     * Gets the servimmuInfoSet value for this GetServInfoReturnType.
     * 
     * @return servimmuInfoSet
     */
    public ocs.server.ServimmuInfoSetType[] getServimmuInfoSet() {
        return servimmuInfoSet;
    }


    /**
     * Sets the servimmuInfoSet value for this GetServInfoReturnType.
     * 
     * @param servimmuInfoSet
     */
    public void setServimmuInfoSet(ocs.server.ServimmuInfoSetType[] servimmuInfoSet) {
        this.servimmuInfoSet = servimmuInfoSet;
    }

    public ocs.server.ServimmuInfoSetType getServimmuInfoSet(int i) {
        return this.servimmuInfoSet[i];
    }

    public void setServimmuInfoSet(int i, ocs.server.ServimmuInfoSetType _value) {
        this.servimmuInfoSet[i] = _value;
    }


    /**
     * Gets the billInfoCount value for this GetServInfoReturnType.
     * 
     * @return billInfoCount
     */
    public int getBillInfoCount() {
        return billInfoCount;
    }


    /**
     * Sets the billInfoCount value for this GetServInfoReturnType.
     * 
     * @param billInfoCount
     */
    public void setBillInfoCount(int billInfoCount) {
        this.billInfoCount = billInfoCount;
    }


    /**
     * Gets the billInfoSet value for this GetServInfoReturnType.
     * 
     * @return billInfoSet
     */
    public ocs.server.BillInfoSetType1[] getBillInfoSet() {
        return billInfoSet;
    }


    /**
     * Sets the billInfoSet value for this GetServInfoReturnType.
     * 
     * @param billInfoSet
     */
    public void setBillInfoSet(ocs.server.BillInfoSetType1[] billInfoSet) {
        this.billInfoSet = billInfoSet;
    }

    public ocs.server.BillInfoSetType1 getBillInfoSet(int i) {
        return this.billInfoSet[i];
    }

    public void setBillInfoSet(int i, ocs.server.BillInfoSetType1 _value) {
        this.billInfoSet[i] = _value;
    }


    /**
     * Gets the totalAmount value for this GetServInfoReturnType.
     * 
     * @return totalAmount
     */
    public int getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this GetServInfoReturnType.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the paymentMethod value for this GetServInfoReturnType.
     * 
     * @return paymentMethod
     */
    public java.lang.String getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this GetServInfoReturnType.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetServInfoReturnType)) return false;
        GetServInfoReturnType other = (GetServInfoReturnType) obj;
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
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            this.realCharge == other.getRealCharge() &&
            this.creditValue == other.getCreditValue() &&
            this.curBalance == other.getCurBalance() &&
            this.paymentInfoCount == other.getPaymentInfoCount() &&
            ((this.paymentInfoSet==null && other.getPaymentInfoSet()==null) || 
             (this.paymentInfoSet!=null &&
              java.util.Arrays.equals(this.paymentInfoSet, other.getPaymentInfoSet()))) &&
            this.servimmuInfoCount == other.getServimmuInfoCount() &&
            ((this.servimmuInfoSet==null && other.getServimmuInfoSet()==null) || 
             (this.servimmuInfoSet!=null &&
              java.util.Arrays.equals(this.servimmuInfoSet, other.getServimmuInfoSet()))) &&
            this.billInfoCount == other.getBillInfoCount() &&
            ((this.billInfoSet==null && other.getBillInfoSet()==null) || 
             (this.billInfoSet!=null &&
              java.util.Arrays.equals(this.billInfoSet, other.getBillInfoSet()))) &&
            this.totalAmount == other.getTotalAmount() &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        _hashCode += getRealCharge();
        _hashCode += getCreditValue();
        _hashCode += getCurBalance();
        _hashCode += getPaymentInfoCount();
        if (getPaymentInfoSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentInfoSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentInfoSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getServimmuInfoCount();
        if (getServimmuInfoSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServimmuInfoSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServimmuInfoSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getBillInfoCount();
        if (getBillInfoSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillInfoSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillInfoSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalAmount();
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetServInfoReturnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "GetServInfoReturnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("realCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfoCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInfoCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfoSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInfoSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "PaymentInfoSetType1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servimmuInfoCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servimmuInfoCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servimmuInfoSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servimmuInfoSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "ServimmuInfoSetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billInfoCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billInfoCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billInfoSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billInfoSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "BillInfoSetType1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
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
