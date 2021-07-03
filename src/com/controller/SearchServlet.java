package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbutil.StudentDao;
import com.entity.Student;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	String stuNo = req.getParameter("stuNo");
    	if(stuNo != null && !stuNo.equals("")) {
    		StudentDao dao = new StudentDao();
    		Student student = dao.selectStuByNo(stuNo);
    		req.setAttribute("student", student);
    	}
    	req.getRequestDispatcher("search.jsp").forward(req, res);
    }

}
