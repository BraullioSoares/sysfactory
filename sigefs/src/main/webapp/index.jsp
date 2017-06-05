<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<%@ include file="pages/head.jsp"%>
<body>
<%@ include file="pages/header.jsp" %>
<jsp:useBean id="dao" class="br.com.sigefs.dao.FornecedorDao"/>
	

<table> 
	<c:forEach var="f" items="${dao.getLista}"> 
		<tr> 
			<td>${f.nome}</td> 
		</tr> 
	</c:forEach> 
</table>
</body>
</html>
