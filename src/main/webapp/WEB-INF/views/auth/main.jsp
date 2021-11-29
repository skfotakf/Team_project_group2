<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign in with JMKY</title>
    <link rel="stylesheet" href="/index_include.css">
    <link rel="stylesheet" href="/main.css">
</head>

<body>
   <jsp:include page="include/index_include/index_header.jsp"></jsp:include>

    <!--main-->
    <div class="wrap">
        <section id="main_top">
            <div class="title_block_container">
                <div class="title_block">
                    <h1>쇼생크 탈출</h1>
                    <div>
                        <li>
                            <a>1994</a>
                            ㆍ<a> 15 </a>ㆍ 2h22m
                        </li>
                    </div>
                </div>
                <div class="rating_bar_container">
                    <div class="rating_bar_btn">
                        <div class="rating_bar_header"><p>JMKY RATING</p></div>
                        <a href="">
                            <div id="rating_star">
                                <i class="fas fa-star fa-2x"></i>
                                <div>
                                    <span>&nbsp;9.3/10</span>
                                    <div id="mini_txt">&nbsp;2.5M</div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="rating_bar_btn">
                        <div class="rating_bar_header"><p>YOUR RATING</p></div>
                        <a href="">
                            <div id="rating_star">
                                <i class="far fa-star fa-2x"></i>
                                <div id="rate">&nbsp;Rate</div>
                            </div>
                        </a>
                    </div>
                    <div class="rating_bar_btn">
                        <div class="rating_bar_header"><p>POPULALITY</p></div>
                        <a href="">
                            <div id="rating_star">
                                <i class="fas fa-chart-line fa-2x"></i>
                                <div id="popularity_box">
                                    <div>&nbsp;38</div>
                                    <div>&nbsp;<i class="fas fa-sort-up"></i> 14</div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
            <div id="sub_nav">
                <div>
                    <ul>
                        <li><a href="">cast & crew</a></li>
                        <li>ㆍ<a href=""> User reviews</a></li>
                        <li>ㆍ<a href=""> Trivia</a></li>
                        <li>ㆍ<a href=""> JMKYPro</a></li>
                        <button type="button"><i class="fas fa-th-large"></i>&nbsp;All topics</button>
                        <button type="button"><i class="fas fa-code-branch"></i></button>
                    </ul>
                </div>
            </div>
            <div id="main_img">
                <div id="poster"></div>
                <div id="preview"></div>
            </div>
            <div id="content_container">
                <div id="content_left">
                    <div class="drama">
                        <div>
                            <a href="">Drama</a>
                        </div>
                        <span>
                            Two imprisoned men bond over a number of years, finding solace and eventual redemption<br>through acts of common decency.
                        </span>
                    </div>
                    <ul>
                        <li id="director"><span>Director</span>&nbsp;&nbsp;<a href="">Frank Darabont</a></li>
                        <li id="writers">
                            <span>Writers</span>
                            <div>
                                <a href="">Stephen King</a><span>&nbsp;(based on the short novel "Rita Hayworth and the Shawshank Redemption" by)</span><br>
                                <a href="">Frank Darabont</a><span>&nbsp;(screenplay by)</span>
                            </div>
                        </li>
                        <li id="stars">
                            <a href="">Stars</a>
                            <a href="">Tim Robbins</a>
                            ㆍ<a href="">Morgan Freeman</a>
                            ㆍ<a href="">Bob Gunton</a>
                        </li>
                        <li id="jmkypro">
                            <div>
                                <a href="">
                                    JMKYPro
                                    <span>See production, box office & company info&nbsp;<i class="fas fa-external-link-alt"></i></span>
                                </a>
                            </div>
                        </li>
                    </ul>
                </div>
                <div id="content_right">
                    <div id="content_right_top">
                        <button type="button" id="add_watchlist">
                            <i class="fas fa-plus"></i>
                            <div>Add to Watchlist</div>
                        </button>
                        <button type="button" id="watchlist_list">
                            <i class="fas fa-chevron-down"></i>
                        </button>
                    </div>
                    <ul id="review_content">
                        <li id="user_review">
                            <a href=""><span>9.6K </span><span>User reviews</span></a>
                        </li>
                        <li id="critic_review">
                            <a href=""><span>193 </span><span>Critic reviews</span></a>
                        </li>
                        <li id="metascore">
                            <a href=""><span>80 </span><span>Metascore</span></a>
                        </li>
                    </ul>
                </div>
            </div>
        </section>

        <section id="main_footer">


        </section>

    </div>

   


    <jsp:include page="include/index_include/index_footer"></jsp:include>


</body>
<script src="https://kit.fontawesome.com/b3187be5e2.js" crossorigin="anonymous"></script>
</html>