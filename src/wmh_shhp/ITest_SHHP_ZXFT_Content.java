package wmh_shhp;

import common.WebServiceUtilDAL;



public class ITest_SHHP_ZXFT_Content {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/webservice/UserLoginSession.asmx";
		String namespace = "http://tempuri.org/";

		String method = "DownloadInfoList_ZxftContent";// 方法名称
		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("MeetingGuid", "8e459b17-61c6-4f00-b24e-e7602d85ed14");
		webservice.addProperty("Title", "");
		webservice.addProperty("FromDate", "");
		webservice.addProperty("ToDate", "");
		webservice.addProperty("PageSize", "15");
		webservice.addProperty("CurrentPageIndex", "1");
		webservice.addProperty("ContentLength", 0);
		String bs = webservice.start();

		
		System.out.println(bs);
	}

}
