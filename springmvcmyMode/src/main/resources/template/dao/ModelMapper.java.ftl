package ${modelDefinition.packageName}.${packageame};

import ${modelDefinition.packageName}.${entity_packagename}.${modelDefinition.className}${entityname};
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import com.free.core.util.MyMapper;



/**
 * ${modelDefinition.modelDesc} 的Mapper文件 
 */

@Repository("${modelDefinition.className}${daoename}")
public interface ${modelDefinition.className}${daoename}  extends MyMapper<${modelDefinition.className}${entityname}> {
		
	
	//MyMapper已经支持增删改查的接口 真实表名：${modelDefinition.tableName}

	//查询全部
	@Select("select *from ${modelDefinition.tableName} t ")
	List<${modelDefinition.className}${entityname}> myfindAll();
	
	//条件查询
	@Select("select * from  ${modelDefinition.tableName} t where 1=1  ${fuhao}{cond}")
	List<${modelDefinition.className}${entityname}> myfindAllByCond(@Param("cond") String cond);
	
	//总记录
	@Select("select count(*) x from ${modelDefinition.tableName} ")
	int mytotalCount();
	
	//查询一条记录
	@Select("select * from  ${modelDefinition.tableName} where ${puk} =${fuhao}{uid}")
	${modelDefinition.className}${entityname} myfindById(@Param("uid") String uid);
	
	//条件删除
	@Delete("delete from ${modelDefinition.tableName} where =${fuhao}{cond}")
	Integer mydelete(@Param("cond") String cond);

	//查询最大的id
	@Select("select max( ${puk} ) from  ${modelDefinition.tableName}  ") 
	Integer mygetMaxId();

	//条件查询多少条
	@Select("select count(*) from   ${modelDefinition.tableName}  where ${fuhao}{cond}")
	int mytotalCountByCond(@Param("cond") String cond);
	
	//分页查询
	@Select("select * from (select t.*,rownum n from (select * from ${modelDefinition.tableName}  where ${fuhao}{cond}) t where rownum <=${fuhao}{offset+limit} order by ${puk} desc) where n > ${fuhao}{offset} ")
	List<${modelDefinition.className}${entityname}> myfindByPage(@Param("cond") String cond, @Param("limit") int limit,@Param("offset") int offset);
	
	
	}