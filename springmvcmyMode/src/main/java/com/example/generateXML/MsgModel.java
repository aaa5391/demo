package com.example.generateXML;

import javax.xml.bind.annotation.XmlRootElement;



public class MsgModel {
	
	private String code;//错误码
	private String msg;//信息说明
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
