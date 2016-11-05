var typeFlag="";
	var parentcode="";
	var childcode="";
	var getParentUrl="";
	var getChildUrl="";
	function inintType(istype,parent,child,parentUrl,childUrl){
		typeFlag=istype;
		parentcode=parent;
		childcode=child;
		getParentUrl=parentUrl;
		getChildUrl=childUrl;
		getAllParent();
		$("#parentcode").bind("change",getChild);
	}
	function getAllParent(){
		  var selectParentcode= $("#parentcode");
			 selectParentcode.empty();
			 if(typeFlag=="true"){
			 	selectParentcode.append('<option value="">请选择大分类</option>');
			 }
		ajax(getParentUrl,"",setAllParent);
	}
	function setAllParent(data){
		 if(data.list!=null){
			 	var ajaxData = eval(data.list);
				 var selectParentcode= $("#parentcode");
				  $.each(ajaxData, function(i,n){
					   if (n.value == parentcode) {
						  selectParentcode.append('<option value="'+n.value+'" selected="selected">'+n.lable+'</option>');
					  }else{
						 selectParentcode.append('<option value="'+n.value+'">'+n.lable+'</option>');
					  } 
					
				  });
				  
		 }
		 getChild();
	}
	function getChild(){
		 var selectChild= $("#childcode");
	   		 selectChild.empty();
	   		 if(typeFlag=="true"){
	   			 selectChild.append('<option value="">请选择二级分类</option>');
	   		 }
	   	var parent=$("#parentcode").val();
		ajax(getChildUrl,"parentCode="+parent,setChild);
	}
	function setChild(data){
		 if(data.list!=null){
			 var ajaxData = eval(data.list);
			 var selectChild= $("#childcode");
			   	$.each(ajaxData, function(i,n){
			   		  if(n.value == childcode){
			   			selectChild.append('<option value="'+n.value+'" selected="selected">'+n.lable+'</option>');
			   		 }else{
			   			selectChild.append('<option value="'+n.value+'">'+n.lable+ '</option>');
			   		 } 
				 });
		 }
	 }