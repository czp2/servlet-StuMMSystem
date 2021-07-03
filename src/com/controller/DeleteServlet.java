package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbutil.StudentDao;
import com.entity.Student;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String stuNo = req.getParameter("stuNo");
		if(stuNo != null && !stuNo.equals("")) {
			StudentDao dao = new StudentDao();
			dao.deleteStu(stuNo);
		}
		req.getRequestDispatcher("show").forward(req, resp);	
	}

}
