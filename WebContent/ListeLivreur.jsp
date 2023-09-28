<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>
    <form method="post" action="List">
        <p>
            <label for="nom">Libelle : </label>
            <input type="text" name="nom" id="nom" />
        </p>
 
        <input type="submit" />
    </form>
   
    <ul>
    
        <c:forEach var="item" items="${ allergene }">
            <li><c:out value="${ item.getLibelle() }" /> </li>
        </c:forEach>
    </ul>    
</body>
</html>