package employeee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data");
		
		switch (data) {
		case "1":
		RequestDispatcher rd= request.getRequestDispatcher("/create");
		rd.forward(request, response);
		break;
		
		case "2":
			RequestDispatcher rd1= request.getRequestDispatcher("/find");
			rd1.forward(request, response);
			break;
			
		case "3":
			RequestDispatcher rd2= request.getRequestDispatcher("/update");
			rd2.forward(request, response);
			break;
			
		case "4":
			RequestDispatcher rd3= request.getRequestDispatcher("/delete");
			rd3.forward(request, response);
			break;
			
		case "5":
			response.sendRedirect("http://www.google.com");
			break;
			default:
				response.sendError(404);
				break;

}
	}
}
