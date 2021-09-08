package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;
	
	public List<SaleDTO> findAll(){
		List<Sale> list = repo.findAll();
		
		return list.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
	}

}
