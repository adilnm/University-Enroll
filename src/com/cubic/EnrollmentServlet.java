package com.cubic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/enroll")
public class EnrollmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String stdName=request.getParameter("stdName");
		 String profName=request.getParameter("profName");
		 String coursename=request.getParameter("courseName");
		 String courseid=request.getParameter("courseid");
		 
		 Course c=new Course(stdName,profName,coursename,courseid);
		 
		 PrintWriter pw=response.getWriter();
		 
		 pw.println(c.getCoursename());
		
	}

}
