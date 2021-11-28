const descending = document.querySelector('.descending');
const ascending = document.querySelector('.ascending');
const ascDesc = document.querySelector('.ascDesc');

if(ascDesc.value == 0){
	ascending.style.display = 'none';
	descending.style.display = 'inline-block';		
} else{
	descending.style.display = 'none';
	ascending.style.display = 'inline-block';	
}

descending.onclick = () =>{
	
	location.href = '/list/top/desc';
	
}
ascending.onclick = () =>{
	location.href = '/list/top';
	
}
