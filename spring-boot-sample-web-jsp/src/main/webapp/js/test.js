$(function(){
	
	$("#generate").click(function(){
		var options = {
				method:"POST",
				url: basePath + "test",
				success: function (data) {
					if(data==1){
						layer.alert("成功");
					}else{
						layer.alert("保存评分失败");
					}
				}
			};
		$("#saveForm").ajaxSubmit(options);
	});
});