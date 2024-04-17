package com.Geko.Prueba.Services;

import com.Geko.Prueba.Dao.VersionCompanyDao;
import com.Geko.Prueba.Models.VersionCompany;

public class VersionCompanyServiceImpl implements VersionCompanyService {

	private VersionCompanyDao getDao;
	
	@Override
	public java.util.List<VersionCompany> List() {
		// TODO Auto-generated method stub
		return getDao.findAll();
	}

	@Override
	public VersionCompany get(int id) {
		if (id != 0) {
			return getDao.getReferenceById(id);
		}
		return null;
	}

	@Override
	public VersionCompany Save(VersionCompany versionCompany) {
		if (versionCompany != null) {
			return getDao.save(versionCompany);
		}
		return null;
	}

	@Override
	public VersionCompany Update(VersionCompany versionCompany) {
		if (versionCompany != null) {
			return getDao.saveAndFlush(versionCompany);
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

}
