package project.wmh.shhp;

import common.WebServiceUtilDAL;

public class ITest_GetInfoDetail {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http://tempuri.org/";
		String method = "GetInfoDetail";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
				+ "<paras>";
		ParasXml += "<InfoID>790572ca-2eba-45ce-9a6c-997a92ec0c78</InfoID>";
		ParasXml += "<IsVideo>0</IsVideo>";
		ParasXml += "<ImgWidth>320</ImgWidth>";
		ParasXml += "</paras>";

		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}
}
