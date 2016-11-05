package com.free.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.free.core.service.IService;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;


public abstract class BaseService<T> implements IService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }
    @Override
    public T selectByKey2(T record) {
    	List<T> list=mapper.select(record);//查询
    	if(list.size()>0){
    		T tb=list.get(0);
    		return tb;
    	}
		
		return null;
    }
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
    public List<T> selectAll() {
        return mapper.selectAll();
    }
    public List<T> select(T record) {
        return mapper.select(record);
    }
    public int insertSelective(T entity) {
        return mapper.insertSelective(entity);
    }

    public int delete(T record) {
        return mapper.delete(record);
    }
    public int deleteByPrimaryKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }
    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateByPrimaryKeySelective(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
        }

   

    //TODO 其他...
}
