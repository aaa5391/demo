package com.freedom.Generates;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.freedom.Constantvalue;
import com.freedom.Generate;

import com.freedom.model.ModelDefinition;
import com.freedom.model.ModelProperty;

public class ModelGenerator extends Generator {

	 //生成实体类
	public void generate(ModelDefinition  param) {
		String templateFileName = "model/Model.java.ftl";
		String fileName =Constantvalue.Entity_packageNAME+"/"+ param.getClassName()+Constantvalue.Entity_NAME + ".java";
		//生成toString 
		Map propMap = new HashMap();
		propMap.put("modelDefinition", param);
		StringBuffer sb=new StringBuffer();
		sb.append("\" "+param.getClassName()+"Model"+" [ ");
		for (ModelProperty modelProperty : param.getProperties()) {
			sb.append(modelProperty.getColumn_name()+"=\"+"+modelProperty.getColumn_name()+"+\",");
			sb.deleteCharAt(sb.length()-1);
		}	sb.append("]\" ");
		propMap.put("toString", sb);
		propMap.put("entityname", Constantvalue.Entity_NAME);
		propMap.put("packageame", Constantvalue.Entity_packageNAME);
		
		Generate.generate(templateFileName, propMap, fileName);
	}
	
	
}
