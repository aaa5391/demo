<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>上传示例</title>
      <script>
   require( [ "webuploader", "jquery" ], function ( webuploader, $ ) {
            $( document ).ready( function() {
                var uploaderContainerId,
                        uploaderOptions;
                        
                uploaderContainerId = "uploaderContainer";
                uploaderOptions = {
                    // swf文件路径
                    swf: '../static/dev/modules/lib/webuploader/Uploader.swf',

                    // 文件接收服务端。
                    server: '../Upload/toUpload'
                };
                webuploader.pku.fileUpload(uploaderContainerId, uploaderOptions );
            } );
        } );

    </script>
  </head>
  
  <body>
  <div style="width: 800px;">
  	<div id="uploaderContainer">
  	</div>
  </div>
   
  </body>
</html>
