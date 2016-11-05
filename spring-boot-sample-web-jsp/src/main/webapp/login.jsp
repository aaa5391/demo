<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'login.jsp' starting page</title>

    <meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page"> -->
	<c:import url="/common/jsp/includeFile.jsp"></c:import>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%-- <link rel="stylesheet" type="text/css" href="<%=basePath%>common/loginStyle/css/simple-style.css"> --%>
	<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Josefin+Sans:400,700,700italic,600'>
	<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
	<link rel="stylesheet" href="<%=basePath%>common/loginStyle/css/style.css">
  </head>
  <body>
    	<div class="htmleaf-container">
		<div class="cont_principal">
			<header class="htmleaf-header">
				<!-- <h1>简洁时尚的用户登录界面设计效果 <span>The effect of the user login interface design</span></h1>
				<div class="htmleaf-links">
					<a class="htmleaf-icon icon-htmleaf-home-outline" href="" title="jQuery之家" target="_blank"><span> jQuery之家</span></a>
					<a class="htmleaf-icon icon-htmleaf-arrow-forward-outline" href="" title="返回下载页" target="_blank"><span> 返回下载页</span></a>
				</div> -->
			</header>
		  <div class="cont_join  ">
		    <div class="cont_letras">
		      <p>LET 'S</p>
		      <p>GET</p>
		      <p>LOST</p>
		    </div>

		    <div class="cont_form_join">
		      <h2>JOIN</h2>

		      <p>用户名:</p>    
		      <input type="text" class="input_text" />

		      <p>密　码:</p>    
		      <input type="text" class="input_text" />

		      <p>验证码:</p>    
		      <input type="password" class="input_text" />
		    </div>
		  
		    <div class="cont_join_form_finish">
		      <h2>Finish <i class="material-icons">&#xE5CA;</i></h2>  
		    </div>

		    <div class="cont_btn_join">
		      <a onclick="join_1()">JOIN</a>
		    </div>
		  </div>
		</div>
	</div>
	
	<script src="<%=basePath%>common/loginStyle/js/index.js"></script>
</html>
