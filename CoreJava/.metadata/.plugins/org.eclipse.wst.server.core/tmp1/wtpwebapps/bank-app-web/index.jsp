<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="css/style.css">

                
          
                
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <title>Index</title>
</head>
<body background="images/wp.jpg">
        <ul>
            <li><a href="index.html" class="active">Home</a></li>
            <li><a href="withdraw.html">Withdraw</a></li>
            <li><a href="deposit.html">Deposit</a></li>
            <li><a href="trans.html">Fund transfer</a></li>
            <li><a href="bal.html">Check balance</a></li>
            <li><a href="getAllBankDetails.do">Account details</a></li>
            <li><a href="searchAccount.html">Account Search</a></li>
            <li><a href="deleteaccount.html">Delete Account</a></li>
            <li><a href="update.html">Update details</a></li>
              </ul>
<div class="container" align="center">
        
                <div class="jumbotron jumbotron-fluid">
              
                <h1><font color="orange">MUMBAI BANK</font></h1>
                
                <form action="addNewBankAccount.do" method="post">
                    <br> 
                    </div>
                    <fieldset>
                      <legend>NEW ACCOUNT:</legend>
                      Name<br>
                      <input type="text" name="customerName" value="Mickey"><br><br>
                      Account type<br>
                      <input type="text" name="account_type" value="saving" title="Enter valid account type"><br><br>
                      Balance<br>
                      <input type="text" name="balance" value="234234" ><br><br>
                      
                      <br><input type="submit" value="Submit" align="center">
                      <br>
                    </fieldset>
                  </form>
      </div>

      
    
</body>
</html>