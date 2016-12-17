package com.learn.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.model.User;

@Service
public class UserService {

	private static List<User> users = new ArrayList<User>();
	private static int UserCount = 3;

	static {
		users.add(new User(1, "Test", "User1", "TestUser1", "password1", "test.user1@ness.com", new Date(), "true"));
		users.add(new User(2, "Test", "User2", "TestUser2", "password2", "test.user2@ness.com", new Date(), "true"));
		users.add(new User(3, "Test", "User3", "TestUser3", "password3", "test.user3@ness.com", new Date(), "true"));
	}

	public List<User> retrieveUsers(String userId) {
		List<User> filteredUsers = new ArrayList<User>();
		for (User user : users) {
			if (user.getUserId().startsWith(userId))
				filteredUsers.add(user);
		}
		return filteredUsers;
	}

	public List<User> retrieveAllUsers() {
		return users;
	}

	public void addUser(String firstName, String lastName, String userId, String password, String email,
			Date creationDate, String isActive) {
		users.add(new User(++UserCount, firstName, lastName, userId, password, email, creationDate, isActive));
	}

	public void deleteUser(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				users.remove(user);
				break;
			}
		}
	}

	public User retrieveUser(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	public void updateUser(User user) {
		deleteUser(user.getId());
		users.add(user);
	}
}