package com.freedom.model;

public class ModelProperty {
	private String comments;// 注释
	private String column_name;// 列名
	private String data_type;// 数据类型
	private String isnull;// 是否为空
	private String ispk;// 是否主键
	
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getColumn_name() {
		return column_name;
	}

	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public String getIsnull() {
		return isnull;
	}

	public void setIsnull(String isnull) {
		this.isnull = isnull;
	}

	public String getIspk() {
		return ispk;
	}

	public void setIspk(String ispk) {
		this.ispk = ispk;
	}

	@Override
	public String toString() {
		return "ModelProperty [comments=" + comments + ", column_name="
				+ column_name + ", data_type=" + data_type + ", isnull="
				+ isnull + ", ispk=" + ispk + "]";
	}
}