const seen_star = document.querySelectorAll(".seen_star");
const seen = document.querySelectorAll(".seen");
const popover = document.querySelectorAll(".popover");

const rating_stars = document.querySelectorAll(".rating_stars");
const popover_delete = document.querySelectorAll(".popover_delete");

for (let p = 0; p < 10; p++) {
  seen_star[p].onclick = () => {
    if (seen_star[p].style.color == "darkgray") {
      seen_star[p].style.color = "rgba(109,174,272,0.5)";
      seen[p].style.display = "inline-block";
      seen[p].innerHTML = "seen";
    } else {
      popover[p].style.display = "block";
    }
  };
}

for (let q = 0; q < 10; q++) {
  popover_delete[q].onclick = () => {
    popover[q].style.display = "none";
    seen_star[q].style.color = "darkgray";
    seen[q].innerHTML = "";
  };
}
for (let k = 0; k < 10; k++) {
  for (let i = 10 * k + 0; i < 10 * k + 10; i++) {
    rating_stars[i].onmouseover = () => {
      for (let j = 10 * k; j < i + 1; j++) {
        rating_stars[j].style.color = "blue";
        seen[k].innerHTML = j + 1 - 10 * k;
      }
    };
    rating_stars[i].onmouseout = () => {
      for (let j = 0; j < i + 1; j++) {
        rating_stars[j].style.color = "darkgray";
      }
    };
    rating_stars[i].onclick = () => {
      popover[k].style.display = "none";
    };
  }
}

/* 별점 매기는 일반 for문

for (let i = 10; i < 20; i++) {
  rating_stars[i].onmouseover = () => {
    for (let j = 10; j < i + 1; j++) {
      rating_stars[j].style.color = "blue";
      seen[1].innerHTML = j + 1 - 10;
    }
  };
  rating_stars[i].onmouseout = () => {
    for (let j = 10; j < i + 1; j++) {
      rating_stars[j].style.color = "darkgray";
    }
  };
  rating_stars[i].onclick = () => {
    popover[1].style.display = "none";
  };
}
*/
