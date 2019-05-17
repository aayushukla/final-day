<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
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
		<li><a href="index.html">Home</a></li>
		<li><a href="withdraw.html">Withdraw</a></li>
		<li><a href="deposit.html">Deposit</a></li>
		<li><a href="trans.html">Fund transfer</a></li>
		<li><a href="bal.html">Check balance</a></li>
		<li><a href="details.html">Account details</a></li>
		<li><a href="searchaccount.html" class="active">Account
				Search</a></li>
		<li><a href="deleteaccount.html">Delete Account</a></li>
		<li><a href="update.html">Update details</a></li>
	</ul>
	<div class="container" align="center">
		<div class="container">
			<div class="jumbotron">
				<h1>
					<font color="white">SEARCH ACCOUNT</font>
				</h1>
				<p>Search any account</p>
			</div>
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Account type</th>
							<th scope="col">Customer name</th>
							<th scope="col">Account balance</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${accounts.accountId}</td>
							<td>${accounts.accountHolderName}</td>
							<td>${accounts.accountType}</td>
							<td>${accounts.accounBalance}</td>
						</tr>
					</tbody>
				</table>
		</div>
</body>
</html>






























