package com.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.dbutil.StudentDao;
import com.entity.Student;

public class DbTest {

	@Test
	public void test() {
		Student student = new Student();
		System.out.println(student);
		StudentDao dao = new StudentDao();
		dao.updateStu(student);
	}

}
