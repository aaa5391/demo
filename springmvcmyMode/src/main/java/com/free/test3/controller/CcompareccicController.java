package com.free.test3.controller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.jdbc.core.JdbcTemplate;
import tk.mybatis.mapper.entity.Example;
import com.free.core.vo.ResponseData;
import com.free.core.model.KQResultSet;
import com.free.core.model.MsgJson;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.free.test3.service.CcompareccicService;
import com.free.test3.model.CcompareccicModel;
import com.alibaba.fastjson.JSONObject;
import com.free.core.model.BootgridPageInfoSet;
import com.free.core.util.Jsonutil;

@Controller  // 哈哈mvc控制器
@RequestMapping(value = "/Ccompareccicmvc")
public class CcompareccicController {
	
		@Resource  //服务
		private CcompareccicService service;	
		
		@Resource  //jdbc
		private JdbcTemplate jdbcTemplate;
	
		//标签页面跳转解析
		@RequestMapping("jump") 
		public ModelAndView jump(ModelAndView model) { 
			model.setViewName("/ResolveAjax.jsp");
			model.addObject("value","hahaha");
			return model;
		}
		
		//查询一条记录
		@RequestMapping("selectByKey")
		@ResponseBody
		public Object selectByKey(){
			      
			 CcompareccicModel t1=service.selectByKey("");
			 CcompareccicModel t2=new CcompareccicModel();
			
			return t1;
		}
		//条件查询查询
		@RequestMapping("select")
		@ResponseBody
		public Object sleelct(){
			CcompareccicModel t=new CcompareccicModel();
			List<CcompareccicModel> list=service.select(t);//查询
			return new PageInfo<CcompareccicModel>(list);
		}
		
		//sql语句查询
		@RequestMapping("selectByExample")
		@ResponseBody
		public  ResponseData  selectByExample(){
			CcompareccicModel t=new CcompareccicModel();
			Example example = new Example(CcompareccicModel.class);
		        Example.Criteria criteria = example.createCriteria();
		        criteria.andCondition("lwjg='43'  or  lwjg='ss'   or wjbt like '%余%' ");
			List<CcompareccicModel> list=service.selectByExample(example);
			return new ResponseData<PageInfo<CcompareccicModel>>(new PageInfo<CcompareccicModel>(list));
		}
	
		//分页查询1
		@RequestMapping(value="bootgridpage",produces="application/json;charset=UTF-8")
		@ResponseBody
		public BootgridPageInfoSet fenye(int current,int rowCount,String sort,String nane,String ph ){			
			PageHelper.startPage(current,rowCount);//分页
			Example example = new Example(CcompareccicModel.class);	
			String by=Jsonutil.getsortby(sort);//解析字段
			example.setOrderByClause(by);	//排序那个字段
			Example.Criteria criteria = example.createCriteria();
		    	 if (StringUtil.isNotEmpty(nane)) {
		             criteria.andLike("xm", "%" + nane + "%");
		         }
		    	 if (StringUtil.isNotEmpty(ph)) {
		             criteria.andLike("rybh", "%" + ph + "%");
		         }
		    List<CcompareccicModel> list=service.selectByExample(example);	
		    new BootgridPageInfoSet<CcompareccicModel>(list);
			return new BootgridPageInfoSet<CcompareccicModel>(list);
		}
		
		//分页查询2
		@RequestMapping("fenye2")
		@ResponseBody
		public ResponseData fenye2(){
			PageHelper.startPage(2,6);
			 Example example = new Example(CcompareccicModel.class);
		        Example.Criteria criteria = example.createCriteria();
		        criteria.andCondition(" jxr like '%s%' ");
			List<CcompareccicModel> list=service.selectByExample(example);	
			return new ResponseData<PageInfo<CcompareccicModel>>(new PageInfo<CcompareccicModel>(list));
		}
		
		//分页查询3
		@RequestMapping("findPage")
		@ResponseBody
		//http://localhost:8080/springmvcmy/vocabularymvc/findPage.htm?condStr=1=1&limit=5&offset=0
		public String findPage(String condStr,int limit,int offset) {
			KQResultSet<CcompareccicModel> Result=service.myfindPage(condStr.toString(), limit, offset);
			JSONObject json=new JSONObject();
			json.put("result", Result);
			return json.toString();
		}
		
		//原始任何sql语句查询||控制分页信息
		@RequestMapping("/jdbcTemplate")
		@ResponseBody
		public ResponseData  getTest(){	
			List<Map<String,Object>> dataList = new  ArrayList<Map<String,Object>>();
			dataList = jdbcTemplate.queryForList(" select * from C_COMPARE_CCIC  t ");
			return new ResponseData<PageInfo<PageInfo>>(new PageInfo(dataList));
		}
			
		//主键删除
		@RequestMapping("deleteByPrimaryKey")
		@ResponseBody
		public int  deleteByPrimaryKey(){
			String key="";
			int bool=service.deleteByPrimaryKey(key);
			return bool;
		}
		
		//条件删除
		@RequestMapping("delete")
		@ResponseBody
		public int  delete(){
			CcompareccicModel t=new CcompareccicModel();
			int bool=0;
			//service.mydeletewhere(cond);
			//bool=service.delete(t);//必须加条件来删除，不然整张表会被删除，建议主键删除
			return bool;
		}
		
		//新增一条
		@RequestMapping("insertSelective")
		@ResponseBody
		public  int insertSelective(){
			CcompareccicModel t=new CcompareccicModel();
		
			int bool=service.insertSelective(t);//保存 可以设置属性为空
			return bool ;
		}
		
		//修改更新 注意主键类型，主键里面是否有空的问题
		@RequestMapping("updateSelective")
		@ResponseBody
		public  int updateByPrimaryKeySelective(){
			CcompareccicModel t=new CcompareccicModel();
			
			int bool=service.updateByPrimaryKeySelective(t);
			return bool ;
		}
			
		//http
		 @RequestMapping("http")
		 public void http(HttpServletRequest request,HttpServletResponse response) {	 
			 
		 }
		  
		//测试
		@RequestMapping("test")
		@ResponseBody
		public Object test() {
		
			return "";
		}

		


}