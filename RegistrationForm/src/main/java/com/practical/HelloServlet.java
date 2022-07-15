package com.practical;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	//constructor
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Welcome</h1>");
		
		String name= request.getParameter("user_name");
		String password= request.getParameter("user_password");
		String email= request.getParameter("user_email");
		String gender=request.getParameter("user_gender");
		String course=request.getParameter("user_course");
		String cond1=request.getParameter("condition1");
		String cond2=request.getParameter("condition2");
		
		if(cond2!=null) {
		if(cond2.equals("checked")) {
			pw.println("<h2> Name : "+name+"</h2>");
			pw.println("<h2> Password : "+password+"</h2>");
			pw.println("<h2> Email: "+email+"</h2>");
			pw.println("<h2> Gender : "+gender+"</h2>");
			pw.println("<h2> Course: "+course+"</h2>");
			
			if(cond1!=null) {
				if(cond1.equals("checked")) {
		        Date date= new Date();
		        String s1=date.toString();
				pw.println("<h2>Current Date and Time :  "+s1+"</h2>");
				pw.println("<h2>Congratulations...your data is submitted successfully!!</h1>");
				}}
		
		}}
		
		else {
			pw.println("<h2>You have not accepted terms and condition</h2>");
		}
		
	
		
		/*if(cond1!=null) {
			if(cond1.equals("checked")) {
	        Date date= new Date();
	        String s1=date.toString();
			pw.println("<h2>Current Date and Time :  "+s1+"</h2>");
			}}*/
		
	
		
	//	response.setContentType("text/html");
      //  Date date= new Date();
        //String s1=date.toString();
		//pw.println("<h2>Current Date and Time :  "+s1+"</h2>");
		//pw.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}