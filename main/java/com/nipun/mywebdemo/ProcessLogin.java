package com.nipun.mywebdemo;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessLogin
 * mvn archetype:generate 
-DgroupId=com.nipun.mywebdemo 
-DartifactId=MyMavenWebAppDemo
-DarchetypeArtifactId=maven-archetype-webapp 
-DinteractiveMode=false
 */

public class ProcessLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProcessLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("##### Your Action is initiated #######");

		String responsePage="fail.jsp";
		RequestDispatcher rd=request.getRequestDispatcher(responsePage);;
		
		request.getRequestDispatcher("displayData.jsp");
	    int age=0;
		 	String name=request.getParameter("username");  
		    String pwd=request.getParameter("password"); 
		   
		    if(request.getParameter("age")!=null && Pattern.matches("[^a-zA-Z\\s+]+", request.getParameter("age"))){
		    	 age=Integer.parseInt(request.getParameter("age"));
		    }
		    
		          
		    if(pwd.equals("nipun")){ 
		    	responsePage="success.jsp";
		    	request.setAttribute("dname", name);
		    	request.setAttribute("dage", age);
		    	rd=request.getRequestDispatcher(responsePage);;
		        rd.include(request, response); 

		    }  
		    else{
		    	request.setAttribute("dname", name);
		    	request.setAttribute("dmessage", "Sorry UserName or Password Error!"); 
	    	rd.include(request, response); 

		                      
		        }  
	}
	
	public long multiply(int a,int b){
		return a*b;
	}

}
