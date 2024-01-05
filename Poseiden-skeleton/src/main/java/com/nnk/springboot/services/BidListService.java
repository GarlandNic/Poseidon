package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.BidList;
import com.nnk.springboot.repositories.BidListRepository;

@Service
public class BidListService {
	@Autowired
	private BidListRepository bidListRepo;

	public List<BidList> findAll() {
		return bidListRepo.findAll();
	}

	public void save(@Valid BidList bid) {
		bidListRepo.save(bid);
	}

	public Optional<BidList> findById(Integer id) {
		return bidListRepo.findById(id);
	}

	public void delete(BidList bid) {
		bidListRepo.delete(bid);
	}

}
