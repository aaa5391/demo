package com.example.generateXML;

import java.io.Serializable;
import java.sql.Clob;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "modes")
// 生成的时候是取这个名字
// 这个没有泛型
public class CcompareccicModel2 {

	private MsgModel msg;// 对象生成

	private List<LlstModel> data;// list的生成

	private String rybh;
	/** 姓名 可空 */

	private String xm;

	/** 可空 */
	public MsgModel getMsg() {
		return msg;
	}

	@XmlElement(name = "Msg")
	public void setMsg(MsgModel msg) {
		this.msg = msg;
	}

	public String getRybh() {
		return rybh;
	}

	public void setRybh(String rybh) {
		this.rybh = rybh;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public List<LlstModel> getData() {
		return data;
	}

	@XmlElementWrapper(name = "List")// 这个是修改的名字
	public void setData(List<LlstModel> data) {
		this.data = data;
	}

}
