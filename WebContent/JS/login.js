/**
 * 
 */

window.onload=function(){
	var logo1=document.querySelector("#logo1");
	var logo2=document.querySelector("#logo2");
	var membership=document.querySelector("#membership");
	
	
	logo1.onclick=function(){
		location.href="index_bx.html";
	}
	logo2.onclick=function(){
		location.href="index_bx.html";
	}
	membership.onclick=function(){
		location.href="registerform2.html";
	}
		
	
	
}

//로그인
function login(){
	var id=document.querySelector("#sectionText1");
	var pw=document.querySelector("#sectionText2");
	var fail=document.querySelector("#fail");
	
	
	if(id.value.length==0 || pw.value.length==0){
		fail.style.border="2px solid #CC3D3D";
		fail.style.color="#F6F6F6";
		fail.style.fontSize="13px";
		fail.style.padding="35px";
		fail.innerHTML="입력한 아이디 또는 비밀번호가<br>올바르지 않습니다.";
		return false;
	}

}