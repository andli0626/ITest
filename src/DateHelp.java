

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author liyc
 * @time 2012-1-9 下午11:13:45
 * @annotation
 */
public class DateHelp {
	public static String DateFormat_1 = "yyyy-MM-dd hh:mm:ss";
	public static String DateFormat_24 = "yyyy-MM-dd HH:mm:ss";

	public static void main(String[] args) {
		System.out.println(getCurrentTime() + "-01 00:00:00");
	}

	public static String switchDay(int day) {
		String daystr = day + "";
		if (daystr.length() == 2) {
			return daystr;
		} else {
			return "0" + daystr;
		}
	}

	public static String convertDate(Date date, String format) {
		if (date != null) {
			DateFormat format1 = new SimpleDateFormat(format);
			String s = format1.format(date);
			return s;
		}
		return "";
	}

	public static String getCurrentTimeYM() {
		return convertDate(new Date(), "yyyy-MM");
	}

	public static String getCurrentTime() {
		return convertDate(new Date(), "yyyy-MM-dd hh:mm:ss");
	}

	public static String Num2Haizi_Week(int day) {
		switch (day) {
		case 1:
			return "星期一";
		case 2:
			return "星期二";
		case 3:
			return "星期三";
		case 4:
			return "星期四";
		case 5:
			return "星期五";
		case 6:
			return "星期六";
		case 0:
			return "星期日";
		default:
			return "";
		}
	}

	public static String Num2Haizi_Week_HTML_Color(int day) {
		switch (day) {
		case 1:
			return "星期一";
		case 2:
			return "星期二";
		case 3:
			return "星期三";
		case 4:
			return "星期四";
		case 5:
			return "星期五";
		case 6:
			return "<font color=red>星期六</font>";
		case 0:
			return "<font color=red>星期日</font>";
		default:
			return "";
		}
	}

	public static Date convertString2Date(String str, String formatStr) {
		DateFormat format = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;
	}

	// 获取每一个日期，是星期几
	public static String getWeekByDate(Date date) {
		Calendar time = Calendar.getInstance();
		time.clear();
		time.setTime(date);
		int week = time.get(Calendar.DAY_OF_WEEK) - 1;
		return Num2Haizi_Week(week);
	}
	
	/**
	 * 根据日期字符串获取星期
	 * @param dateStr 格式必须为yyyy-MM-dd
	 * @return
	 */
	public static String getWeekByDateStr(String dateStr){
		Calendar time = Calendar.getInstance();
		time.clear();
		time.setTime(convertString2Date(dateStr, "yyyy-MM-dd"));
		int week = time.get(Calendar.DAY_OF_WEEK) - 1;
		return Num2Haizi_Week(week);
	}

	// 获取每一个日期，是星期几
	public static String getWeekByDate_HTML_Color(Date date) {
		Calendar time = Calendar.getInstance();
		time.clear();
		time.setTime(date);
		int week = time.get(Calendar.DAY_OF_WEEK) - 1;
		return Num2Haizi_Week_HTML_Color(week);
	}
	
	//如将2012-08-15，生成星期三
		public static String getWeekByFormatedDateStr(String s)
		{
			Calendar time = Calendar.getInstance();
			String[] ss = s.split("-");
			time.set(Integer.parseInt(ss[0]), Integer.parseInt(ss[1])-1, Integer.parseInt(ss[2]));
			return getWeekByDate(time.getTime());
		}

	//如将2012-08-15，生成星期三
	public static String getWeekByFormatedDateStr_HTML_Color(String s)
	{
		Calendar time = Calendar.getInstance();
		String[] ss = s.split("-");
		time.set(Integer.parseInt(ss[0]), Integer.parseInt(ss[1])-1, Integer.parseInt(ss[2]));
		return getWeekByDate_HTML_Color(time.getTime());
	}

	// 获取当前日期天数
	public static int getDayNumsOfCurrentMonth() {
		Calendar time = Calendar.getInstance();
		int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}

