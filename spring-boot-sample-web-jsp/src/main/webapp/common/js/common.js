function callAjax(url, type, param, func) {
	var loadi;
	if (param != null) {
		$.ajax({
			cache : true,
			type : type,
			url : url,
			async : false,
			data : param,
			dataType : "json",
			beforeSend : function(XMLHttpRequest) {
				loadi = layer.load('数据处理中…');
			},
			complete : function(XMLHttpRequest, textStatus) {
				layer.close(loadi);
			},
			error : function(request) {
				alert("数据库连接超时或发生错误，请联系管理员!");
			},
			success : func
		});
	} else {
		$.ajax({
			cache : true,
			type : type,
			url : url,
			async : true,
			dataType : "json",
			beforeSend : function(XMLHttpRequest) {
				loadi = layer.load('数据处理中…');
			},
			complete : function(XMLHttpRequest, textStatus) {
				layer.close(loadi);
			},
			error : function(request) {
				alert("数据库连接超时或发生错误，请联系管理员!");
			},
			success : func
		});
	}
};

function callAjaxByAsync(url, type, param,func) {
	var loadi;
	if (param != null) {
		$.ajax({
			cache : true,
			type : type,
			url : url,
			async : true,
			data : param,
			dataType : "json",
			beforeSend : function(XMLHttpRequest) {
				loadi = layer.load('数据处理中…');
			},
			complete : function(XMLHttpRequest, textStatus) {
				layer.close(loadi);
			},
			error : function(request) {
				alert("数据库连接超时或发生错误，请联系管理员!");
			},
			success : func
		});
	} else {
		$.ajax({
			cache : true,
			type : type,
			url : url,
			async : true,
			dataType : "json",
			beforeSend : function(XMLHttpRequest) {
				loadi = layer.load('数据处理中…');
			},
			complete : function(XMLHttpRequest, textStatus) {
				layer.close(loadi);
			},
			error : function(request) {
				alert("数据库连接超时或发生错误，请联系管理员!");
			},
			success : func
		});
	}
};
/**
 * 解析json数据，返回数组
 * @param data
 * @returns {Array}
 */

function parseJsonData(data)
{
	var items=new Array();
	if(data!=undefined)
		{
		$.each(data,function(index,item)
				{
			 items.push(item);
				});
		}
	
	return items;
}

/*
 * 格式化时间显示
 */
function dateFormat(date) {

	var year = "2000";
	var month = "01";
	var day = "01";
	if (date != null) {
		year = date.getFullYear();
		if ((date.getMonth() + 1) < 10)
			month = "0" + (date.getMonth() + 1);
		else
			month = date.getMonth() + 1;
		if (date.getDate() < 10)
			day = "0" + date.getDate();
		else
			day = date.getDate();
	}
	return year + "-" + month + "-" + day;
}

/*
 * 格式化时间显示
 */
function dateTimeFormat(date) {

	var year = "2000";
	var month = "01";
	var day = "01";
	var hour = "00";
	var minute = "00";
	var seconds = "00";
	if (date != null) {
		year = date.getFullYear();
		if ((date.getMonth() + 1) < 10){
			month = "0" + (date.getMonth() + 1);
		}
		else{
			month = date.getMonth() + 1;
		}
		if (date.getDate() < 10){
			day = "0" + date.getDate();
		}
		else{
			day = date.getDate();
		}
		if (date.getHours() < 10){
			hour = "0" + date.getHours();
		}
		else{
			hour = date.getHours();
		}
		if (date.getMinutes() < 10){
			minute = "0" + date.getMinutes();
		}
		else{
			minute = date.getMinutes();
		}
		if (date.getSeconds() < 10){
			seconds = "0" + date.getSeconds();
		}
		else{
			seconds = date.getSeconds();
		}

	}
	return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + seconds;
}

/*
 * 格式化时间显示
 */
function noSecondsFormat(date) {

	var year = "2000";
	var month = "01";
	var day = "01";
	var hour = "00";
	var minute = "00";
	if (date != null) {
		year = date.getFullYear();
		if ((date.getMonth() + 1) < 10){
			month = "0" + (date.getMonth() + 1);
		}
		else{
			month = date.getMonth() + 1;
		}
		if (date.getDate() < 10){
			day = "0" + date.getDate();
		}
		else{
			day = date.getDate();
		}
		if (date.getHours() < 10){
			hour = "0" + date.getHours();
		}
		else{
			hour = date.getHours();
		}
		if (date.getMinutes() < 10){
			minute = "0" + date.getMinutes();
		}
		else{
			minute = date.getMinutes();
		}
	}
	return year + "-" + month + "-" + day + " " + hour + ":" + minute;
}

/*
 * 时间显示
 */
function hourAndMinuteFormat(date) {

	var hour = "00";
	var minute = "00";
	if (date != null) {
		if (date.getHours() < 10){ 
			hour = "0" + date.getHours();
		}
		else{
			hour = date.getHours();
		}
		if (date.getMinutes() < 10){
			minute = "0" + date.getMinutes();
		}
		else{
			minute = date.getMinutes();
		}
	}
	return hour + ":" + minute;
}


var oLanguage = {
	"sProcessing" : "正在加载数据...",
	"sLengthMenu" : "显示_MENU_条 ",
	"sZeroRecords" : "没有您要搜索的内容",
	"sInfo" : "从_START_ 到 _END_ 条记录——总记录数为 _TOTAL_ 条",
	"sInfoEmpty" : "记录数为0",
	"sInfoFiltered" : "(全部记录数 _MAX_  条)",
	"sInfoPostFix" : "",
	"sSearch" : "搜索",
	"sUrl" : "",
	"oPaginate" : {
		"sFirst" : "第一页",
		"sPrevious" : " 上一页 ",
		"sNext" : " 下一页 ",
		"sLast" : " 最后一页 "
	}
}

function createDataTables(tableId, sAjaxSource, columns, retrieveData){
	$("#goodsTable").dataTable({
		"language" : oLanguage,
		"JQueryUI": true,
		"paginate" : true,// 分页按钮
		"filter" : false,// 搜索栏
		"lengthChange" : false,// 每行显示记录数
		"displayLength" : 10,// 每页显示行数
		"sort" : false,// 排序
		//"aLengthMenu": [[50,100,500,1000,10000], [50,100,500,1000,10000]],//定义每页显示数据数量
		//"iScrollLoadGap":400,//用于指定当DataTable设置为滚动时，最多可以一屏显示多少条数据
		//"aaSorting": [[4, "desc"]],
		"info" : true,// Showing 1 to 10 of 23 entries 总记录数没也显示多少等信息
		"width":true,
		//"sScrollY": "62%",
        //"sScrollX": "210%",
        "scrollCollapse": true,
		"paginationType" : "full_numbers", // 分页，一共两种样式 另一种为two_button // 是datatables默认
		"processing" : true,
		"serverSide" : true,
		"destroy": true,
		"sortCellsTop": true,	
        "ajaxSource": sAjaxSource, 
        "columns": [columns],
        "serverData" : retrieveData
	});
}