<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload file here</title>
</head>
<body>
	<div align="center">
		<h1>${value}</h1>
	</div>
	<form action="${pageContext.request.contextPath}/upload">
		<table align="center">

			<tr>
				<td>File Directory :</td>
				<td><input type="text" name="filePath"
					placeholder="where want to save"></td>
			</tr>
			<tr>
				<td>File Name :</td>
				<td><input type="text" name="fileName"
					placeholder="Enter Generate File name"></td>
			</tr>
			<tr>
				<td>Upload File :</td>
				<td><input type="text" name="newFile"
					placeholder="Enter file which want to upload"></td>
			</tr>
		</table>
		<center>
			<input type="submit" value="SAVED">
		</center>
	</form>
</body>
</html>