package project.wmh.shhp;

import common.WebServiceUtilDAL;

public class ITest_SHHP_Search {
	public static void main(String args[]) {
		String url = "http://search.huangpuqu.sh.cn:8080/EpointJWeb/services/FullTextSearchService?wsdl";
		String namespace = "http://common.fulltextsearch.frame.epoint.com";

		String method = "getFullTextData";// 方法名称

		String firstIndex = "0";//
		// 起始记录数,默认为0
		// String pageSizeIndex = (String) getParam().get("pageSizeIndex");//
		// 一页记录数,默认为10条
		// String sdate = (String) getParam().get("sdate");// 起始时间,默认为1990/1/1
		// String edate = (String) getParam().get("edate");// 结束时间,默认为今天
		// String advanceAnyOneKeyWord = (String) getParam().get(
		// "advanceAnyOneKeyWord");// 任意关键字,默认为空
		// String advanceNotIncludeKeyWord = (String) getParam().get(
		// "advanceNotIncludeKeyWord");// 排除关键字,默认为空
		// String selectedIndexCategory = (String) getParam().get("selectedIndexCategory");// 查询的索引分类guid,默认为空,即查询全部了
		// String selectedSearchCategory = (String) getParam().get("selectedSearchCategory");// 选中的查询类别{0:全文检索；1:标题检索},默认为0
		// String searchType = (String) getParam().get("searchType");// 页面类型
		// // 暂时有:web
		// // oa
		// // bizlogic,默认为default代表全部类型即不过滤类型
		// String userGuid = (String) getParam().get("userGuid");//
		// 当前用户guid,默认为nobodynobody即不过滤用户

		// 政府信息 7cfd1411-9afd-4ff6-8c24-879d34f2bb47
		// 生活服务 9f548dc8-186c-4ab2-9548-aa6adbe2c150

		WebServiceUtilDAL webservice = new WebServiceUtilDAL(url, method,namespace);
		// 注意参数的顺序
		webservice.addProperty("firstIndex", firstIndex);
		webservice.addProperty("pageSizeIndex", "3");// 每页15条
		webservice.addProperty("keyword", "y");
		// 限定搜索的栏目
		
//		0d37ffda-7e56-4db3-8046-c77013cc4a1e,微门户生活服务,EpointMicroWebSh,-4,oa
//		3dc89bc3-d2eb-4500-bc0d-e5d365bfbf1c,微门户便民提示,EpointMicroWebTs,-2,oa
//		73fc88f6-e0fc-4f29-9b56-b497417bdc35,微门户黄浦要闻,EpointMicroWebYw,-1,oa
//		7b744819-3b26-4f33-b217-5b37e0213aa1,微门户在线访谈,EpointMicroWebFt,-5,oa
//		eb0b636f-b083-4e1e-9072-52c9fdbfeec4,微门户信息公开,EpointMicroWebXx,-3,oa
		
//		webservice.addProperty("selectedIndexCategory", "73fc88f6-e0fc-4f29-9b56-b497417bdc35");
		webservice.addProperty("searchType", "oa");// 选中的查询类别{0:全文检索；1:标题检索},默认为0

		String bs = webservice.start();
		System.out.println(bs);

	}

}
