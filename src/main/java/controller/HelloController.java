package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet(urlPatterns = {"/hello", "/xin-chao"})
public class HelloController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user1 = new User("Phuc Hoang Kim 1", 23);
		User user2 = new User("Phuc Hoang Kim 2", 24);
		String name = "test";
		req.setAttribute("name", name);
		req.setAttribute("user1", user1);
		req.setAttribute("user2", user2);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/HelloView.jsp");
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(req, resp);
	}
}
