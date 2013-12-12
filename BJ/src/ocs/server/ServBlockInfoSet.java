/**
 * ServBlockInfoSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class ServBlockInfoSet  implements java.io.Serializable {
    private java.lang.String partitionIdBlock;

    private java.lang.String blockDate;

    private java.lang.String staffName;

    public ServBlockInfoSet() {
    }

    public ServBlockInfoSet(
           java.lang.String partitionIdBlock,
           java.lang.String blockDate,
           java.lang.String staffName) {
           this.partitionIdBlock = partitionIdBlock;
           this.blockDate = blockDate;
           this.staffName = staffName;
    }


    /**
     * Gets the partitionIdBlock value for this ServBlockInfoSet.
     * 
     * @return partitionIdBlock
     */
    public java.lang.String getPartitionIdBlock() {
        return partitionIdBlock;
    }


    /**
     * Sets the partitionIdBlock value for this ServBlockInfoSet.
     * 
     * @param partitionIdBlock
     */
    public void setPartitionIdBlock(java.lang.String partitionIdBlock) {
        this.partitionIdBlock = partitionIdBlock;
    }


    /**
     * Gets the blockDate value for this ServBlockInfoSet.
     * 
     * @return blockDate
     */
    public java.lang.String getBlockDate() {
        return blockDate;
    }


    /**
     * Sets the blockDate value for this ServBlockInfoSet.
     * 
     * @param blockDate
     */
    public void setBlockDate(java.lang.String blockDate) {
        this.blockDate = blockDate;
    }


    /**
     * Gets the staffName value for this ServBlockInfoSet.
     * 
     * @return staffName
     */
    public java.lang.String getStaffName() {
        return staffName;
    }


    /**
     * Sets the staffName value for this ServBlockInfoSet.
     * 
     * @param staffName
     */
    public void setStaffName(java.lang.String staffName) {
        this.staffName = staffName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServBlockInfoSet)) return false;
        ServBlockInfoSet other = (ServBlockInfoSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partitionIdBlock==null && other.getPartitionIdBlock()==null) || 
             (this.partitionIdBlock!=null &&
              this.partitionIdBlock.equals(other.getPartitionIdBlock()))) &&
            ((this.blockDate==null && other.getBlockDate()==null) || 
             (this.blockDate!=null &&
              this.blockDate.equals(other.getBlockDate()))) &&
            ((this.staffName==null && other.getStaffName()==null) || 
             (this.staffName!=null &&
              this.staffName.equals(other.getStaffName())));
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
        if (getPartitionIdBlock() != null) {
            _hashCode += getPartitionIdBlock().hashCode();
        }
        if (getBlockDate() != null) {
            _hashCode += getBlockDate().hashCode();
        }
        if (getStaffName() != null) {
            _hashCode += getStaffName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServBlockInfoSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "ServBlockInfoSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionIdBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partitionIdBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffName"));
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
