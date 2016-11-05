package com.freedom.Generates;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.freedom.Constantvalue;
import com.freedom.Generate;

import com.freedom.model.ModelDefinition;
import com.freedom.model.ModelProperty;

public class DaoGenerator extends Generator {

	// 生成Mapper
	public void generate(ModelDefinition param) {
		String templateFileName = "dao/ModelMapper.java.ftl";
		String fileName =Constantvalue.Dao_packageNAME+"/"+ param.getClassName()+Constantvalue.Dao_NAME + ".java";
		Map propMap = new HashMap();
		propMap.put("modelDefinition", param);
		propMap.put("daoename", Constantvalue.Dao_NAME);
		propMap.put("packageame", Constantvalue.Dao_packageNAME);
		propMap.put("entityname", Constantvalue.Entity_NAME);
		propMap.put("entity_packagename", Constantvalue.Entity_packageNAME);
		propMap.put("fuhao", "$");// 替换 $
		String puk="";//主键
		StringBuffer sb=new StringBuffer();
		for (ModelProperty mode : param.getProperties()) {
			sb.append(mode.getColumn_name()+",");
			if(mode.getIspk().equals("主键")){
				puk=mode.getColumn_name();
				
			}
		}
		propMap.put("puk", puk);// puk
		sb.deleteCharAt(sb.length()-1);
		propMap.put("insertsql", sb);// puk
		//System.out.println(sb);
		Generate.generate(templateFileName, propMap, fileName);
	}

	
}
