package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DecisionMaker;

/**
 * Servlet implementation class SecondDecisionServlet
 */
@WebServlet("/SecondDecisionServlet")
public class SecondDecisionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondDecisionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userInput = request.getParameter("userInput");
		String userPath = request.getParameter("path");
		
		DecisionMaker userChoice = new DecisionMaker(userPath, userInput);
		
		if (userPath.equals("2")) {
			if (userChoice.getDecision() == true) {
				getServletContext().getRequestDispatcher("/insideYes.jsp").forward(request, response);
			} 
			else getServletContext().getRequestDispatcher("/insideNo.jsp").forward(request, response);
		}
		else {
			if (userChoice.getDecision() == true) {
				getServletContext().getRequestDispatcher("/outsideYes.jsp").forward(request, response);
			} 
			else getServletContext().getRequestDispatcher("/outsideNo.jsp").forward(request, response);
		}
	}

}
