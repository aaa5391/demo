package com.freedom;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.freedom.Generates.ControllerGenerator;
import com.freedom.Generates.DaoGenerator;
import com.freedom.Generates.Generator;
import com.freedom.Generates.ModelGenerator;
import com.freedom.Generates.ServiceandServiceimpGenerator;
import com.freedom.freemarkerutil.ConfigurationHelper;
import com.freedom.model.ModelDefinition;

import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Generate  {
	
	 public static void generate(String templateFileName, Map<String, Object> propMap, String fileName)
	  {
	     try {
	    Template t = ConfigurationHelper.getConfiguration().getTemplate(templateFileName);
	    fileName = Constantvalue.Generate_the_path + fileName;
	    new File(fileName.substring(0, fileName.lastIndexOf("/"))).mkdirs();
	    File afile = new File(fileName);
		System.out.println(fileName);
        Writer out = new BufferedWriter(new OutputStreamWriter(
	    new FileOutputStream(afile), "UTF-8"));
	    t.process(propMap, out);
	     out.close();
	     
	   
        } catch (TemplateException e) {
	       e.printStackTrace();
	    
	    } catch (IOException e) {
	      e.printStackTrace();
	      System.out.println("----模版文件未找到！");
	   }
	  }
	 
	 
	 //首字母转大写
	 public static String capFirst(String string) {
		 String b=string.toLowerCase();
	   String s = String.valueOf(b.charAt(0)).toUpperCase();
	     s = s + b.substring(1);
	     return s;
	   }
	 // /转.
	 public static String packagepath(String packageName) {
		   return packageName.replace('/', '.');
		  }
	
	 //生成mvc dao service代码
	 public static void Generates(ModelDefinition mode){
			Generator Mode=new ModelGenerator();
			Mode.generate(mode);
			Generator MVC=new ControllerGenerator();
			MVC.generate(mode);
			Generator Service=new ServiceandServiceimpGenerator();
			Service.generate(mode);
			Generator DAO=new DaoGenerator();
			DAO.generate(mode);
	 }
}
