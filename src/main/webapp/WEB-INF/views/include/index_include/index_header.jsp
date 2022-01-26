<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
	 <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>

<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal" />
</sec:authorize>
<link rel="stylesheet" href="/css/index_include.css" />
<div id="menu_nav">
	<div id="menu_nav_top">
		<h1>
			<a href="/chart/boxoffice" class="logo">JMKY</a>
			
		</h1>
		<label for="" id="exit_btn"><i class="fas fa-times-circle"></i></label>
	</div>
	<div id="menu_main">
		<div class="menu_list">
			<label for=""><i class="fas fa-film"></i>Movie</label>
			<div class="menu_item">
				<ul>
					<li><a href="/chart/boxoffice">Top 10 Rated Movies</a></li>
					<li><a href="/chart/top/1/1">JMKY Movies</a></li>
				</ul>
			</div>
		</div>
		<div class="menu_list">
			<label for=""><i class="fas fa-star"></i>Awards & Events</label>
			<div class="menu_item">
				<ul>
					<li><a
						href="https://www.imdb.com/best-of/?ref_=nv_ev_best_2021">Best
							of 2021</a></li>
					<li><a href="https://www.imdb.com/oscars/?ref_=nv_ev_acd">Oscars</a></li>
					<li><a
						href="https://www.imdb.com/search/title/?count=100&groups=oscar_best_picture_winners&sort=year%2Cdesc&ref_=nv_ch_osc">Best
							Picture Winners</a></li>
					<li><a
						href="https://www.imdb.com/golden-globes/?ref_=nv_ev_gg">Golden
							Globes</a></li>
					<li><a href="https://www.imdb.com/emmys/?ref_=nv_ev_rte">Emmys</a></li>
					<li><a
						href="https://www.imdb.com/starmeterawards/?ref_=nv_ev_sma">STARmeter
							Awards</a></li>
					<li><a href="https://www.imdb.com/comic-con/?ref_=nv_ev_comic">San
							Diego Comic-Con</a></li>
					<li><a href="https://www.imdb.com/nycc/?ref_=nv_ev_nycc">New
							York Comic-Con</a></li>
					<li><a href="https://www.imdb.com/sundance/?ref_=nv_ev_sun">Sundance
							Film Festival</a></li>
					<li><a href="https://www.imdb.com/toronto/?ref_=nv_ev_tor">Toronto
							Int'l Film Festival</a></li>
					<li><a
						href="https://www.imdb.com/awards-central/?ref_=nv_ev_awrd">Awards
							Central</a></li>
					<li><a
						href="https://www.imdb.com/festival-central/?ref_=nv_ev_fc">Festival
							Central</a></li>
					<li><a href="https://www.imdb.com/event/all/?ref_=nv_ev_all">All
							Events</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>
<header id="header">
	<div class="JMKYheader">

		<h1>
			<a href="/chart/boxoffice" class="logo">JMKY</a>
			<p style="color:white" id="sentence"></p>
		</h1>
		
		<ul class="menu">
			<a>
				<li class="icon"><i class="fas fa-list"></i> Menu</li>
			</a>
		</ul>
		<div id="serach_container">
			<form id="search_container" method="get" action="/find">
			<label> </label>
			
			<input id="findValue" name="findValue" type="text" placeholder="Search JMKY" id="key-search" >
			<button type="submit" class="find_submit">
				<i class="fas fa-search"></i>
			</button>
			</form>
		</div>
		<ul class="top_nav">
			<a href="https://pro.imdb.com/login/ap?u=/login/lwa&imdbPageAction=signUp&rf=cons_nb_hm&ref_=cons_nb_hm">
				<li>JMKYPro</li>
			</a>
			<a href="/user/likelist">
				<li><i class="far fa-plus-square"></i> Likelist</li>
			</a>
			<c:choose>
				<c:when test="${empty principal.user }">
					<a href="/auth/signin"><li>Sign In</li></a>
				</c:when>

				<c:otherwise>

					<a href="/auth/mypage"><li class="ellipsis">${principal.user.username }
							님</li></a>
					<div>
						<a href="/logout"><li><i class="fas fa-sign-out-alt"></i></li></a>
					</div>
				</c:otherwise>

			</c:choose>
		</ul>
	</div>
