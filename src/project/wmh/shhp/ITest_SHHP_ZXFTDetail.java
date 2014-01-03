package project.wmh.shhp;

import common.WebServiceUtilDAL;



public class ITest_SHHP_ZXFTDetail {
	public static void main(String args[]) {
		String url = "http://117.143.236.130//shhp/webservice/UserLoginSession.asmx";
		String namespace = "http://tempuri.org/";

		String method = "GetInfoDetail";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("Meetingguid", "67e3f591-b744-4a68-a810-f027e46a37b8");
		webservice.addProperty("xgcount", 0);// 相关消息
		String bs = webservice.start();
		
		System.out.println(bs);
	}

}
