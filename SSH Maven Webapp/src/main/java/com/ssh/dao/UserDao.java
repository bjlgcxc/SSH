package com.ssh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ssh.entity.User;

@Repository
public class UserDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public User getUserById(int id) {
		
		User user = (User) hibernateTemplate.get("com.ssh.entity.User", id);
		return user;
	}
	
}
