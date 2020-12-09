<%-- 
    Document   : index
    Created on : 9 дек. 2020 г., 1:08:38
    Author     : oaren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            try {
                
                org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
                org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
                // TODO initialize WS operation arguments here
                // TODO process result here
                int result = port.operation("1+2");
                out.println("Result = " + result);
            } catch (Exception ex) {
                out.println("exception" + ex);
            }
        %>
    </body>
</html>
