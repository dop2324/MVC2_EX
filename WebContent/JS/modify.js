/**
 * 
 */

$(document).ready(function(){
		//id가 update 선택
		
	$("#update").on("click",function(){
		//memberModify.jsp action
		
		$("form").attr("action","BoardModify.me")
		$("form").attr("method","post")
	})
		//id가 delete 선택
	$("#delete").on("click",function(){
		//memberRemove.jsp action
		
		$("form").attr("action","BoardRemove.me")
		$("form").attr("method","post")
	})
		
})