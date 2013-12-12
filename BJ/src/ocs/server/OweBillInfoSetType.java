/**
 * OweBillInfoSetType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class OweBillInfoSetType  implements java.io.Serializable {
    private java.lang.String billItemName;

    private java.lang.String billItemFee;

    public OweBillInfoSetType() {
    }

    public OweBillInfoSetType(
           java.lang.String billItemName,
           java.lang.String billItemFee) {
           this.billItemName = billItemName;
           this.billItemFee = billItemFee;
    }


    /**
     * Gets the billItemName value for this OweBillInfoSetType.
     * 
     * @return billItemName
     */
    public java.lang.String getBillItemName() {
        return billItemName;
    }


    /**
     * Sets the billItemName value for this OweBillInfoSetType.
     * 
     * @param billItemName
     */
    public void setBillItemName(java.lang.String billItemName) {
        this.billItemName = billItemName;
    }


    /**
     * Gets the billItemFee value for this OweBillInfoSetType.
     * 
     * @return billItemFee
     */
    public java.lang.String getBillItemFee() {
        return billItemFee;
    }


    /**
     * Sets the billItemFee value for this OweBillInfoSetType.
     * 
     * @param billItemFee
     */
    public void setBillItemFee(java.lang.String billItemFee) {
        this.billItemFee = billItemFee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OweBillInfoSetType)) return false;
        OweBillInfoSetType other = (OweBillInfoSetType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billItemName==null && other.getBillItemName()==null) || 
             (this.billItemName!=null &&
              this.billItemName.equals(other.getBillItemName()))) &&
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
        if (getBillItemName() != null) {
            _hashCode += getBillItemName().hashCode();
        }
        if (getBillItemFee() != null) {
            _hashCode += getBillItemFee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OweBillInfoSetType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "oweBillInfoSetType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItemName"));
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
