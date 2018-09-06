
$(function(){
	$("#login").click(function(){
		var name = $("#name").val();
		var password = $("#password").val();
		var url = "login/"+name+"/"+password+".do";
		$.getJSON(url,function(data){
			if(data==1){
				location = "new_file.html";
			}
		});
	})
	
	
});
