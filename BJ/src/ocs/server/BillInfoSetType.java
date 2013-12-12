/**
 * BillInfoSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class BillInfoSetType  implements java.io.Serializable {
    private java.lang.String accNbr;

    private java.lang.String billCycle;

    private java.lang.String billItemName;

    private java.lang.String billItemId;

    private java.lang.String billItemFee;

    public BillInfoSetType() {
    }

    public BillInfoSetType(
           java.lang.String accNbr,
           java.lang.String billCycle,
           java.lang.String billItemName,
           java.lang.String billItemId,
           java.lang.String billItemFee) {
           this.accNbr = accNbr;
           this.billCycle = billCycle;
           this.billItemName = billItemName;
           this.billItemId = billItemId;
           this.billItemFee = billItemFee;
    }


    /**
     * Gets the accNbr value for this BillInfoSetType.
     * 
     * @return accNbr
     */
    public java.lang.String getAccNbr() {
        return accNbr;
    }


    /**
     * Sets the accNbr value for this BillInfoSetType.
     * 
     * @param accNbr
     */
    public void setAccNbr(java.lang.String accNbr) {
        this.accNbr = accNbr;
    }


    /**
     * Gets the billCycle value for this BillInfoSetType.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this BillInfoSetType.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the billItemName value for this BillInfoSetType.
     * 
     * @return billItemName
     */
    public java.lang.String getBillItemName() {
        return billItemName;
    }


    /**
     * Sets the billItemName value for this BillInfoSetType.
     * 
     * @param billItemName
     */
    public void setBillItemName(java.lang.String billItemName) {
        this.billItemName = billItemName;
    }


    /**
     * Gets the billItemId value for this BillInfoSetType.
     * 
     * @return billItemId
     */
    public java.lang.String getBillItemId() {
        return billItemId;
    }


    /**
     * Sets the billItemId value for this BillInfoSetType.
     * 
     * @param billItemId
     */
    public void setBillItemId(java.lang.String billItemId) {
        this.billItemId = billItemId;
    }


    /**
     * Gets the billItemFee value for this BillInfoSetType.
     * 
     * @return billItemFee
     */
    public java.lang.String getBillItemFee() {
        return billItemFee;
    }


    /**
     * Sets the billItemFee value for this BillInfoSetType.
     * 
     * @param billItemFee
     */
    public void setBillItemFee(java.lang.String billItemFee) {
        this.billItemFee = billItemFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillInfoSetType)) return false;
        BillInfoSetType other = (BillInfoSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accNbr==null && other.getAccNbr()==null) || 
             (this.accNbr!=null &&
              this.accNbr.equals(other.getAccNbr()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.billItemName==null && other.getBillItemName()==null) || 
             (this.billItemName!=null &&
              this.billItemName.equals(other.getBillItemName()))) &&
            ((this.billItemId==null && other.getBillItemId()==null) || 
             (this.billItemId!=null &&
              this.billItemId.equals(other.getBillItemId()))) &&
            ((this.billItemFee==null && other.getBillItemFee()==null) || 
             (this.billItemFee!=null &&
              this.billItemFee.equals(other.getBillItemFee())));
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
        if (getAccNbr() != null) {
            _hashCode += getAccNbr().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getBillItemName() != null) {
            _hashCode += getBillItemName().hashCode();
        }
        if (getBillItemId() != null) {
            _hashCode += getBillItemId().hashCode();
        }
        if (getBillItemFee() != null) {
            _hashCode += getBillItemFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillInfoSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "billInfoSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItemFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItemFee"));
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
