<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<%@ include file="/common/jsp/includeFile.jsp"%>
<title>后台管理</title>
<style>
.td-label{float:left}
</style>
</head>
<body>
	<div id="wrapper" class="page-wrap">
		<div id="page-wrapper">
			<div class="row">
				<div class="col-12">
					<div class="panel panel-default">
						<div class="panel-heading">账号列表</div>
						<div class="panel-body">
							<div class="row marbot10 ">
								<form class="form-horizontal" role="form">
									<div class="col-md-12 border-bottom">
										<div class="innerAll  margin-bottom-none padding-top-none">
											<div class="col-md-2">
												<div class="form-group">
													<label class="control-label col-md-5">表名：</label>
													<div class="col-md-7">
														<input type="text" id="tableName" class="form-control"/>
													</div>
												</div>
											</div>
											<div class="col-md-2">
												<div class="form-group">
													<label class="control-label col-md-5">创建时间：</label>
													<div class="col-md-7">
														<select class="form-control" id="category" name="category"> 
															<%-- <shiro:hasRole name="admin"><option value ="">全部</option></shiro:hasRole> --%>
															<option value ="">全部</option>
												    	</select>
													</div>
												</div>
											</div>
											<div class="col-md-2 text-center">
												<button id="searchBtn" type="button" class="btn btn-primary" >
													<i class="fa fa-search"></i> 搜索
												</button>
											</div>
										</div>
									</div>
									<div class="clearfix"></div>
								</form>
							</div>
							<div class="col-12 dataTable_wrapper">
								<table id="dataTable"
									class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th class="text-center">序号</th>
											<th class="text-center">表名</th>
											<th class="text-center">创建时间</th>
											<th class="text-center">注释</th>
											<th class="text-center">操作</th>
										</tr>
									</thead>
									<tbody></tbody>
								</table>
							</div>
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
			</div>
		</div>
		<!-- /#page-wrapper -->
	</div>
	
	<!-- /#wrapper -->

</body>
<script type="text/javascript" src="<%=basePath%>js/tables.js"></script>
</html>