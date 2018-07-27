package org.sree;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A Simple Servlet", urlPatterns = { "/SimpleServletPath" },
initParams={@WebInitParam(name="defaultUser", value="Sri nivas")}
)

public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/hmtl");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != null){
		session.setAttribute("savedUserName",userName);
		context.setAttribute("savedUserName",userName);
		}
		writer.println("Request parameter has username as " +userName);
		writer.println("Session parameter has username as " + (String)session.getAttribute("savedUserName"));
		writer.println("Context parameter has username as " + (String)context.getAttribute("savedUserName"));
		writer.println("Init parameter has default username as " + getServletConfig().getInitParameter("defaultUser"));
		
	}

}
