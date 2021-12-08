const btn=document.querySelector("#review_btn");
const review=document.querySelector("#review");
const mov_idn1=document.querySelector(".mov_idn1");
const mov_idn=document.querySelector(".mov_idn");

let today = new Date();
let year = today.getFullYear(); // 년도
let month = today.getMonth() + 1; // 월
let date = today.getDate(); // 날짜



var movieReviewData={
	mov_idn:0,
	number:0,
	content:"",
	today,
	today,
	username:""
}


btn.onclick=()=>{
	movieReviewData.mov_idn = mov_idn.value;
	movieReviewData.content=review.value;
	if(movieReviewData.content==""){
		alert('댓글등록 실패!')
	}else{
		insertReview();
	}
	
	
}

function insertReview(){
	$.ajax({
		type: "post",
		url: "/title/"+movieReviewData.mov_idn,
		data: JSON.stringify(movieReviewData),
		dataType: "text",
		contentType: "application/json;charset=UTF-8",
		success: function(data){
			movieReviewData = JSON.parse(data);
			if(movieReviewData.error == "auth"){
			alert('로그인해주세요!');
			location.href = '/auth/signin';
			}else{
				alert('댓글등록 완료!');
				clearReview();
			}
		},
		error:function(){
			alert('댓글 비동기 처리 실패');
			clearReview();
		}
	})

}

function clearReview(){
	review.value="";
}
