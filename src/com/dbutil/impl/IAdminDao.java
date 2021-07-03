package com.dbutil.impl;

public interface IAdminDao {
	boolean login(String id, String pwd);
	boolean register(String id, String pwd);
	boolean registerCheck(String id);
}
