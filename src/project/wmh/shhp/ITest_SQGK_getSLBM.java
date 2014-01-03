package project.wmh.shhp;

import common.WebServiceUtilDAL;

//申请公开--受理部门
public class ITest_SQGK_getSLBM {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/ServiceNew.asmx";
		String namespace = "http://tempuri.org/";
		String method = "GovPub_GetShouLiDeptList";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
				+ "<paras></paras>";
//		ParasXml = String.format(ParasXml, "6");// 个人6，企业7
		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}

}
