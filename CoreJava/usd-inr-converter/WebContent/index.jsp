<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="css/style.css">

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Index</title>
</head>
<body background="images/wp.jpg">
	<ul>
	
	</ul>
	<div class="container" align="center">
		<div class="container">
			<div class="jumbotron">
				<h1>USD TO INR</h1>
				<p>ConversionY</p>
			</div>
			<form action="/action_page.php">
				<br>
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">INR</th>
							<th scope="col">USD</th>
						</tr>
					</thead>
					<tbody>
					<div align="center">
						<c:forEach var="i" begin="1" end="50" step="1">
							<tr>
								<td>${i}</td>
								<td>${i*45}</td>
							</tr>
						</c:forEach>
						</div>
					</tbody>
				</table>
		</div>
</body>
</html>