<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Movie</title>
   	<link rel="stylesheet" href="/css/index_include.css">
    <link rel="stylesheet" href="/css/main.css">
</head>

<body>

	<jsp:include page="../include/index_include/index_header.jsp"></jsp:include>

    <!--main-->
    <div class="wrap">
        <section id="wrap_top">
            <div id="main_top">
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
                                    <i class="fas fa-star fa-2x" id="star"></i>
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
                                <div class="blue_star" id="rating_star">
                                    <i class="far fa-star fa-2x"></i>
                                    <div id="rate">&nbsp;Rate</div>
                                </div>
                            </a>
                        </div>
                        <div class="rating_bar_btn">
                            <div class="rating_bar_header"><p>POPULALITY</p></div>
                            <a href="">
                                <div id="rating_star">
                                    <i id="grape" class="fas fa-chart-line fa-2x"></i>
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
                            <label> | </label>
                            <button type="button"><i class="fas fa-code-branch"></i></button>
                        </ul>
                    </div>
                </div>

                <div id="main_img">
                    <div id="poster">
                        <img src="shawshank.jpg" alt="">
                    </div>
                    <div id="preview">
                        <iframe width="768px" height="420.95px" src="https://serviceapi.nmv.naver.com/flash/convertIframeTag.nhn?vid=A5E51E0DBA5AC1D27AF8566384EBF6800CF0&outKey=V12594120ff8d4d4f5a1d533404e65d6dcfcb69fb415b3faf222c533404e65d6dcfcb" frameborder="no" scrolling="no" title="NaverVideo" allow="autoplay; gyroscope; accelerometer; encrypted-media" allowfullscreen></iframe>
                        
                    </div>
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
                        <ul class="metadata">
                            <li class="director"><span>Director</span>&nbsp;&nbsp;<a href="">Frank Darabont</a></li>
                            <li class="writers">
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
                                ㆍ<a href="" id="bob">Bob Gunton</a>
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
            </div>
        </section>

        <!--메인 아랫부분-->
        <section id="wrap_bottom">
            <div id="main_footer">
                <div class="ipc_page">
                    <div class="ipc_page_innerbox">
                        <div class="ipc_title_wrapper">
                            <a href="">
                                <h3>배우 <i class="fas fa-chevron-right"></i></h3>
                                <div>
                                    <a href=""><i class="fas fa-pen"></i> Edit</a>
                                </div>
                            </a>
                        </div>
                        <div id="ipc_sub_grid">
                            <div class="actor_wrap">
                                <div>
                                    <i class="fas fa-user-circle fa-3x"></i>
                                </div>
                                <div id="actor_name">
                                    <a href="">Tim Robbins</a>
                                    <span>as Andy Duresne</span>
                                </div>
                            </div>
                            <div class="actor_wrap">
                                <div>
                                    <i class="fas fa-user-circle fa-3x"></i>
                                </div>
                                <div id="actor_name">
                                    <a href="">Tim Robbins</a>
                                    <span>as Andy Duresne</span>
                                </div>
                            </div>
                            <div class="actor_wrap">
                                <div>
                                    <i class="fas fa-user-circle fa-3x"></i>
                                </div>
                                <div id="actor_name">
                                    <a href="">Tim Robbins</a>
                                    <span>as Andy Duresne</span>
                                </div>
                            </div>
                            <div class="actor_wrap">
                                <div>
                                    <i class="fas fa-user-circle fa-3x"></i>
                                </div>
                                <div id="actor_name">
                                    <a href="">Tim Robbins</a>
                                    <span>as Andy Duresne</span>
                                </div>
                            </div>
                            
                        </div>
                        <ul class="metadata">
                            <li class="director"><span>Director</span>&nbsp;&nbsp;<a href="">Frank Darabont</a></li>
                            <li class="writers">
                                <span>Writers</span>
                                <div>
                                    <a href="">Stephen King</a><span>&nbsp;(based on the short novel "Rita Hayworth and the Shawshank Redemption" by)</span>ㆍ
                                    <a href="">Frank<br> Darabont</a><span>&nbsp;(screenplay by)</span>
                                </div>
                            </li>
                            <li class="metadata_list_item">
                                <a href="">All cast & crew</a>
                                <a href=""><i class="fas fa-chevron-right"></i></a>
                            </li>
                            <li class="metadata_list_item">
                                <a href="">See more cast details at JKMYPro</a>
                                <a href=""><i class="fas fa-external-link-alt"></i></a> 
                            </li>
                        </ul>
                    </div>

                    <div id="ipc_right">
                        <div class="ipc_right_box">
                            <div class="ipc_right_wrapper">
                                <a href="">
                                    <h3>전문가 리뷰 <i class="fas fa-chevron-right"></i></h3>
                                </a>
                            </div>
                            <div id="master_review">
                                <div id="master_info">
                                    <span>김형석</span>
                                    <span>2016.02.25</span>
                                </div>
                                <div>
                                    <span><i class="fas fa-star fa"></i>&nbsp;8.5/10</span> 
                                </div>
                                <div>
                                    <div class="user_review_title">
                                        <span>많은 이들의 '인생 영화'</span>
                                    </div>
                                    <div>
                                        20년 넘게 지났지만 언제나 꺼내 봐도,<br> 
                                        이미 여러 번 본 장면들임에도 불구하고,<br>
                                        여전한 감동을 주는 몇 안 되는 영화들 중 하나.<br> 
                                        스티븐 킹의 탄탄한 스토리를 토대로,<br> 
                                        영화는 단 한 순간도 품격을 잃지 않으며<br>
                                        잘 조율되어 있다.<br>
                                        영화가 개봉되었을 때 프랭크 다라본트 감독은,<br> 
                                        이 영화를 본 후 삶의 의미를 되찾았다는<br>
                                        내용의 수많은 편지를 받았다고 한다.<br> 
                                        단순한 영화를 넘어, 용기와 희망을 북돋우는 힐링 무비.
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="ipc_page">
                    <div class="ipc_page_innerbox">
                        <div class="ipc_title_wrapper">
                            <a href="">
                                <h3>유저 리뷰 <i class="fas fa-chevron-right"></i></h3>
                                <div>
                                    <a href=""><i class="fas fa-plus"></i> Review</a>
                                </div>
                            </a>
                        </div>
                        <div id="user_review_container">
                            <div id="review_top">
                                <span>TOP REVIEW</span>
                                <span><i class="fas fa-star fa"></i>&nbsp;9/10</span> 
                    
                            </div>
                            <div class="user_review_title">
                                <span>A Middle Finger To Pigs Everywhere</span>
                            </div>
                            <div>
                                WHAT. A. MOVIE<br><br>
                                It is just so well acted. You beleve it all and want more of every single character!<br><br>
                                Clever,moralistic and entertaining.<br><br>
                                Hollywood has done very few consequential movies since (V For Vendetta, Captain Fantastic and<br>
                                perhaps Watchmen..) so grab this one if you have not watched it.
                            </div>
                            <div id="user_review_bottom">
                                <div>
                                    <button>
                                        <i class="far fa-thumbs-up fa-2x"></i>
                                    </button>
                                    <span>
                                        <span>helpful</span>
                                        <span>ㆍ</span>
                                        <span>14</span>
                                    </span>
                                    <button>
                                        <i class="far fa-thumbs-down fa-2x"></i>
                                    </button>
                                    <span>0</span>
                                </div>
                                <div>
                                    <button>
                                        <i class="fas fa-ellipsis-v"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div>

                    </div>
                </div>

            </div>
        </section>

    </div>

   <jsp:include page="../include/index_include/index_footer"></jsp:include>


</body>
<script src="https://kit.fontawesome.com/b3187be5e2.js" crossorigin="anonymous"></script>
</html>