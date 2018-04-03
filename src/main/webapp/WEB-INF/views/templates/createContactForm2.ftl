<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "header3.ftl">
<br>
<br>
<br>
<div id="margin">
<#list errors as error>
<tr>
    <td><p>     </p>${error}</td>
</tr>
</#list>
<#include "createContactForm.ftl">
</div>
</body>
</html>

<#--
<#include "header3.ftl">
<br>
<br>
<br>

<#list errors as error>
<tr>
    <td>${error}</td>
</tr>
</#list>
<br>

<form action="/contact/newContact" method="post" name="contact" class="form-group" >

    <p>Surname*</p>
        <input title="Surename" type="text" name="sureName" placeholder="Enter contact surname" id = "surename"/>
    <p>Name*</p>
        <input title="Name" type="text" name="name" placeholder="Enter contact name" id = "name"/>
    <p>Patronymic*</p>
        <input title="Patronymic" type="text" name="patronymic" placeholder="Enter your patronymic" id = "patronymic"/>
    <p>Mobile number*</p>
         <input title="Mobile number" type="text" name="mobileNumber" placeholder="Enter contact mobile number" id = "mobileNumber"/>
    <p>Home number</p>
        <input title="Home number" type="text" name="homeNumber" placeholder="Enter contact home number" id = "homeNumber"/>
    <p>Address</p>
        <input title="Address" type="text" name="adds" placeholder="Enter contact address" id = "adds"/>
    <p>Email</p>
        <input title="Email" type="text" name="email" placeholder="Enter contact email" id = "email"/>
    <input type="submit" value="Add"/>
</form>

<p>* - be sure to enter the data</p>
<br>
-->



