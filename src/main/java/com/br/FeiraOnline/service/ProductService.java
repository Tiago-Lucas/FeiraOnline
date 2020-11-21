package com.br.FeiraOnline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.FeiraOnline.domain.Product;
import com.br.FeiraOnline.repository.ProcutcRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProcutcRepository productRepo;
	
	public List<Product> findAll(){
		return productRepo.findAll();
	}
}
