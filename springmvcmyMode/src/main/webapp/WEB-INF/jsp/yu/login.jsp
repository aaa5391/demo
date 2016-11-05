<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
  <script type="text/javascript">
   
   
  </script>

  </head>
  
 <body>

  

<div class="container" style="width: 350px;">



    <div class="row">
   

                <!-- Tab panes -->
                <div class="tab-content">
                    <div class="tab-pane active" id="login">
                        <form class="form-horizontal" action="/user/login">
                            <div class="panel-body">
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <div class="input-group">
                                            <span class="input-group-addon"><i class="fa fa-user "></i></span>
                                            <input type="text" class="form-control" placeholder="用户名" value="用户名"
                                                   name="loginName"
                                                   data-fv-notempty="true">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <div class="input-group">
                                            <span class="input-group-addon" style="padding: 6px 11px 6px 10px;"><i
                                                    class="fa fa-key "></i></span>
                                            <input type="text" class="form-control" placeholder="密码" value="密码"
                                                   name="password"
                                                   data-fv-notempty="true">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-xs-12">
                                        <button type="submit" class="btn btn-info btn-block js--btn-save">登陆 <i class="fa fa-sign-in"></i></button>
                                    </div>
                                     <div class="col-xs-12" style="margin-top: 10px;">
                                        <button type="submit" class="btn btn-success btn-block js--btn-save">注册 <i class="fa fa fa-unlock-alt"></i></button>
                                    </div>
                                </div>
                            </div>
                        </form>

                    </div>
                  
                </div>
            </div>
        </div>







</body>
</html>