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
            <div class="main">
              <span class="ab-widget">
                <div class="covid-message">
                  <div class="alert">
                    <p class="alert-message">
                      While theaters are closed, some data on this page may be
                      delayed or unavailable. In the meantime, check out
                      <a href="https://www.imdb.com/whats-on-tv/?ref_=im_2020"
                        >What's on TV and Streaming »</a
                      >
                    </p>
                    <p class="alert-message">
                      If you’re going out to the movies (or going out anywhere),
                      please stay safe! Check out the
                      <a
                        href="https://www.who.int/emergencies/diseases/novel-coronavirus-2019/question-and-answers-hub/q-a-detail/q-a-on-covid-19-and-masks"
                        >World Health Organization’s guidance on the use of
                        masks</a
                      >
                      to prevent the spread of COVID-19.
                    </p>
                  </div>
                </div>
              </span>
              <h1 class="title-topBo">Top Box Office</h1>

              <hr />
              <div class="desc">Weekend of November 12 - 14, 2021</div>
              <table class="list">
                <thead class="list-header">
                  <tr>
                    <th class="list-poster"></th>
                    <th class="list-title">Title</th>
                    <th class="list-rating list-rating-title">
                      IMDb <br />Rating
                    </th>
                    <th class="list-date">Date</th>
                    <th class="list-count">Count</th>
                    <th class="list-like">Like</th>
                  </tr>
                </thead>
                <tbody class="list-main">
                  <tr>
                    <td class="list-poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list-title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list-rating">
                      <div class="seen-widget">
                        <div class="boundary-left">
                          <div class="popover"></div>
                        </div>
                        
                        <i class="fas fa-star" style="color: orange"></i
                        >&nbsp;8.6<br />
                        <i
                          class="fas fa-star"
                          style="color: darkgray"
                          id="mystar"
                        ></i>
                        <span class="myrating" style="font-size: 13px"
                          >seen</span
                        >
                      </div>
                    </td>
                    <td class="list-date">11/19</td>
                    <td class="list-count">42</td>
                    <td class="list-like">like</td>
                  </tr>
                </tbody>
              </table>
              <div class="text-smaller">
                Reported by
                <a href="https://www.boxofficemojo.com/">Box Office Mojo</a> ©
                2021
              </div>
            </div>
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
    <script type="text/javascript" src="js/list.js"></script>

    <script
      src="https://kit.fontawesome.com/a04df2c0ca.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
