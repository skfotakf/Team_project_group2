
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	
	 <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>

<select id="animal">
  <option value="movie">Movie</option>
  <option value="dog">Dog</option>
</select>

<input id="action" type="text" placeholder="search action"/> <i class="fa fa-search"></i>

<br/>
<p id="sentence">

</p>
<div>
	<c:forEach var="array" items="${array }">
	${array }
	</c:forEach>
</div>
<script>
  $( function() {
	  var availableTags = {
				'movie': [ 
			  	{value: '해리 포터와 아즈카반의 죄수', id: 1},
			    	{value: '해리 포터와 마법사의 돌', id: 2},
			    	{value: '해리 포터와 비밀의 방', id: 3}
			  ],
			  'dog': [ 
			  	{ value: 'park', id: 5 },
			    { value: 'run', id: 6 },
			    {  value: 'follow', id: 7 },
			    { value: 'sleep', id: 8 }
				]
			}

			$('#action').autocomplete({
				source: function (request, response) {
			                var term = request.term; // search keyword
			                var filteredData = availableTags.movie.filter(x => (x.value.indexOf(term) >= 0));
			                response($.map(filteredData, function (item) {
			                    return {
			                        
			                        value: item.value,
			                       id: item.id
			                    }
			                }))
			            },
			  autoFocus: true,
			  select: function(event, ui) {
			  	alert(ui.item.id);
			  }
			});

			$('#animal').change(function() {
				var animal = $(this).val();
			  var source = availableTags[animal];
			  $('#action').autocomplete('option', 'source', function (request, response) {
			  							var term = request.term; // search keyword
			                var filteredData = source.filter(x => (x.value.indexOf(term) >= 0));
			                response($.map(filteredData, function (item) {
			                    return {
			                        
			                        value: item.value,
			                        id: item.id
			                    }
			                }))
			            });
			});
    
  });
 	
  </script>