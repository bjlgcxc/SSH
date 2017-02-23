package com.ssh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssh.dao.UserDao;
import com.ssh.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public User getUserById(int id){
		return userDao.getUserById(id);
	}
	
}
