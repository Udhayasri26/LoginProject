package com.new.login.dao;

import java.sql.Connection;

import com.new.login.DBConfig.LDBConfig;
import com.new.login.model.LogRegister;

public interface LogRegisterDao {
	LDBConfig config = new LDBConfig();
	Connection con = config.getConnection();
	boolean register(LogRegister register);
	boolean login(String DeveloperId,String Password);
}
