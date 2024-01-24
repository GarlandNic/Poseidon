package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.RuleName;
import com.nnk.springboot.repositories.RuleNameRepository;

@Service
public class RuleNameService {
	@Autowired
	private RuleNameRepository ruleNameRepo;

	public List<RuleName> findAll() {
		return ruleNameRepo.findAll();
	}

	public void save(RuleName ruleName) {
		ruleNameRepo.save(ruleName);
	}

	public Optional<RuleName> findById(Integer id) {
		return ruleNameRepo.findById(id);
	}

	public void delete(RuleName ruleName) {
		ruleNameRepo.delete(ruleName);
	}

}
