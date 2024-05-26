<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!doctype html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <h2>Student Enquiry Form</h2>
    <p><font color="green"> ${msg}</font></p>
    <form:form action="save" modelAttribute="student" method="post">
        <table>
            <tr>
                <td>Name : </td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>Email :</td>
                <td><form:input path="email"/></td>
            </tr>

            <tr>
                <td>Gender:</td>
                <td>
                    <form:radiobutton path="gender" value="M"/>Male
                    <form:radiobutton path="gender" value="F"/>Fe-Male
                </td>
            </tr>
            <tr>
                <td>Course:</td>

                <td>
                    <form:select path="courses">
                        <form:option value="">-Select-</form:option>
<%--                        <form:option value="Java">-Java-</form:option>--%>
<%--                        <form:option value="Python">-Python-</form:option>--%>
<%--                        <form:option value="DevOps">-DevOps-</form:option>--%>
<%--                        <form:option value="spring">-Spring-</form:option>--%>
                        <form:options items="${courses}"/>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Timing</td>
                <td>
                    <%--<form:checkbox path="timing" value="mrng"/>Morning
                    <form:checkbox path="timing" value="noon"/>AfterNoon
                    <form:checkbox path="timing" value="evng"/>Evening--%>
                    <form:checkboxes path="timing" items="${timings}"/>

                </td>
            </tr>

            <tr>
                <td><input type="submit" ></td>
            </tr>
        </table>
    </form:form>
</body>
</html>