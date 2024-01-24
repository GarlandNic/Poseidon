package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;

@Service
public class TradeService {
	@Autowired
	private TradeRepository tradeRepo;

	public List<Trade> findAll() {
		return tradeRepo.findAll();
	}

	public void save(Trade trade) {
		tradeRepo.save(trade);
	}

	public Optional<Trade> findById(Integer id) {
		return tradeRepo.findById(id);
	}

	public void delete(Trade trade) {
		tradeRepo.delete(trade);
	}

}
