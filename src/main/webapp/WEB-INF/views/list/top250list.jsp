<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="css/signin.css" />
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/mainNav.css" />
    <link rel="stylesheet" href="css/top250list.css" />
  </head>
  <body>
    <div class="container">
      <header id="header">
        <div class="JMKYheader">
          <h1><a href="" class="logo">JMKY</a></h1>

          <ul id="menu">
            <a href="">
              <li class="icon"><i class="fas fa-list"></i> Menu</li>
            </a>
          </ul>
          <div id="serach_container">
            <select name="serach_navbar" id="serach_navbar">
              <div>
                <option value="all">All</option>
                <option value="Titles">Titles</option>
                <option value="TV Episodes">TV Episodes</option>
                <option value="Celebs">Celebs</option>
                <option value="Companies">Companies</option>
                <option value="Keywords">Keywords</option>
                <option value="Advanced Search">Advanced Search</option>
              </div>
            </select>
            <input type="text" placeholder="Search JMKY" />
            <button><i class="fas fa-search"></i></button>
          </div>
          <ul class="top_nav">
            <a href="">
              <li>JMKYPro</li>
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

      <div class="wrapper">
        <div class="pagecontent">
          <div class="content_2_wide">
            <div class="main">
              JMKY Charts
              <h1>JMKY Top 5 Movies</h1>
              JMKY Top 5 as rated by regular JMKY voters.
              <hr />
              <div class="lister">
                <div class="nav">
                  <div class="sortby">
                    <label>Sort By: </label>
                    <select class="lister_sortby">
                      <option value="rk:ascending" selected="selected">
                        Ranking
                      </option>
                      <option value="jr:descending">JMKY Ranking</option>
                      <option value="rd:descending">Release Date</option>
                      <option value="nr:descending">Number of Ratings</option>
                      <option value="yr:descending">your Raiting</option>
                    </select>
                  </div>
                  <div class="desc">Showing 250 titles</div>
                </div>
              </div>
            </div>
            <div class="sidebar">
              <div class="sidebar_top"></div>
              <div class="sidebar_widget">
                <div class="sidebar_title">
                  <h5 class="title_yhs">You Have Seen</h5>
                </div>
                <div class="sidebar_seen">
                  <span class="sidebar_seen_movies">0&nbsp;</span>
                  <span>/250</span>
                  <span>( 0% )</span><br />
                  <div>
                    <input class="seen_title" type="checkbox" />
                    <label for="seen_title">Hide titles I've seen</label>
                  </div>
                </div>
              </div>
              <div class="sidebar_widget">
                <h3>JMKY Charts</h3>

                <a href="list.html">Box Office</a><br />
                <a>Most Popular Movies</a><br />
                <a>Top 250 Movies</a><br />
                <a>Top Rated English Movies</a><br />
                <a>Most Popular TV Shows</a><br />
                <a>Top 250 TV Shows</a><br />
                <a>Top Rated Indian Movies</a><br />
                <a>Lowest Rated Movies</a>
              </div>
              <div class="sidebar_widget">
                <h3>JMKY Charts</h3>

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
        <div id="rvi_div">
          <div class="recently_viewed"></div>
        </div>
      </div>
      <footer class="footer">
        <div id="icon_box">
          <ul>
            <li>
              <a href=""><i class="fab fa-facebook-square"></i></a>
            </li>
            <li>
              <a href=""><i class="fab fa-instagram"></i></a>
            </li>
            <li>
              <a href=""><i class="fab fa-twitch"></i></a>
            </li>
            <li>
              <a href=""><i class="fab fa-twitter"></i></a>
            </li>
            <li>
              <a href=""><i class="fab fa-youtube"></i></a>
            </li>
          </ul>
        </div>
        <div id="link_box">
          <div class="link_content_box">
            <ul>
              <li>
                <a href=""
                  >Get the JMKY App <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href="">Help <i class="fas fa-external-link-alt"></i></a>
              </li>
              <li>
                <a href=""
                  >Site Index <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href="">JMKYPro <i class="fas fa-external-link-alt"></i></a>
              </li>
              <li>
                <a href=""
                  >Box Office Mojo <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href=""
                  >JMKY Developer <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
            </ul>
          </div>
          <div class="link_content_box">
            <ul>
              <li>
                <a href=""
                  >Press Room <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href=""
                  >Advertising <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href="">Jobs <i class="fas fa-external-link-alt"></i></a>
              </li>
              <li>
                <a href=""
                  >Conditions of Use <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href=""
                  >Privacy Policy <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href=""
                  >Interest-Based Ads <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
            </ul>
          </div>
        </div>
        <div id="JMKY_footer_logo">
          <p>an amazon company</p>
        </div>
        <div id="JMKY_footer_copy">
          <p>&copy; 1990-2021 by JMKY.com, Inc.</p>
        </div>
      </footer>
    </div>

    <script
      src="https://kit.fontawesome.com/a04df2c0ca.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
    