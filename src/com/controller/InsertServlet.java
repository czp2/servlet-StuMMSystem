package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbutil.StudentDao;
import com.entity.Student;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String stuNo = request.getParameter("stuNo");
		String stuName = request.getParameter("stuName");
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		String college = request.getParameter("college");
		Student student = new Student();
		student.setStuNo(stuNo);
		student.setStuName(stuName);
		student.setSex(sex);
		student.setAddress(address);
		student.setCollege(college);
		StudentDao dao = new StudentDao();
		dao.addStu(student);
		request.getRequestDispatcher("show").forward(request, response);
    }

}
