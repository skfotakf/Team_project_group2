<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JMKY 로그인</title>
    <link rel="stylesheet" href="/css/signin.css">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <link rel="stylesheet" href="/css/index_include.css">
</head>

<body>
    <body>
	<jsp:include page="../include/index_include/index_header.jsp"></jsp:include>
    <div id="root">
        <div class="content1">
            <div id="sign_in_option">
                <div id="sign_in_box">
                    <h1>로그인</h1>
                    <form action="/auth/signin" method="post" id="signinForm">
                    	<input type="hidden" id="flag" value="${empty flag ? 3 : flag }">
                        <div>
                            <input type="text" class="item_ip" name="username"  placeholder="ID">
                        </div>
                        
                        <div>
                            <input type="password" class="item_ip" name="password" placeholder="Password">
                        </div>
                        <c:if test="${msg =='wrongIdPassword'}">
                        <div class="item_message">
                            <span>
                            아이디 또는 비밀번호가 일치하지 않습니다.
                            </span>
                        </div>
                        </c:if>
                        <c:if test="${msg =='loginError'}">
                        <div class="item_message">
                            <span>
                            로그인에 실패했습니다. 다시 확인하세요.
                            </span>
                        </div>
                        </c:if>
                        
                        <div id="login_btns">
                            <div>
                                <button type="submit" class="item_btn btn_login">로그인</button>
                            </div>
                            <div>
                                <button type="button" onclick="location.href='/oauth2/authorization/google'"><a><i class="fab fa-google"></i> 구글 로그인</a></button>
                            </div>
                            <div>
                                <button type="button" onclick="location.href='/oauth2/authorization/facebook'" ><a><i class="fab fa-facebook-square"></i> 페이스북 로그인</a></button>
                            </div>
                            <div>
                                <button type="button" onclick="location.href='/oauth2/authorization/naver'"><a> 네이버 로그인</a></button>
                            </div>
                        </div>
                    </form>
                            
                    <div class="hr-sect">
                        <span>&nbsp;or&nbsp;</span>
                    </div>
                    <div>
                        <button type="button" id="sign_up_btn" onclick="location.href = '/auth/signup'">회원가입</button>
                    </div>
                    <p class="text-center">
                        <small>로그인할 경우, 이용자는 JMKY의
                            <a href="https://www.imdb.com/conditions">이용조건</a>
                             과 
                            <a href="https://www.imdb.com/privacy">개인정보 처리방침</a>
                            에 동의합니다 
                        </small>
                    </p>
                </div>
            </div>
            <div id="sign_in_perks">
                <h1>JMKY에 가입하면...</h1>
                <p>
                    <strong>개인화된 추천</strong><br>
                    좋아하게 될 작품을 만날 수 있습니다
                </p>
                <p>
                    <strong>좋아하는 영화</strong><br>
                    보고싶은 영화를 상영할 때마다 이메일을 받아보세요
                </p>
                <p>
                    <strong>별점</strong><br>
                    이미 본 작품을 별점으로 평가하세요
                </p>
                <p>
                    <strong>JMKY에게</strong><br>
                    당신의 기록은 큰 도움이 됩니다
                </p>

            </div>
        </div>
        <!--  
        <div class="recently_view">
            <div class="rhs">
                <a href="#" id="clear_rvi">Clear your history</a>
            </div>
            <h3>Recently View</h3>
        </div>
		-->
    </div>
	<jsp:include page="../include/index_include/index_footer.jsp"></jsp:include>
	
</body>
<script src="https://kit.fontawesome.com/b3187be5e2.js" crossorigin="anonymous"></script>
<script src="/js/signin.js"></script>
<script src="/js/header.js"></script>
</html>