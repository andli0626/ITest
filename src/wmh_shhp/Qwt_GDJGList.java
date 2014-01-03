package wmh_shhp;

import common.WebServiceUtilDAL;

public class Qwt_GDJGList {
	public static void main(String args[]) {
		String url = "http://192.168.185.55:80/csqwt/GongDiGL.asmx";
		String namespace = "http://tempuri.org/";
		String method = "GongDiInfo_Search";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("userName", "");
		webservice.addProperty("userGuid", "");
		webservice.addProperty("key", "1");
		webservice
				.addProperty("ouGuid", "d61a4692-a5d6-46f2-9972-780578ccb74c");
		String bs = webservice.start();

		System.out.println(bs);
	}
}
