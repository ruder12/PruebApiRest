package com.Geko.Prueba.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.Geko.Prueba.Dao.VersionDao;
import com.Geko.Prueba.Models.Version;

public class VersionServiceImpl implements versionService {

	@Autowired
	private VersionDao getDao;
	
	@Override
	public java.util.List<Version> List() {
		// TODO Auto-generated method stub
		return getDao.findAll();
	}

	@Override
	public Version get(int id) {
		if (id != 0) {
			return getDao.getReferenceById(id);
		}
		return null;
	}

	@Override
	public Version Save(Version version) {
	 if (version != null) {
		return getDao.save(version);
	}
		return null;
	}

	@Override
	public Version Update(Version version) {
		 if (version != null) {
				return getDao.saveAndFlush(version);
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
