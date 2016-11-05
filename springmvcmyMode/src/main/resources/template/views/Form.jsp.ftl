<#assign modelName="${modelDefinition.packageName?substring(modelDefinition.packageName?last_index_of('.')+1)?cap_first}"> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增${modelDefinition.modelDesc}</title>
<script type="text/javascript">
    //关闭本窗口
    function doClose(){
        ownerDialog.close();
    }

    //保存
    function doSave${modelDefinition.className?cap_first}(){
        var frm = Pku.getExt("frmPost");
        if(frm.isValid()){
            frm.submit();
        }
    }

    //反馈
    function doResultFrmPost(form, action){
        if(!action.response) {
            return;
        }
        var objRet = toJson(action.response.responseText);
        if( objRet.success){
            ownerDialog.openerWindow["doQuery${modelDefinition.className?cap_first}"]();
            Dialog.alert("操作成功.",function(){
                //关闭表单窗口
                doClose();
            });
        }else{
            Dialog.alert(objRet.message);
        }
    }
</script>
</head>
<body>
    <form id="frmPost" name="frmPost" url="${'$'}{ctx}/${modelName?uncap_first}/${modelDefinition.className?uncap_first}Save" method="post" onExtSuccess="doResultFrmPost(true)" onExtFailure="doResultFrmPost(false)">
        <div class="frmPostEdit">
            <#list modelDefinition.properties as po>
            <div class="row">
                <label class="label"><#if (po.nullable == 'N')><span class="must"> * </span></#if>${po.comment}:</label>
                <input id="frmPost${po.propertyName?cap_first}" name="${po.propertyName}" type="text"<#if (po.propertyType == 'java.lang.Long')> kind="int"<#elseif (po.propertyType == 'java.lang.String')> maxLength="${po.charLength}"</#if><#if (po.nullable == 'N')> must="true"</#if> value="${'$'}{${modelDefinition.className?uncap_first}.${po.propertyName}}"/>
            </div>
            </#list>
        </div>
    </form>
</body>
</html>