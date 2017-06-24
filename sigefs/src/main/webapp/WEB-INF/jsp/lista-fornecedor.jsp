<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<%@ include file="head.jsp" %>
<body>
<%@ include file="header.jsp" %>
<div class="container">
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
</div>
</body>
</html>
