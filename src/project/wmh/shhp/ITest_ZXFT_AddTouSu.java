package project.wmh.shhp;

import common.WebServiceUtilDAL;

//获取政务大厅分类
public class ITest_ZXFT_AddTouSu {
	public static void main(String args[]) {
		String url = "http://192.168.200.159/shhp/WebBuilderMobileService/ServiceNew.asmx";
		String namespace = "http://tempuri.org/";
		String method = "ZWDT_PostWSBSItemZXSL";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("ValidateData", "Epoint_WebSerivce_**##0601");
		// String ParasXml = "<?xml version=\"1.0\" encoding=\"gb2312\"?>"
		// + "<paras>" + "<CategroyType>%s</CategroyType>"
		// + "</paras>";
		// ParasXml = String.format(ParasXml, "6");// 个人6，企业7
		webservice
				.addProperty(
						"ParasXml",
						"<?xml version=\"1.0\" encoding=\"gb2312\"?><paras><ItemID>48c8e04e-1199-4fc1-85f2-2e82fde6888d</ItemID><Name>111</Name><Title>1111</Title><Link>13222232784</Link><Mail>ww1095@163.com</Mail><Content>222</Content></paras>");
		String bs = webservice.start();

		System.out.println(bs);
	}

}