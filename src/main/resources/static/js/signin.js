const item_ip = document.querySelectorAll('.item_ip');


item_ip[0].onkeypress = () => {
	if(window.event.keyCode == 13){
		window.event.preventDefault();
		item_ip[1].focus();
	}
}

item_ip[1].onkeypress = () => {
	if(window.event.keyCode == 13){
		window.event.preventDefault();
		const form = document.querySelector("#signinForm");
		
	
		form.submit();
		
	}
}




