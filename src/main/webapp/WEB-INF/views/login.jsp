<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login form</title>
    <meta charset="UTF-8">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
</head>
<body>
<div id="login">
    <div class="container">
        <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6">
                <div id="login-box" class="col-md-12">
                    <form id="login-form" class="form" action="${pageContext.request.contextPath}/login" method="post">
                        <h3 class="text-center text-info">Faça seu Login</h3>
                        <div class="form-group">
                            <label for="txtemail" class="text-info">Usuário:</label><br>
                            <input type="text" name="txtemail" id="txtemail" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="txtsenha" class="text-info">Senha:</label><br>
                            <input type="password" name="txtsenha" id="txtsenha" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label for="remember-me" class="text-info"><span>Lembrar-me</span> <span><input
                                    id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                            <input type="submit" name="submit" class="btn btn-info btn-md" value="Entrar">
                        </div>
                        <div id="register-link" class="text-right">
                            <a href="#" class="text-info">Cadastre-se</a>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
