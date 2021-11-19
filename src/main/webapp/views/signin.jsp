<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign in with IMDB</title>
    <link rel="stylesheet" href="css/signin.css">
</head>

<body>
    <header id="header">
        <div class="imdbheader">

            <h1><a href="" class="logo">IMDb</a></h1>

            <ul id="menu">
                <a href="">
                    <li class="icon"><i class="fas fa-list"></i> Menu</li>
                </a>
            </ul>
            <div id="serach_container">
                <input type="text" placeholder="Search IMDb">
            </div>
            <ul class="top_nav">
                <a href="">
                    <li>IMDbPro </li>
                </a>
                <a href="">
                    <li><i class="far fa-plus-square"></i> Watchlist</li>
                </a>
                <a href="">
                    <li>Sign In</li>
                </a>
            </ul>
        </div>
    </header>




    <div id="root">
        <div class="content1">
            <div id="sign_in_option">
                <div id="sign_in_box">
                    <h1>Sign in</h1>
                    <div>
                        <input type="text" placeholder="Email">
                    </div>
                    <div>
                        <input type="password" placeholder="password">
                    </div>
                    <div>
                        <button type="button">로그인</button>
                    </div>
                    <div class="hr-sect">
                        <span>&nbsp;or&nbsp;</span>
                    </div>
                    <div>
                        <button type="button">회원가입</button>
                    </div>
                    <p class="text-center">
                        <small>By signing in, you agree to IMDb's
                            <a href="">Conditions of Use</a>
                             and 
                            <a href="">Privacy Policy</a> 
                        </small>
                    </p>
                </div>
            </div>
            <div id="sign_in_perks">
                <h1>Benefits of your free IMDb account</h1>
                <p>
                    <strong>Personalized Recommendations</strong><br>
                    Discover shows you'll love.
                </p>
                <p>
                    <strong>Your Watchlist</strong><br>
                    Track everything you want to watch and receive e-mail when<br>
                    movies open in theaters.
                </p>
                <p>
                    <strong>Your Ratings</strong><br>
                    Rate and remember everything you've seen.
                </p>
                <p>
                    <strong>Contribute to IMDb</strong><br>
                    Add data that will be seen by millons of people and get cool<br>
                    badges.
                </p>

            </div>
        </div>
        <div class="recently_view">
            <div class="rhs">
                <a href="#" id="clear_rvi">Clear your history</a>
            </div>
            <h3>Recently View</h3>
        </div>

    </div>


    <footer class="footer">
        <div id="icon_box">
            <ul>
                <li><a href=""><i class="fab fa-facebook-square fa-2x"></i></a></li>
                <li><a href=""><i class="fab fa-instagram fa-2x"></i></a></li>
                <li><a href=""><i class="fab fa-twitch fa-2x"></i></a></li>
                <li><a href=""><i class="fab fa-twitter fa-2x"></i></a></li>
                <li><a href=""><i class="fab fa-youtube fa-2x"></i></a></li>
                
            </ul>
        </div>
        <div id="link_box">
            <div class="link_content_box">
                <ul>
                    <li><a href="">Get the IMDb App<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Help<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Site Index<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">IMDbPro<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Box Office Mojo<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">IMDb Developer<i class="fas fa-external-link-alt"></i></a></li>
                </ul>
            </div>
            <div class="link_content_box">
                <ul>
                    <li><a href="">Press Room<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Advertising<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Jobs<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Conditions of Use<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Privacy Policy<i class="fas fa-external-link-alt"></i></a></li>
                    <li><a href="">Interest-Based Ads<i class="fas fa-external-link-alt"></i></a></li>
                </ul>
            </div>
        </div>
        <div>
            
        </div>
        <div>
            
        </div>

    </footer>


</body>
<script src="https://kit.fontawesome.com/b3187be5e2.js" crossorigin="anonymous"></script>

</html>