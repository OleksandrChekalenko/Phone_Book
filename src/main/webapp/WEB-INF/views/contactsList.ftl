<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ContactsData</title>
</head>
<body class="container" background=images/walletHomePage.png">
<#include "templates/header3.ftl">
<br><br>

<div id="margin" >
    <form action="contacts/addContact" method="get" name="wallet" class="form-group">
        <button id="button" type="submit">New contact</button>
    </form>
</div>

<div id="margin">
    <table class="table table-striped">
        <tr>

            <th><form action="/contact/contacts/sortContactsByName" method="get" name="contacts" class="form-group">
                <button type="submit">Full name</button>
            </form>
                <form action="/contact/contacts/sortContactsBySurName" method="get" name="contacts" class="form-group">
                    <button type="submit">Surname</button>
                </form>

            </th>
            <th><form action="/contact/contacts/sortContactsByNumber" method="get" name="contacts" class="form-group">
                <button type="submit">Mobile number</button>
            </form>
            </th>
            <th><form action="" method="get" name="contacts" class="form-group">
                <button type="submit">Home number</button>
            </form>
            </th>
            <th><form action="" method="get" name="contacts" class="form-group">
                <button  type="submit">Address</button>
            </form>
            </th>
            <th><form action="" method="get" name="contacts" class="form-group">
                <button  type="submit">Email</button>
            </form>
            </th>
            <th>
                <p>Button</p>
            </th>
            <th>
                <p>Button</p>
            </th>

        </tr>
    <#list contacts as contact>
        <tr>
        <#--<td><a href="/wallet/${wallet.id}">${wallet.id}</a></td>-->
            <td>${contact.surName} ${contact.name} ${contact.patronymic}</td>
            <td>${contact.mobileNumber}</td>
            <td>${contact.homeNumber}</td>
            <td>${contact.adds}</td>
            <td>${contact.email}</td>
            <td><a href="contacts/delete/${contact.id_contact?c}">Delete</a>
            <td><a href="edit/${contact.id_contact?c}">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
</div>

<#--<div id="margin">
    <form action="contacts/addContact" method="get" name="wallet" class="form-group">
        <button id="button" type="submit">New contact</button>
    </form>
</div>-->
</body>
</html>