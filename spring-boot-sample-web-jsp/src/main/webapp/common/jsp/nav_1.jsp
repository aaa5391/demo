<%@ page language="java" pageEncoding="UTF-8"%>

<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation"
	style="margin-bottom: 0">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="#">康之旅客服后台管理</a>
	</div>
	<!-- /.navbar-header -->

	<ul class="nav navbar-top-links navbar-right">
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-tasks">
				<li><a href="#">
						<div>
							<p>
								<strong>任务1</strong> <span class="pull-right text-muted">40%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-success"
									role="progressbar" aria-valuenow="40" aria-valuemin="0"
									aria-valuemax="100" style="width: 40%">
									<span class="sr-only">40% Complete (success)</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<p>
								<strong>Task 2</strong> <span class="pull-right text-muted">20%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-info" role="progressbar"
									aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
									style="width: 20%">
									<span class="sr-only">20% Complete</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<p>
								<strong>Task 3</strong> <span class="pull-right text-muted">60%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-warning"
									role="progressbar" aria-valuenow="60" aria-valuemin="0"
									aria-valuemax="100" style="width: 60%">
									<span class="sr-only">60% Complete (warning)</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<p>
								<strong>Task 4</strong> <span class="pull-right text-muted">80%
									Complete</span>
							</p>
							<div class="progress progress-striped active">
								<div class="progress-bar progress-bar-danger" role="progressbar"
									aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
									style="width: 80%">
									<span class="sr-only">80% Complete (danger)</span>
								</div>
							</div>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a class="text-center" href="#"> <strong>See
							All Tasks</strong> <i class="fa fa-angle-right"></i>
				</a></li>
			</ul> <!-- /.dropdown-tasks --></li>
		<!-- /.dropdown -->
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-alerts">
				<li><a href="#">
						<div>
							<i class="fa fa-comment fa-fw"></i> New Comment <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-twitter fa-fw"></i> 3 New Followers <span
								class="pull-right text-muted small">12 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-envelope fa-fw"></i> Message Sent <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-tasks fa-fw"></i> New Task <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a href="#">
						<div>
							<i class="fa fa-upload fa-fw"></i> Server Rebooted <span
								class="pull-right text-muted small">4 minutes ago</span>
						</div>
				</a></li>
				<li class="divider"></li>
				<li><a class="text-center" href="#"> <strong>See
							All Alerts</strong> <i class="fa fa-angle-right"></i>
				</a></li>
			</ul> <!-- /.dropdown-alerts --></li>
		<!-- /.dropdown -->
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
				<i class="fa fa-caret-down"></i>
		</a>
			<ul class="dropdown-menu dropdown-user">
				<li><a href="#"><i class="fa fa-user fa-fw"></i> User
						Profile</a></li>
				<li><a href="<%=basePath%>adminUser/updatePassword"><i class="fa fa-gear fa-fw"></i> 修改密码</a></li>
				<li class="divider"></li>
				<li><a href="<%=basePath%>adminUser/logout"><i class="fa fa-sign-out fa-fw"></i>
						Logout</a></li>
			</ul> <!-- /.dropdown-user --></li>
		<!-- /.dropdown -->
	</ul>
	<!-- /.navbar-top-links -->

	<div class="navbar-default sidebar" role="navigation">
		<div class="sidebar-nav navbar-collapse">
			<ul class="nav" id="side-menu">
				<!-- <li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="搜索...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>64
								</span>
							</div> /input-group
						</li> -->
				<li><a href="<%=basePath%>indexController/index"><i
						class="fa fa-dashboard fa-fw"></i> 首页</a>
				</li>
				<li><a href="#"><i class="fa fa-train fa-fw"></i> 列车管理<span
						class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="<%=basePath%>train/init">列车管理</a></li>
						<li><a href="<%=basePath%>trainGoods/init">列车商品管理</a></li>
						<li><a href="<%=basePath%>trainGoods/initBatch">批量商品导入</a></li>
						<li><a href="<%=basePath%>tsDuty/init">餐服长当班管理</a></li>
						<li><a href="<%=basePath%>train/trainNumberInit">往返车次管理 </a></li>
					</ul>
				</li>
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i> 订单管理<span
						class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="<%=basePath%>order/orderInit">订单列表</a></li>
						<li><a href="<%=basePath%>order/initRealOrderInfo" target="_blank">未完成订单列表</a></li>
						<li><a href="<%=basePath%>order/shipInit">发货单列表</a></li>
						<li><a href="<%=basePath%>order/backInit">退货单列表</a></li>
					</ul>
				</li>
				<li>
					<a href="#">
						<i class="fa fa-sitemap fa-fw"></i> App计划管理<span class="fa arrow"></span>
					</a>
					<ul class="nav nav-second-level">
						<li>
							<a href="<%=basePath %>trainGoods/initAlterTeam">计划单管理</a>
						</li>
					</ul>
				</li>
				<li><a href="#"><i class="fa fa-wrench fa-fw"></i> 报表统计<span
						class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
					    <li><a href="<%=basePath %>finance/initFinance">缴款清单</a></li>
					    <li><a href="<%=basePath %>finance/initSale">销售分析单</a></li>
						<li><a href="<%=basePath %>finance/initPlan">APP计划单</a></li>
						<li><a href="<%=basePath %>finance/initMonthAccount">BJTS月收款汇总表</a></li>
						<li><a href="<%=basePath %>finance/initMonthSale">BJTS销售汇总表</a></li>
						<li><a href="<%=basePath %>cdFinance/initSalesDetails">CD销售明细</a></li>
						<li><a href="<%=basePath %>cdFinance/initSalesListSummary">CD销售清单汇总</a></li>
					</ul>
				</li>
				<li><a href="#"><i class="fa fa-files-o fa-fw"></i>高铁商城<span
						class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="<%=basePath %>gOrder/gOrderInit">订单管理</a></li>
						<li><a href="<%=basePath %>gOrder/gOrderTotalInit">订单统计</a></li>
<%-- 						<li><a href="<%=basePath %>gOrder/gOrderTotalInit">发红包</a></li> --%>
					</ul>
				<li>
				
			</ul>
		</div>
		<!-- /.sidebar-collapse -->
	</div>
	<!-- /.navbar-static-side -->
</nav>
