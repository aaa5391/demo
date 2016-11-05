/**
 * 
 */
package com.generator.system.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.generator.system.core.entity.TableInfo;

/**
 * @Description TODO
 * @author JIAYUAN
 * @createDate 2016年10月21日 下午2:32:46
 * @modifier
 * @modifyDate
 * @version 1.0
 */
public interface DBOPMapper {
	
	@Select("SELECT TABLE_NAME AS tableName,CREATE_TIME AS createTime,TABLE_COMMENT AS tableComment FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'staroutlook_dev'")
	List<TableInfo> selectAllTable();
}
