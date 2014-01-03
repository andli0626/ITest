package project.wmh.shhp;

import common.WebServiceUtilDAL;



public class ITest_SHHP_FWDH_GetCategoryList {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";
//		教育:018006001
		String method = "DownloadOneLevelWebCategory";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ParentCategoryID", "018006007");
		String bs = webservice.start();
		
		System.out.println(bs);
	}

}
