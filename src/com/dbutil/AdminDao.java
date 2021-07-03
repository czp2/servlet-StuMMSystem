package com.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.dbutil.impl.IAdminDao;

public class AdminDao implements IAdminDao{

	@Override
	public boolean login(String id, String pwd) {
		Connection conn = DbHelper.getConnection();
		PreparedStatement pst = null;
		ResultSet rst = null;
		boolean checker = false;
		String sql = "SELECT * FROM admin WHERE id=? AND pwd=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, pwd);
			rst = pst.executeQuery();
			if (rst.next()) {
				checker = true;
			} else {
				checker = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbHelper.close(pst, rst);
		return checker;
	}

	@Override
	public boolean register(String id, String pwd) {
		Connection conn = DbHelper.getConnection();
		PreparedStatement pst = null;
		boolean rChecker = false;
		String sql = "INSERT INTO admin(id,pwd) VALUES(?,?)";
		if (!this.registerCheck(id)) {
			try {
				pst = conn.prepareStatement(sql);
				pst.setString(1, id);
				pst.setString(2, pwd);
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			rChecker = true;
		} else {
			rChecker = false;
			System.out.println("此账号已被注册------------------------------------");
		}
		DbHelper.close(pst, null);
		return rChecker;
	}

	@Override
	public boolean registerCheck(String id) {
		Connection conn = DbHelper.getConnection();
		PreparedStatement pst = null;
		ResultSet rst = null;
		boolean checker = false;
		String sql = "SELECT * FROM admin WHERE id=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);
			rst = pst.executeQuery();
			if (rst.next()) {
				DbHelper.close(pst, rst);
				checker = true;
			} else {
				DbHelper.close(pst, rst);
				checker = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return checker;
	}

}
