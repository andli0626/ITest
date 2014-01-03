package project.wmh.shhp;

import common.WebServiceUtilDAL;




public class ITest_GetOneLevel {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/Webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";

		String method = "DownloadOneLevelWebCategory";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ParentCategoryID", "002016002");

		String bs1 = webservice.start();
		
	
		System.out.println(bs1);
	}

}
