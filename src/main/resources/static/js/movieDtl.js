const blue_star = document.querySelector('#blue_star');
const promptable_base = document.querySelector('.promptable_base');
const promptable_base_close = document.querySelector('.promptable_base_close')
const rating_stars = document.querySelectorAll(".rating_stars");
const mov_idn1 = document.querySelector("#mov_idn1");
const rate = document.querySelector(".rate");
const dtlStar = document.querySelector(".dtlStar");
const remove_button = document.querySelector(".remove_button");

var movieRatingData = {
	mov_idn: 0,
	number: 0,
	rating: 0
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
				alert('별점 증가');
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
			
				alert('별점 변화');
			
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
			
				alert('별점 삭제');
			
		},
		error:function(){
			alert('별점 비동기 처리 실패');
		}
	})
}

blue_star.onclick = () =>{
    promptable_base.style.display = "block";
    if(dtlStar.style.color != "darkgray"){
    
    	remove_button.style.display = "block";
    }
    
}

promptable_base_close.onclick = () =>{
    promptable_base.style.display = "none";
}

if(dtlStar.style.color == "darkgray"){

	for (let i = 0; i < 10; i++){
	    rating_stars[i].onmouseover = () => {
	        for (let j = 0; j < i + 1; j++) {
	            rating_stars[j].style.color = "#5285FF";
	        }
	    }
	    
	    rating_stars[i].onmouseout = () => {
	        for (let j = 0; j < i + 1; j++) {
	          rating_stars[j].style.color = "darkgray";
	        }
	    }
	    
	    rating_stars[i].onclick = () => {
	    	movieRatingData.mov_idn = mov_idn1.value;
	      	movieRatingData.rating = i+1;
	      	ratingInsertService();
	      	promptable_base.style.display = "none";
	      	dtlStar.style.color = "#5285FF";
	      	rate.innerHTML = "";
	      	rate.innerHTML = i+1 +"/ 10";
	    }
	}
} else {
    	for (let i = 0; i < 10; i++){
		    rating_stars[i].onmouseover = () => {
		        for (let j = 0; j < i + 1; j++) {
		            rating_stars[j].style.color = "#5285FF";
		        }
		    }
		    
		    rating_stars[i].onmouseout = () => {
		        for (let j = 0; j < i + 1; j++) {
		          rating_stars[j].style.color = "darkgray";
		        }
		    }
		    
		    rating_stars[i].onclick = () => {
		    	movieRatingData.mov_idn = mov_idn1.value;
		      	movieRatingData.rating = i+1;
		      	ratingUpdateService();
		      	promptable_base.style.display = "none";
		      	dtlStar.style.color = "#5285FF";
		      	rate.innerHTML = "";
		      	rate.innerHTML = "&nbsp;"+i+1 +"/ 10";
		    }
		    remove_button.onclick = () => {
		    	movieRatingData.mov_idn = mov_idn1.value;
		      	movieRatingData.rating = 0;
		      	ratingDeleteService();
		      	promptable_base.style.display = "none";
		      	dtlStar.style.color = "darkgray";
		      	rate.innerHTML = "";
		      	rate.innerHTML = "&nbsp;Rate";
		    }
		}
}