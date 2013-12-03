


public class ITest_SHHP_ZXFT_Image {
	public static void main(String args[]) {
		String url = "http://117.143.236.130/shhp/webservice/UserLoginSession.asmx";
		String namespace = "http://tempuri.org/";

		String method = "GetFile_Zxft";// 方法名称
//		:c07] imgID=600540c8-19bc-4c92-b515-ec3ff9983416
//				2013-04-09 10:12:37.904 SHHP[5805:c07] imgID=c82b7546-74e0-4547-a86a-ad15d8b82271
//				2013-04-09 10:12:37.954 SHHP[5805:c07] imgID=dc97cfbc-cb05-4ff6-b11d-087b0b5007f8
//				2013-04-09 10:12:38.004 SHHP[5805:c07] imgID=67e3f591-b744-4a68-a810-f027e46a37b8
		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("MeetingGuid", "c82b7546-74e0-4547-a86a-ad15d8b82271");
		String bs = webservice.start();
		
		System.out.println(bs);
	}

}
