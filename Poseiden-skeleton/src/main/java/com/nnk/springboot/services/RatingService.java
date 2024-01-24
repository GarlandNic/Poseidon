package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.Rating;
import com.nnk.springboot.repositories.RatingRepository;

@Service
public class RatingService {
	@Autowired
	private RatingRepository ratingRepo;

	public List<Rating> findAll() {
		return ratingRepo.findAll();
	}

	public void save(Rating rating) {
		ratingRepo.save(rating);
	}

	public Optional<Rating> findById(Integer id) {
		return ratingRepo.findById(id);
	}

	public void delete(Rating rating) {
		ratingRepo.delete(rating);
	}

}
