<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="org.sree.dto.User" scope="request">
<jsp:setProperty property="*" name="user" />
</jsp:useBean>


Hello My Name is: <jsp:getProperty property="userName" name="user"/>
<br>Address 1: <jsp:getProperty property="address1" name="user"/>
<br>Address 2: <jsp:getProperty property="address2" name="user"/>
<br>City:   <jsp:getProperty property="city" name="user"/>
<br>Sate:  <jsp:getProperty property="state" name="user"/>
<br>PinCode: <jsp:getProperty property="pincode" name="user"/>

</body>
</html>