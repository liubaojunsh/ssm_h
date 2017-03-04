package com.lbj.service;

import com.lbj.model.User;

public interface UserService {

	User selectUser(Long id);
	
	Long saveUser(User user);
}
