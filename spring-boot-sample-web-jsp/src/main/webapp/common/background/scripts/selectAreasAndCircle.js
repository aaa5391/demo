﻿	var flag="";
	var provincesFlag="";
	var cityFlag="";
	var zoneFlag="";
	var circleFlag="";
	var selectNum="";
	var getProUrl="";
	var getCityUrl="";
	var getZoneUrl="";
	var getCircleUrl="";
	function inintSelect(isflag,provincesid,cityid,zoneid,circleid,num,proUrl,cityUrl,zoneUrl,circleUrl){
		flag=isflag;
		provincesFlag=provincesid;
		cityFlag=cityid;
		zoneFlag=zoneid;
		circleFlag=circleid;
		selectNum=num;
		getProUrl=proUrl;
		getCityUrl=cityUrl;
		getZoneUrl=zoneUrl;
		getCircleUrl=circleUrl;
		getProvinces();
		 $("#provinces").bind("change",getCity);
		 if(selectNum=="3"){
		 	 $("#city").bind("change",getZone);
		 	$("#zone").bind("change",getCircle);
		 }
	}
	function getProvinces(){
 		    var selectProvinces= $("#provinces");
			 selectProvinces.empty();
			 if(flag=="true"){
			 	selectProvinces.append('<option value="">请选择省</option>');
			 }
		ajax(getProUrl,"",setProvinces);
	}
	function setProvinces(data){
		 if(data!=null){
			 	var ajaxData = eval(data.list);
				 var selectProvinces= $("#provinces");
				  $.each(ajaxData, function(i,n){
					   if (n.id == provincesFlag) {
						  selectProvinces.append('<option value="'+n.id+'" selected="selected">'+n.name+'</option>');
					  }else{
						 selectProvinces.append('<option value="'+n.id+'">'+n.name+'</option>');
					  } 
					
				  });
				  
		 }
		 getCity();
	}
	function getCity(){
		 var selectCity= $("#city");
	   		 selectCity.empty();
	   		 if(flag=="true"){
	   			 selectCity.append('<option value="">请选择城市</option>');
	   		 }
	   	var provinces=$("#provinces").val();
		ajax(getCityUrl,"provinceid="+provinces,setCity);
	}
	 //给课程下拉框赋值
	function setCity(data){
		 if(data.list!=null){
			 var ajaxData = eval(data.list);
			 var selectCity= $("#city");
			   	$.each(ajaxData, function(i,n){
			   		  if(n.id == cityFlag){
			   			selectCity.append('<option value="'+n.id+'" selected="selected">'+n.name+'</option>');
			   		 }else{
			   			selectCity.append('<option value="'+n.id+'">'+n.name+ '</option>');
			   		 } 
				 });
		 }
		if(selectNum=="3"){
			getZone();
		}
	 }
	  function getZone(){
 		var selectZone= $("#zone");
	   		selectZone.empty();
	   		if(flag=="true"){
		   		selectZone.append('<option value="">请选择区</option>');
	   		}
		ajax(getZoneUrl,"cityid="+$("#city").val(),setZone);
	}
	function setZone(data){
		 if(data.list!=null){
			 var selectZone= $("#zone");
			   	$.each(eval(data.list), function(i,n){
			   	 		 if (n.id == zoneFlag){
			   	 			selectZone.append('<option value="'+n.id+'" selected="selected">'+n.name+'</option>');
			   			}else{
			   				selectZone.append('<option value="'+n.id+'">'+n.name+ '</option>');
			   			}
			   			
				  });
		 }
		 if(selectNum=="3"){
			 getCircle();
		}
	}
	 function getCircle(){
	 		var selectCircle= $("#circle");
		   		selectCircle.empty();
		   		if(flag=="true"){
			   		selectCircle.append('<option value="">请选择商圈地标</option>');
		   		}
			ajax(getCircleUrl,"areasid="+$("#zone").val(),setCircle);
		}
		function setCircle(data){
			 if(data.list!=null){
				 var selectCircle= $("#circle");
				   	$.each(eval(data.list), function(i,n){
				   	 		 if (n.id == circleFlag){
				   	 			selectCircle.append('<option value="'+n.id+'" selected="selected">'+n.name+'</option>');
				   			}else{
				   				selectCircle.append('<option value="'+n.id+'">'+n.name+ '</option>');
				   			}
				   			
					  });
			 }
		   	}
	//ajax方法
		function ajax(URL, Data,callback) {
				 $.ajax( {    
				      type : "POST",    
				       url : URL,    
				       data : Data,    
				       dataType: "json",    
				       success : callback
				   });  
		}

