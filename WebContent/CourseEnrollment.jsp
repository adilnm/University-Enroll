<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Enrollment</title>
</head>
<body>
	<h1>Please Enter the Required details to Finish your enrollment</h1>
	
	<form action="enroll" method="post">
		Student Name: <input type="text" name="stdName"><br/><br/>
		Professor Name: <input type="text" name="profName"><br/><br/>
		Course Name: <input type="text" name="courseName"><br/><br/>
		Course ID: <input type="text" name="courseid"><br/><br/>
		 <input type="submit" value="Submit">
	</form>
</body>
</html>