<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html >
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome to Festival Event registration System</title>
        <link rel="StyleSheet" href="/css/style.css" type="text/css" />
    </head>
    <body>
        <div class="credentials">
            <form:form method="POST" modelAttribute="visitor">
                <table style="width: 100%;">
                    <tr>
                        <th class="loginTableth" colspan="4">Festival Event
                            Registration System</th>
                        <th></th>
                        <th></th>	
                    </tr>
                    <tr>
                        <td style="text-align: center;" colspan="4"><h3>Portal
                                Login Page</h3></td>
                        <td></td>
                        <td></td>
                    <tr>
                        <td style="text-align: right;">Visitor name:</td>
                        <td style="text-align: left;">
                            <form:input type="text" id="username" path="userName"/>
                        </td>
                        <td><form:errors path="userName"/></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">Password:</td>
                        <td style="text-align: left;">
                            <form:input type="password" id="password" path="password"/></td>
                        <td><form:errors path="password"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td style="text-align: left;">
                            <input style="margin-left: 88px;" type="submit" value="login"/>
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">New Visitor:</td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;"><a href='<c:url value="/registration"/>'>register
                                here</a></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
                <c:out value="${error}"/>
            </form:form>
        </div>
    </body>
</html>
