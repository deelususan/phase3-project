<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes Admin Management Portal</title>
</head>
<body style="background-color:powderblue;">


	<h3>
		<a href="logout.jsp">Logout</a> &nbsp;&nbsp;&nbsp;
	</h3>
	
	
	<h3>
		<a href="changePassword.jsp">Change Password</a> &nbsp;&nbsp;&nbsp;
	</h3>
	<center>

		<h1 style="background-color: DodgerBlue;">Sporty Shoes Admin
			Management Portal</h1>

		<br> <br> <br>
		<h2>
			<a href="/products">View All Products </a> &nbsp;&nbsp;&nbsp; <a
				href="/users">View All Users</a> &nbsp;&nbsp;&nbsp; <a
				href="/purchases">View All Purchases</a>
		</h2>
	</center>


	<form>
		<br> <br> <br>
		<div style="text-align: center">
			<INPUT TYPE="submit" value="Add Product" name="submit" />
			<%
			String a = request.getParameter("submit");
			if (a != null && a.equals("Add Product")) {
				response.sendRedirect("/addProduct.jsp");
			}
			%>
		</div>

		&nbsp;
		<div style="text-align: center">
			<INPUT TYPE="submit" value="Update Product" name="submit" />

			<%
			String b = request.getParameter("submit");
			if (b != null && b.equals("Update Product")) {
				response.sendRedirect("updateProduct.jsp");
			}
			%>
		</div>

		&nbsp;
		<div style="text-align: center">
			<INPUT TYPE="submit" value="Delete Product" name="submit" />

			<%
			String c = request.getParameter("submit");
			if (c != null && b.equals("Delete Product")) {
				response.sendRedirect("deleteProduct.jsp");
			}
			%>
		</div>

		&nbsp;
		<div style="text-align: center">
			<INPUT TYPE="submit" value="View Product by Catgeory Name" name="submit" />

			<%
			String d = request.getParameter("submit");
			if (d != null && b.equals("View Product by Catgeory Name")) {
				response.sendRedirect("viewProductByCategoryName.jsp");
			}
			%>
		</div>
		
			&nbsp;
		<div style="text-align: center">
			<INPUT TYPE="submit" value="Search User list by User ID" name="submit" />
			<%
			String e = request.getParameter("submit");
			if (b != null && b.equals("Search User list by User ID")) {
				response.sendRedirect("viewUserByID.jsp");
			}
			%>
		</div>
		
			&nbsp;
		<div style="text-align: center">
			<INPUT TYPE="submit" value="View Purchase list by ID" name="submit" />
			<%
			String f= request.getParameter("submit");
			if (f != null && b.equals("View Purchase list by ID")) {
				response.sendRedirect("viewPurchaseByID.jsp");
			}
			%>
		</div>
		
		
</body>
</html>