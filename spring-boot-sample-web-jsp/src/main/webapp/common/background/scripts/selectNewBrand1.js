var typeFlag="";
	var parentcode="";
	var childcode="";
	var threecode="";
	var getParentUrl="";
	var getChildUrl="";
	var getThreeChildUrl="";
	function inintType(istype,parent,child,threechild,parentUrl,childUrl,threechildUrl){
		typeFlag=istype;
		parentcode=parent;
		childcode=child;
		threecode=threechild;
		getParentUrl=parentUrl;
		getChildUrl=childUrl;
		getThreeChildUrl=threechildUrl;
		getAllParent();
		$("#parentcode").bind("change",getChild);
		$("#childcode").bind("change",getThreeChild);
	}
	function getAllParent(){
		  var selectParentcode= $("#parentcode");
			 selectParentcode.empty();
			 if(typeFlag=="true"){
			 	selectParentcode.append('<option value="">全部</option>');
			 }
		ajax(getParentUrl,"",setAllParent);
	}
	function setAllParent(data){
		 if(data.list!=null){
			 	var ajaxData = eval(data.list);
				 var selectParentcode= $("#parentcode");
				  $.each(ajaxData, function(i,n){
					   if (n.code == parentcode) {
						  selectParentcode.append('<option value="'+n.code+'" selected="selected">'+n.group+' '+n.name+'</option>');
					  }else{
						 selectParentcode.append('<option value="'+n.code+'">'+n.group+' '+n.name+'</option>');
					  } 
					
				  });
				  
		 }
		 getChild();
	}
	function getChild(){
		 var selectChild= $("#childcode");
	   		 selectChild.empty();
	   		 if(typeFlag=="true"){
	   			 selectChild.append('<option value="">全部</option>');
	   		 }
	   	var parent=$("#parentcode").val();
		ajax(getChildUrl,"parentCode="+parent,setChild);
	}
	function setChild(data){
		 if(data.list!=null){
			 var ajaxData = eval(data.list);
			 var selectChild= $("#childcode");
			   	$.each(ajaxData, function(i,n){
			   		  if(n.code == childcode){
			   			selectChild.append('<option value="'+n.code+'" selected="selected">'+n.name+'</option>');
			   		 }else{
			   			selectChild.append('<option value="'+n.code+'">'+n.name+ '</option>');
			   		 } 
				 });
			   getThreeChild();
		 }
		
	 }
	function getThreeChild(){
		 var selectChild= $("#threeChildcode");
	   		 selectChild.empty();
	   		 if(typeFlag=="true"){
	   			 selectChild.append('<option value="">全部</option>');
	   		 }
	   	var parent=$("#childcode").val();
		ajax(getThreeChildUrl,"parentCode="+parent,setThreeChild);
	}
	function setThreeChild(data){
		 if(data.list!=null){
			 var ajaxData = eval(data.list);
			 var selectChild= $("#threeChildcode");
			   	$.each(ajaxData, function(i,n){
			   		  if(n.code == threecode){
			   			selectChild.append('<option value="'+n.code+'" selected="selected">'+n.tlvGroup+'款 '+n.name+'</option>');
			   		 }else{
			   			selectChild.append('<option value="'+n.code+'">'+n.tlvGroup+'款 '+n.name+'</option>');
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