<#assign modelName="${modelDefinition.packageName?substring(modelDefinition.packageName?last_index_of('.')+1)?cap_first}"> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${modelDefinition.modelDesc}列表</title>
<script type="text/javascript">
    //链接资源
    var UUR = {
        // 新增页面
        '${modelDefinition.className?uncap_first}Add':'${'$'}{ctx}/${modelName?uncap_first}/${modelDefinition.className?uncap_first}Form?random=' + Math.random(),
        // 修改页面
        '${modelDefinition.className?uncap_first}Update':'${'$'}{ctx}/${modelName?uncap_first}/${modelDefinition.className?uncap_first}Form?random=' + Math.random(),
        // 删除链接
        '${modelDefinition.className?uncap_first}Delete' : '${'$'}{ctx}/${modelName?uncap_first}/${modelDefinition.className?uncap_first}Delete?' + Math.random(),
        // 详情页面
        '${modelDefinition.className?uncap_first}Detail' : '${'$'}{ctx}/${modelName?uncap_first}/${modelDefinition.className?uncap_first}Detail?' + Math.random()
    };
        
    //新增${modelDefinition.modelDesc}
    function doAdd${modelDefinition.className?cap_first}(){
        var diag = new Dialog();
        diag.Width =440;
        diag.Height = 380;
        diag.Title = "新增${modelDefinition.modelDesc}";
        diag.URL = UUR.${modelDefinition.className?uncap_first}Add;
        diag.OKEvent = function(){
            diag.innerWin["doSave${modelDefinition.className?cap_first}"]();
        }
        diag.show();
    }

    //修改${modelDefinition.modelDesc}
    function doUpdate${modelDefinition.className?cap_first}(){
        var sel = Pku.getExt("${modelDefinition.className?uncap_first}Grid").getSelectionModel().getSelections();
        if(sel.length == 1){ 
            var data = sel[0].data;
            update${modelDefinition.className?cap_first}(data);
        }else{
            Dialog.alert("请选中一条记录！");
        }
    }

    // 执行修改${modelDefinition.modelDesc}
    function update${modelDefinition.className?cap_first}(data){
        var diag = new Dialog();
        diag.Width =440;
        diag.Height = 380;
        diag.Title = "修改${modelDefinition.modelDesc}";
        diag.URL = UUR.${modelDefinition.className?uncap_first}Update<#list modelDefinition.keyProperties as po> + "&${po.propertyName}=" + data["${po.propertyName}"]</#list>;
        diag.OKEvent = function(){
            diag.innerWin["doSave${modelDefinition.className?cap_first}"]();
        }
        diag.show();
    }

    //删除${modelDefinition.modelDesc}
    function doDelete${modelDefinition.className?cap_first}(btn){
        var sel = Pku.getExt("${modelDefinition.className?uncap_first}Grid").getSelectionModel().getSelections();
        if(sel.length > 0){
            Dialog.confirm("确认删除选中记录？", function(){
                var urlParams = "";
                <#if (modelDefinition.unionKey)>
                for(var i=0;i<sel.length;i++){
                    if(i != 0){
                        urlParams += ',';
                    }
                    urlParams += '{<#list modelDefinition.keyProperties as po><#if (po_index != 0)>,</#if>"${po.propertyName}":<#if (po.propertyType == 'java.lang.String')>"</#if>' + sel[i].get("${po.propertyName}") + '<#if (po.propertyType == 'java.lang.String')>"</#if></#list>}';
                }
                urlParams = "[" + urlParams +"]";
                btn.disable();
                Pku.Common.ajax(UUR.${modelDefinition.className?uncap_first}Delete,{txtPost: urlParams},function(bln,response,o){
                <#else>
                for(var i=0;i<sel.length;i++){
                    if(i != 0){
                    }
                    urlParams += ("&${modelDefinition.keyPropertyName}=" + sel[i].get("${modelDefinition.keyPropertyName}"));
                }
                btn.disable();
                Pku.Common.ajax(UUR.${modelDefinition.className?uncap_first}Delete + urlParams,{},function(bln,response,o){
                </#if>
                    btn.enable();
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        Dialog.alert("删除成功！");
                        doQuery${modelDefinition.className?cap_first}();
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }else{
            Dialog.alert("请选中记录");
        }
    }

    //查询${modelDefinition.modelDesc} 
    function doQuery${modelDefinition.className?cap_first}(){
        //模糊查询
        if(Pku.getDom("mainQryFieldCheck").getAttribute("checked")){
            Pku.getDom("mainQryField").setAttribute("operation","like");
        }else{
            //准确查询
            Pku.getDom("mainQryField").setAttribute("operation","=");
        }
        var txtQuery = Pku.Common.getQueryJson("frmQuery");
        Pku.getExt("${modelDefinition.className?uncap_first}Grid").store.baseParams.txtQuery = txtQuery;
        Pku.getExt("${modelDefinition.className?uncap_first}Grid").store.load();
    }

    //查看详情
    function doDetail${modelDefinition.className?cap_first}(){
        var sel = Pku.getExt("${modelDefinition.className?uncap_first}Grid").getSelectionModel().getSelections();
        if(sel.length == 1){ 
            var data = sel[0].data;
            var diag = new Dialog();
            diag.Width = 440;
            diag.Height = 380;
            diag.Title = "查看${modelDefinition.modelDesc}";
            diag.URL = UUR.${modelDefinition.className?uncap_first}Detail<#list modelDefinition.keyProperties as po> + "&${po.propertyName}=" + data["${po.propertyName}"]</#list>;
            diag.show();
        }else{
            Dialog.alert("请选中一条记录！");
        }
    }

    //双击行
    function onRowdblclick${modelDefinition.className?cap_first}(data){
        update${modelDefinition.className?cap_first}(data);
    }

    //初始化加载
    Pku.onReady(function(){
        doQuery${modelDefinition.className?cap_first}();
    });
</script>
</head>
<body>
    <div id="${modelDefinition.className?uncap_first}Grid" title="${modelDefinition.modelDesc}列表" iconCls="icon-window" onExtRowdblclick="onRowdblclick${modelDefinition.className?cap_first}()" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false">
        <div xtype="tbar">
            <div text="新增" iconCls="icon-add" onExtClick="doAdd${modelDefinition.className?cap_first}()" ></div>
            <div text="-"></div>
            <div text="修改" iconCls="icon-update" onExtClick="doUpdate${modelDefinition.className?cap_first}()"></div>
            <div text="-"></div>
            <div text="删除" iconCls="icon-delete" onExtClick="doDelete${modelDefinition.className?cap_first}()"></div>
            <div text="-"></div>
            <div text="查看详情" iconCls="icon-detail" onExtClick="doDetail${modelDefinition.className?cap_first}()"></div>
            <div text="->"></div>
            <form id="frmQuery" name="frmQuery" method="post">
                <table>
                    <tr>
                        <td>名称：</td>
                        <td><input id="mainQryField" type="text" fieldname="XXXXXXXXXX" /></td>
                        <td>&nbsp;&nbsp;模糊：</td>
                        <td><input id="mainQryFieldCheck" type="checkbox"></td>
                    </tr>
                </table>
            </form>
            <div text="查询" iconCls="icon-query" onExtClick="doQuery${modelDefinition.className?cap_first}()"></div>
        </div>
        <div id="${modelDefinition.className?uncap_first}Store" xtype="store" url="${'$'}{ctx}/${modelName?uncap_first}/${modelDefinition.className?uncap_first}ListData" autoLoad="false">
            <div xtype="jsonreader">
                <#list modelDefinition.properties as po>
                <div name="${po.propertyName}"></div>
                </#list>
            </div>
        </div>
        <div xtype="colmodel">
            <div type="checkbox"></div>
            <#list modelDefinition.properties as po>
            <div name="${po.propertyName}"></div>
            <div header="${po.comment}" width="100" sortable="true" dataIndex="${po.propertyName}"></div>
            </#list>
        </div>
     </div>
</body>
</html>