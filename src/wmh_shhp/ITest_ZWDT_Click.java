package wmh_shhp;

import common.WebServiceUtilDAL;

//获取政务大厅分类
public class ITest_ZWDT_Click {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http://tempuri.org/";
		String method = "ZWDT_GetWSBSItemClickStatus";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
				+ "<paras>" + "<ItemID>cee86301-4076-4d90-a189-f379fb8c2e10</ItemID>"
				+ "</paras>";
		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();

		System.out.println(bs);
	}

}
