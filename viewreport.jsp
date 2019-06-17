<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Jenkins Report Dashboard</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#build_date" ).datepicker({
        dateFormat: 'yy-mm-dd'
    });
  } );
  </script>
</head>
<body>
 
<body>

	<%@page
		import="com.javatpoint.dao.DBQueryOperation,com.javatpoint.bean.*,java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<h1>Users List</h1>

	<%
		String buildModule = request.getParameter("build_module");
		String buildDate = request.getParameter("build_date");
		
		if(buildModule==null){
			buildModule="";
		}
		if(buildDate==null){
			buildDate="";
		}
		buildModule=buildModule.trim();
		buildDate=buildDate.trim();
		
		List<Report> list = DBQueryOperation.getReport(buildModule, buildDate);
		request.setAttribute("list", list);
	%>
	<form action="viewreport.jsp">
		Build Module: <input type="text" name="build_module"> </br> Build date: <input type="text" id="build_date" name="build_date"> </br>
<input type="submit" value="View Report">
	</form>


	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Build Module</th>
			<th>Build Status</th>
			
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getSid()}</td>
				<td>${u.getBuild_module()}</td>
				<td>${u.getBuild_status()}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>