package wmh_shhp;

import common.WebServiceUtilDAL;



public class ITest_SHHP_Login {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/webservice/UserLoginSession.asmx";
		String namespace = "http://tempuri.org/";

		String method = "UserSession";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("loginid", "shhp_test");
		webservice.addProperty("Password", "11111");
		
		String bs = webservice.start();
		System.out.println(bs);
	}

}
