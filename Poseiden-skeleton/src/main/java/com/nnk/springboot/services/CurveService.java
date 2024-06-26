package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.CurvePoint;
import com.nnk.springboot.repositories.CurvePointRepository;

@Service
public class CurveService {
	@Autowired
	CurvePointRepository curveRepo;

	public List<CurvePoint> findAll() {
		return curveRepo.findAll();
	}

	public void save(CurvePoint curvePoint) {
		curveRepo.save(curvePoint);
	}

	public Optional<CurvePoint> findById(Integer id) {
		return curveRepo.findById(id);
	}

	public void delete(CurvePoint curvePoint) {
		curveRepo.delete(curvePoint);
	}

}
