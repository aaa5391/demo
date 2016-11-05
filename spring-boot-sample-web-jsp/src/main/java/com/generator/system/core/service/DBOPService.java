/**
 * 
 */
package com.generator.system.core.service;

import com.generator.system.core.common.ResponseData;
import com.generator.system.core.entity.TableInfo;
import com.github.pagehelper.Page;

/**
 * @Description TODO
 * @author JIAYUAN
 * @createDate 2016年10月21日 下午2:59:18
 * @modifier
 * @modifyDate
 * @version 1.0
 */
public interface DBOPService {

	ResponseData<?> getAllTable(Page<TableInfo> page);
	
}
