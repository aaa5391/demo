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
	.zone{height:6rem;line-height:6rem;text-align:center;width:14rem;float:left;border:1px solid #efefef;margin:1rem 1rem 0 0;}
	.zone div{display:inline-block;margin:auto;margin-top:1rem;}
</style>
</head>
<body>
	<div id="wrapper" class="page-wrap">
		<div id="page-wrapper">
			<div class="row">
				<div class="col-12">
					<div class="panel-body">
						<form id="saveForm">
							<div class="row marbot10 martop10">
								<div class="col-md-10">
									<div class="row marbot10 martop10">
										<div class="col-md-12">
											<div class="innerAll  margin-bottom-none padding-top-none">
												<div class="col-md-3">
													<div class="form-group">
														<label class="control-label col-md-4">用户名：</label>
														<div class="col-md-8">
															<input type="text" class="form-control" name="username" id="username">
														</div>
													</div>
												</div>
												<div class="col-md-3">
													<div class="form-group">
														<label class="control-label col-md-4">密码：</label>
														<div class="col-md-8">
															<input type="text" class="form-control" name="password" id="username">
														</div>
													</div>
												</div>
												<div class="col-md-3">
													<div class="form-group">
														<label class="control-label col-md-4">表名：</label>
														<div class="col-md-8">
															<input type="text" class="form-control" name="tableName" id="tableName">
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</form>
							<div class="zone" id="generate">
								<div>
									<p>生成代码</p>
								</div>
							</div>
						</div>
						<!-- /.panel-body -->
					<!-- /.panel -->
				</div>
			</div>
		</div>
		<!-- /#page-wrapper -->
	</div>
	
	<!-- /#wrapper -->
</body>
<script type="text/javascript" src="<%=basePath%>common/js/jquery.form.js"></script>
<script type="text/javascript" src="<%=basePath%>js/test.js"></script>
</html>
