<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<html>
<head>


<title>登录</title>
<script type="text/javascript">

	require(["jquery", "datepicker","select2","bootgrid" ], function() {
				inti();
            } );
            
           function selectsearch(){
           $("#datagrid_1").bootgrid("destroy");//先移除插件
            inti();//重新查询
    		}
    		function Resetsearch(){//清除
      			 $("#exampleInputName2").val("");
        	    $("#exampleInputEmail2").val("");
    		}
    		
		function inti(){//查询
			 var exampleInputName2 = $("#exampleInputName2").val();
             var exampleInputEmail2 = $("#exampleInputEmail2").val();
                    var $grid = jQuery( "#datagrid_1" );
                
               		$grid.bootgrid({
                    ajax: true,
					    post: function (request)
					    {
					        return {
					            nane: exampleInputName2,
					            ph:exampleInputEmail2,
					        };
					    },
                    url: "../Ccompareccicmvc/bootgridpage",
                    padding: 4,
                    navigation: 3,
                    // 让列可选取（生成checkbox）
                    selection: true,
                    multiSelect: true,
                    // 点击该列时，被选取（该行的checkbox 被选中）
                    rowSelect: true,
                    // 每页多少条记录
                    rowCount: [10 ,5, 15, 20, 30, 40, 50],

           formatters: {
				"_operation": function (column, row) { //commands 参考上面 data-formatter="commands"  与前面一致即可
				return "<a href='www.baidu.com'>"+row.rybh+"</a>";
				}
			}

                }).on("selected.rs.jquery.bootgrid", function(e, list) {
                    var rowIds = [];
                    for (var i = 0; i < list.length; i++) {
                    	
                        rowIds.push(list[i].rybh);
                    }
                   // alert("选择: " + rowIds.join(","));
                }).on("deselected.rs.jquery.bootgrid", function(e, list) {
                    var rowIds = [];
                    for (var i = 0; i < list.length; i++) {
                        rowIds.push(list[i].rybh);
                    }
                   // alert("取消选择: " + rowIds.join(","));
                });

                $grid.colResizable( { partialRefresh: true } );
			}

</script>

</head>

<body>


	<div style="width: 80%;margin-left:9%;margin-top: 5%">
	 <article class="article">
       
        <main>

		<form class="form-inline">
			<div class="form-group" style="margin-right: 2em;">
				<label for="exampleInputName2">姓名：</label> <input type="text"
					class="form-control" id="exampleInputName2">
			</div>
			<div class="form-group" style="margin-right: 2em;">
				<label for="exampleInputEmail2">身份证号：</label> <input type="email"
					class="form-control" id="exampleInputEmail2">
			</div>
			<button type="button" id="confirmAddBtn" onclick="selectsearch()" class="btn btn-info "  >
				<i class="fa fa-search"></i>  搜索
			</button>
			<button type="button" onclick="Resetsearch()" class="btn btn-success "  >
				<i class="fa fa-recycle"  ></i>  清除条件
			</button>
		</form>

		<table id="datagrid_1" class="table table-hover table-striped table-bordered">
                <thead>
                <tr>
                    <th data-column-id="xm" data-identifier="true" >姓名</th>
                    <!-- data-type="numeric"：数据类型为数字，用于排序，默认为字符串 -->
                    <th data-column-id="rybh"     data-width="200">公民身份证号码</th>
                    <th data-column-id="csrq"    data-order="desc">时间</th>
                    <th data-column-id="hjdxz"   data-width="300"  data-sortable="false"  >地址</th>
                    <th data-column-id="hjdqh"   data-sortable="false"  >行政地编码</th>
                    <th data-sortable="false"     data-column-id="_operation"  data-width="200" data-formatter="_operation" data-column-title="操作">
                          <a href="javascript:void(0);" class="js--viewSysDept" data-row="deptId,deptName">详情</a>&nbsp;&nbsp;
                          <a href="javascript:void(0);" class="js--editSysDept" data-row="deptId,deptName">编辑</a>&nbsp;&nbsp;
                          <a href="javascript:void(0);" class="js--deleteSysDept" data-row="deptId">删除</a>
                   </th>
                </tr>
                </thead>
            </table>
            <script>
              
            </script>
        </main>
        </article>
        </div>
</body>
</html>