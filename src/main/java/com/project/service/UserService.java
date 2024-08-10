package com.project.service;

import java.util.List;

import com.project.dto.User;

public interface UserService {

	boolean addUser(User user);

	boolean deleteUser(int userId);

	boolean updateUser(int userID);

	List<User> showAllUser();

	boolean searchUser(String email);

	User getUser(String email);

	User getUser(int UserId);
}