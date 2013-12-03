

/**
 * 
* @author lilin
* @date 2013-4-12 上午9:27:18
* @annotation 获取服务导航栏目的详情
 */
public class ITest_SHHP_FWDH_GetCategoryInfo {
	public static void main(String args[]) {
		String url = "http://www.huangpuqu.sh.cn/shhp/webservice/InfoDataChangeXml.asmx";
		String namespace = "http://tempuri.org/";
//		教育:018006001
		String method = "GetInfoExtendByCategoryNum";// 方法名称

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,
				namespace);
		webservice.addProperty("CategoryNum", "018006007");
		webservice.addProperty("PageSize", "65");
		webservice.addProperty("CurrentPageIndex", "1");
		String bs = webservice.start();
		
		System.out.println(bs);
	}

}
