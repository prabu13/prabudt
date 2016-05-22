<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<form role="form" action="registerValidate">
    <div class="form-group">
      <label for="usr">Name:</label>
      <input type="text" name="user">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" name="pword">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" name="email">
    </div>
    <div class="form-group">
      <label for="number">Mobile Number:</label>
      <input type="number" name="mobile">
    </div>
    <input type="submit" value="Register">
  </form>

</body>
</html>