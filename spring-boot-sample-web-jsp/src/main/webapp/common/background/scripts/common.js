		var submitFlg = 0;
	    
	    // 防止页面二次提交
	    function block2Submit(){
	    	if (submitFlg == 0) {
	    		submitFlg = 1;
	    		//$("a").on("click",function(){return false;});
	    		return true;
	    	} else {
	    		alert("不能重复提交");
	    		return false;
	    	}
	    }
	    function showLoadInfo() {
	    	$.layer({
	    		type: 3,
	    		border : [0],
	    		shade: [0.1, '#FFFFFF'],
	    		time: 0,
	    		loading: {
	    			type: 2
	    		}
	    	});
	    }
	    function check_email(email){
			var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
			 if (email == '') {//判断
				 return false;
			  }else{
				  if (!reg.test(email)) {
					  return false;
			  }
			  return true;
			 }
		};
	  //检查手机号码
	function check_mobile(mobile){
		if(mobile.length != 11 || isNaN(mobile)){
			return false;
		}
		mobile = mobile.substr(0,3);
		//号段
		var hd = new Array('130','131','132','133','134','135','136','137','138','139','150','151','152','153','154','155','156','157','158','159','180','181','182','183','184','185','186','187','188','189');
		var i = hd.length;
		while (i--) {
			if (hd[i] == mobile) {
				return true;
			}   
		}   
		return false;
	}
	 //检查整数
	function check_Num(num){
		var regu = /^[0-9]*[1-9][0-9]*$/;
		//var regu = /^([1-9]\d?|100|[1-9]\d\d|1000)$/;
		if(!regu.test(num)){
			return false;    
		}
		return true;
	}
	    