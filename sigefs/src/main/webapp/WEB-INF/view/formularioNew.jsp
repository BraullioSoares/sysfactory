<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<%@ include file="head.jsp"%>

<body>
<%@ include file="header.jsp"%>

<div class="container Jumbotron">
	<h1>Fornecedores</h1>
</div>
<div class="container col-md-6">
  <h2>Cadastro</h2>
  <form action="sistema.do" method="post">
  	<div class="form-group">
      <label for="name">Nome:</label>
      <input type="text" class="form-control" id="name" placeholder="Razão Social" name="name" required>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="exemplo@exemplo.com" name="email" required>
    </div>
    <div class="form-group">
      <label for="phone">Telefone:</label>
      <input type="tel" class="form-control" id="phone" placeholder="(XX) X XXXX-XXXX" name="phone" >
    </div>
    <div class="form-group">
      <label for="tipoProd">Matéria Prima :</label>
   		<select class="selectpicke form-control" data-width="auto">
			<c:forEach var="materia" items="${lista_materia}">
  				<option title="${materia.material_id}">${materia.descricao}</option>
  			</c:forEach>
		</select>
    </div>
      <input type="text" name="logica" value="CadastrarFornecedor" class="hidden">
      <button type="submit" class="btn btn-success">Cadastrar</button>
  </form>
</div>
<div class="col-md-6 " >

</div>
</body>