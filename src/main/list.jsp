<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/mainNav.css" />
    <link rel="stylesheet" href="css/list.css" />
  </head>
  <body>
    <div class="container">
      <header>
        <div class="imdb_header">
          <div class="page-content-container">
            <a class="imdb-header_logo-link">
              <img class="img_imdb" src="image/imdb1.png" />
            </a>
            <label class="imdb_menu">Menu</label>
            <div class="search-container">
              <form class="nav-search-form">
                <div class="search-category-selector">
                  <label class="categories" role="button">All</label>
                </div>
                <div class="search-input-container">
                  <input type="text" class="search-input" />
                </div>
                <button id="suggestion-search-button">검색</button>
              </form>
            </div>

            <div class="navbar_user">
              <a
                class="IMDbPro"
                href="https://pro.imdb.com/login/ap?u=/login/lwa&imdbPageAction=signUp&rf=cons_nb_hm&ref_=cons_nb_hm"
                >IMDbPro</a
              >
              <div class="navbar_bar"></div>
              <a class="watchlist">Watchlist</a>
              <a class="signin-text">Sign In</a>
            </div>
          </div>
        </div>
      </header>
      <div class="wrapper">
        <div class="pagecontent">
          <div class="content-2-wide">
            <div class="main"></div>
            <div class="sidebar">
              <div class="sidebar-top"></div>
              <div class="sidebar-widget">
                <div class="sidebar-title">
                  <h5 class="title-yhs">You Have Seen</h5>
                </div>
                <div class="sidebar-seen">
                  <span>0&nbsp;</span>
                  <span>/250</span>
                  <span>( 0% )</span><br />
                  <div>
                    <input class="seen-title" type="checkbox" />
                    <label for="seen-title">Hide titles I've seen</label>
                  </div>
                </div>
              </div>
              <div class="sidebar-widget">
                <h3>YMCK Charts</h3>

                <a>Box Office</a><br />
                <a>Most Popular Movies</a><br />
                <a>Top 250 Movies</a><br />
                <a>Top Rated English Movies</a><br />
                <a>Most Popular TV Shows</a><br />
                <a>Top 250 TV Shows</a><br />
                <a>Top Rated Indian Movies</a><br />
                <a>Lowest Rated Movies</a>
              </div>
              <div class="sidebar-widget">
                <h3>YMCK Charts</h3>

                <a>Action </a><br />
                <a>Adventure</a><br />
                <a>Animation</a><br />
                <a>Biography</a><br />
                <a>Comedy</a><br />
                <a>Crime</a><br />
                <a>Drama</a><br />
                <a>Family</a>
                <a>Fantasy </a><br />
                <a>Film-Noir</a><br />
                <a>History</a><br />
                <a>Horror</a><br />
                <a>Music</a><br />
                <a>Musical</a><br />
                <a>Mystery</a>
                <a>Romance</a><br />
                <a>Sci-Fi</a><br />
                <a>Sport</a><br />
                <a>Thriller</a><br />
                <a>War</a><br />
                <a>Western</a>
              </div>
            </div>
          </div>
        </div>
        <div id="rvi-div">
          <div class="recently-viewed"></div>
        </div>
      </div>
      <div id="imdbFooter"></div>
    </div>
  </body>
</html>
