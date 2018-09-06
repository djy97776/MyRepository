$(function() {
	$.getJSON("getUser.do",function(data){
		$("#wel").html("欢迎"+data.name);
		
		
	});
	
	
	
	$(document).on("click", ".change", function(){
		var id = $(this).parents("ul").children().first().html();
		var url = "update/"+id+".do";
		$.getJSON(url,function(data){
			for(var i=0;i<data.length;i++){
				var u = data[0];
			$("#ids").val(u.id);
			$("#names").val(u.name);
			$("#phones").val(u.phone);
			$("#adresss").val(u.adress);
			$(":radio[name='states'][value='" +data[0].stateid + "']").prop("checked", "checked");
			}
			});
		
		
	});
	$(document).on("click", "#ups", function(){
		
		var id = $("#ids").val();
		var name = $("#names").val();
		var phone = $("#phones").val();
		var adress = $("#adresss").val();
		var stateid = $('input:radio[name="states"]:checked').val();
		var url = "updateStu/"+id+"/"+name+"/"+phone+"/"+adress+"/"+stateid+".do";
		
		$.getJSON(url,function(data){
			
			if(data==1){
				alert("修改成功!");
			}
		});
		
	});
	function loadStud() {

		var p = $("#page").html();

		var url = "loadStu/" +p+ "/5.do";

		$.getJSON(url, function(data) {

			for(var i = 0; i < data.length; i++) {
				var temp = "<ul>";
				temp += "<li>" + data[i].id + "</li>";
				temp += "<li>" + data[i].name + "</li>";
				temp += "<li>" + data[i].phone + "</li>";
				temp += "<li>" + data[i].adress + "</li>";
				temp += "<li>" + data[i].stateid + "</li>";
				temp += "<li><a href='#' class='delete'>删除</a> </li>";
				temp += "<li><a href='#' class='change'>修改信息</a> </li>";
				temp += "</ul>";
				$("#container").append(temp);
			}
			$("#page").html(parseInt(p) + 1);
		});
	}
	loadStud();

	$("#loadMore").click(loadStud);

	$(document).on("click", ".delete", function() {
		
		if(confirm("确认删除")) {
			var id = $(this).parents("ul").children().first().html();
			
			var $my = $(this);
			var url = "dell/" +id+ ".do";
			$.get(url, function(data) {
				if(data == 1) {
					
					$my.parents("ul").remove();
					var p = ($("#page").html()-1) * 5;
					var url = "loadStu/" + p + "/1.do";
					$.get(url, function(data) {
					for(var i = 0; i < data.length; i++) {
						var temp = "<ul>";
						temp += "<li>" + data[i].id + "</li>";
						temp += "<li>" + data[i].name + "</li>";
						temp += "<li>" + data[i].phone + "</li>";
						temp += "<li>" + data[i].adress + "</li>";
						temp += "<li>" + data[i].stateid + "</li>";
						temp += "<li><a href='#' class='delete'>删除</a> </li>";
						temp += "<li><a href='#' class='change'>修改信息</a> </li>";
						temp += "</ul>";
						
						$("#container").append(temp);
						
					}
					});
				}
			});
		
		}
	});
	$("#subn").click(function(){
		var id = $("#idx").val();
		var name = $("#name").val();
		var phone = $("#phone").val();
		var adress = $("#adress").val();
		var stateid = $('input:radio[name="state"]:checked').val();
		var url = "addStu/"+id+"/"+name+"/"+phone+"/"+adress+"/"+stateid+".do";
		$.getJSON(url,function(data){
		
			if(data==1){
				alert("添加成功!");
			}
		})
		
	});
});