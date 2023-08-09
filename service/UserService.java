package org.numetry.darshan.service;

import org.numetry.darshan.model.User;

public interface UserService {

	public User userGetServ(String id);

	public User userAddServ(User user);

	public User userUpdateServ(String id, User user);

	public String userRemoveServ(String id);

}
