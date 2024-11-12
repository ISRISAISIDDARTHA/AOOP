<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>
<body>
    <h2>Student Registration Form</h2>
    <form action="StudentDetailsServlet" method="post">
        Name: <input type="text" name="name"><br>
        Address: <input type="text" name="address"><br>
        Program: <input type="text" name="program"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
