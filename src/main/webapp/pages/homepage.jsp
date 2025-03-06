<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<style>

body {
  margin:0;
  padding:0;
}
.navbar {
  background-color:#000;
}
nav {
  height:130px;
}
.navbar-nav {
  margin:auto;
}
.nav-link {
  margin:10px 25px;
  color:#fff;
}
.nav-link:hover {
  color:yellow;
}
.box {
  width:100%;
  height:30px;
  background-color:#000;
  position:relative;
}
.box-1 {
  width:50%;
  background-color:#fff;
  height:100%;
  border-radius:0px 40px 0px 0px;
  border-top:5px solid yellow;
  border-right:5px solid yellow;
}
.box-2 {
  position:absolute;
  background-color:#fff;
  height:100%;
  width:50%;
  right:0;
  top:0;
  border-radius:40px 0px 0px 0px;
  border-top:5px solid yellow;
  border-left:5px solid yellow;
}
h1 {
  margin-top:200px;
}


</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color:#006d77">
  <div class="container-fluid">
    <a class="navbar-brand fw-bold" href="#">Coding Mafia</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link ">Contact</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<br><br>
<center><h3>Welcome to Our Website</h3></center>
</body>
</html>