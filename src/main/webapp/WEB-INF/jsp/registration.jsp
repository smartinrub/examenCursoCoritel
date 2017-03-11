<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html >
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome to Festival Event registration System</title>


        <link rel="StyleSheet" href="css/style.css" type="text/css" />
    </head>

    <body>

        <div class="credentials">
            <form:form method="POST" modelAttribute="visitor">
                <table style="width: 100%;">
                    <tr>
                        <th class="registration" colspan="3">Festival Registration
                            System</th>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <nav>
                                <a href='<c:url value="/"/>'>Log In</a>
                            </nav>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: center;" colspan="3"><h3>Portal
                                Login Page</h3></td>
                    </tr>
                    <tr>
                        <td style="text-align: right; font-size: x-small;" colspan="3"><h3>Fields
                                marked (*) are mandatory</h3></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">*First Name:</td>
                        <td style="text-align: left;">
                            <!--  TODO: completar código --> 
                            <form:input id="firstName" path="firstName" type="text" />
                        </td>
                        <td><form:errors path="firstName" /></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">*Last Name:</td>
                        <td style="text-align: left;"><form:input type="text"
                                    id="lastName" path="lastName" /></td>
                        <td>
                            <!--  TODO: completar código --> 
                            <form:errors path="lastName" />
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">*User Name:</td>
                        <td style="text-align: left;">
                            <!--  TODO: completar código --> 
                            <form:input type="text" id="userName" path="userName" />
                        </td>
                        <td>
                            <!--  TODO: completar código --> 
                            <form:errors path="userName" />
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">*Password:</td>
                        <td style="text-align: left;">
                            <!--  TODO: completar código --> 
                            <form:input type="password"
                                        id="password" path="password" />
                        </td>
                        <td><form:errors path="password" /></td>
                    </tr>
                    <tr>
                        <td style="text-align: right;">*Confirm password:</td>
                        <td style="text-align: left;">
                            <!--  TODO: completar código -->
                            <form:input type="password"
                                        id="confirmPassword" path="confirmPassword" />
                        </td>
                        <td>
                            <!--  TODO: completar código -->
                            <form:errors path="confirmPassword" />
                        </td>
                    </tr>

                    <tr>
                        <td style="text-align: right;">Address:</td>
                        <td style="text-align: left;">
                            <!--  TODO: completar código -->
                            <form:input type="text"
                                        id="address" path="address" />
                        </td>
                        <td><form:errors path="address" /></td>
                    </tr>
                    <tr>

                        <td style="text-align: right;">
                            <input type="reset" value="Cancel" style="margin-left: 73px;"></input>
                        </td>
                        <td style="text-align: left;">
                            <input type="submit" value="Register" style="margin-left: 73px;"></input>
                        </td>
                        <td></td>
                    </tr>
                </table>
                <c:out value="${error}" />
            </form:form>
        </div>
    </body>
</html>