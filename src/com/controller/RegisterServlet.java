package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbutil.AdminDao;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("name");
		String password = req.getParameter("pwd");
		AdminDao dao = new AdminDao();
		String message = null;
		boolean registerCheck = dao.register(username, password);
		if (registerCheck) {
			message = "注册成功";
            req.getSession().setAttribute("message", message);
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		} else {
			message = "账号已被注册或者出现异常错误，请重试";
            req.getSession().setAttribute("message", message);
            req.getRequestDispatcher("Register.jsp").forward(req, resp);
		}
		
    }

}
