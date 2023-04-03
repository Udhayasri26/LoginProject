package com.new.login.service;

import com.new.login.dao.LogRegisterDao;
import com.new.login.dao.LogRegisterDaoImpl;
import com.new.login.model.LogRegister;

public interface LogRegisterService {
	LogRegisterDao dao = new LogRegisterDaoImpl();
	
	boolean register(LogRegister register);
	boolean login(String DeveloperId,String Password);
}
