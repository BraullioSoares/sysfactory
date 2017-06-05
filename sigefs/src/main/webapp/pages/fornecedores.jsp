<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
<link rel="stylesheet" type="text/css" href="../libs/bootstrap/css/bootstrap.min.css">
<script src="../libs/jquery/jquery.min.js"></script>
<script src="../libs/bootstrap/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<title>Sigefs</title>
</head>

<body>
<header>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="../index.jsp">Sigefs</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="#">Clientes</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Forncedores <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="fornecedores.jsp">Cadastrar</a></li>
						<li><a href="#">Visualizar</a></li>
					</ul></li>
				<li><a href="#">Produtos</a></li>
				<li><a href="#">Materia - Prima</a></li>
				<li><a href="#">Financeiro</a></li>
			</ul>
		</div>
	</nav>
</header>
<div class="container Jumbotron">
	<h1>Fornecedores</h1>
</div>
<%@ include file="cadastro.jsp"  %>
</body>