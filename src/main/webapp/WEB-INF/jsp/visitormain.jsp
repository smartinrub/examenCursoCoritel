<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html ">
<html>
    <head>
        <title>Welcome to Festival Event Registration System</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="StyleSheet" href="css/style.css" type="text/css" />
    </head>
    <body>
        <div class="generic">
            <div class="title">
                <p style="color: maroon; font-size: x-large; marging-bottom: 10px;">Festival
                    Registration System</p>
            </div>
            <nav>
                <a href='<c:url value="/logout"/>'>Log Out</a>
            </nav>
            <h3>
                Festival Portal Page: Welcome <span id="user">${visitor.firstName}</span>
                to your portal page:
            </h3>
            <div class="userInformation">
                <p>
                    <strong>Your personal information</strong> is below.
                </p>
                <p class="style1">
                    First Name:
                    <c:out value="${visitor.firstName}"></c:out>
                    </p>
                    <p class="style1">
                        Last Name:
                    <c:out value="${visitor.lastName}"></c:out>
                    </p>
                    <p class="style1">
                        Address:
                    <c:out value="${visitor.address}"></c:out>
                    </p>
                </div>


                <hr
                    style="background-color: DarkCyan; border: 0; height: 3px; margin: 2px">

                <div class="release">

                    <table style="width: 100%;">
                        <tr bgcolor="#669966" style="font-size: small">
                            <th scope="col">Event id</th>
                            <th scope="col">Event name</th>
                            <th scope="col">Description</th>
                            <th scope="col">Places</th>
                            <th scope="col">Available Tickets</th>
                        </tr>
                        <!--  TODO: Completar código para mostrar eventos  -->
                    <c:forEach items="${events}" var="event">
                        <tr bgcolor="#669966" style="font-size: small">
                            <td scope="col">${event.id}</td>
                            <td scope="col">${event.name}</td>
                            <td scope="col">${event.description}</td>
                            <td scope="col">${event.places}</td>
                            <td scope="col">${event.seatsAvailable}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>

