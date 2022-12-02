<jsp:directive.page contentType="text/html; charset=UTF-8" />
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facebook</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body>
	
	<div class="container">
		<div class="row">
			<div CLASS="COL-MD-2"></div>
				<div class="col-md-8">
				<h1>UsuÃ¡rios</h1>

				<table class="table">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Nome</th>
							<th scope="col">GÃªnero</th>
							<th scope="col">Email</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach var="user" items="${usuarios}">
						<tr>
							<th scope="row">${user.getID()}</th>
							<td>${user.getName()}</td>
							<td>${user.getGender()}</td>
							<td>${user.getEmail()}</td>
						</tr>
					</c:forEach>	
						
					</tbody>
				</table>

			</div>
			</div CLASS="col-md-2"></div>
		</div>
	</div>
	
	<script type="text/javascript" src="js/bootstrap.bundle.min.js"></script>
</body>
</html>