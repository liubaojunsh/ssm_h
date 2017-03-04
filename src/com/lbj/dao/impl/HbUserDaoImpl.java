package com.lbj.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lbj.dao.HbUserDao;
import com.lbj.model.User;

@Repository("userDaoHbm")
public class HbUserDaoImpl implements HbUserDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public Long saveUser(User user) {
		Session session=sessionFactory.openSession(); 
		return (Long) session.save(user);
	}
	
	

}
