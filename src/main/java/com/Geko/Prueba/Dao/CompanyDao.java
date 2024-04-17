package com.Geko.Prueba.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Geko.Prueba.Models.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>{

	Company findByCodigo(String code);
	
}
