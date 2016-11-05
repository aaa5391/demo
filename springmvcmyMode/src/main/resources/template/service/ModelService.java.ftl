package ${modelDefinition.packageName}.${packageame};
import com.free.core.service.IService;
import java.util.List;
import com.free.core.model.KQResultSet;
import ${modelDefinition.packageName}.${entity_packagename}.${modelDefinition.className}${entityname};

 // ${modelDefinition.modelDesc} 服务接口


public interface  ${modelDefinition.className}${servicename}   extends IService<${modelDefinition.className}${entityname}> {


	 /**
     * YU直接给出右边的条件即可，如 and name='yu'
     *
     * @param cond
     * @return List集合
     */
	 List myfindAllByCond(String cond);
 	/**
     * 根据id查询出一条记录
     *
     * @param 主键值
     * @return 对象
     */
	 ${modelDefinition.className}${entityname} myfindById(String uid);
	 /**
     * 根据右边的条件来删除记录
     *
     * @param cond，条件
     * @return 对象
     */
	 int mydeletewhere(String cond) ;
	 /**
     * 查询主键最大的值，有则有，无则无
     *
     * @param null
     * @return int
     */
	 Integer mygetMaxId();
	 /**
     * 按条件查询，有多少条记录，一般配合分页一起用
     *
     * @param cond，查询条件
     * @return int
     */
	 int mytotalCountByCond(String cond);
	 /**
	 * 分页查询，cond查询条件，limit:起页,offset:止页
	 *
	 * @param cond，limit，offset
	 * @return KQResultSet
	 */
	 public KQResultSet myfindPage(String cond, int limit, int offset);
	 /**
     *  查询全表多少条记录
     *
     * @param null
     * @return Integer
     */
	 public int mytotalCount();
}
