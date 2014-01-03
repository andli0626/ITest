package wmh_shhp;

import common.WebServiceUtilDAL;

public class ITest_GetInfoAttach {
	public static void main(String args[]) {
		// 获取图片列表--所有分类---子分类写死
		String url = "http://demo.epoint.com.cn:1616/shhp/WebBuilderMobileService/Service.asmx";
		String namespace = "http://tempuri.org/";

		String method = "GetInfoAttachNoBackGround";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
				+ "<paras>" + "<AttachGuid>%s</AttachGuid>"
				+ "<ShowPlayIcon>%s</ShowPlayIcon>"
				+ "<ImageWidth>%s</ImageWidth>"
				+ "<ImageHeight>%s</ImageHeight>" + "</paras>";
		ParasXml = String
				.format(ParasXml,
						"019f85cf-3803-44be-8692-bb8fd13789a8_Small1", "false",
						175, 67);// 个人6，企业7
		webservice.addProperty("ParasXml", ParasXml);
		String bs = webservice.start();
		System.out.println(bs);
	}
}
