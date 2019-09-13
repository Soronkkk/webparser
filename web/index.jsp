<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WebParser</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
        .bg {
            background: linear-gradient(to right, #ff7200, #4a82ff);
            height: 50%
        }
    </style>
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>WebParser</h1>
</div>
<div class="bg w3-container w3-center">
    <div class="w3-bar w3-padding-large w3-padding-24">
        <button class="w3-btn w3-hover-blue w3-round-large"
                onclick="location.href='/webparser_war_exploded/registration'">
            Registration
        </button>
        <button class="w3-btn w3-hover-orange w3-round-large"
                onclick="location.href='/webparser_war_exploded/login'">Login
        </button>
        <button class="w3-btn w3-hover-orange w3-round-large"
                onclick="location.href='/webparser_war_exploded/logout'">Logout
        </button>
        <button class="w3-btn w3-hover-orange w3-round-large"
                onclick="location.href='/webparser_war_exploded/webparser'">WebParser
        </button>
    </div>
</div>
<div class="bg"></div>
</div>
</body>
</html>
