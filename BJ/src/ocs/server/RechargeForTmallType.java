/**
 * RechargeForTmallType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class RechargeForTmallType  implements java.io.Serializable {
    private java.lang.String sign;

    private java.lang.String sign_type;

    private long alipay_order_id;

    private java.lang.String order_status;

    private long tb_order_id;

    private java.lang.String out_order_id;

    private java.lang.String seller_alipay_id;

    private long deduct_money;

    private java.lang.String order_pay_time;

    private java.lang.String interfaceId;

    public RechargeForTmallType() {
    }

    public RechargeForTmallType(
           java.lang.String sign,
           java.lang.String sign_type,
           long alipay_order_id,
           java.lang.String order_status,
           long tb_order_id,
           java.lang.String out_order_id,
           java.lang.String seller_alipay_id,
           long deduct_money,
           java.lang.String order_pay_time,
           java.lang.String interfaceId) {
           this.sign = sign;
           this.sign_type = sign_type;
           this.alipay_order_id = alipay_order_id;
           this.order_status = order_status;
           this.tb_order_id = tb_order_id;
           this.out_order_id = out_order_id;
           this.seller_alipay_id = seller_alipay_id;
           this.deduct_money = deduct_money;
           this.order_pay_time = order_pay_time;
           this.interfaceId = interfaceId;
    }


    /**
     * Gets the sign value for this RechargeForTmallType.
     * 
     * @return sign
     */
    public java.lang.String getSign() {
        return sign;
    }


    /**
     * Sets the sign value for this RechargeForTmallType.
     * 
     * @param sign
     */
    public void setSign(java.lang.String sign) {
        this.sign = sign;
    }


    /**
     * Gets the sign_type value for this RechargeForTmallType.
     * 
     * @return sign_type
     */
    public java.lang.String getSign_type() {
        return sign_type;
    }


    /**
     * Sets the sign_type value for this RechargeForTmallType.
     * 
     * @param sign_type
     */
    public void setSign_type(java.lang.String sign_type) {
        this.sign_type = sign_type;
    }


    /**
     * Gets the alipay_order_id value for this RechargeForTmallType.
     * 
     * @return alipay_order_id
     */
    public long getAlipay_order_id() {
        return alipay_order_id;
    }


    /**
     * Sets the alipay_order_id value for this RechargeForTmallType.
     * 
     * @param alipay_order_id
     */
    public void setAlipay_order_id(long alipay_order_id) {
        this.alipay_order_id = alipay_order_id;
    }


    /**
     * Gets the order_status value for this RechargeForTmallType.
     * 
     * @return order_status
     */
    public java.lang.String getOrder_status() {
        return order_status;
    }


    /**
     * Sets the order_status value for this RechargeForTmallType.
     * 
     * @param order_status
     */
    public void setOrder_status(java.lang.String order_status) {
        this.order_status = order_status;
    }


    /**
     * Gets the tb_order_id value for this RechargeForTmallType.
     * 
     * @return tb_order_id
     */
    public long getTb_order_id() {
        return tb_order_id;
    }


    /**
     * Sets the tb_order_id value for this RechargeForTmallType.
     * 
     * @param tb_order_id
     */
    public void setTb_order_id(long tb_order_id) {
        this.tb_order_id = tb_order_id;
    }


    /**
     * Gets the out_order_id value for this RechargeForTmallType.
     * 
     * @return out_order_id
     */
    public java.lang.String getOut_order_id() {
        return out_order_id;
    }


    /**
     * Sets the out_order_id value for this RechargeForTmallType.
     * 
     * @param out_order_id
     */
    public void setOut_order_id(java.lang.String out_order_id) {
        this.out_order_id = out_order_id;
    }


    /**
     * Gets the seller_alipay_id value for this RechargeForTmallType.
     * 
     * @return seller_alipay_id
     */
    public java.lang.String getSeller_alipay_id() {
        return seller_alipay_id;
    }


    /**
     * Sets the seller_alipay_id value for this RechargeForTmallType.
     * 
     * @param seller_alipay_id
     */
    public void setSeller_alipay_id(java.lang.String seller_alipay_id) {
        this.seller_alipay_id = seller_alipay_id;
    }


    /**
     * Gets the deduct_money value for this RechargeForTmallType.
     * 
     * @return deduct_money
     */
    public long getDeduct_money() {
        return deduct_money;
    }


    /**
     * Sets the deduct_money value for this RechargeForTmallType.
     * 
     * @param deduct_money
     */
    public void setDeduct_money(long deduct_money) {
        this.deduct_money = deduct_money;
    }


    /**
     * Gets the order_pay_time value for this RechargeForTmallType.
     * 
     * @return order_pay_time
     */
    public java.lang.String getOrder_pay_time() {
        return order_pay_time;
    }


    /**
     * Sets the order_pay_time value for this RechargeForTmallType.
     * 
     * @param order_pay_time
     */
    public void setOrder_pay_time(java.lang.String order_pay_time) {
        this.order_pay_time = order_pay_time;
    }


    /**
     * Gets the interfaceId value for this RechargeForTmallType.
     * 
     * @return interfaceId
     */
    public java.lang.String getInterfaceId() {
        return interfaceId;
    }


    /**
     * Sets the interfaceId value for this RechargeForTmallType.
     * 
     * @param interfaceId
     */
    public void setInterfaceId(java.lang.String interfaceId) {
        this.interfaceId = interfaceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RechargeForTmallType)) return false;
        RechargeForTmallType other = (RechargeForTmallType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sign==null && other.getSign()==null) || 
             (this.sign!=null &&
              this.sign.equals(other.getSign()))) &&
            ((this.sign_type==null && other.getSign_type()==null) || 
             (this.sign_type!=null &&
              this.sign_type.equals(other.getSign_type()))) &&
            this.alipay_order_id == other.getAlipay_order_id() &&
            ((this.order_status==null && other.getOrder_status()==null) || 
             (this.order_status!=null &&
              this.order_status.equals(other.getOrder_status()))) &&
            this.tb_order_id == other.getTb_order_id() &&
            ((this.out_order_id==null && other.getOut_order_id()==null) || 
             (this.out_order_id!=null &&
              this.out_order_id.equals(other.getOut_order_id()))) &&
            ((this.seller_alipay_id==null && other.getSeller_alipay_id()==null) || 
             (this.seller_alipay_id!=null &&
              this.seller_alipay_id.equals(other.getSeller_alipay_id()))) &&
            this.deduct_money == other.getDeduct_money() &&
            ((this.order_pay_time==null && other.getOrder_pay_time()==null) || 
             (this.order_pay_time!=null &&
              this.order_pay_time.equals(other.getOrder_pay_time()))) &&
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
        if (getSign() != null) {
            _hashCode += getSign().hashCode();
        }
        if (getSign_type() != null) {
            _hashCode += getSign_type().hashCode();
        }
        _hashCode += new Long(getAlipay_order_id()).hashCode();
        if (getOrder_status() != null) {
            _hashCode += getOrder_status().hashCode();
        }
        _hashCode += new Long(getTb_order_id()).hashCode();
        if (getOut_order_id() != null) {
            _hashCode += getOut_order_id().hashCode();
        }
        if (getSeller_alipay_id() != null) {
            _hashCode += getSeller_alipay_id().hashCode();
        }
        _hashCode += new Long(getDeduct_money()).hashCode();
        if (getOrder_pay_time() != null) {
            _hashCode += getOrder_pay_time().hashCode();
        }
        if (getInterfaceId() != null) {
            _hashCode += getInterfaceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeForTmallType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ocs", "RechargeForTmallType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sign_type "));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alipay_order_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alipay_order_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("seller_alipay_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller_alipay_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deduct_money");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deduct_money "));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_pay_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order_pay_time"));
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
