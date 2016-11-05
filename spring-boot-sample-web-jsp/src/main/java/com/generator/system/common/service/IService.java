package com.generator.system.common.service;


import java.util.List;

import com.generator.system.common.model.DataResult;


public interface IService<T> {


    DataResult<String> ping();

    T selectByPrimaryKey(Object key);

    int insert(T entity);

    int insertSelective(T entity);

    /**
     * mysql专用
     *
     * @param entity
     * @return
     */
    int insertUseGeneratedKeys(T entity);

    int deleteByPrimaryKey(Object key);

    int updateByPrimaryKey(T entity);

    int updateByPrimaryKeySelective(T entity);

    List<T> selectByExample(Object example);
}
