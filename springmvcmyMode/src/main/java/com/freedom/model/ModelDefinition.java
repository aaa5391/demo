package com.freedom.model;

import java.util.List;

import com.freedom.Generate;


public class ModelDefinition {
	private String packageName;// 包名
	private String className; // 文件名
	private String tableName; // 表名
	private String modelDesc; // 说明
	private List<ModelProperty> properties;// 数据库字段
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		// 把首字母大写
		this.className =Generate.capFirst( className);
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getModelDesc() {
		return modelDesc;
	}
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}
	public List<ModelProperty> getProperties() {
		return properties;
	}
	public void setProperties(List<ModelProperty> properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "ModelDefinition [packageName=" + packageName + ", className="
				+ className + ", tableName=" + tableName + ", modelDesc="
				+ modelDesc + ", properties=" + properties + "]";
	}
}