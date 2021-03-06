package com.rong.dao;

import java.util.List;

import com.rong.model.User;

public interface IUserDao {
	public void add(User user);
	public void delete(int id);
	public void update(User user);
	public List<User> query(int id);
}
