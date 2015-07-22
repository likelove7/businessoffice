package com.businessoffice.mapper;

import java.util.Map;

import com.businessoffice.model.User;

public interface UserMapper {
	User selectByPrimaryKey(Integer id);
}
