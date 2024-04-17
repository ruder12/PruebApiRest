package com.Geko.Prueba.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Geko.Prueba.Models.Company;
import com.Geko.Prueba.Models.VersionCompany;

public interface VersionCompanyDao extends JpaRepository<VersionCompany, Integer> {

	VersionCompany findByCompanyId(Company company);
}
