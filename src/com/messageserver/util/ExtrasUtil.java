package com.messageserver.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExtrasUtil {

	private static ExtrasUtil standards;

	private ExtrasUtil() {
	}

	public static ExtrasUtil getInstance() {
		if (standards == null) {
			standards = new ExtrasUtil();
		}
		return standards;
	}

	public Map<String, String> getStandardList() {

		Map<String, String> standarsMap = new LinkedHashMap<>();
		standarsMap.put("lkg", "LKG");
		standarsMap.put("ukg", "UKG");
		standarsMap.put("1", "1st");
		standarsMap.put("2", "2nd");
		standarsMap.put("3", "3rd");
		standarsMap.put("4", "4th");
		standarsMap.put("5", "5th");
		return standarsMap;
	}

	public Map<String, String> getRolesMap() {
		Map<String, String> roleMap = new HashMap<String, String>();
		roleMap.put("principal", "Principal");
		roleMap.put("admin", "Admin");
		roleMap.put("staff", "Staff");
		return roleMap;
	}

	public Map<String, String> getTemplateCatagaries() {
		Map<String, String> catagaryMap = new HashMap<String, String>();
		catagaryMap.put("national", "NationalFestival");
		catagaryMap.put("regional", "RegionalFestival");
		catagaryMap.put("attendence", "Attendence");
		catagaryMap.put("events", "Events");
		catagaryMap.put("marriage", "MarriageAnniversary");
		catagaryMap.put("birthday", "BirthDay");
		catagaryMap.put("management", "Management");
		return catagaryMap;

	}

}
