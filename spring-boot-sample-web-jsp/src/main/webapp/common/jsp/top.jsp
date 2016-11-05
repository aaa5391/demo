<%@ page language="java" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = path + "/";
	String  USERID = "";
	if(request.getSession().getAttribute("USERID") != null){
		USERID = request.getSession().getAttribute("USERID").toString();
	}
	if(USERID.equals("")){
		response.sendRedirect(basePath + "login");
	}
%>

<script type="text/javascript">
	var pathNoSlash = '<%=path %>';
	var basePath = '<%=basePath %>';
</script>