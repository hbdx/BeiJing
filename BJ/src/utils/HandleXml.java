package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import ocs.server.BillInfoSetType;
import ocs.server.CumulationInfoSetType;
import ocs.server.GetCumulationInfoReturn;
import ocs.server.GetCumulationInfoType;
import ocs.server.OweBillQueryReturn;
import ocs.server.OweBillQueryType;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandleXml {
	
	private static final Logger logger = LoggerFactory.getLogger(HandleXml.class);

	public static String OweBillQueryReturnToXmlString(OweBillQueryType in0) {
		logger.info("conver OweBillQueryReturn To XmlString.....");
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element vcInformationElement = serviceInformation.addElement("Bill_Query") ;
		Element element = null ;
		
		element = vcInformationElement.addElement("BillQuery_Type");
		element.setText(in0.getFeeQueryFlag());
		
		element = vcInformationElement.addElement("Destination_Account");
		element.setText(in0.getAccNbr());
		
		element = vcInformationElement.addElement("Destination_Attr");
		element.setText("2");
		
		element = vcInformationElement.addElement("Query_Flag");
		element.setText("1");
		
		element = vcInformationElement.addElement("Fee_Query_Flag");
		element.setText("0");
		
		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static OweBillQueryReturn xmlToOweBillQueryReturn(String data, OweBillQueryType in0) {
		logger.info("convert sgw ack to OweBillQueryReturn......");
		OweBillQueryReturn resp = new OweBillQueryReturn();
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			
			Node node = root.selectSingleNode("Service_Information//Service_Result_Code");
			if(node != null){
				resp.setResult(node.getStringValue());
			}
			
			List<Node> errorDesc = root.selectNodes("//Service_Information/Para_Field_Result") ;
			if(errorDesc.size() > 0){
				String errorDescs = "|" ;
				for(int i=0 ;i<errorDesc.size() ;i++){
					errorDescs += errorDesc.get(i).getStringValue()+"|" ;
				}
				resp.setErrorCode(errorDescs);
			}
			
			resp.setErrorMessage("");
			
			int acctItemChargeSum = 0 ;
			List<Node> acctItemCharge = root.selectNodes("//Service_Information/Bill_Query_Information/Fee_Billing_Cycle/Acct_Item_Group/Acct_Item_Type/Acct_Item_Charge");
			for(int i=0 ;i<acctItemCharge.size() ;i++){
				acctItemChargeSum += Integer.parseInt(acctItemCharge.get(i).getStringValue());
			}
			resp.setTotalAmount(acctItemChargeSum) ;
			
			node = root.selectSingleNode("//Service_Information/Bill_Query_Information/Acc_Nbr");
			
			List<Element> billQueryInformationElements = root.elements("Bill_Query_Information") ;
			List<Element> feeBillingCycleElements = billQueryInformationElements.get(0).elements("Fee_Billing_Cycle");
			List<Element> acctItemGroupElements = null ;
			List<Element> acctItemTypeElements = null ;
			if(feeBillingCycleElements != null){
				BillInfoSetType[] billInfoSetTypeArr = new BillInfoSetType[feeBillingCycleElements.size()];
				for(int i=0 ;i<feeBillingCycleElements.size() ;i++){
					BillInfoSetType billInfoSetType = new BillInfoSetType();
					if(node != null){
						billInfoSetType.setAccNbr(node.getStringValue());
					}
					if(feeBillingCycleElements.get(i).elementText("Billing_Cycle_ID") != null){
						billInfoSetType.setBillCycle(feeBillingCycleElements.get(i).elementText("Billing_Cycle_ID"));
					}
					billInfoSetType.setBillItemId("");
					acctItemGroupElements = feeBillingCycleElements.get(i).elements("Acct_Item_Group") ;
					if(acctItemGroupElements != null){
						for(int j=0 ;j<acctItemGroupElements.size() ;j++){
							acctItemTypeElements = acctItemGroupElements.get(j).elements("Acct_Item_Type");
							if(acctItemTypeElements != null){
								for(int z=0 ;z<acctItemTypeElements.size() ;z++){
									if(acctItemTypeElements.get(j).elementText("Acct_Item_Type_Name") != null){
										billInfoSetType.setBillItemName(acctItemTypeElements.get(j).elementText("Acct_Item_Type_Name"));
									}
									if(acctItemTypeElements.get(j).elementText("Acct_Item_Charge") != null){
										billInfoSetType.setBillItemFee(acctItemTypeElements.get(j).elementText("Acct_Item_Charge"));
									}
								}
							}
						}
					}
					billInfoSetTypeArr[i] = billInfoSetType ;
				}
				resp.setBillInfoSet(billInfoSetTypeArr);
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToOweBillQueryReturn:" + exc);
			exc.printStackTrace();
		}
		logger.info("OweBillQueryReturn:" + resp.toString());
		return resp;
	}

	public static String GetCumulationInfoReturnToXmlString(GetCumulationInfoType in0) {
		logger.info("conver OweBillQueryReturn To XmlString.....");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String time = sdf.format(new Date());
		
		Element serviceInformation = DocumentHelper.createElement("Service_Information");
		Element vcInformationElement = serviceInformation.addElement("Bill_Information") ;
		Element element = null ;
		
		element = vcInformationElement.addElement("Acc_Nbr");
		element.setText(in0.getAccNbr());
		
		element = vcInformationElement.addElement("Destination_Attr");
		element.setText("2");
		
		element = vcInformationElement.addElement("Billing_Cycle");
		element.setText(time);
		
		logger.info(serviceInformation.asXML());
		return serviceInformation.asXML();
	}

	public static GetCumulationInfoReturn xmlToGetCumulationInfoReturn(String data) {
		logger.info("convert sgw ack to CumulationInfoReturn......");
		GetCumulationInfoReturn resp = new GetCumulationInfoReturn();
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(data);
			Element root = doc.getRootElement();
			
			
			Node node = root.selectSingleNode("//Service_Information/Service_Result_Code");
			if(node != null){
				resp.setResult(node.getStringValue());
			}
			
			List<Node> errorDesc = root.selectNodes("//Service_Information/Para_Field_Result") ;
			if(errorDesc.size() > 0){
				String errorDescs = "|" ;
				for(int i=0 ;i<errorDesc.size() ;i++){
					errorDescs += errorDesc.get(i).getStringValue()+"|" ;
				}
				resp.setErrorCode(errorDescs);
			}
			
			resp.setErrorMessage("");
			
			List<Element> productOFFinfo = root.elements("Product_OFF_Info") ;
			List<Element> respondRatableQueryElements = null ;
			CumulationInfoSetType[] cumulationInfoSetTypeArr = null ;
			if(productOFFinfo != null){
				for(int i=0 ;i<productOFFinfo.size() ;i++){
					respondRatableQueryElements = productOFFinfo.get(i).elements("Respond_Ratable_Query");
					if(respondRatableQueryElements != null){
						cumulationInfoSetTypeArr = new CumulationInfoSetType[respondRatableQueryElements.size()];
						for(int j=0 ;j<respondRatableQueryElements.size() ;j++){
							CumulationInfoSetType cumulationInfoSetType = new CumulationInfoSetType();
							if(respondRatableQueryElements.get(j).elementText("Ratable_Resource_Name") != null){
								cumulationInfoSetType.setAccuName(respondRatableQueryElements.get(j).elementText("Ratable_Resource_Name"));
							}
							if(respondRatableQueryElements.get(j).elementText("BeginTime") != null){
								cumulationInfoSetType.setStartTime(respondRatableQueryElements.get(j).elementText("BeginTime"));
							}
							if(respondRatableQueryElements.get(j).elementText("EndTime") != null){
								cumulationInfoSetType.setEndTime(respondRatableQueryElements.get(j).elementText("EndTime"));
							}
							if(respondRatableQueryElements.get(j).elementText("UnitType_Id") != null){
								cumulationInfoSetType.setUnitName(respondRatableQueryElements.get(j).elementText("UnitType_Id"));
							}
							if(respondRatableQueryElements.get(j).elementText("Ratable_Amount") != null){
								cumulationInfoSetType.setTotal(respondRatableQueryElements.get(j).elementText("Ratable_Amount"));
							}
							if(respondRatableQueryElements.get(j).elementText("Balance_Amount") != null){
								cumulationInfoSetType.setLeft(respondRatableQueryElements.get(j).elementText("Balance_Amount"));
							}
							if(respondRatableQueryElements.get(j).elementText("Ratable_Amount") != null ){
								cumulationInfoSetType.setLeft(String.valueOf(Integer.parseInt(respondRatableQueryElements.get(j).elementText("Ratable_Amount"))-Integer.parseInt(respondRatableQueryElements.get(j).elementText("Balance_Amount"))));
							}
							cumulationInfoSetTypeArr[j] = cumulationInfoSetType ;
						}
					}
					resp.setCumulationInfoSet(cumulationInfoSetTypeArr) ;
				}
			}
		} catch (Exception exc) {
			logger.warn("Exception in xmlToCumulationInfoReturn:" + exc);
			exc.printStackTrace();
		}
		logger.info("------------CumulationInfoReturn:" + resp.getResult()+","+resp.getCumulationInfoSet()[0].getTotal());
		return resp;
	}

	

}