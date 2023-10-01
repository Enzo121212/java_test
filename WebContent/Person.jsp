
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <c:if test="${ !empty sessionScope.prenom && !empty sessionScope.nom }">
        <p>Vous �tes ${ sessionScope.prenom } ${ sessionScope.nom } !</p>
    </c:if>
<p> 
<c:forTokens var="morceau" items="Un �l�ment/Encore un autre �l�ment/Un dernier pour la route" delims="/ ">
    <p>${ morceau }</p>
</c:forTokens>
</p>


<p> 
<c:forEach items="${ tabName }" var="name" varStatus="status">
    <p>N�<c:out value="${ status.count }" /> : <c:out value="${ name }" /> !</p>
</c:forEach>
</p>

<p> 
	<c:forEach var="i" begin="0" end="10" step="3">
	    <p>Un message n�<c:out value="${ i }" /> !</p>
	</c:forEach>
</p>

<p> 
	<c:if test="${ 50 > 10 }" var="variable">
	    C'est vrai !
	</c:if> <br/>
	
	<c:choose>
    <c:when test="${ variable }">Du texte</c:when>
    <c:when test="${ autreVariable }">Du texte</c:when>
    <c:when test="${ encoreUneAutreVariable }">Du texte</c:when>
    <c:otherwise>Text par defaut</c:otherwise>
</c:choose>
</p>

<p> 
 <c:out value="JSTL Variable out"/>
 
 <c:out value="${ name }" default="Name par defaut en jstl" escapeXml='false'/>
 
 <c:set var="nom_variable" value="�p amise" scope="page" />
 
  <c:set target="${ p1 }" value="changement nom via beans ou model " property="nom"  /> <br/>
 
 <c:out value="${ p1.nom }"/>
 
 <c:remove var="nom_variable" scope="page"/>

</p>

<p> 
	
	<c:out value="${ nom_variable }"/>
</p>


<%@ include file="menu.jsp" %>


<div> 
Nom qui vient des objets � Josephine

${ p1.nom }
</div>

Voici la listes des personnes
 �  notre amise
<% out.print(request.getAttribute("nom")) ;
%>

<%@ include file="footer.jsp" %>
<div>

	<%
	String name = (String)request.getAttribute("name");
	if( name != null  ){
		out.println("Bonjour "+name);
	}else{
		out.println("Aucun nom est associer");
	}
%>

<div>
	${ nom }
</div>

<div>
	${ empty name ? 'pas de nom' : name }
</div>


<div>
	${ tabName[3] }
</div>




</div>

 </body>
</html>