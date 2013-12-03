


public class ITest_SHHP_XXGKList {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/Webservice/UserLoginSession.asmx";
		String namespace = "http://tempuri.org/";

		String method = "DownloadInfoList_Zxxxgk ";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("Title", "");
		webservice.addProperty("FromDate", "");
		webservice.addProperty("ToDate", "");
		// webservice.addProperty("CategoryNum", categorynum);
		webservice.addProperty("PageSize", "5");
		webservice.addProperty("CurrentPageIndex", "1");
		webservice.addProperty("ContentLength", 0);
		String bs = webservice.start();
		
		System.out.println(bs);
	}

}
