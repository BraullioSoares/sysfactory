$(function() {

    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});

function confirmaExclusao (id) {
	if (window.confirm("Tem certeza que deseja excluir?")){
		location.href="sistema.do?logica=RemoverFornecedor&id="+id;
	}
}
function btnEditar (id) {
	location.href="sistema.do?logica=EditarFornecedor&id="+id;
}