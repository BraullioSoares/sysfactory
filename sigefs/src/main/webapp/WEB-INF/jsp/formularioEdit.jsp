<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="head.jsp"%>

<body>
<%@ include file="header.jsp"%>

<div class="container col-md-6">
  <form action="sistema.do" method="post">
  	
  	<div class="form-group">
      <label for="name">Código:</label>
      <input type="text" class="form-control" name="id" value="${forn.id}" readonly>
    </div>
  	<div class="form-group">
      <label for="name">Nome:</label>
      <input type="text" class="form-control" id="name" placeholder="Razão Social" name="name" value="${forn.nome}">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="exemplo@exemplo.com" name="email" value="${forn.email}">
    </div>
    <div class="form-group">
      <label for="phone">Telefone:</label>
      <input type="tel" class="form-control" id="phone" placeholder="(XX) X XXXX-XXXX" name="phone" value="${forn.tel}">
    </div>
    <div class="form-group">
      <label for="tipoProd">Matéria Prima :</label>
      <textarea class="form-control" rows="5" id="tipoProd" name="tipoProd" maxlength="255" placeholder="Digite aqui um breve descrição...">${forn.tipoProduto}</textarea>
    </div>
      <input type="text" name="logica" value="SalvarFornecedor" class="hidden">
      <button type="submit" class="btn btn-success">Salvar</button>
  </form>
</div>
<div class="container Jumbotron col-md-6 hidden" >
	<h1>Cadastrado com sucesso!!</h1>

</div>
</body>