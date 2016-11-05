package com.free.test3.mapper;

import com.free.test3.model.CcompareccicModel;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import com.free.core.util.MyMapper;



/**
 * 哈哈 的Mapper文件 
 */

@Repository("CcompareccicMapper")
public interface CcompareccicMapper  extends MyMapper<CcompareccicModel> {
		
	
	//MyMapper已经支持增删改查的接口 真实表名：C_COMPARE_CCIC

	//查询全部
	@Select("select *from C_COMPARE_CCIC t ")
	List<CcompareccicModel> myfindAll();
	
	//条件查询
	@Select("select * from  C_COMPARE_CCIC t where 1=1  ${cond}")
	List<CcompareccicModel> myfindAllByCond(@Param("cond") String cond);
	
	//总记录
	@Select("select count(*) x from C_COMPARE_CCIC ")
	int mytotalCount();
	
	//查询一条记录
	@Select("select * from  C_COMPARE_CCIC where rybh =${uid}")
	CcompareccicModel myfindById(@Param("uid") String uid);
	
	//条件删除
	@Delete("delete from C_COMPARE_CCIC where =${cond}")
	Integer mydelete(@Param("cond") String cond);

	//查询最大的id
	@Select("select max( rybh ) from  C_COMPARE_CCIC  ") 
	Integer mygetMaxId();

	//条件查询多少条
	@Select("select count(*) from   C_COMPARE_CCIC  where ${cond}")
	int mytotalCountByCond(@Param("cond") String cond);
	
	//分页查询
	@Select("select * from (select t.*,rownum n from (select * from C_COMPARE_CCIC  where ${cond}) t where rownum <=${offset+limit} order by rybh desc) where n > ${offset} ")
	List<CcompareccicModel> myfindByPage(@Param("cond") String cond, @Param("limit") int limit,@Param("offset") int offset);
	
	
	}