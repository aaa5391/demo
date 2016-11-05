<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${modelDefinition.packageName}.dao.${modelDefinition.className}Mapper" >
  <!-- 结果集映射 -->
  <resultMap id="BaseResultMap" type="${modelDefinition.packageName}.model.${modelDefinition.className}" >
    <#list modelDefinition.properties as po>
    <<#if (po.isPk == 'Y' && !modelDefinition.unionKey)>id<#else>result</#if> column="${po.columnName}" property="${po.propertyName}" jdbcType="<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>" />
    </#list>
  </resultMap>
  <!-- Oracle分页SQL片段 -->
  <sql id="pageHeader">
    select * from(select s_.*,rownum rn_ from(
  </sql>
  <sql id="pageRoot">
      ) s_ where rownum &lt;= ${'#{'}pager.limit}) where rn_ &gt; ${'#{'}pager.start}
  </sql>
  <!-- 查询操作的查询标准SQL片段 -->
  <sql id="Criteria_Where_Clause" >
    <where >
      <foreach collection="oredCriteria" item="criteria" separator="or" >
        <if test="criteria.valid" >
          <trim prefix="(" suffix=")" prefixOverrides="and" >
            <foreach collection="criteria.criteria" item="criterion" >
              <choose >
                <when test="criterion.noValue" >
                  and ${'${'}criterion.condition}
                </when>
                <when test="criterion.singleValue" >
                  and ${'${'}criterion.condition} ${'#{'}criterion.value}
                </when>
                <when test="criterion.betweenValue" >
                  and ${'${'}criterion.condition} ${'#{'}criterion.value} and ${'#{'}criterion.secondValue}
                </when>
                <when test="criterion.listValue" >
                  and ${'${'}criterion.condition}
                  <foreach collection="criterion.value" item="listItem" open="(" close=")" separator="," >
                    ${'#{'}listItem}
                  </foreach>
                </when>
              </choose>
            </foreach>
          </trim>
        </if>
      </foreach>
    </where>
  </sql>
  <!-- 更新操作的查询标准SQL片段 -->
  <sql id="Update_By_Criteria_Where_Clause" >
    <where >
      <foreach collection="criteria.oredCriteria" item="criteria" separator="or" >
        <if test="criteria.valid" >
          <trim prefix="(" suffix=")" prefixOverrides="and" >
            <foreach collection="criteria.criteria" item="criterion" >
              <choose >
                <when test="criterion.noValue" >
                  and ${'${'}criterion.condition}
                </when>
                <when test="criterion.singleValue" >
                  and ${'${'}criterion.condition} ${'#{'}criterion.value}
                </when>
                <when test="criterion.betweenValue" >
                  and ${'${'}criterion.condition} ${'#{'}criterion.value} and ${'#{'}criterion.secondValue}
                </when>
                <when test="criterion.listValue" >
                  and ${'${'}criterion.condition}
                  <foreach collection="criterion.value" item="listItem" open="(" close=")" separator="," >
                    ${'#{'}listItem}
                  </foreach>
                </when>
              </choose>
            </foreach>
          </trim>
        </if>
      </foreach>
    </where>
  </sql>
  <!-- 查询字段SQL片段 -->
  <sql id="Base_Column_List" >
  	<#list modelDefinition.properties as po>
  	${po.columnName}<#if (po_has_next)>,</#if>
    </#list>
  </sql>
  <!-- 根据查询标准获取列表数据-->
  <select id="getListByCriteria" resultMap="BaseResultMap" parameterType="com.pkusoft.framework.model.Criteria" >
  	<if test="pager != null" >
      <include refid="pageHeader" />
    </if> 
    select
    <if test="distinct" >
      distinct
    </if>
    <include refid="Base_Column_List" />
    from ${modelDefinition.tableName}
    <if test="_parameter != null" >
      <include refid="Criteria_Where_Clause" />
    </if>
    <if test="orderByClause != null" >
      order by ${'${'}orderByClause}
    </if>
    <if test="pager != null" >
      <include refid="pageRoot" />
    </if>
  </select>
  <!-- 根据主键获取对象信息 -->
  <select id="get" resultMap="BaseResultMap" parameterType="java.lang.Object" >
    select 
    <include refid="Base_Column_List" />
    from ${modelDefinition.tableName}
    where 
    <#list modelDefinition.keyProperties as po>
    <#if po_index == 0>
    ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    <#else>
    and ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    </#if>
    </#list>
  </select>
  <!-- 根据主键删除记录 -->
  <delete id="delete" parameterType="java.lang.Object" >
    delete from ${modelDefinition.tableName}
    where 
    <#list modelDefinition.keyProperties as po>
    <#if po_index == 0>
    ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    <#else>
    and ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    </#if>
    </#list>
  </delete>
  <delete id="deleteByCriteria" parameterType="com.pkusoft.framework.model.Criteria" >
    delete from ${modelDefinition.tableName}
    <if test="_parameter != null" >
      <include refid="Criteria_Where_Clause" />
    </if>
  </delete>
  <!-- 全字段插入 -->
  <insert id="insert" parameterType="${modelDefinition.packageName}.model.${modelDefinition.className}" >
    insert into ${modelDefinition.tableName} (
    <#list modelDefinition.properties as po>
    ${po.columnName}<#if (po_has_next)>,</#if>
    </#list>
      )
    values (
    <#list modelDefinition.properties as po>
    ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}<#if (po_has_next)>,</#if>
    </#list>
      )
  </insert>
  <!-- 选择值不为空的字段插入 -->
  <insert id="insertSelective" parameterType="${modelDefinition.packageName}.model.${modelDefinition.className}" >
    insert into ${modelDefinition.tableName}
    <trim prefix="(" suffix=")" suffixOverrides="," >
    <#list modelDefinition.properties as po>
      <if test="${po.propertyName} != null" >
	    ${po.columnName},
      </if>
    </#list>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
    <#list modelDefinition.properties as po>
      <if test="${po.propertyName} != null" >
	    ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>},
      </if>
    </#list>
    </trim>
  </insert>
  <!-- 根据查询标准获取记录数 -->
  <select id="getCountByCriteria" parameterType="com.pkusoft.framework.model.Criteria" resultType="java.lang.Integer" >
    select count(*) from ${modelDefinition.tableName}
    <if test="_parameter != null" >
      <include refid="Criteria_Where_Clause" />
    </if>
  </select>
  <!-- 根据查询标准更新 ，选择字段值不为空的更新 -->
  <update id="updateByCriteriaSelective" parameterType="map" >
    update ${modelDefinition.tableName}
    <set >
    <#list modelDefinition.properties as po>
      <if test="record.${po.propertyName} != null" >
	    ${po.columnName} = ${'#{'}record.${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>},
      </if>
    </#list>
    </set>
    <if test="_parameter != null" >
      <include refid="Update_By_Criteria_Where_Clause" />
    </if>
  </update>
  <!-- 根据查询标准全字段更新 -->
  <update id="updateByCriteria" parameterType="map" >
    update ${modelDefinition.tableName}
    set 
    <#list modelDefinition.properties as po>
		${po.columnName} = ${'#{'}record.${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}<#if (po_has_next)>,</#if>
    </#list>
    <if test="_parameter != null" >
      <include refid="Update_By_Criteria_Where_Clause" />
    </if>
  </update>
  <!-- 根据主键更新 ，选择字段值不为空的更新 -->
  <update id="updateSelective" parameterType="${modelDefinition.packageName}.model.${modelDefinition.className}" >
    update ${modelDefinition.tableName}
    <set >
    <#list modelDefinition.properties as po>
      <if test="${po.propertyName} != null" >
       ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>},
      </if>
    </#list>
    </set>
    where 
    <#list modelDefinition.keyProperties as po>
    <#if po_index == 0>
    ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    <#else>
    and ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    </#if>
    </#list>
  </update>
  <!-- 根据主键全字段更新 -->
  <update id="update" parameterType="${modelDefinition.packageName}.model.${modelDefinition.className}" >
    update ${modelDefinition.tableName}
    set 
    <#list modelDefinition.properties as po>
		${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}<#if (po_has_next)>,</#if>
    </#list>    
    where 
    <#list modelDefinition.keyProperties as po>
    <#if po_index == 0>
    ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    <#else>
    and ${po.columnName} = ${'#{'}${po.propertyName},jdbcType=<#if (po.propertyType == 'java.lang.String')>VARCHAR<#elseif (po.propertyType == 'java.util.Date')>TIMESTAMP<#else>DECIMAL</#if>}
    </#if>
    </#list>   
  </update> 
  
  <!-- 在以下扩展数据操作接口 -->
  
</mapper>