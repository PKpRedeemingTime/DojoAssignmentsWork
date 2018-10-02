package com.patrickkilpatrick.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.patrickkiklpatrick.web.models.AllTeams;
import com.patrickkiklpatrick.web.models.Player;
import com.patrickkiklpatrick.web.models.Team;

/**
 * Servlet implementation class NewPlayer
 */
@WebServlet("/NewPlayer")
public class NewPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewPlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int teamID = Integer.valueOf(request.getParameter("id"));
		request.setAttribute("teamID", teamID);
		request.setAttribute("team", AllTeams.allTeams.get(teamID));
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewPlayer.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int teamID = Integer.valueOf(request.getParameter("id"));
		String fName = request.getParameter("firstName");
		String lName = request.getParameter("lastName");
		int age = Integer.valueOf(request.getParameter("age"));
		
		Player p = new Player(fName, lName, age);
		AllTeams.allTeams.get(teamID).getPlayers().add(p);
		response.sendRedirect("/TeamRoster/TeamPage?id=" + teamID);
	}

}
