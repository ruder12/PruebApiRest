package com.Geko.Prueba.Services;

import com.Geko.Prueba.Models.Application;

public interface ApplicationService {

	java.util.List<Application> List();
	Application get(int id);
	Application Save(Application application);
	Application Update(Application application);
	Boolean delete(int id);
	
	
}
