<%-- 
    Document   : ejemplo
    Created on : 1 sep. 2021, 01:26:23
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="calculos.Area" %>
<%@page import="calculos.Perimetro" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String n1=request.getParameter("num1");
            String n2=request.getParameter("num2");
            
Area s=new Area(n1,n2);
s.hacerArea();
int resultado=s.getResultado();

Perimetro p=new Perimetro(n1);
p.hacerPerimetro();
int resultadoPerimetro=p.getResultadoPerimetro();
            %>
            El area es: 
            <%=resultado%>
            
            El perimetro es:
            <%=resultadoPerimetro%>
    </body>
</html>
