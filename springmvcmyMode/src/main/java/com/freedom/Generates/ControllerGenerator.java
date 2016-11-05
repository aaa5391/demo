package com.freedom.Generates;

import java.util.HashMap;
import java.util.Map;

import com.freedom.Constantvalue;
import com.freedom.Generate;

import com.freedom.model.ModelDefinition;

public class ControllerGenerator  extends Generator{


		//生成Controller MVC
		public void generate(ModelDefinition  param) {
			String templateFileName = "controller/ModelController.java.ftl";
			String fileName = Constantvalue.MVC_packageNAME+"/"+ param.getClassName()+Constantvalue.Mvc_NAME + ".java";
			Map propMap = new HashMap();
			propMap.put("modelDefinition", param);
			propMap.put("modename",   Constantvalue.Mvc_NAME);
			propMap.put("packageame", Constantvalue.MVC_packageNAME);
			propMap.put("entityname", Constantvalue.Entity_NAME);
			propMap.put("entity_packagename", Constantvalue.Entity_packageNAME);
			propMap.put("servicename", Constantvalue.Service_NAME);
			propMap.put("servicepackagename", Constantvalue.Service_packageNAME);
			propMap.put("modelname", param.getClassName()+Constantvalue.Entity_NAME);
			Generate.generate(templateFileName, propMap, fileName);
		}
		

}
