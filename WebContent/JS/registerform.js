/**
 * 
 */

$(document).ready(function(){
	$("#idMsg").hide()
	$("#pwMsg").hide()
	$("#pwCheckMsg").hide()
	$("#lock").hide()
	
	// id 경고메세지와 색상 변경
	$("#userId").blur(function(){
		//var idv = $("#userId").val().length
		 //id 정규식
		var id = /^[a-z0-9]{5,20}$/;
		var idv = $("#userId").val()
//ID는 영어소문자+숫자로만 조합해야하며 , 5~20자 이내로만 사용가능 하다는 패턴
		
		console.log(idv)
		if(id.test(idv)){
			$("#idMsg").hide()
			$("#userId").css("border-bottom-color","green")
		}else{
			
			$("#idMsg").show()
			$("#userId").css("border-bottom-color","#c04346")
		}
	})
		
		
	// 패스워드 경고메세지와 색상 변경
	$("#userPw").blur(function(){
		//var pwv = $("#userPw").val().length
		var pw = /^[a-zA-Z0-9~!@#$%^&*()_+-=<>?]{8,20}/; //pw정규식
// 비밀번호는 영(소,대)+숫자+특수문자 의 조합을 갖추고 있어야되고 8~20자 내외로만 사용가능하다는 패턴
		var pwv = $("#userPw").val()
		console.log(pwv)
		if(pw.test(pwv)){ 
			$("#pwMsg").hide()
			$("#userPw").css("border-bottom-color","green")
			$("#lock").css("display","inline")
			$("#lock").css("color","green")
			
		}else{
			$("#lock").hide()
			$("#pwMsg").show()
			$("#userPw").css("border-bottom-color","#c04346")
		}
	})
	// 패스워드 확인 했을 때 경고메세지와 색상 변경
	$("#userPwCheck").blur(function(){
		var pwc = $("#userPwCheck").val()
		var pwv = $("#userPw").val()
		console.log(pwc)
		console.log(pwv)
		if(pwc != pwv){
			$("#pwCheckMsg").show()
			$("#userPwCheck").css("border-bottom-color","#c04346")
		}else{
			$("#pwCheckMsg").hide()
			$("#userPwCheck").css("border-bottom-color","green")
		}
	})
	//가입하기 버튼 올렸을 때 색상 변경
	$("#apply").hover(function(){   // 노란색 #f5d042
		$(this).css({"background":"#f5d042","color":"black"})
	},function(){
		$(this).css({"background":"#8AAAE5","color":"white"})
	})
	$("#mailCheck").hover(function(){   // 노란색 #f5d042
		$(this).css({"background":"#f5d042","color":"black"})
	},function(){
		$(this).css({"background":"#8AAAE5","color":"white"})
	}
	)
	

	})
	$(function() {
		
	$("#registerform").submit(function(){
		
		// 아이디가 제대로 입력 안되어있을 때
		var id = /^[a-z0-9]{5,20}$/;
		var idv = $("#userId").val()
//ID는 영어소문자+숫자로만 조합해야하며 , 5~20자 이내로만 사용가능 하다는 패턴

		if (!(id.test(idv))){
			alert("id를 확인해주세요")
			return false;
		}
		
		// 비밀번호가 제대로 입력 안되어 있을 때
		var pw = /^[a-zA-Z0-9~!@#$%^&*()_+-=<>?]{8,20}/;
		var pwv = $("#userPw").val()
		if(!(pw.test(pwv))){
			alert("비밀번호를 확인 해주세요")
			return false;
		}
		// 비밀번호 확인이 제대로 안되어 있을 때
		var pwc = $("#userPwCheck").val()
		var pwv = $("#userPw").val()
		if(pwc != pwv){
			alert("비밀번호 확인 입력창을 확인해주세요")
			return false;
		}

		// 이름이 제대로 안되어있을 때
		var namev =$("#userName").val()
		// var username = /^[가-힣]{2,4}$/; // 정규식이 안먹어...
        if (namev=="") {
            alert("이름이 올바르지 않습니다.")
            return false;
        }
		// var namev =$("#userName").val()
		// var username = /^[가-힣]{2,4}$/; // 정규식이 안먹어...
        // if (!(namev.test(username))) {
        //     alert("이름이 올바르지 않습니다.")
        //     return false;
        // }

		// 닉네임이 없을 때
		var nicknamev = $("#nickName").val()
		if(nicknamev==""){
			alert("닉네임을 입력해주세요")
			return false;
		}

		// 이메일이 입력 안되어있을 때
			// 어차피 인증번호를 입력해야 하므로 할 필요x
		// 인증번호가 입력이 안되어있을 때

		//인증번호 보낼려면 서버가 필요함
		var emailcheckv =$("#emailcheck").val()
		if(emailcheckv==""){
			alert("이메일 인증을 해주세요")
			return false;
		}

		// 연락처가 입력이 안되어있을 때
		var mPhone2v = $("#mPhone2").val();
		if(mPhone2v==""){
			alert("휴대폰 번호를 확인해주세요")
			return false;
		}
		var mPhone3v = $("#mPhone3").val();
		if(mPhone3v==""){
			alert("휴대폰 번호를 확인해주세요")
			return false;
		}
		return true;

	})
	})
	