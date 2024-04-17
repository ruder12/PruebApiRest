package com.Geko.Prueba.Services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Geko.Prueba.Dao.CompanyDao;
import com.Geko.Prueba.Dao.VersionCompanyDao;
import com.Geko.Prueba.Models.Company;
import com.Geko.Prueba.Models.VersionCompany;

@Component
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao getDao;
	
	@Autowired
	private VersionCompanyDao getVersionCompanyDao;
	
	@Override
	public java.util.List<Company> List() {
		// TODO Auto-generated method stub
		return getDao.findAll();
	}

	@Override
	public Company get(int id) {
		if (id != 0) {
			return getDao.getReferenceById(id);
		}
		return null;
	}

	@Override
	public Company Save(Company company) {
		if (company != null) {
			return getDao.save(company);
		}
		return null;
	}

	@Override
	public Company Update(Company company) {
		if (company != null) {
			return getDao.saveAndFlush(company);
		}
		return null;
	}

	@Override
	public Boolean delete(int id) {
		if (id != 0) {
			try {
				getDao.deleteById(id);
				return true;
			} catch (Exception e) {
				return false;
			}
			
		}
		return null;
	}

	@Override
	public HashMap<String, String> getCode(String code) {
		HashMap<String, String> datos = new HashMap<String, String>();
		Company company = getDao.findByCodigo(code);
		if (company != null) {
			VersionCompany versionCompany = getVersionCompanyDao.findByCompanyId(company);
			if (versionCompany != null) {
				datos.put("code", company.getCodigo());
				datos.put("name", company.getName());
				datos.put("version", ""+versionCompany.getVersion_id().getVersion());
				return datos;
			}
		}
		return null;
	}

}
