package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.User;
import com.nnk.springboot.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepo;

	public List<User> findAll() {
		return userRepo.findAll();
	}

	public void save(User user) {
		userRepo.save(user);
	}

	public Optional<User> findById(Integer id) {
		return userRepo.findById(id);
	}

	public void delete(User user) {
		userRepo.delete(user);
	}

}
