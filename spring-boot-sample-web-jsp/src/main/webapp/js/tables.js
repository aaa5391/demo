var dataTable;
$(document).ready(function() {
	
	$("#searchBtn").on('click',function(){
		dataTable.ajax.reload();
	});
	dataTable = $("#dataTable").DataTable({
		"processing": true,
        "serverSide": true,
        "searching":false,
        "lengthMenu": [10,15,20,25],
        "fnDrawCallback": function(){
        	var api = this.api();
        	var startIndex= api.context[0]._iDisplayStart;//获取到本页开始的条数
        	api.column(0).nodes().each(function(cell, i) {
        		cell.innerHTML = startIndex + i + 1;
    		}); 
  		},
  		"ajax":{
			"url":basePath + "tables",
			"type":"get",
			"contentType": "application/json",
			"data": function ( d ) {
				var pageNo = Math.ceil(d.start/d.length)+1;
				
				var paramRequest = "pageNum=" + pageNo + "&pageSize="+d.length+"&name="+$("#name").val();
				
				return paramRequest;
			 },
			 "dataFilter": function(data){
		            var result = jQuery.parseJSON(data);
					var json = new Object();
		            json.recordsTotal = result.data.pageNum;
		            json.recordsFiltered = result.data.total;
		            json.data = result.data.list;
		            return JSON.stringify( json ); // return JSON string
		     }
		},
	    columns: [
	              { data: null},
	              { data: 'tableName'},
	              { data: 'createTime'},
	              { data: 'tableComment'},
	              { data: 'tableName',
	            	  render:function(data, type, row){
	            		  var html = "";
	            		  html += '<button type="button" name="genTableBtn" tableName="' + data + '" class="btn btn-info ' + 
	            		  	'title="生成代码">生成代码</button> ';
	            		  html += '<button type="button" name="deleteBtn" tableName="' + data + '" class="btn btn-danger marright2 ' +
							'title="删除表">删除表</button>';
	            		  return html;
	            	  }
	              }
	          ]
	});
	
	$('body').on('click', 'button[name="genTableBtn"]',function(){
		var tableName = $(this).attr("tableName");
		$.ajax({
			url: basePath + "genCode",
			type:"post",
			data:{"tableName":tableName},
			dataType:"json",
			success:function(data){
				if(data.result==1){
					layer.alert("生成代码成功！");
				}else{
					layer.alert("生成代码失败！");
				}
			}
		});
	});
});
