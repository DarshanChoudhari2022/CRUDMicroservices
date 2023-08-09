package org.numetry.darshan.service.impl;

import org.numetry.darshan.model.User;
import org.numetry.darshan.repository.UserRepository;
import org.numetry.darshan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User userGetServ(String id) {

		return userRepository.userGetRepo(id);
	}

	@Override
	public User userAddServ(User user) {
		userRepository.userAddRepo(user);
		return userRepository.userGetRepo(user.getId());
	}

	@Override
	public User userUpdateServ(String id, User user) {
		userRepository.userUpdateRepo(id, user);

		return userRepository.userGetRepo(id);
	}

	@Override
	public String userRemoveServ(String id) {

		return userRepository.userRemoveRepo(id);
	}

}
