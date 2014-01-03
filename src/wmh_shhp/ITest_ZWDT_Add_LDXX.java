package wmh_shhp;

import common.WebServiceUtilDAL;

//申请公开提交
public class ITest_ZWDT_Add_LDXX {
	public static void main(String args[]) {
		String url = "http:192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http:tempuri.org/";
		String method = "LDXX_PostLeaderDetail";// 方法名称


		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);//
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>";
		ParasXml += "<paras>";
		ParasXml += "<ItemID>12</ItemID>";//邮箱ID
		ParasXml += "<Name>2</Name>";//姓名	
		ParasXml += "<Link>2</Link>";//联系电话	
		ParasXml += "<Mail>2</Mail>";//邮箱

		ParasXml += "<Content>2</Content>";//
		ParasXml += "<PostalCode>2</PostalCode>";//邮政编码
		ParasXml += "<Address>2</Address>";//联系地址
		ParasXml += "<IsPublish>1</IsPublish>";//
		ParasXml += "<Title>1</Title>";//

		ParasXml += "</paras>";
		
		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}
}
