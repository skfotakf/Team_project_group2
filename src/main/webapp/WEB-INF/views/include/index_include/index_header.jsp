<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal"/> 
</sec:authorize>
<link rel="stylesheet" href="/css/index_include.css" />
	<script type="text/javascript" src="/js/index.js"></script>
<header id="header">
        <div class="JMKYheader">

            <h1><a href="/chart/boxoffice/1" class="logo">JMKY</a></h1>

            <ul id="menu">
                <a href="">
                    <li class="icon"><i class="fas fa-list"></i> Menu</li>
                </a>
            </ul>
            <div id="search_container1">
                
                <form id="search_container" method="get" action="/find">
                <input type="search" placeholder="Search JMKY" id="key-search" name="findValue">
                <button type="submit" class="find_submit"><i class="fas fa-search"></i></button>
                </form >
            </div>
            <ul class="top_nav">
                <a href="">
                    <li>JMKYPro </li>
                </a>
                <a href="/user/likelist">
                    <li><i class="far fa-plus-square"></i> Likelist</li>
                </a>
                <c:choose>
                	<c:when test="${empty principal.user }">
		                <a href="/auth/signin"><li>Sign In </li></a>
                	</c:when>
                	
                	<c:otherwise>
                		
	               			<a href="/auth/mypage"><li class="ellipsis">${principal.user.username } 님</li></a>
                			<div>
                				<a href="/logout"><li><i class="fas fa-sign-out-alt"></i></li></a>
                			</div>
                	</c:otherwise>
                
                </c:choose>
            </ul>
        </div>
</header>