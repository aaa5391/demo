package com.free.core.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用接口
 */
@Service
public interface IService<T> {

	
	/**
     * 增加一条，主键可自己设置，也可使用注解序列
     *
     * @param record
     * @return 执行结果
     */
	int insertSelective(T record);
	/**
     * 删除主键一条值
     *
     * @param key
     * @return 执行结果
     */
	int deleteByPrimaryKey(Object key);
	/**
     * 按条件来删除，慎用！
     *
     * @param record
     * @return 执行结果
     */
	int delete (T record);
	/**
     * 更新表的一条记录，要传入准确的id,返回执行结果
     *
     * @param record
     * @return 执行结果
     */
	int updateByPrimaryKeySelective(T record);
	/**
     * 使用mybatis-generato生成的代码使用这接口查询第一个对象
     *
     * @param key
     * @return 执行结果
     */
	T selectByKey(Object key);
	/**
     * 使用自己写的freemarker生成的代码使用这接口查询第一个对象
     *
     * @param 	record
     * @return  一条对象
     */
	T selectByKey2(T record);
	/**
     * 按example条件来查询返回List
     * 
     * @param example
     * @return List集合
     */
	List<T> selectByExample(Object example);
	/**
     * 查询全部
     * 
     * @param null
    * @return List集合
     */
	List<T> selectAll();
	/**
     * 按条件查询返回结果
     * 
     * @param record
     * @return List集合
     */
	List<T> select(T record);
	
}
