<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	  <link rel="stylesheet" type="text/css" href="index.css">
  <script src="${pageContext.request.contextPath}/static/js/jquery-1.8.2.js"></script>
     
    <title>怎么解析json里面的数据显示到页面</title>   
   <script type="text/javascript">
 
 	 jiex2()
   
     //例子传入任何sql可以把数据投射到页面上去
   function jiex2(){  

	   $.get("http://localhost:8080/springmvcmyMode/Ccompareccicmvc/select",{"sql":"ss"},function(data){
	  
	 	var values=data.list;//得到list里面的信息
	 	
	 	 $("#myTaskTable_tbody").html(""); 	 
        for(var i=0;i<values.length;i++){
	          $.each(values[i],function(key,value){//以键值对的形式把数据显示到页面上 
	            $("#div").append(key+"----"+value+"<br/><hr/>");
	        }); 
        }
       
        $("#myTaskTable_tbody").html(""); 	 
       /*  for(var i=0;i<values.length;i++){//迭代list里面的信息
        if(values[i].cadate==undefined){
        values[i].cadate="";
        }
			$("#myTaskTable_tbody").append("<tr><td>"+values[i].cadate+"</td>"+"<td>"+values[i].content+"</td><td>"+values[i].userid+"</td><td>" +values[i].vocabularyid+"</td>"+"</r>");
		} */
		
		 for(var i=0;i<values.length;i++){//迭代list里面的信息
          if(values[i].rksj==null){
        values[i].rksj="";
        }
			$("#myTaskTable_tbody").append("<tr><td>"+values[i].c6+"</td>"+"<td>"+values[i].c2+"</td><td>"+values[i].c14+"</td><td>" +values[i].rksj+"</td>"+"</r>");
		} 
		
		
		
	  },"json"); 
   }
   
  
 
	 </script>

  </head>
  
  <body>
   <button onclick="jiexi()">关于带json里面的数据解析到p再到div里面</button>
     <button onclick="jiex2()">传入任何sql语句以键值对的形式把数据显示到页面上</button>
   <div id="div">
   </div>
    <div id="div2">
   </div>
  <table class="biaoge"  align="center"   width="900px">
	  <thead id="myTaskTable_thead">
	   </thead>
	   <tbody id="myTaskTable_tbody">
		</tbody>
  </table>
 <p id="p1"></p>
  <p id="p2"></p>
  </body>
</html>
