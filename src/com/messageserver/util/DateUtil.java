package com.messageserver.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static DateUtil dateUtil;

	private DateUtil() {

	}

	public static DateUtil getInstance() {

		if (dateUtil == null) {
			dateUtil = new DateUtil();
		}
		return dateUtil;

	}

	public Date getDateFromString(String date) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date utilDate = null;
		try {
			utilDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return utilDate;

	}

}
