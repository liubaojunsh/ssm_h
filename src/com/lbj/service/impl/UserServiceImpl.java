package com.lbj.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lbj.dao.HbUserDao;
import com.lbj.dao.UserMapper;
import com.lbj.model.User;
import com.lbj.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Resource(name="userDaoHbm")
	private HbUserDao hbUserDao;
	
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED, readOnly=true)
	@Override
	public User selectUser(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)  
	@Override
	public Long saveUser(User user) {
		return hbUserDao.saveUser(user);
	}

}
