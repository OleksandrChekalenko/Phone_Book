<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>

<form action="/contact/update" method="post" name="contact" class="form-group">
    <input title="Id" type="text" name="id_contact" value="${contacts.id_contact}" hidden>
    Surname
    <input title="Surname" type="text" name="surName" value="${contacts.surName}" />
    Name
    <input title="Name" type="text" name="name" value="${contacts.name}"/>
    Patronymic
    <input title="Patronymic" type="text" name="patronymic" value="${contacts.patronymic}"/>
    Mobile number
    <input title="Mobile number" type="text" name="mobileNumber" value="${contacts.mobileNumber}"/>
    Home number
    <input title="Home number" type="text" name="homeNumber" value="${contacts.homeNumber}"/>
    Address
    <input title="Address" type="text" name="adds" value="${contacts.adds}"/>
    Email
    <input title="Email" type="text" name="email" value="${contacts.email}"/>
    <#--<input title="Email" type="text" name="email" value="${contacts.user.getUser}" />-->

        <input type="submit" value="Update"/>
</form>
<a type="button" href="/" class="button">Back</a>
</body>
</html>
<#--
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header.ftl">

<form action="/editUser" method="post" name="user" class="form-group">
    <input title="Id" type="number" name="name" value="${user.id}"/>
    <input title="Name" type="text" name="name" value="${user.name}"/>
    <input title="Email" type="text" name="email" value="${user.email}"/>
    <input title="Age" type="number" name="age" value="${user.age}"/>
    <input type="submit" title="OK" value="Edit!"/>
</form>
<a type="button" href="/users" class="button">Back</a>
</body>
</html>
-->