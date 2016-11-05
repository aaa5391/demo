<%@ page language="java" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = path + "/";
	String  USERID = "";
	/* if(request.getSession().getAttribute("CurrentUserID") != null){
		USERID = request.getSession().getAttribute("CurrentUserID").toString();
	}
	if(USERID.equals("")){
		response.sendRedirect(basePath + "adminUser/initLogin");
	} */
%>

<script type="text/javascript">
	var pathNoSlash = '<%=path %>';
	var basePath = '<%=basePath %>';
</script>
<link rel="stylesheet" href="<%=basePath %>common/js/bootstrap/css/bootstrap.css" />
<link rel="stylesheet" href="<%=basePath %>common/js/metisMenu/dist/metisMenu.min.css" />
<link rel="stylesheet" href="<%=basePath %>common/js/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" />
<link rel="stylesheet" href="<%=basePath %>common/js/datatables-responsive/css/dataTables.responsive.css" />
<link rel="stylesheet" href="<%=basePath %>common/js/datatables/media/css/jquery.dataTables.css" />
<link rel="stylesheet" href="<%=basePath %>common/js/font-awesome/css/font-awesome.min.css" />
<link rel="stylesheet" href="<%=basePath %>common/css/sb-admin-2.css" />
<link rel="stylesheet" href="<%=basePath %>common/js/morrisjs/morris.css" />
<link rel="stylesheet" href="<%=basePath %>common/js/zTree/css/zTreeStyle.css" type="text/css">
<link rel="stylesheet" href="<%=basePath %>common/css/common.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath %>common/js/bootstrap-select/bootstrap-select.css">
<link rel="stylesheet" type="text/css" href="<%=basePath %>common/js/bootstrap-select/bootstrap-select.min.css">

<script type="text/javascript" src="<%=basePath %>common/js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/metisMenu/dist/metisMenu.min.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/datatables/media/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/raphael/raphael-min.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/morrisjs/morris.min.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/layer/layer.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/common.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/My97DatePicker/WdatePicker.js"></script>

<script src="<%=basePath %>common/js/zTree/jquery.ztree.core-3.5.js"></script>
<script src="<%=basePath %>common/js/zTree/jquery.ztree.excheck-3.5.js"></script>
<script src="<%=basePath %>common/js/highchart/highcharts.js"></script>
<script src="<%=basePath %>common/js/highchart/data.js"></script>
<script src="<%=basePath %>common/js/highchart/highcharts-3d.js"></script>
<script src="<%=basePath %>common/js/highchart/exporting.js"></script>
<script src="<%=basePath %>common/js/highchart/drilldown.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/bootstrap-select/bootstrap-select.js"></script>
<script type="text/javascript" src="<%=basePath %>common/js/bootstrap-select/bootstrap-select.min.js"></script>

<%-- <link rel="stylesheet" type="text/css" href="<%=basePath%>common/js/wysi/src/bootstrap-wysihtml5.css"></link> --%>
<link rel="stylesheet" type="text/css" href="<%=basePath%>common/js/wysi/src/bootstrap3-wysihtml5.min.css"></link>
<%-- <script src="<%=basePath%>common/js/wysi/lib/js/wysihtml5-0.3.0.js"></script>
<script src="<%=basePath%>common/js/wysi/src/bootstrap-wysihtml5.js"></script> --%>
<script src="<%=basePath%>common/js/wysi/src/bootstrap3-wysihtml5.all.min.js"></script>


<script type="text/javascript" src="http://validform.rjboy.cn/Validform/v5.1/Validform_v5.1_min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/additional-methods.min.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>

<script>
  $.extend( $.fn.dataTable.defaults, {
	  "language": {
	       "sProcessing": "处理中...",
	       "sLengthMenu": "显示 _MENU_ 项结果",
	       "sZeroRecords": "没有匹配结果",
	       "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
	       "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
	       "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
	       "sInfoPostFix": "",
	       "sSearch": "搜索:",
	       "sUrl": "",
	       "sEmptyTable": "表中数据为空",
	       "sLoadingRecords": "载入中...",
	       "sInfoThousands": ",",
	       "oPaginate": {
	           "sFirst": "首页",
	           "sPrevious": "上页",
	           "sNext": "下页",
	           "sLast": "末页"
	       },
	       "oAria": {
	           "sSortAscending": ": 以升序排列此列",
	           "sSortDescending": ": 以降序排列此列"
	       }
	   },
	   "processing": true,
       "serverSide": true,
       "searching":false,
       "ordering": false,
	   "pageLength": 20,
	   "lengthMenu": [20,30,40,50]
	} );
</script>