package com.freedom;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import com.freedom.model.ModelConnection;
import com.freedom.model.ModelDefinition;
import com.freedom.model.ModelProperty;

public class Example {
	
	
	//生成一个表的数据
	public static void ExampleSingletable(){
		ModelDefinition mode = new ModelDefinition();
		List<ModelProperty> lsit = ModelConnection.GetModelPropertyList("vocabulary");
		mode.setProperties(lsit);
		mode.setClassName("vocabulary");
		mode.setModelDesc("词汇管理");
		mode.setPackageName("com.kanq");
		Generate.Generates(mode);
		for (int i = 0; i < 15; i++) {
	    	  System.out.println("记住检查实体类和数据库生成对应的格式!!!");
		}
	}

	//同时生成多张表的文件
	public static void ExampleListletable(){
		 List<ModelDefinition> modelist= Example.parse(Example.class.getResourceAsStream("/generator/models.xml"));
		 for (ModelDefinition modelDefinition : modelist) {
			 ModelDefinition mode2 = new ModelDefinition();
				List<ModelProperty> lsit = ModelConnection.GetModelPropertyList(modelDefinition.getTableName());
				mode2.setProperties(lsit);
				mode2.setClassName(modelDefinition.getClassName());
				mode2.setModelDesc(modelDefinition.getModelDesc());
				mode2.setPackageName(modelDefinition.getPackageName());
				mode2.setTableName(modelDefinition.getTableName());
				Generate.Generates(mode2);
		}
		 for (int i = 0; i < 15; i++) {
	    	  System.out.println("记住检查实体类和数据库生成对应的格式!!!，检查是否生成了主键，没有，删除修改不能用！！！！！");
		}
	
	}
	

	//解析/generator/models.xml
	private static List<ModelDefinition> parse(InputStream is)
	  {
     List models = new ArrayList();
     String packageName = null;
     DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
     try {
	     	DocumentBuilder builder = factory.newDocumentBuilder();
	     	Document doc = builder.parse(is, "UTF-8");
	        Element root = doc.getDocumentElement();
	        packageName = root.getAttribute("packageName");
	        NodeList modelList = root.getElementsByTagName("model");
	        for (int i = 0; i < modelList.getLength(); i++) {
	        Element modelElement = (Element)modelList.item(i);
	        ModelDefinition md = new ModelDefinition();
	        String ClassName=  modelElement.getAttribute("tableName");
	        md.setTableName(ClassName);
	        ClassName= ClassName.replace("_", "");//生命的文件名去掉下划线
	        md.setClassName(ClassName);
	        md.setModelDesc(modelElement.getAttribute("modelDesc"));
	        md.setPackageName(packageName);
	        models.add(md);
	        }
     	} catch (Exception e) {
    	 e.printStackTrace();
	     }
	   return models;
	   }
	
}
