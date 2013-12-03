


public class ITest_SHHP {
	public static void main(String args[]) {
		String url = "http://117.143.236.130/shhp/Webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";

		String method = "GetCategoryInfoCount";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);

		webservice.addProperty("Dt1", "");
		webservice.addProperty("Dt2", "2013-03-12T09:00:00");
		webservice.addProperty("Dt3", "2013-03-12T09:00:00");
		webservice.addProperty("Dt4", "2013-03-12T09:00:00");

		String bs1 = webservice.start();
		
//		String method = "GetRanCode";// 方法名称
//
//		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
//				namespace);
//		webservice.addProperty("DisPlayName", "小李");
//		webservice.addProperty("Mobile", "13222232784");//联通手机不可以
//		String bs = webservice.start();
//		
		System.out.println(bs1);
	}

}
