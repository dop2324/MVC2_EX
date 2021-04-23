/**
 * 
 */


$(document).ready(function(){
	//수정, 삭제버튼 숨김 ( 로그인했을 때 나타나게 )
	$(".mod_btn").hide();
	$(".del_btn").hide();
	$(".comm_page_num_box").hide();
	$(".layer_moer").hide();
	$(".layer_moer2").hide();

	// 추천수 
	var rec_val=Number($(".recomm").val());
		// 추천버튼 누르면 빨간하트, 추천수 올라감, 한 번 더 누르면 추천 취소
		$(".heart_btn").click(function(){
			var src = ($(".heart").attr("src") === "image/heart.png") ? "image/red heart.png" : "image/heart.png";
			$(".heart").attr("src", src);
			if(src == "image/red heart.png"){
			$(".recomm").html(rec_val=rec_val+1)}
			else{$(".recomm").html(rec_val=rec_val-1)}
		});
		
		// 작성자 클릭 시
		$(".writer").click(function(e){
			e.preventDefault()
			$(".layer_moer").toggle();
		})
		//댓글작성자 클릭 시
		$(".profile").click(function(e){
			e.preventDefault()
			$(".layer_moer2").toggle();
		})
		
		// 댓글 버튼 클릭하면 사라지고 나타나게
		$(".comm_btn").click(function(){
			$(".comment_section").toggle();
		})
		
		
		// 프로필 이미지 클릭하면 
		// 로그인 안했을 때 
		$(".profile_img").click(function(e){
			e.preventDefault()
			var confirm_true=confirm("접근권한이 없습니다. 로그인 하시겠습니까?")
			if(confirm_true==true){
				location.href="로그인페이지";
			}
		})
		
		
		// 로그인 전 댓글 작성 클릭 시 로그인 알림창
		
		$(".comment_text").click(function(){
			var confirm_true=confirm("로그인 하시겠습니까?")
			if(confirm_true==true){
				location.href="로그인페이지";
			}
		})

		// 삭제버튼 클릭 시 확인창 ( 로그인 했을 때 )
		$(".del_btn").click(function(){
			var confirm_true=confirm("게시글을 삭제 하시겠습니까?")
			if(confirm_true==true){
				// 글 삭제
			}
		})
		// 
		
		
		// 수정버튼 클릭 시 링크 이동 ( 로그인 했을 때 )
		$(".mod_btn").click(function(){
			location.href="file:///D:/00-BACKUP/%EC%9A%B0%EB%AF%BC%EC%A7%80/WOOMINJI/&&write.html";
		})
		
		// 게임 카테고리 눌렀을 때 링크 이동
		
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
		
		
		
	});
