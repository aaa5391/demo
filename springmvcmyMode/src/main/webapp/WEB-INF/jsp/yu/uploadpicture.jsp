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
                    server: '../Upload/toUpload',
                // 只允许选择图片文件。
			    accept: {
			        title: 'Images',
			        extensions: 'gif,jpg,jpeg,bmp,png',
			        mimeTypes: 'image/*'
			    },
		                
              // 指定Drag And Drop拖拽的容器
       		 dnd: '#' + uploaderContainerId + ' .uploader-filelist',
       		  // 通过粘贴来添加截屏的图片
       		  paste: document.body
       		};
                webuploader.pku.imageUpload(uploaderContainerId, uploaderOptions );
            } );
        } );

    </script>
  </head>
  
  <body>
  <div style="width: 700px;">
  	<div id="uploaderContainer">
  	</div>
  </div>
   
  </body>
</html>
