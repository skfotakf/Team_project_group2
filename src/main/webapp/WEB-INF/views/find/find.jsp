<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find</title>
	<link rel="stylesheet" href="/css/index_include.css" />
    <link rel="stylesheet" href="/css/find.css" />
    
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
	
	<div class="container">
		<jsp:include page="../include/index_include/index_header.jsp"></jsp:include>
     	<div class="wrap">
            <div class="main">
                <div class="main_component">
                    <div id="sub_list">
                    	<c:set var="findMovie" value="${findMovie }" />
                    	<c:if test="${findMovie[0].mov_title eq 'Eternals' }">
                    		<h1>Results for "${findMovie[0].mov_title }"</h1>
                    	</c:if>
                        
                        <div class="findSection">
                            <h3 class="findSectionHeader">Titles</h3>
                            <table class="findList">
                                <tbody>
                                    <tr class="findResult">
                                        <td class="primary_photo">
                                            <a href="https://www.imdb.com/title/tt9032400/?ref_=fn_al_tt_1">
                                                <img src="/images/find_eternals.jpg" alt="">
                                            </a>
                                        </td>
                                        <td class="result_text">
                                            <a href="https://www.imdb.com/title/tt9032400/?ref_=fn_al_tt_1">이터널스</a>
                                            (2021)
                                            <br>
                                            
                                        </td>
                                    </tr>
                                    <tr class="findResult">
                                        <td class="primary_photo">
                                            <a href="https://www.imdb.com/title/tt4118878/?ref_=fn_al_tt_2">
                                                <img src="/images/find_eternals1.jpg" alt="">
                                            </a>
                                        </td>
                                        <td class="result_text">
                                            <a href="https://www.imdb.com/title/tt4118878/?ref_=fn_al_tt_2">이터널스</a>
                                            (2014) (TV Mini Series) 
                                            <br>
                                            
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="findSection">
                            <h3 class="findSectionHeader">Names</h3>
                            <table class="findList">
                                <tbody>
                                    <tr class="findResult">
                                        <td class="primary_photo">
                                            <a href="https://www.imdb.com/name/nm13093902/?ref_=fn_al_nm_1">
                                                <img src="/images/makeup.png" alt="">
                                            </a>
                                        </td>
                                        <td class="result_text">
                                            <a href="https://www.imdb.com/name/nm13093902/?ref_=fn_al_nm_1">Eternals</a>
                                            <small>
                                                (Make-Up Department, "
                                                <a href="https://www.imdb.com/title/tt9032400/?ref_=fn_al_tt_1">이터널스</a>
                                                " (2021))
                                            </small>
                                            
                                        </td>
                                    </tr>
                                    <tr class="findResult">
                                        <td class="primary_photo">
                                            <a href="https://www.imdb.com/name/nm0001613/?ref_=fn_al_nm_2">
                                                <img src="/images/find_eternals1.jpg" alt="">
                                            </a>
                                        </td>
                                        <td class="result_text">
                                            <a href="https://www.imdb.com/name/nm0001613/?ref_=fn_al_nm_2">Bernadette Peters</a>
                                            (2014) (TV Mini Series) 
                                            <small>
                                                (Actress, "
                                                <a href="https://www.imdb.com/title/tt0079367/?ref_=fn_al_nm_2a">The Jerk</a>
                                                " (1979))
                                            </small>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="findSection">
                            <h3 class="findSectionHeader">No Results</h3>
                            <table class="findList">
                                There are no results
                            </table>
                        </div>
                    </div>
                    
                </div>

            </div>
            
        </div>
        <jsp:include page="../include/index_include/index_footer.jsp"></jsp:include>
       
	</div>
    <script
      src="https://kit.fontawesome.com/a04df2c0ca.js"
      crossorigin="anonymous"
    ></script>
</body>
</html>