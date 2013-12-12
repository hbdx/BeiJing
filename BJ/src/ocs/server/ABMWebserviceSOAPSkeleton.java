/**
 * ABMWebserviceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public class ABMWebserviceSOAPSkeleton implements ocs.server.ABMWebservice_PortType, org.apache.axis.wsdl.Skeleton {
    private ocs.server.ABMWebservice_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "RechargeType"), ocs.server.RechargeType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("recharge", _params, new javax.xml.namespace.QName("", "rechargeReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "RechargeReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "recharge"));
        _oper.setSoapAction("http://server.ocs/recharge");
        _myOperationsList.add(_oper);
        if (_myOperations.get("recharge") == null) {
            _myOperations.put("recharge", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("recharge")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "OweBillQueryType"), ocs.server.OweBillQueryType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("oweBillQuery", _params, new javax.xml.namespace.QName("", "oweBillQueryReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "OweBillQueryReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "oweBillQuery"));
        _oper.setSoapAction("http://server.ocs/oweBillQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("oweBillQuery") == null) {
            _myOperations.put("oweBillQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("oweBillQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "AccountQueryType"), ocs.server.AccountQueryType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("accountQuery", _params, new javax.xml.namespace.QName("", "accountQueryReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "AccountQueryReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "accountQuery"));
        _oper.setSoapAction("http://server.ocs/accountQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("accountQuery") == null) {
            _myOperations.put("accountQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("accountQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "GetBalanceConferInfoType"), ocs.server.GetBalanceConferInfoType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getBalanceConferInfo", _params, new javax.xml.namespace.QName("", "getBalanceReturnDetailReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "GetBalanceConferInfoReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "getBalanceConferInfo"));
        _oper.setSoapAction("http://server.ocs/getBalanceConferInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBalanceConferInfo") == null) {
            _myOperations.put("getBalanceConferInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBalanceConferInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "AccountUsabilityQueryType"), ocs.server.AccountUsabilityQueryType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("accountUsabilityQuery", _params, new javax.xml.namespace.QName("", "accountUsabilityQueryReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "AccountUsabilityQueryReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "accountUsabilityQuery"));
        _oper.setSoapAction("http://server.ocs/accountUsabilityQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("accountUsabilityQuery") == null) {
            _myOperations.put("accountUsabilityQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("accountUsabilityQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "GetPaymentRecordType"), ocs.server.GetPaymentRecordType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPaymentRecord", _params, new javax.xml.namespace.QName("", "getPaymentRecordReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "GetPaymentRecordReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "getPaymentRecord"));
        _oper.setSoapAction("http://server.ocs/getPaymentRecord");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPaymentRecord") == null) {
            _myOperations.put("getPaymentRecord", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPaymentRecord")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "GetCumulationInfoType"), ocs.server.GetCumulationInfoType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCumulationInfo", _params, new javax.xml.namespace.QName("", "getCumulationInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "GetCumulationInfoReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "getCumulationInfo"));
        _oper.setSoapAction("http://server.ocs/getCumulationInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCumulationInfo") == null) {
            _myOperations.put("getCumulationInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCumulationInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "GetBalanceConferInfoByMonthType"), ocs.server.GetBalanceConferInfoByMonthType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getBalanceConferInfoByMonth", _params, new javax.xml.namespace.QName("", "getBalanceConferInfoByMonthReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "GetBalanceConferInfoByMonthReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "getBalanceConferInfoByMonth"));
        _oper.setSoapAction("http://server.ocs/getBalanceConferInfoByMonth");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBalanceConferInfoByMonth") == null) {
            _myOperations.put("getBalanceConferInfoByMonth", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBalanceConferInfoByMonth")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "DoServValidateType"), ocs.server.DoServValidateType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doServValidate", _params, new javax.xml.namespace.QName("", "doServValidateReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "DoServValidateReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "doServValidate"));
        _oper.setSoapAction("http://server.ocs/doServValidate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doServValidate") == null) {
            _myOperations.put("doServValidate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doServValidate")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "GetOweBillType"), ocs.server.GetOweBillType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getOweBill", _params, new javax.xml.namespace.QName("", "getOweBillReturn "));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "GetOweBillReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "getOweBill"));
        _oper.setSoapAction("http://server.ocs/getOweBill");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getOweBill") == null) {
            _myOperations.put("getOweBill", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getOweBill")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "RefreshParaType"), ocs.server.RefreshParaType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("refreshPara", _params, new javax.xml.namespace.QName("", "refreshParaReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "RefreshParaReturnType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "refreshPara"));
        _oper.setSoapAction("http://server.ocs/refreshPara");
        _myOperationsList.add(_oper);
        if (_myOperations.get("refreshPara") == null) {
            _myOperations.put("refreshPara", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("refreshPara")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "QryIsOweType"), ocs.server.QryIsOweType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("qryIsOwe", _params, new javax.xml.namespace.QName("", "qryIsOweReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "QryIsOweReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "qryIsOwe"));
        _oper.setSoapAction("http://server.ocs/qryIsOwe");
        _myOperationsList.add(_oper);
        if (_myOperations.get("qryIsOwe") == null) {
            _myOperations.put("qryIsOwe", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("qryIsOwe")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "QryCreditValueType"), ocs.server.QryCreditValueType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("qryCreditValue", _params, new javax.xml.namespace.QName("", "qryCreditValueReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "QryCreditValueReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "qryCreditValue"));
        _oper.setSoapAction("http://server.ocs/qryCreditValue");
        _myOperationsList.add(_oper);
        if (_myOperations.get("qryCreditValue") == null) {
            _myOperations.put("qryCreditValue", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("qryCreditValue")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "QryWriteoffAmountType"), ocs.server.QryWriteoffAmountType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("qryWriteoffAmount", _params, new javax.xml.namespace.QName("", "qryWriteoffAmountReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "QryWriteoffAmountReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "qryWriteoffAmount"));
        _oper.setSoapAction("http://server.ocs/qryWriteoffAmount");
        _myOperationsList.add(_oper);
        if (_myOperations.get("qryWriteoffAmount") == null) {
            _myOperations.put("qryWriteoffAmount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("qryWriteoffAmount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "BalanceTransferType"), ocs.server.BalanceTransferType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("balanceTransfer", _params, new javax.xml.namespace.QName("", "balanceTransferReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "BalanceTransferReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "balanceTransfer"));
        _oper.setSoapAction("http://server.ocs/balanceTransfer");
        _myOperationsList.add(_oper);
        if (_myOperations.get("balanceTransfer") == null) {
            _myOperations.put("balanceTransfer", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("balanceTransfer")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "PrepayCanBackType"), ocs.server.PrepayCanBackType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("prepayCanBack", _params, new javax.xml.namespace.QName("", "prepayCanBackReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "PrepayCanBackReturnType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "prepayCanBack"));
        _oper.setSoapAction("http://server.ocs/PrepayCanBack");
        _myOperationsList.add(_oper);
        if (_myOperations.get("prepayCanBack") == null) {
            _myOperations.put("prepayCanBack", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("prepayCanBack")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "TransBalanceQueryType"), ocs.server.TransBalanceQueryType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("transBalanceQuery", _params, new javax.xml.namespace.QName("", "transBalanceQueryReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "TransBalanceQueryReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "transBalanceQuery"));
        _oper.setSoapAction("http://server.ocs/transBalanceQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("transBalanceQuery") == null) {
            _myOperations.put("transBalanceQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("transBalanceQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "CanPresentBalanceQueryType"), ocs.server.CanPresentBalanceQueryType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("canPresentBalanceQuery", _params, new javax.xml.namespace.QName("", "canPresentBalanceQueryReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "CanPresentBalanceQueryReturnType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "canPresentBalanceQuery"));
        _oper.setSoapAction("http://server.ocs/canPresentBalanceQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("canPresentBalanceQuery") == null) {
            _myOperations.put("canPresentBalanceQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("canPresentBalanceQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "BalancePresentType"), ocs.server.BalancePresentType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("balancePresent", _params, new javax.xml.namespace.QName("", "balancePresentReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "BalancePresentReturnType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "balancePresent"));
        _oper.setSoapAction("http://server.ocs/balancePresent");
        _myOperationsList.add(_oper);
        if (_myOperations.get("balancePresent") == null) {
            _myOperations.put("balancePresent", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("balancePresent")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "BalancePresentLogType"), ocs.server.BalancePresentLogType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("balancePresentLog", _params, new javax.xml.namespace.QName("", "balancePresentLogReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "BalancePresentLogReturnType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "balancePresentLog"));
        _oper.setSoapAction("http://server.ocs/balancePresentLog");
        _myOperationsList.add(_oper);
        if (_myOperations.get("balancePresentLog") == null) {
            _myOperations.put("balancePresentLog", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("balancePresentLog")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "GetServInfoType"), ocs.server.GetServInfoType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getServInfo", _params, new javax.xml.namespace.QName("", "getServInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "GetServInfoReturnType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "getServInfo"));
        _oper.setSoapAction("http://server.ocs/getServInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getServInfo") == null) {
            _myOperations.put("getServInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getServInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "UsabilitychargeType"), ocs.server.UsabilitychargeType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("usabilitycharge", _params, new javax.xml.namespace.QName("", "usabilitychargeReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "UsabilitychargeReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "Usabilitycharge"));
        _oper.setSoapAction("http://server.ocs/usabilitycharge");
        _myOperationsList.add(_oper);
        if (_myOperations.get("usabilitycharge") == null) {
            _myOperations.put("usabilitycharge", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("usabilitycharge")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "PrepayBackType"), ocs.server.PrepayBackType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("prepayBack", _params, new javax.xml.namespace.QName("", "prepayBackReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "PrepayBackReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "prepayBack"));
        _oper.setSoapAction("http://server.ocs/prepayBack");
        _myOperationsList.add(_oper);
        if (_myOperations.get("prepayBack") == null) {
            _myOperations.put("prepayBack", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("prepayBack")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "IndentInvoiceNumQryType"), ocs.server.IndentInvoiceNumQryType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("indentInvoiceNumQry", _params, new javax.xml.namespace.QName("", "indentInvoiceNumQryReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "IndentInvoiceNumQryReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "indentInvoiceNumQry"));
        _oper.setSoapAction("http://server.ocs/indentInvoiceNumQry");
        _myOperationsList.add(_oper);
        if (_myOperations.get("indentInvoiceNumQry") == null) {
            _myOperations.put("indentInvoiceNumQry", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("indentInvoiceNumQry")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "IndentInvoicePrintType"), ocs.server.IndentInvoicePrintType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("indentInvoicePrint", _params, new javax.xml.namespace.QName("", "indentInvoicePrintReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "IndentInvoicePrintReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "indentInvoicePrint"));
        _oper.setSoapAction("http://server.ocs/indentInvoicePrint");
        _myOperationsList.add(_oper);
        if (_myOperations.get("indentInvoicePrint") == null) {
            _myOperations.put("indentInvoicePrint", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("indentInvoicePrint")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "QryImmuntyInfoType"), ocs.server.QryImmuntyInfoType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("qryImmuntyInfo", _params, new javax.xml.namespace.QName("", "qryImmuntyInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "QryImmuntyInfoReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "qryImmuntyInfo"));
        _oper.setSoapAction("http://server.ocs/qryImmuntyInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("qryImmuntyInfo") == null) {
            _myOperations.put("qryImmuntyInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("qryImmuntyInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "QueryIVcCardRequestType"), ocs.server.QueryIVcCardRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("queryIVcCard", _params, new javax.xml.namespace.QName("", "queryIVcCardReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "QueryIVcCardReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "queryIVcCardRequest"));
        _oper.setSoapAction("http://server.ocs/queryIVcCard");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryIVcCard") == null) {
            _myOperations.put("queryIVcCard", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryIVcCard")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "ForceActiveRequestType"), ocs.server.ForceActiveRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("forceActive", _params, new javax.xml.namespace.QName("", "forceActiveReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "ForceActiveReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "forceActiveRequest"));
        _oper.setSoapAction("http://server.ocs/forceActive");
        _myOperationsList.add(_oper);
        if (_myOperations.get("forceActive") == null) {
            _myOperations.put("forceActive", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("forceActive")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "UpdateCertificateFlagType"), ocs.server.UpdateCertificateFlagType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateCertificateFlag", _params, new javax.xml.namespace.QName("", "updateCertificateFlagReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "UpdateCertificateFlagResponseType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "updateCertificateFlagRequest"));
        _oper.setSoapAction("http://server.ocs/updateCertificateFlag");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateCertificateFlag") == null) {
            _myOperations.put("updateCertificateFlag", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateCertificateFlag")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "QryServBlockInfoType"), ocs.server.QryServBlockInfoType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("qryServBlockInfo", _params, new javax.xml.namespace.QName("", "qryServBlockInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "QryServBlockInfoReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "qryServBlockInfoRequest"));
        _oper.setSoapAction("http://server.ocs/qryServBlockInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("qryServBlockInfo") == null) {
            _myOperations.put("qryServBlockInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("qryServBlockInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "QryExtDataInfoRequestType"), ocs.server.QryExtDataInfoRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("qryExtDataInfo", _params, new javax.xml.namespace.QName("", "qryExtDataInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "QryExtDataInfoReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "qryExtDataInfoRequest"));
        _oper.setSoapAction("http://server.ocs/qryExtDataInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("qryExtDataInfo") == null) {
            _myOperations.put("qryExtDataInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("qryExtDataInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://server.ocs", "RechargeForTmallType"), ocs.server.RechargeForTmallType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rechargeForTmall", _params, new javax.xml.namespace.QName("", "isp"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://server.ocs", "RechargeForTmallReturn"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://server.ocs", "rechargeForTmall"));
        _oper.setSoapAction("http://server.ocs/rechargeForTmall");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rechargeForTmall") == null) {
            _myOperations.put("rechargeForTmall", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rechargeForTmall")).add(_oper);
    }

    public ABMWebserviceSOAPSkeleton() {
        this.impl = new ocs.server.ABMWebserviceSOAPImpl();
    }

    public ABMWebserviceSOAPSkeleton(ocs.server.ABMWebservice_PortType impl) {
        this.impl = impl;
    }
    public ocs.server.RechargeReturn recharge(ocs.server.RechargeType in0) throws java.rmi.RemoteException
    {
        ocs.server.RechargeReturn ret = impl.recharge(in0);
        return ret;
    }

    public ocs.server.OweBillQueryReturn oweBillQuery(ocs.server.OweBillQueryType in0) throws java.rmi.RemoteException
    {
        ocs.server.OweBillQueryReturn ret = impl.oweBillQuery(in0);
        return ret;
    }

    public ocs.server.AccountQueryReturn accountQuery(ocs.server.AccountQueryType in0) throws java.rmi.RemoteException
    {
        ocs.server.AccountQueryReturn ret = impl.accountQuery(in0);
        return ret;
    }

    public ocs.server.GetBalanceConferInfoReturn getBalanceConferInfo(ocs.server.GetBalanceConferInfoType in0) throws java.rmi.RemoteException
    {
        ocs.server.GetBalanceConferInfoReturn ret = impl.getBalanceConferInfo(in0);
        return ret;
    }

    public ocs.server.AccountUsabilityQueryReturn accountUsabilityQuery(ocs.server.AccountUsabilityQueryType in0) throws java.rmi.RemoteException
    {
        ocs.server.AccountUsabilityQueryReturn ret = impl.accountUsabilityQuery(in0);
        return ret;
    }

    public ocs.server.GetPaymentRecordReturn getPaymentRecord(ocs.server.GetPaymentRecordType in0) throws java.rmi.RemoteException
    {
        ocs.server.GetPaymentRecordReturn ret = impl.getPaymentRecord(in0);
        return ret;
    }

    public ocs.server.GetCumulationInfoReturn getCumulationInfo(ocs.server.GetCumulationInfoType in0) throws java.rmi.RemoteException
    {
        ocs.server.GetCumulationInfoReturn ret = impl.getCumulationInfo(in0);
        return ret;
    }

    public ocs.server.GetBalanceConferInfoByMonthReturn getBalanceConferInfoByMonth(ocs.server.GetBalanceConferInfoByMonthType in0) throws java.rmi.RemoteException
    {
        ocs.server.GetBalanceConferInfoByMonthReturn ret = impl.getBalanceConferInfoByMonth(in0);
        return ret;
    }

    public ocs.server.DoServValidateReturn doServValidate(ocs.server.DoServValidateType in0) throws java.rmi.RemoteException
    {
        ocs.server.DoServValidateReturn ret = impl.doServValidate(in0);
        return ret;
    }

    public ocs.server.GetOweBillReturn getOweBill(ocs.server.GetOweBillType in0) throws java.rmi.RemoteException
    {
        ocs.server.GetOweBillReturn ret = impl.getOweBill(in0);
        return ret;
    }

    public ocs.server.RefreshParaReturnType refreshPara(ocs.server.RefreshParaType in0) throws java.rmi.RemoteException
    {
        ocs.server.RefreshParaReturnType ret = impl.refreshPara(in0);
        return ret;
    }

    public ocs.server.QryIsOweReturn qryIsOwe(ocs.server.QryIsOweType in0) throws java.rmi.RemoteException
    {
        ocs.server.QryIsOweReturn ret = impl.qryIsOwe(in0);
        return ret;
    }

    public ocs.server.QryCreditValueReturn qryCreditValue(ocs.server.QryCreditValueType in0) throws java.rmi.RemoteException
    {
        ocs.server.QryCreditValueReturn ret = impl.qryCreditValue(in0);
        return ret;
    }

    public ocs.server.QryWriteoffAmountReturn qryWriteoffAmount(ocs.server.QryWriteoffAmountType in0) throws java.rmi.RemoteException
    {
        ocs.server.QryWriteoffAmountReturn ret = impl.qryWriteoffAmount(in0);
        return ret;
    }

    public ocs.server.BalanceTransferReturn balanceTransfer(ocs.server.BalanceTransferType in0) throws java.rmi.RemoteException
    {
        ocs.server.BalanceTransferReturn ret = impl.balanceTransfer(in0);
        return ret;
    }

    public ocs.server.PrepayCanBackReturnType prepayCanBack(ocs.server.PrepayCanBackType in0) throws java.rmi.RemoteException
    {
        ocs.server.PrepayCanBackReturnType ret = impl.prepayCanBack(in0);
        return ret;
    }

    public ocs.server.TransBalanceQueryReturn transBalanceQuery(ocs.server.TransBalanceQueryType in0) throws java.rmi.RemoteException
    {
        ocs.server.TransBalanceQueryReturn ret = impl.transBalanceQuery(in0);
        return ret;
    }

    public ocs.server.CanPresentBalanceQueryReturnType canPresentBalanceQuery(ocs.server.CanPresentBalanceQueryType in0) throws java.rmi.RemoteException
    {
        ocs.server.CanPresentBalanceQueryReturnType ret = impl.canPresentBalanceQuery(in0);
        return ret;
    }

    public ocs.server.BalancePresentReturnType balancePresent(ocs.server.BalancePresentType in0) throws java.rmi.RemoteException
    {
        ocs.server.BalancePresentReturnType ret = impl.balancePresent(in0);
        return ret;
    }

    public ocs.server.BalancePresentLogReturnType balancePresentLog(ocs.server.BalancePresentLogType in0) throws java.rmi.RemoteException
    {
        ocs.server.BalancePresentLogReturnType ret = impl.balancePresentLog(in0);
        return ret;
    }

    public ocs.server.GetServInfoReturnType getServInfo(ocs.server.GetServInfoType in0) throws java.rmi.RemoteException
    {
        ocs.server.GetServInfoReturnType ret = impl.getServInfo(in0);
        return ret;
    }

    public ocs.server.UsabilitychargeReturn usabilitycharge(ocs.server.UsabilitychargeType in0) throws java.rmi.RemoteException
    {
        ocs.server.UsabilitychargeReturn ret = impl.usabilitycharge(in0);
        return ret;
    }

    public ocs.server.PrepayBackReturn prepayBack(ocs.server.PrepayBackType in0) throws java.rmi.RemoteException
    {
        ocs.server.PrepayBackReturn ret = impl.prepayBack(in0);
        return ret;
    }

    public ocs.server.IndentInvoiceNumQryReturn indentInvoiceNumQry(ocs.server.IndentInvoiceNumQryType in0) throws java.rmi.RemoteException
    {
        ocs.server.IndentInvoiceNumQryReturn ret = impl.indentInvoiceNumQry(in0);
        return ret;
    }

    public ocs.server.IndentInvoicePrintReturn indentInvoicePrint(ocs.server.IndentInvoicePrintType in0) throws java.rmi.RemoteException
    {
        ocs.server.IndentInvoicePrintReturn ret = impl.indentInvoicePrint(in0);
        return ret;
    }

    public ocs.server.QryImmuntyInfoReturn qryImmuntyInfo(ocs.server.QryImmuntyInfoType in0) throws java.rmi.RemoteException
    {
        ocs.server.QryImmuntyInfoReturn ret = impl.qryImmuntyInfo(in0);
        return ret;
    }

    public ocs.server.QueryIVcCardReturn queryIVcCard(ocs.server.QueryIVcCardRequestType in0) throws java.rmi.RemoteException
    {
        ocs.server.QueryIVcCardReturn ret = impl.queryIVcCard(in0);
        return ret;
    }

    public ocs.server.ForceActiveReturn forceActive(ocs.server.ForceActiveRequestType in0) throws java.rmi.RemoteException
    {
        ocs.server.ForceActiveReturn ret = impl.forceActive(in0);
        return ret;
    }

    public ocs.server.UpdateCertificateFlagResponseType updateCertificateFlag(ocs.server.UpdateCertificateFlagType in0) throws java.rmi.RemoteException
    {
        ocs.server.UpdateCertificateFlagResponseType ret = impl.updateCertificateFlag(in0);
        return ret;
    }

    public ocs.server.QryServBlockInfoReturn qryServBlockInfo(ocs.server.QryServBlockInfoType in0) throws java.rmi.RemoteException
    {
        ocs.server.QryServBlockInfoReturn ret = impl.qryServBlockInfo(in0);
        return ret;
    }

    public ocs.server.QryExtDataInfoReturn qryExtDataInfo(ocs.server.QryExtDataInfoRequestType in0) throws java.rmi.RemoteException
    {
        ocs.server.QryExtDataInfoReturn ret = impl.qryExtDataInfo(in0);
        return ret;
    }

    public ocs.server.RechargeForTmallReturn rechargeForTmall(ocs.server.RechargeForTmallType in0) throws java.rmi.RemoteException
    {
        ocs.server.RechargeForTmallReturn ret = impl.rechargeForTmall(in0);
        return ret;
    }

}
