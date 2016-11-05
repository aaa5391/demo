package com.free.test3.service.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.free.core.service.impl.BaseService;
import org.springframework.stereotype.Service;
import com.free.core.model.KQResultSet;
import com.free.test3.mapper.CcompareccicMapper;
import com.free.test3.model.CcompareccicModel;
import com.free.test3.service.CcompareccicService;

@Service("CcompareccicService") //用@Service注解
public class CcompareccicServiceimpl   extends BaseService<CcompareccicModel>  implements CcompareccicService {
	
	//拿到资源
	@Resource(name="CcompareccicMapper") 
	private CcompareccicMapper mapper;
	
	//全部数据
	public List myfindAll() {
		return mapper.myfindAll();
	}
	//条件查询
	public List myfindAllByCond(String cond) {
		return mapper.myfindAllByCond(cond);
	}
	//查询单条记录
	public  CcompareccicModel myfindById(String uid) {
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
		KQResultSet<CcompareccicModel> result = new KQResultSet<CcompareccicModel>();
		int totalCount = mapper.mytotalCountByCond(cond);
		List<CcompareccicModel> list = mapper.myfindByPage(cond, limit, offset);
		result.setPage(offset);
		result.setRows(list);
		result.setTotal(totalCount);
		result.setMessage("查询成功");
		return result;
	
	}

	
	
	

}
