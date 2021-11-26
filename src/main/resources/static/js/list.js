const desc = document.querySelector(".desc");

const imdb_rating_number = document.querySelectorAll(".imdb_rating_number");

const seen_star = document.querySelectorAll(".seen_star");
const seen = document.querySelectorAll(".seen");
const popover = document.querySelectorAll(".popover");

const rating_stars = document.querySelectorAll(".rating_stars");
const popover_delete = document.querySelectorAll(".popover_delete");
const like_heart = document.querySelectorAll(".like_heart");
const like_count = document.querySelectorAll(".like_count");

const sidebar_seen_movies = document.querySelector(".sidebar_seen_movies");

const descend = document.querySelector(".descend");

descend.onclick = () =>{
	alert("바보!");
}



let seen_movies_number = sidebar_seen_movies.innerText;
let ratingNumber = new Array(10);

let likeNumber = new Array(10);

// 날짜
let today = new Date();
let year = today.getFullYear(); // 년도
let month = today.getMonth() + 1; // 월
let date = today.getDate(); // 날짜

desc.innerHTML = year + "/" + month + "/" + date;

//별 누르면 seen 나오고, sidebar 숫자 1 추가
for (let p = 0; p < 10; p++) {
  seen_star[p].onclick = () => {
    if (seen_star[p].style.color == "darkgray") {
      seen_star[p].style.color = "rgba(109,174,272,0.5)";
      seen[p].style.display = "inline-block";
      seen[p].innerHTML = "seen";
      seen_movies_number = parseInt(seen_movies_number) + 1;
      sidebar_seen_movies.innerHTML = seen_movies_number;
    } else {
      popover[p].style.display = "block";
    }
  };
}

// x 아이콘 누르면 popover 사라지고 평점 원래대로 돌아옴
for (let q = 0; q < 10; q++) {
  ratingNumber[q] = imdb_rating_number[q].innerText;
  const firstRatingNumber1 = parseFloat(ratingNumber[q]);
  popover_delete[q].onclick = () => {
    popover[q].style.display = "none";
    seen_star[q].style.color = "darkgray";
    seen[q].innerHTML = "";
    seen_movies_number = parseInt(seen_movies_number) - 1;
    sidebar_seen_movies.innerHTML = seen_movies_number;
    imdb_rating_number[q].innerHTML = firstRatingNumber1;
  };
}

// 별점 생성, 별점의 숫자 반영
for (let k = 0; k < 10; k++) {
  ratingNumber[k] = imdb_rating_number[k].innerText;
  const firstRatingNumber = parseFloat(ratingNumber[k]);
  for (let i = 10 * k + 0; i < 10 * k + 10; i++) {
    rating_stars[i].onmouseover = () => {
      for (let j = 10 * k; j < i + 1; j++) {
        rating_stars[j].style.color = "#5285FF";
        seen[k].innerHTML = j + 1 - 10 * k;
        seen[k].style.fontSize = "16px";
        seen[k].style.width = "30px";
        seen[k].style.top = "1.5px";
        seen[k].style.textAlign = "center";
      }
    };
    rating_stars[i].onmouseout = () => {
      for (let j = 0; j < i + 1; j++) {
        rating_stars[j].style.color = "darkgray";
      }
    };
    rating_stars[i].onclick = () => {
      popover[k].style.display = "none";
      seen_star[k].style.color = "#5285FF";
      ratingNumber[k] =
        (firstRatingNumber * 10 + parseInt(seen[k].innerText)) / 11;
      imdb_rating_number[k].innerHTML = ratingNumber[k].toFixed(1);
    };
  }
}
// 하트 생성, 하트수 증감
for (let r = 0; r < 10; r++) {
  likeNumber[r] = like_count[r].innerText;

  like_heart[r].onclick = () => {
    if (like_heart[r].style.color == "darkgray") {
      likeNumber[r] = parseInt(likeNumber[r]) + 1;
      like_count[r].innerHTML = likeNumber[r];
      like_heart[r].style.color = "#E04386";
    } else {
      likeNumber[r] = parseInt(likeNumber[r]) - 1;
      like_count[r].innerHTML = likeNumber[r];
      like_heart[r].style.color = "darkgray";
    }
  };
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
