<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="/css/signin.css" />
    <link rel="stylesheet" href="/css/style.css" />
    <link rel="stylesheet" href="/css/mainNav.css" />
    <link rel="stylesheet" href="/css/list.css" />
  </head>
  <body>
    <div class="container">
      <jsp:include page="../include/index_include/index_header.jsp"></jsp:include>
      <div class="wrapper">
        <div class="pagecontent">
          <div class="content_2_wide">
            <div class="main">
              <span class="ab_widget">
                <div class="covid_message">
                  <div class="alert">
                    <p class="alert_message">
                      While theaters are closed, some data on this page may be
                      delayed or unavailable. In the meantime, check out
                      <a href="https://www.imdb.com/whats-on-tv/?ref_=im_2020"
                        >What's on TV and Streaming »</a
                      >
                    </p>
                    <p class="alert_message">
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
              <h1 class="title_topBo">Top Box Office</h1>

              <hr />
              <div class="desc">Weekend of November 12 - 14, 2021</div>
              <table class="list">
                <thead class="list_header">
                  <tr>
                    <th class="list_poster"></th>
                    <th class="list_title">Title</th>
                    <th class="list_rating list_rating_title">
                      IMDb <br />Rating
                    </th>
                    <th class="list_date">Date</th>
                    <th class="list_count">Count</th>
                    <th class="list_like">Like</th>
                  </tr>
                </thead>
                <tbody class="list_main">
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
                        </div>
                        <div class="my_rating">
                          <div class="popover" style="display: none">
                            <span class="popover_delete"></span>
                            <ul class="popover_rating">
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star11"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star12"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star13"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star14"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star15"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star16"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star17"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star18"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star19"
                                  style="color: darkgray"
                                ></i>
                              </li>
                              <li>
                                <i
                                  class="fas fa-star rating_stars"
                                  id="star20"
                                  style="color: darkgray"
                                ></i>
                              </li>
                            </ul>
                          </div>

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                  <tr>
                    <td class="list_poster">
                      <img src="image/eternals.jpg" />
                    </td>
                    <td class="list_title">
                      <a
                        href="https://www.imdb.com/title/tt9032400/?pf_rd_m=A2FGELUUNOQJNL&pf_rd_p=f9f31d04-fc22-4d12-86b4-f46e25aa2f6f&pf_rd_r=0R2767XQ0FBAAFYFRSXF&pf_rd_s=center-1&pf_rd_t=15506&pf_rd_i=boxoffice&ref_=cht_bo_2"
                        >Eternals</a
                      >
                    </td>
                    <td class="list_rating">
                      <div class="seen_widget">
                        <div class="imdb_rating">
                          <i class="fas fa-star" style="color: orange"></i
                          >&nbsp;8.6
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

                          <i
                            class="fas fa-star seen_star"
                            style="color: darkgray"
                          ></i>
                          <span class="seen" style="font-size: 13px"></span>
                        </div>
                      </div>
                    </td>
                    <td class="list_date">11/19</td>
                    <td class="list_count">42</td>
                    <td class="list_like">like</td>
                  </tr>
                </tbody>
              </table>
              <div class="text_smaller">
                Reported by
                <a href="https://www.boxofficemojo.com/">Box Office Mojo</a> ©
                2021
              </div>
            </div>
            <div class="sidebar">
              <div class="sidebar_top"></div>
              <div class="sidebar_widget">
                <div class="sidebar_title">
                  <h5 class="title_yhs">You Have Seen</h5>
                </div>
                <div class="sidebar_seen">
                  <span>0&nbsp;</span>
                  <span>/250</span>
                  <span>( 0% )</span><br />
                  <div>
                    <input class="seen_title" type="checkbox" />
                    <label for="seen_title">Hide titles I've seen</label>
                  </div>
                </div>
              </div>
              <div class="sidebar_widget">
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
              <div class="sidebar_widget">
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
                  >Get the IMDb App <i class="fas fa-external-link-alt"></i
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
                <a href="">IMDbPro <i class="fas fa-external-link-alt"></i></a>
              </li>
              <li>
                <a href=""
                  >Box Office Mojo <i class="fas fa-external-link-alt"></i
                ></a>
              </li>
              <li>
                <a href=""
                  >IMDb Developer <i class="fas fa-external-link-alt"></i
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
    <script type="text/javascript" src="/js/list.js"></script>

    <script
      src="https://kit.fontawesome.com/a04df2c0ca.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>