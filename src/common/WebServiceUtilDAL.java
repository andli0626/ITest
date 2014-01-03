package common;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * @author liyc
 * @time 2012-4-17 下午4:27:53
 * @annotation Webservice方法调用代理类
 */
public class WebServiceUtilDAL {
	private static String httpURL = "";
	private static String nameSpace = "";// 命名空间
	private static String method = "";// 调用方法
	private static SoapObject request;// soap请求

	// 构造方法
	public WebServiceUtilDAL(String URL, String Method, String NameSpace) {
		httpURL = URL;
		nameSpace = NameSpace;
		method = Method;
		request = new SoapObject(nameSpace, method);
	}

	public void addProperty(String key, Object value) {
//		System.out.println(key + "=" + value);
		request.addProperty(key, value);
	}

	public String start() {
		String result = null;

		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = true;
		envelope.setOutputSoapObject(request);

		HttpTransportSE androidHttpTransport = new HttpTransportSE(httpURL);

		try {
			androidHttpTransport.call(nameSpace + method, envelope);
			result = envelope.getResponse().toString();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("连接超时！");
			// return HttpHelp.CONNECTION_TIME_OUT;
		}

		return result;
	}
}
