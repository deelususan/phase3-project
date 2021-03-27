<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <@ Page import com.ecom.web.controller.ProductController; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<h3><a href=home.jsp>Return to Home </a> </h3>

 <%

 %>


    <form Action="addProduct.jsp">
    
    <label for="p_name"> Product Name :</label>
    <INPUT TYPE="text" name="prname"> <br><br>
    <label for="p_price"> Product Price :</label>
    <INPUT TYPE="number" name="prprice"> <br><br>
    <label for="p_brand"> Product Brand :</label>
    <INPUT TYPE="text" name="prbrand"> <br><br>
    <label for="p_cid"> Category Id  :</label>
    <INPUT TYPE="number" name="prcid"> <br><br>
    <label for="catgeory"> Category Name :</label>
    <INPUT TYPE="text" name="prcat"> <br><br>
    
    <INPUT TYPE="submit" value="Add Product" name="submit"/>
    </form>

    <%   
    String submitted = (String) request.getParameter("submit");
    if (submitted != null) {
     String p_name=request.getParameter("prname");
     String p_price=request.getParameter("prprice");
     String p_brand=request.getParameter("prbrand");
     String p_cid=request.getParameter("prcid");
     String catgeory=request.getParameter("prcat");
     
     

   	

  	 
  	}
       %>
    
    
    
</body>
</html>