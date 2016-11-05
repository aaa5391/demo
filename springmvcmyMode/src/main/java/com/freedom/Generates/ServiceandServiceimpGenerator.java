package com.freedom.Generates;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.freedom.Constantvalue;
import com.freedom.Generate;

import com.freedom.model.ModelDefinition;

public class ServiceandServiceimpGenerator extends Generator {

	// 生成Service and Serviceimp
	public void generate(ModelDefinition param) {
		Servicegenerate(param);
		Serviceimpgenerate(param);
	}

	// 生成Service
	public void Servicegenerate(ModelDefinition param) {
		String templateFileName = "service/ModelService.java.ftl";
		String fileName =Constantvalue.Service_packageNAME+"/"+ param.getClassName()+Constantvalue.Service_NAME + ".java";
		Map propMap = new HashMap();
		propMap.put("modelDefinition", param);
		propMap.put("servicename", Constantvalue.Service_NAME);
		propMap.put("packageame", Constantvalue.Service_packageNAME);
		propMap.put("entityname", Constantvalue.Entity_NAME);
		propMap.put("entity_packagename", Constantvalue.Entity_packageNAME);
		Generate.generate(templateFileName, propMap, fileName);
	}

	// 生成Serviceimp
	public void Serviceimpgenerate(ModelDefinition param) {
		String templateFileName = "service/ModelServiceImpl.java.ftl";
		String fileName =Constantvalue.Service_packageNAME+"/"+Constantvalue.Service_IMP_NAME+"/"+ param.getClassName()+Constantvalue.Service_NAME+Constantvalue.Service_IMP_NAME + ".java";
		Map propMap = new HashMap();
		propMap.put("modelDefinition", param);
		propMap.put("servicename", Constantvalue.Service_NAME);
		propMap.put("packageame", Constantvalue.Service_packageNAME);
		propMap.put("service_imp_name", Constantvalue.Service_IMP_NAME);
		propMap.put("entityname", Constantvalue.Entity_NAME);
		propMap.put("entity_packagename", Constantvalue.Entity_packageNAME);
		propMap.put("daoename", Constantvalue.Dao_NAME);
		propMap.put("daopackageame", Constantvalue.Dao_packageNAME);
		Generate.generate(templateFileName, propMap, fileName);
	}
}
