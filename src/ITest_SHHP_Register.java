


public class ITest_SHHP_Register {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn//shhp/webservice/UserLoginSession.asmx";
		String namespace = "http://tempuri.org/";

		String method = "UserRegister";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("LitLoginID", "shhp_test");
		webservice.addProperty("LitDisPlayName", "shhp_test");
		webservice.addProperty("PassWord", "11111");
		webservice.addProperty("txtEmail", "ww1095@163.com");
		webservice.addProperty("txtPhone", "13222232789");
		
		String bs = webservice.start();
//		<LitLoginID>string</LitLoginID>
//	      <LitDisPlayName>string</LitDisPlayName>
//	      <PassWord>string</PassWord>
//	      <txtEmail>string</txtEmail>
//	      <txtPhone>string</txtPhone>
		System.out.println(bs);
	}

}
