<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
    height: 99%;
   width: 95%;
}

.bg {
    /* The image used */
    background-image: url("00585a3568a0a7d.jpg");

    background-position: center;
    background-repeat: no-repeat;
    background-size:cover;
}
</style>
</head>

<body class="bg">

<br>
<br>
<div><center>

<h1> Choose File whose data you want to store : </h1><br><br>

<form action="ProjectController" method="post" enctype="multipart/form-data">   
    <input type="file" name="fileName" />
    <input type="submit" value="upload file and view data"/>
</form>

<br><br>

<a href="exceldataview.jsp">Excel Data List</a>
</center></div>
</body>
</html>
