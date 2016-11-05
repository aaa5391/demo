package ${modelDefinition.packageName}.${packageame};
import java.io.Serializable;
import java.sql.Clob;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
@Table(name = "${modelDefinition.tableName}")
public class ${modelDefinition.className}${entityname}   implements Serializable {

	/**${modelDefinition.modelDesc}实体类，检查是否生成了主键，如没，请检查数据库表主键字段，主键是@Id标识*/
	private static final long serialVersionUID = 1L;
	<#list modelDefinition.properties as po>
	/** ${po.comments?if_exists}  ${po.isnull }   ${po.ispk} */
	<#if (po.ispk== '主键')>
	@Id
	</#if>
    @Column(name = "${po.column_name}")
	private ${po.data_type} ${po.column_name};
	</#list>
	
	<#list modelDefinition.properties as po> 
	/**
	 * 取得${po.comments?if_exists}
	 *@return ${po.data_type} ${po.comments?if_exists}
	 */
	 public ${po.data_type} get${po.column_name?cap_first}(){
		return this.${po.column_name};
	}
	/**
	 * 设置${po.comments?if_exists}
	 *@param ${po.data_type} ${po.comments?if_exists}
	 */
	 public void set${po.column_name?cap_first}(${po.data_type} ${po.column_name}){
	<#if (po.data_type== 'String')>
	 this.${po.column_name} = ${po.column_name} == null ? "" : ${po.column_name}.trim();
	
	<#else>
		 this.${po.column_name} = ${po.column_name};
		 </#if>
	}
	
	</#list>
	public String toString() {
		return ${toString} ;
	}
}