</header>
<script>
  $( function() {
    var availableTags = {
    	'movie': [
    		   {
   			      "value":"이터널스",
   			      "id":"1"
   			   },
   			   {
   			      "value":"듄",
   			      "id":"2"
   			   },
   			   {
   			      "value":"007 노 타임 노 다이",
   			      "id":"3"
   			   },
   			   {
   			      "value":"다크나이트",
   			      "id":"4"
   			   },
   			   {
   			      "value":"12인의 성난 사람들",
   			      "id":"5"
   			   },
   			   {
   			      "value":"쉰들러 리스트",
   			      "id":"6"
   			   },
   			   {
   			      "value":"반지의 제왕: 왕의 귀환",
   			      "id":"7"
   			   },
   			   {
   			      "value":"펄프 픽션",
   			      "id":"8"
   			   },
   			   {
   			      "value":"석양의 무법자",
   			      "id":"9"
   			   },
   			   {
   			      "value":"반지의 제왕: 반지 원정대",
   			      "id":"10"
   			   },
   			   {
   			      "value":"해리 포터와 마법사의 돌",
   			      "id":"11"
   			   },
   			   {
   			      "value":"글래디에이터",
   			      "id":"12"
   			   },
   			   {
   			      "value":"해리 포터와 아즈카반의 죄수",
   			      "id":"13"
   			   },
   			   {
   			      "value":"쇼생크 탈출",
   			      "id":"14"
   			   },
   			   {
   			      "value":"토이 스토리",
   			      "id":"15"
   			   },
   			   {
   			      "value":"시네마 천국",
   			      "id":"16"
   			   },
   			   {
   			      "value":"지옥의 묵시록",
   			      "id":"17"
   			   },
   			   {
   			      "value":"미스터 빈의 홀리데이",
   			      "id":"18"
   			   },
   			   {
   			      "value":"센과 치히로의 행방불명",
   			      "id":"19"
   			   },
   			   {
   			      "value":"라푼젤",
   			      "id":"20"
   			   },
   			   {
   			      "value":"아메리칸 히스토리 X",
   			      "id":"21"
   			   },
   			   {
   			      "value":"반딧불이의 묘",
   			      "id":"22"
   			   },
   			   {
   			      "value":"위플래시",
   			      "id":"23"
   			   },
   			   {
   			      "value":"시티 라이트",
   			      "id":"24"
   			   },
   			   {
   			      "value":"해리 포터와 비밀의 방",
   			      "id":"25"
   			   },
   			   {
   			      "value":"디파티드",
   			      "id":"26"
   			   },
   			   {
   			      "value":"언터처블: 1%의 우정",
   			      "id":"27"
   			   },
   			   {
   			      "value":"프레스티지",
   			      "id":"28"
   			   },
   			   {
   			      "value":"카사블랑카",
   			      "id":"29"
   			   },
   			   {
   			      "value":"옛날 옛적 서부에서",
   			      "id":"30"
   			   },
   			   {
   			      "value":"이창",
   			      "id":"31"
   			   },
   			   {
   			      "value":"토이 스토리 2",
   			      "id":"32"
   			   },
   			   {
   			      "value":"에일리언",
   			      "id":"33"
   			   },
   			   {
   			      "value":"토이 스토리 3",
   			      "id":"34"
   			   },
   			   {
   			      "value":"메멘토",
   			      "id":"35"
   			   },
   			   {
   			      "value":"레이더스",
   			      "id":"36"
   			   },
   			   {
   			      "value":"위대한 독재자",
   			      "id":"37"
   			   },
   			   {
   			      "value":"장고: 분노의 추적자",
   			      "id":"38"
   			   },
   			   {
   			      "value":"타인의 삶",
   			      "id":"39"
   			   },
   			   {
   			      "value":"영광의 길",
   			      "id":"40"
   			   }
   			]
    };
    
	    $( '#findValue' ).autocomplete({
	      source: function(request, response) {
	    	
	    	  
	    	  var term = request.term;
	    	  var filteredData = availableTags.movie.filter(x => (x.value.indexOf(term) >= 0));
	      	  response($.map(filteredData, function(item) {
	      		  return {
	      			  value: item.value,
	      			  id: item.id
	      		  }
	      	  }))
	      	  
	      }, 
	      
	      
	      /*
	   	  open: function(event, ui) {
	            $(this).autocomplete("widget").css({
	                "background": "black",
	                "color": "white",
	                
	                
	            });
	      },*/
	      
          select: function(event, ui) {
				
        	  location.href="/title/"+ui.item.id

          }
	      
  		});
	    
	   
    
  });
 	
  </script>
