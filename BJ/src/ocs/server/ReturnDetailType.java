/**
 * ReturnDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class ReturnDetailType  implements java.io.Serializable {
    private java.lang.String returnDate;

    private int factCharge;

    private int curPhase;

    private java.lang.String countFormula;

    private java.lang.String effDate;

    private java.lang.String expDate;

    private java.lang.String returnState;

    private java.lang.String returnDesc;

    public ReturnDetailType() {
    }

    public ReturnDetailType(
           java.lang.String returnDate,
           int factCharge,
           int curPhase,
           java.lang.String countFormula,
           java.lang.String effDate,
           java.lang.String expDate,
           java.lang.String returnState,
           java.lang.String returnDesc) {
           this.returnDate = returnDate;
           this.factCharge = factCharge;
           this.curPhase = curPhase;
           this.countFormula = countFormula;
           this.effDate = effDate;
           this.expDate = expDate;
           this.returnState = returnState;
           this.returnDesc = returnDesc;
    }


    /**
     * Gets the returnDate value for this ReturnDetailType.
     * 
     * @return returnDate
     */
    public java.lang.String getReturnDate() {
        return returnDate;
    }


    /**
     * Sets the returnDate value for this ReturnDetailType.
     * 
     * @param returnDate
     */
    public void setReturnDate(java.lang.String returnDate) {
        this.returnDate = returnDate;
    }


    /**
     * Gets the factCharge value for this ReturnDetailType.
     * 
     * @return factCharge
     */
    public int getFactCharge() {
        return factCharge;
    }


    /**
     * Sets the factCharge value for this ReturnDetailType.
     * 
     * @param factCharge
     */
    public void setFactCharge(int factCharge) {
        this.factCharge = factCharge;
    }


    /**
     * Gets the curPhase value for this ReturnDetailType.
     * 
     * @return curPhase
     */
    public int getCurPhase() {
        return curPhase;
    }


    /**
     * Sets the curPhase value for this ReturnDetailType.
     * 
     * @param curPhase
     */
    public void setCurPhase(int curPhase) {
        this.curPhase = curPhase;
    }


    /**
     * Gets the countFormula value for this ReturnDetailType.
     * 
     * @return countFormula
     */
    public java.lang.String getCountFormula() {
        return countFormula;
    }


    /**
     * Sets the countFormula value for this ReturnDetailType.
     * 
     * @param countFormula
     */
    public void setCountFormula(java.lang.String countFormula) {
        this.countFormula = countFormula;
    }


    /**
     * Gets the effDate value for this ReturnDetailType.
     * 
     * @return effDate
     */
    public java.lang.String getEffDate() {
        return effDate;
    }


    /**
     * Sets the effDate value for this ReturnDetailType.
     * 
     * @param effDate
     */
    public void setEffDate(java.lang.String effDate) {
        this.effDate = effDate;
    }


    /**
     * Gets the expDate value for this ReturnDetailType.
     * 
     * @return expDate
     */
    public java.lang.String getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this ReturnDetailType.
     * 
     * @param expDate
     */
    public void setExpDate(java.lang.String expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the returnState value for this ReturnDetailType.
     * 
     * @return returnState
     */
    public java.lang.String getReturnState() {
        return returnState;
    }


    /**
     * Sets the returnState value for this ReturnDetailType.
     * 
     * @param returnState
     */
    public void setReturnState(java.lang.String returnState) {
        this.returnState = returnState;
    }


    /**
     * Gets the returnDesc value for this ReturnDetailType.
     * 
     * @return returnDesc
     */
    public java.lang.String getReturnDesc() {
        return returnDesc;
    }


    /**
     * Sets the returnDesc value for this ReturnDetailType.
     * 
     * @param returnDesc
     */
    public void setReturnDesc(java.lang.String returnDesc) {
        this.returnDesc = returnDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnDetailType)) return false;
        ReturnDetailType other = (ReturnDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnDate==null && other.getReturnDate()==null) || 
             (this.returnDate!=null &&
              this.returnDate.equals(other.getReturnDate()))) &&
            this.factCharge == other.getFactCharge() &&
            this.curPhase == other.getCurPhase() &&
            ((this.countFormula==null && other.getCountFormula()==null) || 
             (this.countFormula!=null &&
              this.countFormula.equals(other.getCountFormula()))) &&
            ((this.effDate==null && other.getEffDate()==null) || 
             (this.effDate!=null &&
              this.effDate.equals(other.getEffDate()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.returnState==null && other.getReturnState()==null) || 
             (this.returnState!=null &&
              this.returnState.equals(other.getReturnState()))) &&
            ((this.returnDesc==null && other.getReturnDesc()==null) || 
             (this.returnDesc!=null &&
              this.returnDesc.equals(other.getReturnDesc())));
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
        if (getReturnDate() != null) {
            _hashCode += getReturnDate().hashCode();
        }
        _hashCode += getFactCharge();
        _hashCode += getCurPhase();
        if (getCountFormula() != null) {
            _hashCode += getCountFormula().hashCode();
        }
        if (getEffDate() != null) {
            _hashCode += getEffDate().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getReturnState() != null) {
            _hashCode += getReturnState().hashCode();
        }
        if (getReturnDesc() != null) {
            _hashCode += getReturnDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "ReturnDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "factCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curPhase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curPhase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countFormula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnDesc"));
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
