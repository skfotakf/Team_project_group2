<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JMKY Registration</title>
    <link rel="stylesheet" href="/css/signup.css">
</head>
<body>
    <div id="wrap">
        <div id="logo_box">
            <h1 class="logo">JMKY</h1>
        </div>
        <div id="inner_box">
            <h1>Create account</h1>
            <div>
                <label for="">ID</label>
                <input type="text" id="id">
            </div>
            <div>
                <label for="">Password</label>
                <input type="password" id="password">
            </div>
            <div></div>
            <div>
                <label for="">Re-enter password</label>
                <input type="password" id="repassword">
            </div>
            <div>
                <label for="">Email</label>
                <input type="text" id="eamil">
            </div>
            <div>
                <label for="">Your name</label>
                <input type="text" id="name">
            </div>
            <div>
                <label for="">Your telephone</label>
                <input type="text" id="telephone">
            </div>
            <div>
                <label for="">NickName</label>
                <input type="text" id="nickname">
            </div>
            <button>Create your JMKY account</button>
            <div id="inner_footer">Already have an account?<a href=""> Sign-In</a></div>
        </div>
    </div>
    <jsp:include page="include/signup_include/signup_footer.jsp"></jsp:include>
</body>
</html>