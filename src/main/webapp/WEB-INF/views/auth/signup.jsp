<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../setting/setting_taglib.jsp" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JMKY 회원가입</title>
    <link rel="stylesheet" href="/css/signup.css">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
    <form id="signup-form">
        <div id="logo_box">
            <h1 class="logo">JMKY</h1>
        </div>
        <div id="inner_box">
            <h1>Create account</h1>
            <div>
                <label for="">ID</label>
                <input type="text" name="username">
            </div>
            <div>
                <label for="">Password</label>
                <input type="password" name="password">
            </div>
            <div></div>
            <div>
                <label for="">Re-enter password</label>
                <input type="password" name="repassword">
            </div>
            <div>
                <label for="">Email</label>
                <input type="text" name="email">
            </div>
            <div>
                <label for="">Your name</label>
                <input type="text" name="name">
            </div>
            <div>
                <label for="">Your telephone (without "-")</label>
                <input type="tel" name="telephone">
            </div>
            
            <button type="button" id="signup-btn">JMKY 계정 만들기</button>
            
            <div id="inner_footer">계정을 가지고 계신가요?<a href="/auth/signin">로그인</a></div>
        </div>
    </form>
        
        
        <script type="text/javascript">
        	const signupBtn = document.querySelector('#signup-btn');
        	const signupForm = document.querySelector('#signup-form');
        	signupBtn.onclick = () => {
        		let formData = new FormData(signupForm);
        		let signupObj = {
        				username : formData.get('username'),
        				password: formData.get('password'),
        				email: formData.get('email'),
        				name: formData.get('name'),
        				telephone: formData.get('telephone'),
        				role: 'ROLE_USER'
        		}
        		$.ajax({
        			type: "post",
        			url: "/auth/signup",
        			data : signupObj,
        			dataType : "text",
        			success: function(data) {
        				let respObj = JSON.parse(data);
        				if(respObj.code == 400) {
        					alert('오류코드' + respObj.code +
									'\n오류메세지' + 
									'\nusername: ' + respObj.msg.username +
									'\npassword: ' + respObj.msg.password +
									'\nrepassword: ' + respObj.msg.repassword +
									'\nemail: ' + respObj.msg.email +
									'\nname: ' + respObj.msg.name +
									'\ntelephone: ' + respObj.msg.telephone);
									
        				}else if(respObj.code == 410 || respObj.code == 500){
        					alert("오류코드 : " + respObj.code +
									'\n오류메세지' +
									'\n' + respObj.msg);
        				} else {
        					alert(respObj.msg);
        					location.href = '/auth/signin';
        				}
        			},
        			error: function() {
        				alert("전송 오류");
        			}
        		}) // end ajax
        	} // end onclick
        </script>
    </div>
    <jsp:include page="../include/signup_include/signup_footer.jsp"></jsp:include>
</body>
</html>