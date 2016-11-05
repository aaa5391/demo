package com.free.test3.test;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;





public class generateXML {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		dome1();
	}

	
	//利用 jdk自带的JAXBContext生成xml 
	public static void dome1() throws JAXBException{
		CcompareccicModel<LlstModel> model=new CcompareccicModel<LlstModel>();
		model.setXm("余清泉");
		model.setRybh("110账户");
		
		MsgModel msg=new MsgModel();
		msg.setCode("001");
		msg.setMsg("错误");
	
		
		LlstModel list1=new LlstModel();
		list1.setName("二级余清泉1");
		list1.setAa("aaa");
		LlstModel list2=new LlstModel();
		list2.setName("二级余清泉2");
		list1.setAa("aaa");
		list1.setBb("bbb");
		List<LlstModel> data=new ArrayList<LlstModel>();
		data.add(list1);
		data.add(list2);
		
		model.setMsg(msg);
		model.setData(data);
		//上面都是设置值
		//核心代码生成
		 JAXBContext context = JAXBContext.newInstance(CcompareccicModel.class,LlstModel.class);
		 Marshaller jaxbMarshaller = context.createMarshaller();
		 jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 StringWriter writer = new StringWriter();  
		 jaxbMarshaller.marshal(model, writer);
		String  Stringxml=writer.toString();
		System.out.println(Stringxml);
	}
}
