package com.new.login.service;

import com.new.login.model.LogRegister;

public class LogRegisterServiceImpl implements LogRegisterService{

	@Override
	public boolean register(LogRegister register) {
		// TODO Auto-generated method stub
		return dao.register(register);
	}

	@Override
	public boolean login(String DeveloperId,String Password) {
		// TODO Auto-generated method stub
		return dao.login(DeveloperId, Password);
	}

}
