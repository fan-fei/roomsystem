package com.feifan.common;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

public class CommonUtility {
	// 最后操作员
	public static String lastupdated_operator;

	// 获取系统日期
	public static String getSysDate(int index) {
		String sysDate = "";
		// 系统日期年月日时分
		if (index == 1) {
			SimpleDateFormat simplDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			sysDate = simplDateFormat.format(new Date());
		}
		// 系统日期年月日
		if (index == 2) {
			SimpleDateFormat simplDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			sysDate = simplDateFormat.format(new Date());
		}
		// 系统日期上月1日
		if (index == 3) {
			SimpleDateFormat simplDateFormat = new SimpleDateFormat("yyyy-MM");
			sysDate = simplDateFormat.format(new Date());
			int year = Integer.parseInt(sysDate.substring(0, 4));
			int month = Integer.parseInt(sysDate.substring(5, 7));
			if (month == 1) {
				year = year - 1;
				month = 12;
			} else {
				month = month - 1;
			}
			sysDate = String.valueOf(year) + "-";
			sysDate = sysDate + (String.valueOf(month).length() == 1 ? "0" + String.valueOf(month) : String.valueOf(month)) + "-";
			sysDate = sysDate + "01";
		}
		return sysDate;
	}

	// 是否是身份证号码
	public static boolean isPerson_Num(String person_num) {
		if (person_num.length() != 18) {
			return false;
		}
		char charArray[] = person_num.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (i < charArray.length - 1) {
				if ((c < '0' || c > '9')) {
					return false;
				}
			} else if ((c < '0' || c > '9') && (c != 'X') && (c != 'x')) {
				return false;
			}
		}
		return true;
	}

	// 是否是电话号码
	public static boolean isTelephone(String telephone) {
		char charArray[] = telephone.toCharArray();
		for (char c : charArray) {
			if ((c < '0' || c > '9') && c != '-' && c != ' ') {
				return false;
			}
		}
		return true;
	}

	// 是否是邮件地址
	public static boolean isEmail(String email) {
		String regExp = "\\w+\56{0,1}\\w+@\\w{2,}(\56\\w+)+";
		if (!email.matches(regExp)) {
			return false;
		}
		return true;
	}

	// 是否是房间号码
	public static boolean isHouse_Num(String house_num) {
		String regExp = "\\p{Alnum}+";
		if (!house_num.matches(regExp)) {
			return false;
		}
		return true;
	}

	// 是否是可住人数
	public static boolean isAllow_Num(String allow_num) {
		if (!allow_num.matches("\\p{Digit}+")) {
			return false;
		} else if (allow_num.matches("0+\\p{Digit}*")) {
			return false;
		}
		return true;
	}

	// 是否是帐号
	public static boolean isUsername(String username) {
		if (username.length() < 6 || username.length() > 8) {
			return false;
		}
		if (!username.matches("\\p{Alpha}+\\p{Alnum}+")) {
			return false;
		}
		return true;
	}

	// 是否是密码
	public static boolean isPassword(String password) {
		if (!password.matches("\\p{Alnum}{6,8}")) {
			return false;
		}
		return true;
	}

	// 是否是床位号码
	public static boolean isBed_Num(String bed_num) {
		if (!bed_num.matches("\\p{Digit}+")) {
			return false;
		}
		return true;
	}

	// 是否是日期
	public static boolean isDate(String date) {
		if (!date.matches("\\p{Digit}{4}-\\p{Digit}{2}-\\p{Digit}{2}")) {
			return false;
		}
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8));
		if (year == 0 || month == 0 || day == 0) {
			return false;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				return false;
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				return false;
			}
		}
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				if (day > 29) {
					return false;
				}
			} else {
				if (day > 28) {
					return false;
				}
			}
		}
		return true;
	}

	// 比较日期大小
	public static boolean isGreaterEqual(String start_date, String end_date) {
		char start[] = start_date.toCharArray();
		char end[] = end_date.toCharArray();
		for (int i = 0; i < 10; i++) {
			if (end[i] < start[i]) {
				return false;
			} else if (end[i] > start[i]) {
				return true;
			}
		}
		return true;
	}

	// 是否是金额
	public static boolean isAmount(String amount) {
		if (!amount.matches("\\p{Digit}+")) {
			return false;
		} else if (amount.matches("0{2,}\\p{Digit}*")) {
			return false;
		}
		return true;
	}

	// 验证软件是否可以正常使用
	public static boolean identify() {

		ClassPathResource cr = new ClassPathResource("com\\feifan\\struts\\IdentifyCode.properties");
		Properties pros = new Properties();
		try {
			pros.load(cr.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			// 发生异常时
			return false;
		}
		// 验证码长度太小时，验证失败
		char[] c = pros.getProperty("identifycode").toCharArray();
		if (c.length < 20) {
			return false;
		}
		// 系统日期超出验证码日期时，验证失败
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date1 = sdf.format(dt);

		String date2 = "20" + String.valueOf((char) (c[c.length - 2] ^ 'z')) + String.valueOf((char) (c[c.length - 4] ^ 'z')) + "0"
				+ String.valueOf((char) (c[c.length - 6] ^ 'z')) + "0" + String.valueOf((char) (c[c.length - 8] ^ 'z'));
		if (Integer.parseInt(date1) - Integer.parseInt(date2) > 0) {
			return false;
		}
		// 验证正常时，软件可以正常使用
		return true;
	}

	// 生成验证码
	public static void main(String[] args) {
		String identifycode = "1113333111234123595967017";
		char[] c = identifycode.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print((char) (c[i] ^ 'z'));
		}
	}
}
