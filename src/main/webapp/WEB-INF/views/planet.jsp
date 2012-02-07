<%@page import="com.dperry.space.model.space.PlanetPlot"%>
<%@page import="com.dperry.space.model.space.Planet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="../resources/css/style.css" />
</head>
<body>
<h1>
	Hello space!  
</h1>

<table class="planet">
	<%  Planet planet = (Planet)request.getAttribute( "planet" );
		int height = planet.getSize();
		int width = height*2;
		// rows
		for( int i = 0; i < height; i++ ) { %>
			<tr>
	<%		// columns
			for( int j = 0; j < width; j++ ) { 
				PlanetPlot plot = planet.getPlanetPlot(j,i); %>
				
				<td>
					<div class="plot <%=( plot.isWater() ? "water" : ( plot.isGas() ? "gas" : "land" ) ) %>" >
						o
					</div>
				</td>
				
	<%		} %>
			
			</tr>
	<%
		}
	%>
</table>
</body>
</html>
