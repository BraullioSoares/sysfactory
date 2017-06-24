<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<%@ include file="/WEB-INF/jsp/head.jsp"%>
<body>
	<div class="container">
<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<a href="#" class="active" id="login-form-link">Entrar</a>
							</div>
							<div class="col-xs-6">
								<a href="#" id="register-form-link">Registre-se</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="autenticador.do" method="post"  style="display: block;">
									<div class="form-group">
										<input type="text" name="user" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
									</div>
									<div class="form-group">
										<input type="password" name="senha" id="password" tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit" tabindex="3" class="form-control btn btn-login" value="Log In">
											</div>
										</div>
									</div>
								</form>
								
								<form id="register-form" action="sistema.do" method="post" style="display: none;">
									<div class="form-group">
										<input type="text" name="user" id="username" tabindex="1" class="form-control" placeholder="Usuário" value="" required>
									</div>
									<div class="form-group">
										<input type="email" name="email" id="email" tabindex="2" class="form-control" placeholder="Email Address" value="" required>
									</div>
									<div class="form-group">
										<input type="password" name="senha" id="password" tabindex="3" class="form-control" placeholder="Senha" required>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="text" name="logica" value="CadastrarUsuario" class="hidden">
												<input type="submit"  tabindex="4" class="form-control btn btn-register" value="Cadastre-se" >
											</div>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>
