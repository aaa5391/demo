/**
 * 
 */
package com.generator.system.core.controller;

import java.util.Arrays;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.org.rapid_framework.generator.DB;
import cn.org.rapid_framework.generator.GeneratorFacade;

import com.generator.system.common.generate.GenConfig;
import com.generator.system.core.common.ErrorCode;
import com.generator.system.core.common.ResponseData;
import com.generator.system.core.entity.TableInfo;
import com.generator.system.core.service.DBOPService;
import com.github.pagehelper.Page;

/**
 * @Description 基本数据库操作
 * @author JIAYUAN
 * @createDate 2016年10月21日 下午3:10:19
 * @modifier
 * @modifyDate
 * @version 1.0
 */
@Controller
public class DBOPController {
	
	@Resource
	private DBOPService dbopService;
	
	@RequestMapping("/toTables")
	public Object preTableList(){
		return "tables";
	}
	
	@RequestMapping("/tables")
	@ResponseBody
	public Object getAllTable(Page<TableInfo> page){
		return dbopService.getAllTable(page);
	}
	
	@RequestMapping("/genCode")
	@ResponseBody
	public Object genCode(String[] tableName,DB db){
		/*DB db = new DB();db.setUserame(username);db.setPassword(password);
		db.getUsername();
		db.getPassword();*/
		//System.out.println(db.getUsername()+ " -- " + db.getPassword());
		GeneratorFacade facade = new GeneratorFacade();
		String[] args = Arrays.copyOf(tableName,tableName.length);
        if(args.length == 0) return "";
        facade.g.setIncludes(GenConfig.getIncludes(args,1));
        try {
			facade.generateByTable(args[0],GenConfig.getTemplateRootDir());
			GenConfig.checkAndMakeOutRootDirs();
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseData<>(ErrorCode.FAILED_CODE);
		}
		return new ResponseData<>(ErrorCode.SUCCESS_CODE);
	}
}
