package wmh_shhp;

import common.WebServiceUtilDAL;



public class ITest_SHHP_BMTSList {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/Webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";

		String method = "DownloadInfoList ";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("Title", "");
		webservice.addProperty("FromDate", "");
		webservice.addProperty("ToDate", "");
		webservice.addProperty("CategoryNum", "028|003|007007003");
		webservice.addProperty("PageSize", "15");
		webservice.addProperty("CurrentPageIndex", 3);
		webservice.addProperty("ContentLength", 0);
		String bs = webservice.start();
		
		System.out.println(bs);
	}

}
