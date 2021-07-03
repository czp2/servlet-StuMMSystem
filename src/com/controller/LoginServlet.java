package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbutil.AdminDao;
import com.entity.Admin;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("name");
		String password = req.getParameter("pwd");
		AdminDao dao = new AdminDao();
		boolean checker = dao.login(username, password);
		if (checker) {
			req.getRequestDispatcher("show").forward(req, resp);
			System.out.println("登录成功---------------------------------------------");
		}else {
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
			System.out.println("登录失败---------------------------------------------");
		}
    }

}
