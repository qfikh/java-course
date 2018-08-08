<%@ page 
   language="java" 
   import="java.util.*"
   pageEncoding="utf-8"
   session="true"
  %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>page指令</title>  
  </head>
  
  <body>
      <%
      	 String name = "中国";
      	 //name.charAt(1);
      	 int i = 100/10;
      	 
      	HttpSession session1 = request.getSession();
      	//session.getId();
       %>
       <%= name%><br>
       <%= i %> <br>
       <%=session1.getId() %>
  </body>
</html>
