package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbutil.StudentDao;
import com.entity.Student;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String stuNo = req.getParameter("stuNo");
		if (stuNo != null && !stuNo.equals("")) {
			StudentDao dao = new StudentDao();
			Student student = dao.selectStuByNo(stuNo);
			req.setAttribute("student", student);
		}
		req.getRequestDispatcher("update.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String stuNo = request.getParameter("stuNo");
		String stuName = request.getParameter("stuName");
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		String college = request.getParameter("college");
		Student student = new Student();
		System.out.println(student);
		student.setStuNo(stuNo);
		student.setStuName(stuName);
		student.setSex(sex);
		student.setAddress(address);
		student.setCollege(college);
		StudentDao dao = new StudentDao();
		dao.updateStu(student);
		request.getRequestDispatcher("show").forward(request, response);
    }

}
