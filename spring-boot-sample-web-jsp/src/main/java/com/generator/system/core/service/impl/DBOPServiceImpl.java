/**
 * 
 */
package com.generator.system.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.generator.system.core.common.ResponseData;
import com.generator.system.core.entity.TableInfo;
import com.generator.system.core.mapper.DBOPMapper;
import com.generator.system.core.service.DBOPService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @Description TODO
 * @author JIAYUAN
 * @createDate 2016年10月21日 下午2:59:40
 * @modifier
 * @modifyDate
 * @version 1.0
 */
@Service
public class DBOPServiceImpl implements DBOPService{

	@Resource
	private DBOPMapper dbopMapper;
	
	/**
	 * @Description 获取所有表明
	 * @param page
	 * @return
	 * @author JIAYUAN
	 * @createDate 2016年10月21日 下午3:01:27
	 * @modifier
	 * @modifyDate
	 * @version 1.0
	 */
	@Override
	public ResponseData<?> getAllTable(Page<TableInfo> page) {
		PageHelper.startPage(page.getPageNum() == 0 ? 1 : page.getPageNum(),
                page.getPageSize() == 0 ? 10 : page.getPageSize());
		return new ResponseData<PageInfo<TableInfo>>(new PageInfo<TableInfo>(dbopMapper.selectAllTable()));
	}

}
