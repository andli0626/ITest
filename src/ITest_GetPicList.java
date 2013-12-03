public class ITest_GetPicList {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http://tempuri.org/";
		String method = "GetInfoList";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
				+ "<paras>" + "<CurrentPageIndex>%s</CurrentPageIndex>"
				+ "<PageSize>%s</PageSize>" + "<TypeID>%s</TypeID>"
				+ "</paras>";
		ParasXml = String.format(ParasXml, "1", "15", "21");// 个人6，企业7
		//获取图片列表--所有分类---子分类写死
		webservice
				.addProperty(
						"ParasXml",
						"<?xml version=\"1.0\" encoding=\"gb2312\" ?><paras><CurrentPageIndex>0</CurrentPageIndex><PageSize>15</PageSize><CateNum>002016002</CateNum><IsHeadNews>0</IsHeadNews><Title></Title></paras>");
		String bs = webservice.start();

		System.out.println(bs);
	}
}
