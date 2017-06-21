<%@ page language="java" contentType="text/html; charset=utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="libs/bootstrap/css/bootstrap.min.css">
<script src="libs/jquery/jquery.min.js"></script>
<script src="libs/bootstrap/js/bootstrap.min.js"></script>
<script>
	function confirmaExclusao (id) {
		if (window.confirm("Tem certeza que deseja excluir?")){
			location.href="sistema.do?logica=RemoverFornecedor&id="+id;
		}
	}
	function btnEditar (id) {
		location.href="sistema.do?logica=EditarFornecedor&id="+id;
	}
</script>
<meta charset="utf-8">
<title>Sigefs</title>


</head>

<body>
	<header>
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="index.jsp">Sigefs</a>
				</div>
				<ul class="nav navbar-nav">
					<li><a href="#">Clientes</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Forncedores <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="formularioNew.jsp">Cadastrar</a></li>
							<li><a href="sistema.do?logica=ListaFornecedor">Visualizar</a></li>
						</ul></li>
					<li><a href="#">Produtos</a></li>
					<li><a href="#">Materia - Prima</a></li>
					<li><a href="#">Financeiro</a></li>
				</ul>
			</div>
		</nav>
	</header>


	<table class="table">
		<thead>
			<tr>
				<th>#</th>
				<th>Fornecedor</th>
				<th>E-mail</th>
				<th>Telefone</th>
				<th>Matéria Prima</th>
			</tr>
		</thead>
		<c:forEach var="fornecedor" items="${fornecedores}">
			<tbody>
				<tr>
					<th scope="row">${fornecedor.id}</th>
					<td>${fornecedor.nome}</td>
					<td>${fornecedor.email}</td>
					<td>${fornecedor.tel}</td>
					<td>${fornecedor.tipoProduto}</td>
					<td>
						<buttom class="btn btn-success" onclick="btnEditar(${fornecedor.id})">Editar</buttom>
						<buttom class="btn btn-danger" onclick="confirmaExclusao(${fornecedor.id})">Excluir</buttom>
					</td>
					
				</tr>
			</tbody>
		</c:forEach>
	</table>


</body>
</html>
