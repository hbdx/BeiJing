/**
 * RechargeForTmallResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class RechargeForTmallResponseType  implements java.io.Serializable {
    private long tb_order_id;

    private java.lang.String out_order_id;

    private long alipay_order_no;

    private long deduct_money;

    private java.lang.String seller_alipay_id;

    private java.lang.String order_status;

    public RechargeForTmallResponseType() {
    }

    public RechargeForTmallResponseType(
           long tb_order_id,
           java.lang.String out_order_id,
           long alipay_order_no,
           long deduct_money,
           java.lang.String seller_alipay_id,
           java.lang.String order_status) {
           this.tb_order_id = tb_order_id;
           this.out_order_id = out_order_id;
           this.alipay_order_no = alipay_order_no;
           this.deduct_money = deduct_money;
           this.seller_alipay_id = seller_alipay_id;
           this.order_status = order_status;
    }


    /**
     * Gets the tb_order_id value for this RechargeForTmallResponseType.
     * 
     * @return tb_order_id
     */
    public long getTb_order_id() {
        return tb_order_id;
    }


    /**
     * Sets the tb_order_id value for this RechargeForTmallResponseType.
     * 
     * @param tb_order_id
     */
    public void setTb_order_id(long tb_order_id) {
        this.tb_order_id = tb_order_id;
    }


    /**
     * Gets the out_order_id value for this RechargeForTmallResponseType.
     * 
     * @return out_order_id
     */
    public java.lang.String getOut_order_id() {
        return out_order_id;
    }


    /**
     * Sets the out_order_id value for this RechargeForTmallResponseType.
     * 
     * @param out_order_id
     */
    public void setOut_order_id(java.lang.String out_order_id) {
        this.out_order_id = out_order_id;
    }


    /**
     * Gets the alipay_order_no value for this RechargeForTmallResponseType.
     * 
     * @return alipay_order_no
     */
    public long getAlipay_order_no() {
        return alipay_order_no;
    }


    /**
     * Sets the alipay_order_no value for this RechargeForTmallResponseType.
     * 
     * @param alipay_order_no
     */
    public void setAlipay_order_no(long alipay_order_no) {
        this.alipay_order_no = alipay_order_no;
    }


    /**
     * Gets the deduct_money value for this RechargeForTmallResponseType.
     * 
     * @return deduct_money
     */
    public long getDeduct_money() {
        return deduct_money;
    }


    /**
     * Sets the deduct_money value for this RechargeForTmallResponseType.
     * 
     * @param deduct_money
     */
    public void setDeduct_money(long deduct_money) {
        this.deduct_money = deduct_money;
    }


    /**
     * Gets the seller_alipay_id value for this RechargeForTmallResponseType.
     * 
     * @return seller_alipay_id
     */
    public java.lang.String getSeller_alipay_id() {
        return seller_alipay_id;
    }


    /**
     * Sets the seller_alipay_id value for this RechargeForTmallResponseType.
     * 
     * @param seller_alipay_id
     */
    public void setSeller_alipay_id(java.lang.String seller_alipay_id) {
        this.seller_alipay_id = seller_alipay_id;
    }


    /**
     * Gets the order_status value for this RechargeForTmallResponseType.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this RechargeForTmallResponseType.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeForTmallResponseType)) return false;
        RechargeForTmallResponseType other = (RechargeForTmallResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tb_order_id == other.getTb_order_id() &&
            ((this.out_order_id==null && other.getOut_order_id()==null) || 
             (this.out_order_id!=null &&
              this.out_order_id.equals(other.getOut_order_id()))) &&
            this.alipay_order_no == other.getAlipay_order_no() &&
            this.deduct_money == other.getDeduct_money() &&
            ((this.seller_alipay_id==null && other.getSeller_alipay_id()==null) || 
             (this.seller_alipay_id!=null &&
              this.seller_alipay_id.equals(other.getSeller_alipay_id()))) &&
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status())));
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
        _hashCode += new Long(getTb_order_id()).hashCode();
        if (getOut_order_id() != null) {
            _hashCode += getOut_order_id().hashCode();
        }
        _hashCode += new Long(getAlipay_order_no()).hashCode();
        _hashCode += new Long(getDeduct_money()).hashCode();
        if (getSeller_alipay_id() != null) {
            _hashCode += getSeller_alipay_id().hashCode();
        }
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeForTmallResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "RechargeForTmallResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tb_order_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tb_order_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("out_order_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "out_order_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alipay_order_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alipay_order_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deduct_money");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deduct_money"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller_alipay_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller_alipay_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status"));
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
