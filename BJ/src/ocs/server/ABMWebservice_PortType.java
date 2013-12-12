/**
 * ABMWebservice_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

public interface ABMWebservice_PortType extends java.rmi.Remote {
    public ocs.server.RechargeReturn recharge(ocs.server.RechargeType in0) throws java.rmi.RemoteException;
    public ocs.server.AccountQueryReturn accountQuery(ocs.server.AccountQueryType in0) throws java.rmi.RemoteException;
    public ocs.server.GetBalanceConferInfoReturn getBalanceConferInfo(ocs.server.GetBalanceConferInfoType in0) throws java.rmi.RemoteException;
    public ocs.server.AccountUsabilityQueryReturn accountUsabilityQuery(ocs.server.AccountUsabilityQueryType in0) throws java.rmi.RemoteException;
    public ocs.server.OweBillQueryReturn oweBillQuery(ocs.server.OweBillQueryType in0) throws java.rmi.RemoteException;
    public ocs.server.GetPaymentRecordReturn getPaymentRecord(ocs.server.GetPaymentRecordType in0) throws java.rmi.RemoteException;
    public ocs.server.GetCumulationInfoReturn getCumulationInfo(ocs.server.GetCumulationInfoType in0) throws java.rmi.RemoteException;
    public ocs.server.GetBalanceConferInfoByMonthReturn getBalanceConferInfoByMonth(ocs.server.GetBalanceConferInfoByMonthType in0) throws java.rmi.RemoteException;
    public ocs.server.DoServValidateReturn doServValidate(ocs.server.DoServValidateType in0) throws java.rmi.RemoteException;
    public ocs.server.GetOweBillReturn getOweBill(ocs.server.GetOweBillType in0) throws java.rmi.RemoteException;
    public ocs.server.RefreshParaReturnType refreshPara(ocs.server.RefreshParaType in0) throws java.rmi.RemoteException;
    public ocs.server.QryIsOweReturn qryIsOwe(ocs.server.QryIsOweType in0) throws java.rmi.RemoteException;
    public ocs.server.QryCreditValueReturn qryCreditValue(ocs.server.QryCreditValueType in0) throws java.rmi.RemoteException;
    public ocs.server.QryWriteoffAmountReturn qryWriteoffAmount(ocs.server.QryWriteoffAmountType in0) throws java.rmi.RemoteException;
    public ocs.server.BalanceTransferReturn balanceTransfer(ocs.server.BalanceTransferType in0) throws java.rmi.RemoteException;
    public ocs.server.PrepayCanBackReturnType prepayCanBack(ocs.server.PrepayCanBackType in0) throws java.rmi.RemoteException;
    public ocs.server.TransBalanceQueryReturn transBalanceQuery(ocs.server.TransBalanceQueryType in0) throws java.rmi.RemoteException;
    public ocs.server.CanPresentBalanceQueryReturnType canPresentBalanceQuery(ocs.server.CanPresentBalanceQueryType in0) throws java.rmi.RemoteException;
    public ocs.server.BalancePresentReturnType balancePresent(ocs.server.BalancePresentType in0) throws java.rmi.RemoteException;
    public ocs.server.BalancePresentLogReturnType balancePresentLog(ocs.server.BalancePresentLogType in0) throws java.rmi.RemoteException;
    public ocs.server.GetServInfoReturnType getServInfo(ocs.server.GetServInfoType in0) throws java.rmi.RemoteException;
    public ocs.server.UsabilitychargeReturn usabilitycharge(ocs.server.UsabilitychargeType in0) throws java.rmi.RemoteException;
    public ocs.server.PrepayBackReturn prepayBack(ocs.server.PrepayBackType in0) throws java.rmi.RemoteException;
    public ocs.server.IndentInvoiceNumQryReturn indentInvoiceNumQry(ocs.server.IndentInvoiceNumQryType in0) throws java.rmi.RemoteException;
    public ocs.server.IndentInvoicePrintReturn indentInvoicePrint(ocs.server.IndentInvoicePrintType in0) throws java.rmi.RemoteException;
    public ocs.server.QryImmuntyInfoReturn qryImmuntyInfo(ocs.server.QryImmuntyInfoType in0) throws java.rmi.RemoteException;
    public ocs.server.QueryIVcCardReturn queryIVcCard(ocs.server.QueryIVcCardRequestType in0) throws java.rmi.RemoteException;
    public ocs.server.ForceActiveReturn forceActive(ocs.server.ForceActiveRequestType in0) throws java.rmi.RemoteException;
    public ocs.server.UpdateCertificateFlagResponseType updateCertificateFlag(ocs.server.UpdateCertificateFlagType in0) throws java.rmi.RemoteException;
    public ocs.server.QryServBlockInfoReturn qryServBlockInfo(ocs.server.QryServBlockInfoType in0) throws java.rmi.RemoteException;
    public ocs.server.QryExtDataInfoReturn qryExtDataInfo(ocs.server.QryExtDataInfoRequestType in0) throws java.rmi.RemoteException;
    public ocs.server.RechargeForTmallReturn rechargeForTmall(ocs.server.RechargeForTmallType in0) throws java.rmi.RemoteException;
}
