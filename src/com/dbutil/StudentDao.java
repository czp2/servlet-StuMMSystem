package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDao {
	public List<Student> getAllStu() { // 查询所有信息
		List<Student> list = new ArrayList<Student>(); // 创建集合
		Connection conn = DbHelper.getConnection();
		String sql = "select * from student"; // SQL查询语句
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while (rst.next()) {
				Student student = new Student();
				student.setStuNo(rst.getString("stuno"));
				student.setStuName(rst.getString("stuname"));
				student.setSex(rst.getString("sex"));
				student.setAddress(rst.getString("address"));
				student.setCollege(rst.getString("institute"));
				list.add(student);
			}
			rst.close(); // 关闭
			pst.close(); // 关闭
		} catch (SQLException e) {
			e.printStackTrace(); // 抛出异常
		}
		return list; // 返回一个集合
	}
	
	public boolean addStu(Student student) { // 添加信息
		String sql = "INSERT INTO student(stuno,stuname,sex,address,institute) VALUES (?,?,?,?,?)"; // 添加的SQL语句
		Connection conn = DbHelper.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, student.getStuNo());
			pst.setString(2, student.getStuName());
			pst.setString(3, student.getSex());
			pst.setString(4, student.getAddress());
			pst.setString(5, student.getCollege());
			int count = pst.executeUpdate();
			pst.close();
			return count > 0 ? true : false; // 是否添加的判断
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateStu(Student student) {
		String sql = "UPDATE student SET stuno=?,stuname=?,sex=?,address=?,institute=? WHERE stuno=?";
		Connection connection = DbHelper.getConnection();
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, student.getStuNo());
			pst.setString(2, student.getStuName());
			pst.setString(3, student.getSex());
			pst.setString(4, student.getAddress());
			pst.setString(5, student.getCollege());
			pst.setString(6, student.getStuNo());
			int count = pst.executeUpdate();
			pst.close();
			return count > 0 ? true : false; // 是否添加的判断
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteStu(String stuNo) {
		String sql = "DELETE FROM student WHERE stuno = ?"; // 删除的SQL语句，根据ID删除
		Connection conn = DbHelper.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, stuNo);
			int count = pst.executeUpdate();
			pst.close();
			return count > 0 ? true : false; // 是否删除的判断
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Student selectStuByNo(String stuNo) { // 根据ID进行查询
		Connection conn = DbHelper.getConnection();
		String sql = "SELECT * FROM student WHERE stuno = " + stuNo;
		Student student = null;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while (rst.next()) {
				student = new Student();
				student.setStuNo(rst.getString("stuno"));
				student.setStuName(rst.getString("stuname"));
				student.setSex(rst.getString("sex"));
				student.setAddress(rst.getString("address"));
				student.setCollege(rst.getString("institute"));
			}
			rst.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student; // 返回
	}
}
