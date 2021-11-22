const mystar = document.querySelector("#mystar");
const myrating = document.querySelector(".myrating");

mystar.onclick = () => {
  mystar.style.color = "rgba(109,174,272,0.5)";
  myrating.style.display = "inline-block";
};
