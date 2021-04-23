/**
 * 
 */


// 페이지 벗어날 때 경고창
// 작성버튼을 누르면 경고창 안뜸
$(document).ready(function(){
	$(window).on('beforeunload',function(){
		return "페이지를 벗어나면 작성중인 내용이 사라집니다";
	});
	$(document).on("submit", function(event){
		// 조건없으면 complete 실행되고 나면 페이지 벗어날 때 경고창 안 뜸
		if(title_text.value.length>=4){
			$(window).off('beforeunload');
		}
	})
	// 게임카테고리로 링크 이동
	$(".game_cate_all").click(function(){
		location.href="file:///D:/00-BACKUP/%EC%9A%B0%EB%AF%BC%EC%A7%80/WOOMINJI/MessageBoard.html";
	})
	$(".game_cate_action").click(function(){
		location.href="액션";
	})
	$(".game_cate_RPG").click(function(){
		location.href="RPG";
	})
	$(".game_cate_adventure").click(function(){
		location.href="어드벤처";
	})
	$(".game_cate_sports").click(function(){
		location.href="스포츠";
	})
	$(".game_cate_simulation").click(function(){
		location.href="시뮬레이션";
	})
	
	
})

// 제목이 0글자 일 때 
// 글 내용이 10글자 이상 일 때  ( 나중에 ) 
function complete(){
	var title_text=document.querySelector("#title_text");	
	if(title_text.value.length<4){
		alert("제목을 4글자 이상 입력해 주세요")
		return false;
	}
}







