package ${modelDefinition.packageName}.${packageame}.${service_imp_name};
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.free.core.service.impl.BaseService;
import org.springframework.stereotype.Service;
import com.free.core.model.KQResultSet;
import ${modelDefinition.packageName}.${daopackageame}.${modelDefinition.className}${daoename};
import ${modelDefinition.packageName}.${entity_packagename}.${modelDefinition.className}${entityname};
import ${modelDefinition.packageName}.${packageame}.${modelDefinition.className}${servicename};

@Service("${modelDefinition.className}${servicename}") //用@Service注解
public class ${modelDefinition.className}${servicename}${service_imp_name}   extends BaseService<${modelDefinition.className}${entityname}>  implements ${modelDefinition.className}${servicename} {
	
	//拿到资源
	@Resource(name="${modelDefinition.className}${daoename}") 
	private ${modelDefinition.className}${daoename} mapper;
	
	//全部数据
	public List myfindAll() {
		return mapper.myfindAll();
	}
	//条件查询
	public List myfindAllByCond(String cond) {
		return mapper.myfindAllByCond(cond);
	}
	//查询单条记录
	public  ${modelDefinition.className}${entityname} myfindById(String uid) {
		return mapper.myfindById(uid);
	}

	//条件删除
	public int mydeletewhere(String cond) {
		return mapper.mydelete(cond);
		
	}
	
	
	//查询最大id
	public Integer mygetMaxId() {
		return mapper.mygetMaxId();
		
	}
	
	//查询表有多少条记录
	public int mytotalCount() {
		return mapper.mytotalCount();
	}
	//根据查询表有多少条记录
	public int mytotalCountByCond(String cond) {
		return mapper.mytotalCountByCond(cond);
	}
	
	//分页查询
	public KQResultSet myfindPage(String cond, int limit, int offset) {
		KQResultSet<${modelDefinition.className}${entityname}> result = new KQResultSet<${modelDefinition.className}${entityname}>();
		int totalCount = mapper.mytotalCountByCond(cond);
		List<${modelDefinition.className}${entityname}> list = mapper.myfindByPage(cond, limit, offset);
		result.setPage(offset);
		result.setRows(list);
		result.setTotal(totalCount);
		result.setMessage("查询成功");
		return result;
	
	}

	
	
	

}
