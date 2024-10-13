<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="jakarta.tags.core" %>>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>>
<!DOCTYPE html>
<html>
<head>
    <title>Login form</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form>
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>   

            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password"   
 required>
            </div>
            <button type="submit">Login</button>   

            <a href="#">Forget password</a>
        </form>
    </div>
    <script src="script.js"></script>
</body>
</html>