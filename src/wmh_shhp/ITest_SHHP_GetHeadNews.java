package wmh_shhp;

import common.WebServiceUtilDAL;




public class ITest_SHHP_GetHeadNews {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/Webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";

		String method = "GetHeadNewsInformation";// 方法名称
		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("CategoryNum", "002008");
		webservice.addProperty("Rows", "4");

		String bs = webservice.start();
		
	
		System.out.println(bs);
	}

}
