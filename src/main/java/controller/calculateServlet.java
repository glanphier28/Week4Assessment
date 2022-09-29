package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumberMultiplier;

/**
 * Servlet implementation class calculateServlet
 */
@WebServlet("/calculateServlet")
public class calculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstNumber = request.getParameter("firstNumber");
		String secondNumber = request.getParameter("secondNumber");
		
		NumberMultiplier userMultiplier = new NumberMultiplier(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));
		
		request.setAttribute("userNumberContainer", userMultiplier);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request,  response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userMultiplier.toString());
		writer.close();
		
	}

}
