package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.User;

import java.util.List;

public interface UserDAO {

	String getUsernameByAccountId(int accountId);
	
    List<User> findAll();

    User findByUsername(String username);

    int findIdByUsername(String username);

    boolean create(String username, String password);
}