	// 获取当前时间的星期几
	public static String getWeektimeOfCurrentTime() {
		Calendar time = Calendar.getInstance();
		int week = time.get(Calendar.DAY_OF_WEEK) - 1;
		return Num2Haizi_Week(week);
	}

	// 获取每个日期里，本月的天数
	public static int getDayNumsOfMonth(Date date) {
		Calendar time = Calendar.getInstance();
		time.setTime(date);
		int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}

	public static int getDaysOfYM(int year, int month) {
		Calendar time = Calendar.getInstance();
		time.clear();
		time.set(Calendar.YEAR, year);
		time.set(Calendar.MONTH, month - 1);
		int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);
		return day;
	}

	/**
	 * @author lilin
	 * @date 2012-2-17 上午09:27:52
	 * @annotation 获取指定格式的日期
	 */
//	public static String getFormateDate(int type) {
//		// 获取系统时间，并格式化
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(new Date());
//		int year = calendar.get(Calendar.YEAR);
//		int mounth = calendar.get(Calendar.MONTH) + 1;
//		int day = calendar.get(Calendar.DATE);
//		int hour = calendar.get(Calendar.HOUR_OF_DAY);
//		int min = calendar.get(Calendar.MINUTE);
//		int secound = calendar.get(Calendar.SECOND);
//
//		// 格式一：2011-11-1 12-12-66+mima 作为图片文件名
//		if (type == 1) {
//			String a[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
//			Random random = new Random();
//			int i = random.nextInt(10);
//			String extra = a[i];
//			String mima = MiMa.jiami(extra + AddZero(min) + AddZero(secound)
//					+ random.nextInt(10), 6);
//			// 加密
//			// return String.valueOf(year) + "-" + AddZero(mounth) + "-"
//			// + AddZero(day) + " " + AddZero(hour) + "-" + AddZero(min)
//			// + "-" + AddZero(secound) + " " + mima;
//			// 不加密
//			return String.valueOf(year) + AddZero(mounth) + AddZero(day)
//					+ AddZero(hour) + AddZero(min) + AddZero(secound);
//		}
//		// 格式二：2011年11月1日 12时12分45秒 写在照片上
//		else if (type == 2) {
//			return String.valueOf(year) + "年" + AddZero(mounth) + "月"
//					+ AddZero(day) + "日  " + AddZero(hour) + "时" + AddZero(min)
//					+ "分" + AddZero(secound) + "秒";
//		}
//		// 格式三：2011-11-1 12-12-11 作为录音文件名
//		else if (type == 3) {
//			return String.valueOf(year) + "-" + AddZero(mounth) + "-"
//					+ AddZero(day) + " " + AddZero(hour) + "-" + AddZero(min)
//					+ "-" + AddZero(secound) + " ";
//		}
//		return null;
//	}

	public static String AddZero(int i) {
		if (i >= 0 && i <= 9) {
			return "0" + i;
		}
		return String.valueOf(i);

	}

	public static String getFormatedDate(String strs,String tag)
	{
		String[] ss = strs.split(tag);
		String year = ss[0];
		String month = switchDay(Integer.parseInt(ss[1]));
		String day = switchDay(Integer.parseInt(ss[2]));
		return year+"-"+month+"-"+day;
	}
	
//	public static String getTimeStrHanzi(String datastr) {
//		if (MainService.chechbs_isinnormal(datastr)) {
//			LogHelp.Log2SDInfo("获取服务器时间失败");
//			return getTimeStrHanzi();
//		}
//		try {
//			return convertDate(
//					convertString2Date(datastr, "yyyy-MM-dd HH:mm:ss"),
//					"yyyy/MM/dd HH:mm:ss");
//		} catch (Exception e) {
//			return getTimeStrHanzi();
//		}
//	}
	
	/**
	 * 获取当前年月日,时分秒字符串
	 * 
	 * @param day
	 * @return
	 */
	public static String getTimeStrHanzi() {
		return convertDate(new Date(), "yyyy/MM/dd HH:mm:ss");
	}
}
