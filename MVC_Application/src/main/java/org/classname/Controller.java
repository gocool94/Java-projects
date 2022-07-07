package org.classname;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String param = request.getParameter("page");
		System.out.println(param);
		if(param.equals("login")) {
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			System.out.println("**********************************************");
		} else if(param.equals("signup")) {
			getServletContext().getRequestDispatcher("/singup.jsp").forward(request, response);
		}else if(param.equals("about")) {
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
		}
		else {
			getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
		}

	
}

}
