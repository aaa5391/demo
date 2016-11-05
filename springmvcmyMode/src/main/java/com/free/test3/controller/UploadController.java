package com.free.test3.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.free.core.model.MsgJson;


@Controller  // 前台使用webuploader插件上传的 
@RequestMapping(value = "/Upload")
public class UploadController {

	
		//上传文件
		@RequestMapping("jump") 
		public ModelAndView jump(ModelAndView model) { 
			model.setViewName("yu/upload.jsp");
			model.addObject("value","hahaha");
			return model;
		}
	
		//上传图片
		@RequestMapping("jump2") 
		public ModelAndView jump2(ModelAndView model) { 
			model.setViewName("/yu/uploadpicture.jsp");
			model.addObject("value","hahaha");
			return model;
		}
					
		//页面在 /springmvcmyMode/src/main/webapp/WEB-INF/jsp/yu/upload.jsp
		// 文件上传 //name 必须给 file
		@RequestMapping(value="toUpload",produces="application/json;charset=UTF-8")
		@ResponseBody
		public MsgJson fileUpload(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request)throws Exception {
			MsgJson json=new MsgJson();
			try {
				// 判断文件是否为空， 空直接返回上传错误
				if (!file.isEmpty()) {
					// 获取本地文件存储目录
					String path = request.getSession().getServletContext().getRealPath("/download/temp/");
					// 获取文件名
					String filename = file.getOriginalFilename();
					// 创建一个要保存的新文件
					File saveFile = new File(path);// 判断是否已经存在，不存在即创建
					if (!saveFile.exists()) {
						saveFile.mkdirs();
					}
					path += "\\" + filename;
					File saveFile2 = new File(path);
					file.getFileItem().write(saveFile2);//保存
					json.setResult(MsgJson.success);
				}
			
			} catch (Exception e) {
				json.setResult(MsgJson.fail);
			
			}
			return json;
		}
		
		
		// 文件上传 //name 必须给 file
		@RequestMapping(value="uploadpicture",produces="application/json;charset=UTF-8")
		@ResponseBody
		public MsgJson uploadpicture(@RequestParam("file") CommonsMultipartFile file,HttpServletRequest request)throws Exception {
			MsgJson json=new MsgJson();
			try {
				// 判断文件是否为空， 空直接返回上传错误
				if (!file.isEmpty()) {
					// 获取本地文件存储目录
					String path = request.getSession().getServletContext().getRealPath("/download/temp/");
					// 获取文件名
					String filename = file.getOriginalFilename();
					// 创建一个要保存的新文件
					File saveFile = new File(path);// 判断是否已经存在，不存在即创建
					if (!saveFile.exists()) {
						saveFile.mkdirs();
					}
					path += "\\" + filename;
					File saveFile2 = new File(path);
					file.getFileItem().write(saveFile2);//保存
					json.setResult(MsgJson.success);
				}
			
			} catch (Exception e) {
				json.setResult(MsgJson.fail);
			
			}
			return json;
		}
}
