<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
   <style type="text/css">
  
  div {
 
  width: 500px;
  border: 15px;
  padding: 50px;
  margin: 20px;
}
 </style>
</head>
<body>
<center>
<h1>Details:</h1>
<div>
<table  class="table">
<tr>
<th>Name:</th>
<th>Roll</th>
<th>Stream</th>
<th>Class</th>
<th>Grade</th>
</tr>
<tr>
<td>${std.name }</td>
<td>${std.roll }</td>
<td>${std.stream }</td>
<td>${std.type }</td>
<td>${std.grade }</td>
</tr>
</table>
</div>
</center>
</body>
</html>