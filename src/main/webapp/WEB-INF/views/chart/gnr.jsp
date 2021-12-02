<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Gnr</title>
    <link rel="stylesheet" href="/css/index_include.css" />
    <link rel="stylesheet" href="/css/gnr.css" />
    
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>

<body>
    <div class="container">

        <jsp:include page="../include/index_include/index_header.jsp"></jsp:include>
        <!--main-->
        <div class="wrap">
            <div class="main">
                <div class="main_component">
                    <div id="sub_list">
                        <h1>Feature Film, Rating Count at least 25,000, Action (Sorted by JMKY Rating Descending)</h1>
                        <div class="nav">
                            <span>1-50 of 1,591 titles. </span>
                            <label> | </label>
                            <a href="">Next >></a>
                        </div>
                        <br class="clear">
                        <div id="sort">
                            <span>Sort by : </span>
                            <a href="">Popularity</a>
                            <label> | </label>
                            <a href="">A-Z</a>
                            <label> | </label>
                            <a href="">User Rating</a>
                            <label> | </label>
                            <a href="">Number of Votes</a>
                            <label> | </label>
                            <a href="">US Box Office</a>
                            <label> | </label>
                            <a href="">Runtime</a>
                            <label> | </label>
                            <a href="">Year</a>
                            <label> | </label>
                            <a href="">Release Date</a>
                            <label> | </label>
                            <a href="">Date of Your Rating</a>
                            <label> | </label>
                            <a href="">Your Rating</a>
                        </div>
                        <br class="clear">

                        <div class="item_list">
                            <div id="movie_poster">
                                <a href=""><img src="/images/darknight.jpg" alt=""></a>
                            </div>
                        
                            <div class="item_list_content">
                                <h3>
                                    <span>1. </span>
                                    <a href="">다크나이트</a>
                                    <span> (2008)</span>
                                </h3>
                                <p id="movie_detail">
                                    <span>15</span>
                                    <label> | </label>
                                    <span>152 min</span>
                                    <label> | </label>
                                    <span>Action, Crime, Drama</span>
                                </p>
                                <div id="rating_bar">
                                    <div class="rating_star">
                                        <i class="fas fa-star fa"></i>
                                            <span>&nbsp;9.0</span>
                                    </div>
                                    <div class="rating_star">
                                        <i class="far fa-star fa"></i>
                                        &nbsp;<a>Rate this</a>
                                    </div>
                                </div>
                                <p id="plot">When the menace known as the Joker wreaks havoc and chaos on the people of
                                    Gotham, Batman must accept one of the greatest pasychplogical and physical tests of
                                    his ability to fight injustice
                                </p>
                                <div id="credits">
                                    <span>Director : </span>
                                    <a href="">Christopher Nolan</a>
                                    <label> | </label>
                                    <span>Stars : </span>
                                    <a href="">Christian Bale</a>,
                                    <a href=""> Heath Ledger</a>,
                                    <a href=""> Aaron Eckhart</a>,
                                    <a href=""> Michael Caine</a>
                                </div>
                                <div id="sort_num">
                                    <span>Votes: 2,449,080</span>
                                    <label> | </label>
                                    <span>Gross: $534.86M</span>
                                </div>
                                
                            </div>
                        </div>



                        <div class="item_list">
                            <div id="movie_poster">
                                <a href=""><img src="/images/thelordoftherings.jpg" alt=""></a>
                            </div>
                        
                            <div class="item_list_content">
                                <h3>
                                    <span>2. </span>
                                    <a href="">반지의 제왕 : 왕의 귀환</a>
                                    <span> (2003)</span>
                                </h3>
                                <p id="movie_detail">
                                    <span>12</span>
                                    <label> | </label>
                                    <span>201 min</span>
                                    <label> | </label>
                                    <span>Action, Adventure, Drama</span>
                                </p>
                                <div id="rating_bar">
                                    <div class="rating_star">
                                        <i class="fas fa-star fa"></i>
                                            <span>&nbsp;8.9</span>
                                    </div>
                                    <div class="rating_star">
                                        <i class="far fa-star fa"></i>
                                        &nbsp;<a>Rate this</a>
                                    </div>
                                </div>
                                <p id="plot">Gandalf and Aragorn lead the Wprld of Men against Sauron's army to draw his gaze
                                    from Frodo and Sam as they approach Mount Doom with the One Ring.
                                </p>
                                <div id="credits">
                                    <span>Director : </span>
                                    <a href="">Peter Jackson</a>
                                    <label> | </label>
                                    <span>Stars : </span>
                                    <a href="">Elijah Wood</a>,
                                    <a href=""> Viggo Mortensen</a>,
                                    <a href=""> Ian McKellen</a>,
                                    <a href=""> Orlando Bloom</a>
                                </div>
                                <div id="sort_num">
                                    <span>Votes: 1,726,915</span>
                                    <label> | </label>
                                    <span>Gross: $377.85M</span>
                                </div>
                                
                            </div>
                        </div>

                    </div>
                    <div class="nav">
                        <span>1-50 of 1,591 titles. </span>
                        <label> | </label>
                        <a href="">Next >></a>
                    </div>
                </div>
            </div>
            <div class="recently_view">
                <div class="rhs">
                    <a href="#" id="clear_rvi">Clear your history</a>
                </div>
                <h3>Recently View</h3>
            </div>
            
        </div>
        <jsp:include page="../include/index_include/index_footer.jsp"></jsp:include>
    </div>
    <script src="https://kit.fontawesome.com/a04df2c0ca.js" crossorigin="anonymous"></script>
</body>

</html>