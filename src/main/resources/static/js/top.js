/* 정배열 역배열 버튼(못넣음)
const descending = document.querySelector('.descending');
const ascending = document.querySelector('.ascending');
const ascDesc = document.querySelector('.ascDesc');
*/

const lister_sortby = document.querySelector('.lister_sortby');
const submit_sortby = document.querySelector('.submit_sortby');

const sortbyRanking = document.querySelector('.sortbyRanking');
const sortbyRelease = document.querySelector('.sortbyRelease');
const sortbyLike = document.querySelector('.sortbyLike');
const nameSortby = document.querySelector('.nameSortby');

if(nameSortby.value == 1){
	sortbyRanking.style.display = 'inline-block';
	sortbyRelease.style.display = 'none';
	sortbyLike.style.display = 'none';	
} else if(nameSortby.value == 2){
	sortbyRanking.style.display = 'none';
	sortbyRelease.style.display = 'inline-block';
	sortbyLike.style.display = 'none';	
} else if(nameSortby.value == 3){
	sortbyRanking.style.display = 'none';
	sortbyRelease.style.display = 'none';
	sortbyLike.style.display = 'inline-block';	
} else{
	alert('분류 제목 오류');
}
submit_sortby.onclick = () =>{
	if(lister_sortby.value == "jr:descending"){
	  location.href = '/list/top/1';
	  
	  
	} else if(lister_sortby.value == "rd:descending"){
	  location.href = '/list/top/2';
	  
	} else{
	  location.href = '/list/top/3';
	  
	}

}

/* 정배열 역배열 버튼(못넣음)
if(ascDesc.value == 0){
	ascending.style.display = 'none';
	descending.style.display = 'inline-block';		
} else{
	descending.style.display = 'none';
	ascending.style.display = 'inline-block';	
}

descending.onclick = () =>{
	
	if(lister_sortby.value == "jr:descending"){
	  location.href = '/list/top/1/desc';
	  
	} else if(lister_sortby.value == "rd:descending"){
	  location.href = '/list/top/2/desc';
	  
	} else{
	  
	  location.href = '/list/top/3/desc';
	}
	
}
ascending.onclick = () =>{
	location.href = '/list/top';
	
}
*/
