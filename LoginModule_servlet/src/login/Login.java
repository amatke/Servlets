package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/login")
public class Login extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = (String) req.getParameter("username");
		String password = (String) req.getParameter("password");
		
		if (username.equals("aleksa") && password.equals("test")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			resp.sendRedirect("welcome.jsp");
		} else {
			resp.sendRedirect("login.jsp");
		}
	}
	
}
