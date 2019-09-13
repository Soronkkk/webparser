<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>WebParser</h1>
</div>
<div class="w3-container w3-center w3-green">
    <h2>Login</h2>
</div>
<br/>
<div class="bg w3-container w3-center">
    <div class="w3-bar w3-padding-large w3-padding-24">
        <button class="w3-btn w3-hover-blue w3-round-large"
                onclick="location.href='/webparser_war_exploded/registration'">
            Registration
        </button>
    </div>
</div>
<div>
    <form action="login" method="post" class="w3-selection w3-center w3-light-grey w3-padding">
        Name:<input type="text" name="uname" class="w3-input w3-center w3-border w3-round-large"
                    style="position: relative; left: 35%; width: 30%"/><br/>

        Password:<input type="password" name="pass" class="w3-input w3-center w3-border w3-round-large"
                        style="position: relative; left: 35%; width: 30%"/><br/>

        <button type="submit" name="login" value="login"
                class="w3-btn w3-center w3-green w3-round-large w3-margin-bottom">Login
        </button>
    </form>
</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/webparser_war_exploded/'">Back to main</button>
</div>
</body>
</html>
