<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="/css/signin.css" />
    <link rel="stylesheet" href="/css/style.css" />
    <link rel="stylesheet" href="/css/mainNav.css" />
    <link rel="stylesheet" href="/css/chart.css" />
    <link rel="stylesheet" href="/css/top250chart.css" />
     <script src="http://code.jquery.com/jquery-latest.min.js"></script>
  </head>
  <body>
    <div class="container">
      <jsp:include page="../include/index_include/index_header.jsp"></jsp:include>

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
                    <form>
                    <select class="lister_sortby">
                      
                      <option value="jr:descending">JMKY Ranking</option>
                      <option value="rd:descending">Release Date</option>
                      <option value="nl:descending">Number of Likes</option>
                      
                    </select>
                    <span class="submit_sortby">확인</span>
                    </form>
                    <input type="hidden" value="${ascDesc }" class="ascDesc">
                    <span class="ascending" style="display:none"></span>
                    <span class="descending" style="display:none"></span>
                  </div>
                  <div class="desc">Showing 250 titles</div>
                
                  <br>
                  <input type="hidden" value="${nameSortby }" class="nameSortby" >
                  <span class="sortbyRanking">Sort by : JMKY Ranking</span>
                  <span class="sortbyRelease">Sort by : Release Date</span>
                  <span class="sortbyLike">Sort by : Number of Likes</span>
                  <table class="chart">
                <thead class="chart_header">
                  <tr>
                    <th class="chart_poster"></th>
                    <th class="chart_title">Title</th>
                    <th class="chart_rating chart_rating_title">
                      IMDb <br />Rating
                    </th>
                    <th class="chart_date chart_date_title">Date</th>
                    <th class="chart_count">Count</th>
                    <th class="chart_like">Like</th>
                  </tr>
                </thead>
                <tbody class="chart_main">
                  <c:forEach var="chartAll" items="${chartAll }">
                  <input class="mov_idn1" type="hidden" value=${chartAll.mov_idn }>
                  <tr>
                  
                    <td class="chart_poster">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        ><img src="/images/${chartAll.mov_photo }"
                      ></a>
                    </td>
                    <td class="chart_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >${chartAll.mov_title }</a
                      >
                    </td>
                    <td class="chart_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;<span class="imdb_rating_number">${chartAll.mov_rat }</span>
                        </div>
                        <div class="my_rating">
                          <div class="popover" style="display: none">
                            <span class="popover_delete"></span>
                            <ul class="popover_rating">
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star1"
                                  style="color: darkgray"
                                  
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star2"
                                  style="color: darkgray"
                                  
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star3"
                                  style="color: darkgray"
                                 
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star4"
                                  style="color: darkgray"
                                 
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star5"
                                  style="color: darkgray"
                                 
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star6"
                                  style="color: darkgray"
                                  
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star7"
                                  style="color: darkgray"
                               
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star8"
                                  style="color: darkgray"
                                 
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star9"
                                  style="color: darkgray"
                                 
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star10"
                                  style="color: darkgray"
                                 
                                ></i>
                              </li>
                            </ul>
                          </div>
						  <c:choose>
						  	<c:when test="${chartAll.rating_user_id eq null }">
						  		<i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
						  	</c:when>
                          	<c:when test="${chartAll.rating_rating eq 0 }">
                          		<i
                            class="fas fa-star seen_star"
                            style="color: rgba(109,174,272,0.5)"
                          ></i>
                          	</c:when>
                          	<c:when test="${chartAll.rating_rating > 0 }">
                          		<i
                            class="fas fa-star seen_star"
                            style="color: #5285FF"
                          ></i>
                          	</c:when>
						  
                         
                          </c:choose>
                          
                          <c:choose>
                          	<c:when test="${empty chartAll.rating_user_id  }"><span class="seen" style="font-size: 13px"></span> </c:when>
                          	<c:when test="${chartAll.rating_rating eq 0 }">
                          		<span class="seen" style="font-size: 13px">seen</span>
                          	</c:when>
                          	<c:when test="${chartAll.rating_rating > 0 }">
                          		<span class="seen" style="font-size: 16px;width:30px;top:1.5px;textAlign:center;">${chartAll.rating_rating }</span>
                          	</c:when>
                          </c:choose>
                          
                        </div>
                      </div>
                    </td>
                    <td class="chart_date">${chartAll.mov_release }</td>
                    <td class="chart_count"><span class="movie_count">${chartAll.mov_viewCnt }</span></td>
                    <td class="chart_like">
                      <div class="like_widget">
                        <div class="imdb_like">
                          <i
                            class="fas fa-heart like_heart"
                            style="color: ${chartAll.like_user_id eq null ? 'darkgray' : '#E04386'}"
                          ></i>
                        </div>
                        <div class="people_like">
                          <div style="font-size: 13px">
                            <span class="like_count">${chartAll.mov_lik_cnt }</span> likes
                          </div>
                        </div>
                      </div>
                    </td>
                  </tr>
                  </c:forEach>
                </tbody>
              </table>
              <div class="text_smaller">
                Reported by
                <a href="https://www.boxofficemojo.com/">Box Office Mojo</a> ©
                2021
              </div>
              
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

                <a href="/chart/boxoffice/1">Box Office</a><br />
                <a>Most Popular Movies</a><br />
                <a href="/chart/top/1">Top 250 Movies</a><br />
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
      <jsp:include page="../include/index_include/index_footer.jsp"></jsp:include>
    </div>
	<script type="text/javascript" src="/js/chart.js"></script>
	<script type="text/javascript" src="/js/top.js"></script>
    <script
      src="https://kit.fontawesome.com/a04df2c0ca.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
    