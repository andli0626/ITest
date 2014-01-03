package wmh_shhp;
import java.util.Date;

import common.DateHelp;

public class Test {

	public static void main(String[] args) {
		String datestr = "2013/03/12 9:00:00";
		Date date =DateHelp.convertString2Date(datestr, "yyyy/MM/dd HH:mm:ss");
		String datestr2 = DateHelp.convertDate(date, "yyyy-MM-dd HH:mm:ss");
		
		System.out.println(datestr2.replace(" ", "T"));

	}

	public static String changwDateStr(String datestr) {
		if (datestr != null && !datestr.equals("")) {
			String datestrs[] = datestr.split(" ");
			String datestrs2[] = datestrs[0].split("/");
			if (datestrs2[1].length() < 2) {
				if (Integer.valueOf(datestrs2[1]) > 0
						&& Integer.valueOf(datestrs2[1]) <= 9) {
					datestrs2[1] = "0" + datestrs2[1];
				}
			}
			if (datestrs2[2].length() < 2) {
				if (Integer.valueOf(datestrs2[2]) > 0
						&& Integer.valueOf(datestrs2[2]) <= 9) {
					datestrs2[2] = "0" + datestrs2[2];
				}
			}
			return datestrs2[0] + "-" + datestrs2[1] + "-" + datestrs2[2];
		}
		return datestr;
	}

}
