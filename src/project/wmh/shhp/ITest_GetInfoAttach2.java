package project.wmh.shhp;

import common.WebServiceUtilDAL;

public class ITest_GetInfoAttach2 {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http://tempuri.org/";
		String method = "GetInfoAttachNoBackGround";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
				+ "<paras>" + "<AttachGuid>%s</AttachGuid>"
				+ "<ShowPlayIcon>%s</ShowPlayIcon>"
				+ "<ImageWidth>%s</ImageWidth>"
				+ "<ImageHeight>%s</ImageHeight>" + "</paras>";
		ParasXml = String.format(ParasXml,
				"bc0bfc8d-e7aa-45ae-9ff0-a1d2854984a2", "false", "200", "20");// 个人6，企业7
		// 获取图片列表--所有分类---子分类写死
		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}
}
