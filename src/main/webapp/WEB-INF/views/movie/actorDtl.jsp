<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Actor</title>
<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal"/> 
</sec:authorize>
	<link rel="stylesheet" href="/css/index_include.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/actorDtl.css" />
    <link rel="stylesheet" href="/css/style.css" />
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>

<body>

	<jsp:include page="../include/index_include/index_header.jsp"></jsp:include>
	<!--main-->
    <div class="wrapper">
    	<div class="pagecontent">
    		 <div class="content_2_wide">
    		 	<div class="maindetails_center" id="maindetails_center_top">
    		 		<div class="article name-overview with-hero">
    		 			<div id="name-overview-widget" class="name-overview-widget">
    		 				<table id="name-overview-widget-layout" >
    		 					<tbody>
    		 						<tr>
    		 							<td class="name-overview-widget__section">
    		 								<h1 class="header">
    		 									<span class="itemprop">Daniel Radcliffe</span>
    		 								</h1>
    		 								<div class="infobar" id="name-job-categories">
    		 									<a href="#">
    		 										<span class="itemprop"> Actor</span>
    		 									</a>
    		 									<span class="ghost">|</span>
    		 									<a href="#">
    		 										<span class="itemprop"> Producer</span>
    		 									</a>
    		 									<span class="ghost">|</span>
    		 									<a href="#">
    		 										<span class="itemprop"> Soundtrack</span>
    		 									</a>
    		 									<hr>
    		 								</div>
    		 							</td>
    		 						</tr>
    		 						<tr>
    		 							<td id="img_primary">
    		 								<div class="poster-hero-container">
    		 									<img id="name-poster" height="263.6" width="178" alt="Daniel Radcliffe Picture" title="Daniel Radcliffe Picture" 
    		 									src="https://m.media-amazon.com/images/M/MV5BZmE0NzNiNzQtYTVlYS00MjljLWE4MTgtYzYxNjU2NjZkM2M4XkEyXkFqcGdeQXVyNjY5NDgzNjQ@._V1_UX214_CR0,0,214,317_AL_.jpg">
    		 									<div class="videoPreview">
    		 										<iframe width="506" height="263.6" src="https://www.youtube.com/embed/fc7DhqpPans" frameborder="no" scrolling="no" title="NaverVideo" allow="autoplay; gyroscope; accelerometer; encrypted-media" allowfullscreen></iframe>
    		 									</div>
    		 								
    		 								</div>
    		 								
    		 							</td>
    		 						</tr>
    		 						<tr>
    		 						
    		 						</tr>
    		 					</tbody>
    		 				</table>
    		 			</div>
    		 		
    		 		</div>
    		 	</div>
    		 	<div class="maindetails_sidebar_bottom"></div>
    		 </div>
    	</div>
    
    </div>

	<jsp:include page="../include/index_include/index_footer.jsp"></jsp:include>
   


</body>
<script src="https://kit.fontawesome.com/b3187be5e2.js" crossorigin="anonymous"></script>
<script type="text/javascript" src="/js/header.js"></script>