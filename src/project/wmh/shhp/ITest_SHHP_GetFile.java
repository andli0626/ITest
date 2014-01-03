package project.wmh.shhp;

import common.WebServiceUtilDAL;




public class ITest_SHHP_GetFile {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/Webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";

		String method = "GetFileByAttachID";// 方法名称
//		05-09 11:25:18.449: I/andli(30933): a05cbb20-c129-461c-8d79-12f453bd0ac8无图
//		05-09 11:25:18.549: I/andli(30933): 60e51b3a-d59f-4037-aa47-2100241644e1无图
//		05-09 11:25:58.174: I/andli(31917): a05cbb20-c129-461c-8d79-12f453bd0ac8无图
//		05-09 11:25:58.264: I/andli(31917): 60e51b3a-d59f-4037-aa47-2100241644e1无图

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("AttachID", "a05cbb20-c129-461c-8d79-12f453bd0ac8");

		String bs1 = webservice.start();
		
	
		System.out.println(bs1);
	}

}
