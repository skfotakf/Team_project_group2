const imdb_rating_number = document.querySelectorAll(".imdb_rating_number");
const seen_star = document.querySelectorAll(".seen_star");
const seen = document.querySelectorAll(".seen");
const popover = document.querySelectorAll(".popover");
const rating_stars = document.querySelectorAll(".rating_stars");
const remove = document.querySelectorAll(".remove");
const rating_status = document.querySelectorAll(".rating_status");
const like_heart = document.querySelectorAll(".like_heart");
const like_count = document.querySelectorAll(".like_count");
const sidebar_seen_movies = document.querySelector(".sidebar_seen_movies");
const descend = document.querySelector(".descend");
const no_rating = document.querySelectorAll(".no_rating");
const seen_rating = document.querySelectorAll(".seen_rating");
let ratingNumber = new Array(20);
let likeNumber = new Array(20);

const mov_idn1 = document.querySelectorAll(".mov_idn1");

var movieLikeData = {
	mov_idn: 0,
	number: 0,
	
}

var movieRatingData = {
	mov_idn: 0,
	number: 0,
	rating: 0
}




// like 누르면 수가 db에서 1 증가
function likePlusService(){
	$.ajax({
		type: "post",
		url: "/chart-like/plus",
		data: JSON.stringify(movieLikeData),
		dataType: "text",
		contentType: "application/json;charset=UTF-8",
		success: function(data){
			movieLikeData = JSON.parse(data);
			if(movieLikeData.error == "auth"){
			location.href = '/auth/signin';
			}else{
				alert('Likelist에 영화가 추가되었습니다.');
			}
			
		},
		error:function(){
			alert('좋아요 비동기 처리 실패');
		}
	})

}

// like 누르면 수가 db에서 1 감소
function likeMinusService(){
	$.ajax({
		type: "post",
		url: "/chart-like/minus",
		data: JSON.stringify(movieLikeData),
		dataType: "text",
		contentType: "application/json;charset=UTF-8",
		success: function(data){
			movieLikeData = JSON.parse(data);
			
				alert('Likelist에 영화가 제거되었습니다.');
			
		},
		error:function(){
			alert('좋아요 비동기 처리 실패');
		}
	})

}

// 별을 누르면 본 기록이 movie_rating에 insert
function ratingInsertService(){
	$.ajax({
		type: "post",
		url: "/chart-rating/insert",
		data: JSON.stringify(movieRatingData),
		dataType: "text",
		contentType: "application/json;charset=UTF-8",
		success: function(data){
			movieRatingData = JSON.parse(data);
			if(movieRatingData.error == "auth"){
			location.href = '/auth/signin';
			}else{
				location.reload(true);
			}
		},
		error:function(){
			alert('별점 비동기 처리 실패');
		}
	})

}

// 별점을 누르면 movie_rating의 rating이 update
function ratingUpdateService(){
	$.ajax({
		type: "post",
		url: "/chart-rating/update",
		data: JSON.stringify(movieRatingData),
		dataType: "text",
		contentType: "application/json;charset=UTF-8",
		success: function(data){
			movieRatingData = JSON.parse(data);
			
				location.reload(true);
			
		},
		error:function(){
			alert('별점 비동기 처리 실패');
		}
	})

}

// x를 누르면 movie_rating에 delete
function ratingDeleteService(){
	$.ajax({
		type: "post",
		url: "/chart-rating/delete",
		data: JSON.stringify(movieRatingData),
		dataType: "text",
		contentType: "application/json;charset=UTF-8",
		success: function(data){
			movieRatingData = JSON.parse(data);
			
				location.reload(true);
			
		},
		error:function(){
			alert('별점 비동기 처리 실패');
		}
	})
}

