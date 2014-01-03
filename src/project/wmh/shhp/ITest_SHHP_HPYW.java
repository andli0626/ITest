package project.wmh.shhp;

import common.WebServiceUtilDAL;



public class ITest_SHHP_HPYW {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/Webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";

		String method = "DownloadInfoList ";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("Title", "");
		webservice.addProperty("FromDate", "");
		webservice.addProperty("ToDate", "");
		webservice.addProperty("CategoryNum", "002016002002");
		webservice.addProperty("PageSize", "15");
		webservice.addProperty("CurrentPageIndex", 1);
		webservice.addProperty("ContentLength", 20);
		String bs = webservice.start();
//		图片的栏目：CategoryNum=002016001
//				视频的栏目：CategoryNum=002016002

		System.out.println(bs);
	}

}
