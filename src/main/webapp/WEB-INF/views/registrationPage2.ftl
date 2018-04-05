

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>

</head>
<body class="container" background="images/walletHomePage.png">
<#include "templates/header3.ftl">
<br><br><br>
<#list errors as error>
<tr>
    <td><p>     </p>${error}</td>
</tr>
</#list>
<br>
<h1> REGISTRATION</h1>
<br>
<div id="margin">
    <form  id = "form" action="/newUser" method="post" name="user" class="form-group" onsubmit="valid(this)">


        <p>Login</p>
        <input title="Login" type="text" name="login" placeholder="Enter your login" id = "login"/>
        <#--<p>First name</p>
        <input title="First name" type="text" name="firstName" placeholder="Enter your first name"/>
        <p>Email</p>
        <input title="Email" type="text" name="email" placeholder="Enter your email"/>
        <p>Phone number</p>
        <input title="Phone number" type="text" name="phoneNumber" placeholder="Enter your phone nymber">-->
        <p>Password</p>
        <input title="Password" type="password" name="password" placeholder="Enter your password" id="password">
        <p>rePassword</p>
        <input title="Password" type="password" name="rePassword" placeholder="Repeat password">
        <p>Full name</p>
        <input title="Full name" type="text" name="snp" placeholder="Enter your full name"/>
        <input type="submit" name="submit" value="Registration"/>
    </form>
</div>
</body>
</html>