//별을 누르면 회색별이냐 아니야에 따라 별점창 다르게 나타내기
for (let p = 0; p < 10; p++) {

	seen_star[p].onclick = () => { 
	    if (seen_star[p].style.color == "darkgray") {
	    	
		   $(popover[p]).attr("style","display:block");
		   $(seen_star[p]).attr("style","color:rgb(179, 210, 245);pointer-events:none");
		   
		   $(seen[p]).attr("style","display:inline-block");
		   $(remove[p]).attr("style","display:none");
		   $(no_rating[p]).attr("style","display:inline-block");
		   
	    } else {
	    		
	        $(popover[p]).attr("style","display:block");
		    $(seen_star[p]).attr("style","color:rgb(179, 210, 245);pointer-events:none");
		    $(seen_rating[p]).attr("style","display:inline-block");
		    $(remove[p]).attr("style","display:inline-block");
		    $(no_rating[p]).attr("style","display:none");
			    
	    }
	}
};

//별점 별에 갖다대면 파란색, 떼면 회색
for (let p = 0; p < 10; p++) {
	for (let i = 10 * p + 0; i < 10 * p + 10; i++) {
   		rating_stars[i].onmouseover = () => {
		      for (let j = 10 * p; j < i + 1; j++) {
			      	seen[p].style.display = "none";
			        rating_stars[j].style.color = "rgb(82, 133, 255)";
			        seen_rating[p].innerHTML = j + 1 - 10 * p;
			        seen_rating[p].style.fontSize = "16px";
			        seen_rating[p].style.width = "30px";
			        seen_rating[p].style.top = "1.5px";
			        seen_rating[p].style.textAlign = "center";
		      }
	    };
	    rating_stars[i].onmouseout = () => {
		      for (let j = 0; j < i + 1; j++) {
		        	rating_stars[j].style.color = "darkgray";
		       }
	    };
	} 
}


//별점 별을 클릭하면 insert 혹은 update
for (let p = 0; p < 10; p++) {
	for (let i = 10 * p + 0; i < 10 * p + 10; i++){
 		rating_stars[i].onclick = () => {
 			if(rating_status[p].value == 1) {
		    	movieRatingData.mov_idn = mov_idn1[p].value;
		      	movieRatingData.rating = i+1- 10*p;
		    	ratingInsertService();  // 사람 수 증가
			} else {
				movieRatingData.mov_idn = mov_idn1[p].value;
		      	movieRatingData.rating = i+1- 10*p;
		    	ratingUpdateService();  // 사람 수 한명 증가 or 그대로
			}    	
	    } 
	}
}			  
	
//no rating 클릭하면 insert
for (let p = 0; p < 10; p++) {		
	no_rating[p].onclick = () => {
		movieRatingData.mov_idn = mov_idn1[p].value;
      	movieRatingData.rating = 0;					      	
      	ratingInsertService();  // 사람 수 증가 x
    }
}		   
	
// x표 누르면 delete	
for (let p = 0; p < 10; p++){
	remove[p].onclick = () => {
		movieRatingData.mov_idn = mov_idn1[p].value;
	  	movieRatingData.rating = 0;				  	
	  	ratingDeleteService();    // 사람 수 한명 감소 or 그대로
	}   

}

 		  
// 하트 생성, 하트수 증감
for (let r = 0; r < 10; r++) {
  likeNumber[r] = like_count[r].innerText;

  like_heart[r].onclick = () => {
    if (like_heart[r].style.color == "darkgray") {
      movieLikeData.mov_idn = mov_idn1[r].value;    
      likePlusService();
      	
      likeNumber[r] = parseInt(likeNumber[r]) + 1;
      like_count[r].innerHTML = likeNumber[r];
      like_heart[r].style.color = "#E04386";
     
    } else {
    
      movieLikeData.mov_idn = mov_idn1[r].value;
      likeMinusService();
      
      likeNumber[r] = parseInt(likeNumber[r]) - 1;
      like_count[r].innerHTML = likeNumber[r];
      like_heart[r].style.color = "darkgray";
    }
  };
}
