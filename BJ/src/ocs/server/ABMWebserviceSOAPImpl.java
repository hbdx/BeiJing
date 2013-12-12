/**
 * ABMWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ocs.server;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.Comutils;
import utils.HandleXml;

import cn.chinatelecom.sgw.soap.SGWService;
import cn.chinatelecom.sgw.soap.SgwQueryAck;
import cn.chinatelecom.sgw.soap.SgwQueryReq;

import com.hp.ocs.diameter.DiameterUtils;

public class ABMWebserviceSOAPImpl implements ocs.server.ABMWebservice_PortType{
	
private static final Logger logger = LoggerFactory.getLogger(ABMWebserviceSOAPImpl.class);
	
	//读取properties配置文件
	ResourceBundle reb = ResourceBundle.getBundle("prop") ;
	String url = reb.getString("sgwServerURL") ;
	String id = reb.getString("uid") ;

	private static int SUCCESS = 0;
	private String sgwServerURL = url;
	private String uid = id;
	private String pwd = "E807F1FCF82D132F9BB018CA6738A19F";

	public SgwQueryReq createSgwQueryReq() {
		SgwQueryReq req = new SgwQueryReq();
		req.setMID(DiameterUtils.makeSessionID(uid));
		req.setUID(uid);
		req.setPWD(pwd);
		return req;
	}
	
    public ocs.server.RechargeReturn recharge(ocs.server.RechargeType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.OweBillQueryReturn oweBillQuery(ocs.server.OweBillQueryType in0) throws java.rmi.RemoteException {
    	logger.info("receive OweBillQueryReturn ... "); 
        SgwQueryReq req = createSgwQueryReq();
        req.setDATA(HandleXml.OweBillQueryReturnToXmlString(in0));
//        req.setSCID("BillQueryByAcctID.Payment@027.ctnbc-bon.net");
        req.setSCID("BillQueryByAcctID.Payment@010.ctnbc-bon.net");
        SGWService sgwclient = Comutils.getSGWServiceClient(this.sgwServerURL);
        logger.info("send message to sgw,message details: ");
        logger.info("MID:" + req.getMID());
        logger.info("UID:" + req.getUID());
        logger.info("PWD:" + req.getPWD());
        logger.info("SCID:" + req.getSCID());
        logger.info("DATA:" + req.getDATA());
        SgwQueryAck ack = sgwclient.sgwQueryRequest(req);
        if (ack != null) {
          logger.info("receive response from sgw,message details: ");
          logger.info("MID:" + ack.getMID());
          logger.info("RTT:" + ack.getRTT());
          logger.info("RC:" + ack.getRC());
          logger.info("DS:" + ack.getDS());
          logger.info("DATA:" + ack.getDATA());
          if (Integer.valueOf(ack.getRC()).intValue() == SUCCESS) {
            return HandleXml.xmlToOweBillQueryReturn(ack.getDATA(),in0);
          }
          logger.warn("request sgw error, error code:" + ack.getRC() + 
            ",reason:" + ack.getDS());
        }
        logger.warn("request sgw error, response is null");
    	return null;
    }

    public ocs.server.AccountQueryReturn accountQuery(ocs.server.AccountQueryType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.GetBalanceConferInfoReturn getBalanceConferInfo(ocs.server.GetBalanceConferInfoType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.AccountUsabilityQueryReturn accountUsabilityQuery(ocs.server.AccountUsabilityQueryType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.GetPaymentRecordReturn getPaymentRecord(ocs.server.GetPaymentRecordType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.GetCumulationInfoReturn getCumulationInfo(ocs.server.GetCumulationInfoType in0) throws java.rmi.RemoteException {
    	logger.info("receive GetCumulationInfoReturn ... "); 
        SgwQueryReq req = createSgwQueryReq();
        req.setDATA(HandleXml.GetCumulationInfoReturnToXmlString(in0));
//        req.setSCID("RatableResourceQuery.Balance@027.ctnbc-bon.net");
        req.setSCID("RatableResourceQuery.Balance@010.ctnbc-bon.net");
        SGWService sgwclient = Comutils.getSGWServiceClient(this.sgwServerURL);
        logger.info("send message to sgw,message details: ");
        logger.info("MID:" + req.getMID());
        logger.info("UID:" + req.getUID());
        logger.info("PWD:" + req.getPWD());
        logger.info("SCID:" + req.getSCID());
        logger.info("DATA:" + req.getDATA());
        SgwQueryAck ack = sgwclient.sgwQueryRequest(req);
        if (ack != null) {
          logger.info("receive response from sgw,message details: ");
          logger.info("MID:" + ack.getMID());
          logger.info("RTT:" + ack.getRTT());
          logger.info("RC:" + ack.getRC());
          logger.info("DS:" + ack.getDS());
          logger.info("DATA:" + ack.getDATA());
          if (Integer.valueOf(ack.getRC()).intValue() == SUCCESS) {
            return HandleXml.xmlToGetCumulationInfoReturn(ack.getDATA());
          }
          logger.warn("request sgw error, error code:" + ack.getRC() + 
            ",reason:" + ack.getDS());
        }
        logger.warn("request sgw error, response is null");
    	return null;
    }

    public ocs.server.GetBalanceConferInfoByMonthReturn getBalanceConferInfoByMonth(ocs.server.GetBalanceConferInfoByMonthType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.DoServValidateReturn doServValidate(ocs.server.DoServValidateType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.GetOweBillReturn getOweBill(ocs.server.GetOweBillType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.RefreshParaReturnType refreshPara(ocs.server.RefreshParaType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.QryIsOweReturn qryIsOwe(ocs.server.QryIsOweType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.QryCreditValueReturn qryCreditValue(ocs.server.QryCreditValueType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.QryWriteoffAmountReturn qryWriteoffAmount(ocs.server.QryWriteoffAmountType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.BalanceTransferReturn balanceTransfer(ocs.server.BalanceTransferType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.PrepayCanBackReturnType prepayCanBack(ocs.server.PrepayCanBackType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.TransBalanceQueryReturn transBalanceQuery(ocs.server.TransBalanceQueryType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.CanPresentBalanceQueryReturnType canPresentBalanceQuery(ocs.server.CanPresentBalanceQueryType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.BalancePresentReturnType balancePresent(ocs.server.BalancePresentType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.BalancePresentLogReturnType balancePresentLog(ocs.server.BalancePresentLogType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.GetServInfoReturnType getServInfo(ocs.server.GetServInfoType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.UsabilitychargeReturn usabilitycharge(ocs.server.UsabilitychargeType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.PrepayBackReturn prepayBack(ocs.server.PrepayBackType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.IndentInvoiceNumQryReturn indentInvoiceNumQry(ocs.server.IndentInvoiceNumQryType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.IndentInvoicePrintReturn indentInvoicePrint(ocs.server.IndentInvoicePrintType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.QryImmuntyInfoReturn qryImmuntyInfo(ocs.server.QryImmuntyInfoType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.QueryIVcCardReturn queryIVcCard(ocs.server.QueryIVcCardRequestType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.ForceActiveReturn forceActive(ocs.server.ForceActiveRequestType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.UpdateCertificateFlagResponseType updateCertificateFlag(ocs.server.UpdateCertificateFlagType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.QryServBlockInfoReturn qryServBlockInfo(ocs.server.QryServBlockInfoType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.QryExtDataInfoReturn qryExtDataInfo(ocs.server.QryExtDataInfoRequestType in0) throws java.rmi.RemoteException {
        return null;
    }

    public ocs.server.RechargeForTmallReturn rechargeForTmall(ocs.server.RechargeForTmallType in0) throws java.rmi.RemoteException {
        return null;
    }

}
