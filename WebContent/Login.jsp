
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <c:if test="${ !empty sessionScope.prenom && !empty sessionScope.nom }">
        <p>Vous êtes ${ sessionScope.prenom } ${ sessionScope.nom } !</p>
    </c:if>

  <c:if test="${ !empty liv.getResultat() }"><p><c:out value="${ liv.getResultat() }" /></p></c:if>
<form action="authentification" method="post">
    <label for="username">Nom d'utilisateur :</label>
    <input type="text" id="username" name="username" ><br><br>

    <label for="password">Mot de passe :</label>
    <input type="password" id="password" name="password"><br><br>

    <input type="submit" value="Se Connecter">
</form>

</body>
</html>