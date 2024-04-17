package com.Geko.Prueba.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.Geko.Prueba.Dao.ApplicationDao;
import com.Geko.Prueba.Models.Application;

public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationDao getDao;
	
	@Override
	public java.util.List<Application> List() {
		// TODO Auto-generated method stub
		return getDao.findAll();
	}

	@Override
	public Application get(int id) {
		if (id != 0) {
			return getDao.getReferenceById(id);
		}
		return null;
	}

	@Override
	public Application Save(Application application) {
		if (application != null) {
			return getDao.save(application);
		}
		return null;
	}

	@Override
	public Application Update(Application application) {
		if (application != null) {
			return getDao.saveAndFlush(application);
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
