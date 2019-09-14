<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WebParser</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <style>
        * {
            margin: 0;
            padding: 0;
        }


        .main {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translateX(-50%) translateY(-50%);
        }

        .bg {
            background: linear-gradient(to right, #ff7200, #4a82ff);
            height: 100%
        }
    </style>
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>WebParser</h1>
</div>
<div class="bg"></div>
<div class="main">
    <form name="form" method="post" id="form">
        <input type="text" name="page" class="w3-input w3-center w3-border w3-round-large"
               style="position: relative"/><br>
        <button class="w3-button w3-block w3-blue">Parse</button>
    </form>

</div>
<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/webparser_war_exploded/'">Back to main</button>
</div>
</body>
</html>
