package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PetServlet
 */
@WebServlet("/PetServlet")
public class PetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String firstname=request.getParameter("n1");
		System.out.println(firstname);
		String lastname=request.getParameter("n2");
		System.out.println(lastname);
		String address=request.getParameter("n3");
		System.out.println(address);
		String email =request.getParameter("n4");
		System.out.println(email);
		String city=request.getParameter("n5");
		System.out.println(city);
		String state=request.getParameter("n6");
		System.out.println(state);
		String petname=request.getParameter("n7");
		System.out.println(petname);
		Long phone=Long.parseLong(request.getParameter("n8"));
		System.out.println(phone);
		String pettype=request.getParameter("n9");
		System.out.println(pettype);
		int age=Integer.parseInt(request.getParameter("n10"));
		System.out.println(age);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
