package com.patrickkilpatrick.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    Random r = new Random();
    int num = 0;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(num == 0) {
			num = r.nextInt(100 + 1);
			session.setAttribute("number", num);
			session.setAttribute("result", "");
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String restart = (String) request.getParameter("restart");
		
		if(restart != null) {
			num = 0;
			session.setAttribute("guess", null);
		}
		else {
			Integer answer = (int) session.getAttribute("number");
			Integer guess = Integer.parseInt(request.getParameter("guess"));
			String tooLow = "Too Low!";
			String tooHigh = "Too High!";
			String correct = "Correct!";
			if(guess > answer) {
				session.setAttribute("result", "Too High!");
			}
			else if(guess < answer) {
				session.setAttribute("result", "Too Low!");
			}
			else {
				session.setAttribute("result", "Correct!");
			}
		}
		
		
		
		
		response.sendRedirect("/GreatNumberGame/Home");
	}

}
