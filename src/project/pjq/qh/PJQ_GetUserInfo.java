package project.pjq.qh;

import common.WebServiceUtilDAL;

public class PJQ_GetUserInfo {
	public static void main(String args[]) {
		String url = "http://192.168.200.111/ZwfwV1.1/EpointAdminService/WebService/Pad_Info.asmx";
		String namespace = "http://tempuri.org/";
		String method = "User_Info ";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice
				.addProperty(
						"ParasXml",
						"<?xml version= \"1.0\" encoding=\"UTF-8\"?><paras><IdentityGuid>PAD</IdentityGuid><UserGuid>42e7817b-aead-42cd-ad2b-4c68f5e283ae</UserGuid></paras>");
		String bs = webservice.start();

		System.out.println(bs);
	}
}
