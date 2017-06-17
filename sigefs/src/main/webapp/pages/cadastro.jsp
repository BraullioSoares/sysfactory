<div class="container col-md-6">
  <h2>Cadastro</h2>
  <form action="sistema.do">
  	<div class="form-group">
      <label for="name">Nome:</label>
      <input type="text" class="form-control" id="name" placeholder="Razão Social" name="name">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="exemplo@exemplo.com" name="email">
    </div>
    <div class="form-group">
      <label for="phone">Telefone:</label>
      <input type="tel" class="form-control" id="phone" placeholder="(XX) X XXXX-XXXX" name="phone">
    </div>
    <div class="form-group">
      <label for="tipoProd">Matéria Prima :</label>
      <textarea class="form-control" rows="5" id="tipoProd" name="tipoProd"></textarea>
    </div>
      <button type="submit" class="btn btn-success">Cadaastrar</button>
  </form>
</div>
<div class="container Jumbotron col-md-6 hidden" >
	<h1>Cadastrado com sucesso!!</h1>

</div>
</body>