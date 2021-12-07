const blue_star = document.querySelector('#blue_star');
const promptable_base = document.querySelector('.promptable_base');
const promptable_base_close = document.querySelector('.promptable_base_close')
const rating_stars = document.querySelectorAll(".rating_stars");

blue_star.onclick = () =>{
    promptable_base.style.display = "block";
}

promptable_base_close.onclick = () =>{
    promptable_base.style.display = "none";
}

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
}