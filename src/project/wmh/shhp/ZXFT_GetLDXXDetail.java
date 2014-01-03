package project.wmh.shhp;

import common.WebServiceUtilDAL;

public class ZXFT_GetLDXXDetail {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http://tempuri.org/";
		String method = "LDXX_GetLeaderDetail";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?><paras>";
		ParasXml += "<InfoID>87b0dc09-4166-4eef-b795-7f6abc996337</InfoID>";
		ParasXml += "</paras>";

		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}
}
