package com.Geko.Prueba.Services;


import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.Geko.Prueba.Models.Company;

@Service
public interface CompanyService {
	java.util.List<Company> List();
	Company get(int id);
	Company Save(Company company);
	Company Update(Company company);
	Boolean delete(int id);
	HashMap<String, String> getCode(String code);
}
