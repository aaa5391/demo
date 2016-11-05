package com.free.core.model;

import java.util.Arrays;
import java.util.List;

/**
 * 分页结果集
 * 
 * @author Wkkyo
 * 
 */
public class KQResultSet<T> {

	private int total;

	private List<T> rows;

	private String result;

	private int page;

	private String message;

	

	private String[] fields;

	private String[] otherFields;

	public KQResultSet() {
		this.result = "success";
		this.message = "数据请求成功";
	}

	
	public String[] getFields() {
		return fields;
	}

	/**
	 * 描述提示信息
	 */
	public String getMessage() {
		return message;
	}

	public String[] getOtherFields() {
		return otherFields;
	}

	/**
	 * 当前页数
	 * 
	 * @return
	 */
	public int getPage() {
		return page;
	}

	/**
	 * 结果说明
	 */
	public String getResult() {
		return result;
	}

	/**
	 * 记录集
	 */
	public List<T> getRows() {
		return rows;
	}

	/**
	 * 总记录数
	 */
	public int getTotal() {
		return total;
	}

	

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	/**
	 * 描述提示信息
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void setOtherFields(String[] otherFields) {
		this.otherFields = otherFields;
	}

	/**
	 * 当前页数
	 * 
	 * @param page
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 结果说明
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * 记录集
	 */
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	/**
	 * 总记录数
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "KQResultSet [total=" + total + ", rows=" + rows + ", result="
				+ result + ", page=" + page + ", message=" + message
				+ ", fields="
				+ Arrays.toString(fields) + ", otherFields="
				+ Arrays.toString(otherFields) + "]";
	}
}
