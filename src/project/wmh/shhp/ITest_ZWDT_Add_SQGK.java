package project.wmh.shhp;

import common.WebServiceUtilDAL;

//申请公开提交
public class ITest_ZWDT_Add_SQGK {
	public static void main(String args[]) {
		String url = "http:192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http:tempuri.org/";
		String method = "GovPub_PostYSQGKData";// 方法名称

		String DeptCode = "";// 部门代码
		String proposerTypeCode = "";//个人：0组织：1

		String peopleName = "";//申请人（个人）姓名
		String workUnit = "";//单位/职业（个人）

		String paperName = "";//证件名称（个人）
		String paperNum = "";//证件号码（个人）
		String address = "";//通信地址（个人）
		String zip = "";//邮政编码（个人）
		String peoplePhone = "";//联系电话（个人）
		String peopleEmail = "";//电子邮箱（个人）

		String corporationName = "";//申请人名称（企业）
		String organizeCode = "";//组织机构代码（企业）
		String corporationDelegate = "";//法定代表人（企业）
		String linkman = "";//联系人（个人、企业）
		String linkmanPhone = "";//联系电话（企业）
		String linkmanEmail = "";//电子邮箱（企业）

		String CorporationAddress = "";//通信地址（企业）
		String CorporationZip = "";//邮政编码（企业）
		String infoDescription = "";//所需政府信息的内容描述
		String InfoUse = "";//所需政府信息的用途
		String chargeCode = "";//是否免费申请,不申请：0,申请：1

		String infoLend = "";//政府信息的载体形式

		String infoGet = "";//获取政府信息的方式
		String InfoName = "";//名称
		String ChargeDetail = "";//申请免费详细，CheckBox多选项内容，分号分隔


		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);//
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>";
		ParasXml += "<paras>";
		ParasXml += "<DeptCode>%s</DeptCode>";
		ParasXml += "<proposerTypeCode>%s</proposerTypeCode>";
		ParasXml += "<peopleName>%s</peopleName>";
		ParasXml += "<workUnit>%s</workUnit>";

		ParasXml += "<paperName>%s</paperName>";
		ParasXml += "<paperNum>%s</paperNum>";
		ParasXml += "<address>%s</address>";
		ParasXml += "<zip>%s</zip>";
		ParasXml += "<peoplePhone>%s</peoplePhone>";
		ParasXml += "<peopleEmail>%s</peopleEmail>";

		ParasXml += "<corporationName>%s</corporationName>";
		ParasXml += "<organizeCode>%s</organizeCode>";
		ParasXml += "<corporationDelegate>%s</corporationDelegate>";
		ParasXml += "<linkman>%s</linkman>";
		ParasXml += "<linkmanPhone>%s</linkmanPhone>";
		ParasXml += "<linkmanEmail>%s</linkmanEmail>";

		ParasXml += "<CorporationAddress>%s</CorporationAddress>";
		ParasXml += "<CorporationZip>%s</CorporationZip>";
		ParasXml += "<infoDescription>%s</infoDescription>";
		ParasXml += "<InfoUse>%s</InfoUse>"; // 逗号分割
		ParasXml += "<chargeCode>%s</chargeCode>";
		ParasXml += "<infoLend>%s</infoLend>";

		ParasXml += "<infoGet>%s</infoGet>";
		ParasXml += "<InfoName>%s</InfoName>";
		ParasXml += "<ChargeDetail>%s</ChargeDetail>"; // 逗号分割
		ParasXml += "</paras>";
		ParasXml = String.format(ParasXml, DeptCode, proposerTypeCode,
				peopleName, workUnit, paperName, paperNum, address, zip,
				peoplePhone, peopleEmail, corporationName, organizeCode,
				corporationDelegate, linkman, linkmanPhone, linkmanEmail,
				CorporationAddress, CorporationZip, infoDescription, InfoUse,
				chargeCode, infoLend, infoGet, InfoName, ChargeDetail);
		System.out.println(ParasXml);
		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}
}
