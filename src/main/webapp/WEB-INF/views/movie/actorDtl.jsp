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
	<link rel="stylesheet" href="/css/signin.css" />
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>

<body>

	<jsp:include page="../include/index_include/index_header.jsp"></jsp:include>
	<!--main-->
    <div class="wrap">
    
    </div>

	<jsp:include page="../include/index_include/index_footer.jsp"></jsp:include>
   


</body>
<script src="https://kit.fontawesome.com/b3187be5e2.js" crossorigin="anonymous"></script>
<script type="text/javascript" src="/js/header.js"></script>