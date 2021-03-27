<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sporty Shoes Admin Portal</title>
</head>
<body>
<center>
<body style="background-color:powderblue;">
<h1>Welcome Sporty Shoes Admin Portal</h1>
</center>

<br><br><br>
 <center>
        <form Action="/home" method=get>
           <label for="admin_id ">Admin Id: </label>
            <INPUT TYPE="text" name="admin_id"> <br><br>
            <label for="admin_pwd">Password: </label>
            <INPUT TYPE="text" name="admin_pwd"> <br><br>
            <INPUT TYPE="submit" value="Login" name="submit"/>
        </form>
   </center>

  <% 
    String submitted = (String) request.getParameter("submit");
    if (submitted != null) {
    String username=request.getParameter("admin_id"); 
    String password=request.getParameter("admin_pwd"); 
    if((username.equals("deelu") && password.equals("test"))) 
    {
    session.setAttribute("username",username);	
    response.sendRedirect("/home"); } 
    else 
    	response.sendRedirect("error.jsp"); 
   
    	}%>

</body>
</html>