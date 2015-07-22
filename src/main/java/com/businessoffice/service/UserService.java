package com.businessoffice.service;

import java.util.Map;

import com.businessoffice.model.User;

public interface UserService {
	User selectByPrimaryKey(Integer id);
}
