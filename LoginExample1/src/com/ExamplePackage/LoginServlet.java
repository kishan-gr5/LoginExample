package com.ExamplePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		try
		{
			UserBean user = new UserBean();
			user.setUsername(req.getParameter("un"));
			user.setPassword(req.getParameter("pw"));
		
			user=UserDAO.login(user);
		
			if(user.isValid())
			{
			HttpSession session = req.getSession(true);
			session.setAttribute("currentsessionUser", user);
			resp.sendRedirect("userLogged.jsp");
			}
		
			else
			{
			resp.sendRedirect("invalidLogin.jsp");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
