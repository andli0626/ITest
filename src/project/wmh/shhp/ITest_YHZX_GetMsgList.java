package project.wmh.shhp;

import common.WebServiceUtilDAL;

public class ITest_YHZX_GetMsgList {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http://tempuri.org/";
		String method = "UC_MyMessageList";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
				+ "<paras>";
		ParasXml += "<CurrentPageIndex>0</CurrentPageIndex>";
		ParasXml += "<PageSize>15</PageSize>";
		ParasXml += "<loginid>yyyy123456</loginid>";
		ParasXml += "</paras>";

		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}
}
