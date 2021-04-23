/**
 * 
 */



window.onload=function(){
	var logo1=document.querySelector("#logo1");
	var logo2=document.querySelector("#logo2");
	var home=document.querySelector("#home");
	var notice=document.querySelector("#notice");
	var introdution=document.querySelector("#introdution");
	var recommend=document.querySelector("#recommend");
	var attack=document.querySelector("#attack");
	var free=document.querySelector("#free");
	
	
	logo1.onclick=function(){
		location.href="index_bx.html";
	}
	logo2.onclick=function(){
		location.href="index_bx.html";
	}
	home.onclick=function(){
		location.href="index_bx.html";
	}
	notice.onclick=function(){
		location.href="noticeBoard.html";
	}
	introdution.onclick=function(){
		location.href="introduce-board.html";
	}
	recommend.onclick=function(){
		location.href="recBoard.html";
	}
	attack.onclick=function(){
		location.href="attackBoard.html";
	}
	free.onclick=function(){
		location.href="MessageBoard.html";
	}
	
	
	
}
    
 $(document).ready(function(){
 	$(".paging > a").on("click",function(e){
		$(this).addClass("page").siblings().removeClass("page")
	})
	
	// 게시판 추천게임 슬라이더
	 $('.rec_img').bxSlider({
      minSlides:4,
	  maxSlides:4,
	  moveSlides:1,
	  pager:false,
	  auto:true,
	  speed:1000,
	  pause:4000,
	  
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
	
	//글쓰기 버튼 클릭 시 이동
	$(".write_btn").click(function(){
		location.href="file:///D:/00-BACKUP/%EC%9A%B0%EB%AF%BC%EC%A7%80/WOOMINJI/&&write.html";
	})
   	  
});
	
	
	
	
