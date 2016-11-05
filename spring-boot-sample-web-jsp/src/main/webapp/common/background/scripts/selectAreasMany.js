	var flag_second="";
	var provincesFlag_second="";
	var cityFlag_second="";
	var zoneFlag_second="";
	var selectNum_second="";
	var getProUrl_second="";
	var getCityUrl_second="";
	var getZoneUrl_second="";
	var provincesids_second="";
	var cityids_second="";
	var zoneids_second="";
	function inintSelectByid(isflag,provincesid,cityid,zoneid,num,pid,cid,zid,proUrl,cityUrl,zoneUrl){
		flag_second=isflag;
		provincesFlag_second=provincesid;
		cityFlag_second=cityid;
		zoneFlag_second=zoneid;
		selectNum_second=num;
		getProUrl_second=proUrl;
		getCityUrl_second=cityUrl;
		getZoneUrl_second=zoneUrl;
		provincesids_second=pid;
		cityids_second=cid;
		zoneids_second=zid;
		getProvincesSecond();
		 $("#"+provincesids_second).bind("change",getCitySecond);
		 if(selectNum_second=="3"){
		 	 $("#"+cityid_second).bind("change",getZoneSecond);
		 }
	}
	function getProvincesSecond(){
 		    var selectProvinces= $("#"+provincesids_second);
			 selectProvinces.empty();
			 if(flag_second=="true"){
			 	selectProvinces.append('<option value="">请选择省</option>');
			 }
			 ajaxSecond(getProUrl_second,"",setProvincesSecond);
	}
	function setProvincesSecond(data){
		 if(data!=null){
			 	var ajaxData = eval(data.list);
				 var selectProvinces= $("#"+provincesids_second);
				  $.each(ajaxData, function(i,n){
					   if (n.id == provincesFlag_second) {
						  selectProvinces.append('<option value="'+n.id+'" selected="selected">'+n.name+'</option>');
					  }else{
						 selectProvinces.append('<option value="'+n.id+'">'+n.name+'</option>');
					  } 
					
				  });
				  
		 }
		 getCitySecond();
	}
	function getCitySecond(){
		 var selectCity= $("#"+cityids_second);
	   		 selectCity.empty();
	   		 if(flag_second=="true"){
	   			 selectCity.append('<option value="">请选择城市</option>');
	   		 }
	   	var provinces=$("#"+provincesids_second).val();
	   	ajaxSecond(getCityUrl_second,"provinceid="+provinces,setCitySecond);
	}
	 //给课程下拉框赋值
	function setCitySecond(data){
		 if(data.list!=null){
			 var ajaxData = eval(data.list);
			 var selectCity= $("#"+cityids_second);
			   	$.each(ajaxData, function(i,n){
			   		  if(n.id == cityFlag_second){
			   			selectCity.append('<option value="'+n.id+'" selected="selected">'+n.name+'</option>');
			   		 }else{
			   			selectCity.append('<option value="'+n.id+'">'+n.name+ '</option>');
			   		 } 
				 });
		 }
		if(selectNum_second=="3"){
			getZoneSecond();
		}
	 }
	  function getZoneSecond(){
 		var selectZone= $("#"+zoneids_second);
	   		selectZone.empty();
	   		if(flag_second=="true"){
		   		selectZone.append('<option value="">请选择区</option>');
	   		}
	   		ajaxSecond(getZoneUrl_second,"cityid="+$("#"+cityids_second).val(),setZoneSecond);
	}
	function setZoneSecond(data){
		 if(data.list!=null){
			 var selectZone= $("#"+zoneids_second);
			   	$.each(eval(data.list), function(i,n){
			   	 		 if (n.id == zoneFlag_second){
			   	 			selectZone.append('<option value="'+n.id+'" selected="selected">'+n.name+'</option>');
			   			}else{
			   				selectZone.append('<option value="'+n.id+'">'+n.name+ '</option>');
			   			}
			   			
				  });
		 }
	   	}
	//ajax方法
		function ajaxSecond(URL, Data,callback) {
				 $.ajax( {    
				      type : "POST",    
				       url : URL,    
				       data : Data,    
				       dataType: "json",    
				       success : callback
				   });  
		}

