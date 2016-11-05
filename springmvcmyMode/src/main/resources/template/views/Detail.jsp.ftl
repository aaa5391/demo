<#assign modelName="${modelDefinition.packageName?substring(modelDefinition.packageName?last_index_of('.')+1)?cap_first}"> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${modelDefinition.modelDesc}详细信息</title>
<script type="text/javascript">

</script>
</head>
<body>
    <table class="detailTable">
        <#list modelDefinition.properties as po>
        <#if po_index%2 == 0><tr>
            <td class="txtTitle">${po.comment}：</td>
            <td class="txtValue">${'$'}{${modelDefinition.className?uncap_first}.${po.propertyName}}</td>
<#if !po_has_next>            <td class="txtTitle">&nbsp;</td>
            <td class="txtValue">&nbsp;</td>
        </tr></#if><#else>    <td class="txtTitle">${po.comment}：</td>
            <td class="txtValue">${'$'}{${modelDefinition.className?uncap_first}.${po.propertyName}}</td>
        </tr>
        </#if>
        </#list>
    </table>
</body>
</html>