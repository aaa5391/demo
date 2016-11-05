package com.free.core.util;

import java.util.Set;

import com.alibaba.fastjson.JSONObject;

public class Jsonutil {

	/**
	 * 传入sort的json 只能是一对，返回需要排序的字段
	 * 
	 * @param sort
	 * @return String 如： xm desc
	 */
	public static String getsortby(String sort) {
		JSONObject jsonObject = JSONObject.parseObject(sort);
		Set<String> set = jsonObject.keySet();
		String keyname = "";
		for (String key : set) {
			keyname = key;
		}
		String value = jsonObject.getString(keyname);
		return " " + keyname + "  " + value + "";
	}

}
