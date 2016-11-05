package com.free.core.model;

public class MsgJson {
	

	/**
	 * 失败 值是0
	 * 
	 */
	public static  String fail="0";//失败
	/**
	 * 成功 值是1
	 * 
	 */
	public static  String success="1";//成功
	private String name;//表示什么
	private Object msg;//说明
	private String result="0";//是否成功
	public String getName() {
		return name;
	}
	/**
     * name属性，可给可不给
     *
     * @param name
     */
	
	public void setName(String name) {
		this.name = name;
	}
	public Object getMsg() {
		return msg;
	}
	/**
     * 设置消息
     *
     * @param fail，success
     */
	public void setMsg(Object msg) {
		this.msg = msg;
	}
	
	public String getResult() {
		return result;
	}
	
	/**
     * result属性，设置是否成功
     *
     * @param name
     */
	
	public void setResult(String result) {
		
		this.result = result;
	}
}
