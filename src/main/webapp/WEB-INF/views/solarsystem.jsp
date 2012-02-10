<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="../resources/css/style.css" />
</head>
<body>
<h1>
	Solar System  
</h1>

<div id="solarSystem" class="grid">
		<div class="star">
			&nbsp;
		</div>
	<c:forEach var="planet" items="${solarSystem.planets}">
		<div class="planet " 
			style="left:${planet.x}px; top:${planet.y}px; height: ${planet.size}px; width: ${planet.size}px;">
			<img alt="${planet.planetType.description}" 
				 src="../resources/images/${planet.planetType.description}.png"
				 height="${planet.size}px"
				 width="${planet.size}px"/>
			&nbsp;
		</div>
	</c:forEach>
	
</div>

</body>
</html>
