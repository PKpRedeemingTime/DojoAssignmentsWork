package com.patrickkilpatrick.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.patrickkiklpatrick.web.models.AllTeams;
import com.patrickkiklpatrick.web.models.Team;

/**
 * Servlet implementation class TeamPage
 */
@WebServlet("/TeamPage")
public class TeamPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teamID = request.getParameter("id");
		
		if(teamID == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewTeam.jsp");
			view.forward(request, response);
		}
		else {
			int id = Integer.valueOf(teamID);
			request.setAttribute("teamID", id);
			request.setAttribute("team", AllTeams.allTeams.get(id));
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/TeamPage.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
