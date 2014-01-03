package project.wmh.shhp;

import common.MDUtil;
import common.WebServiceUtilDAL;



public class ITest_SHHP_GetUser {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn//shhp/webservice/UserLoginSession.asmx";
		String namespace = "http://tempuri.org/";

		String method = "UserSession2";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("loginid", "yyyy123456");
		webservice.addProperty("Password", MDUtil.authPassword("123456"));
		
		String bs = webservice.start();
		System.out.println(bs);
	}

}
