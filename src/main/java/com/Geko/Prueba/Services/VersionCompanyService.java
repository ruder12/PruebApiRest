package com.Geko.Prueba.Services;

import com.Geko.Prueba.Models.VersionCompany;

public interface VersionCompanyService {

	java.util.List<VersionCompany> List();
	VersionCompany get(int id);
	VersionCompany Save(VersionCompany versionCompany);
	VersionCompany Update(VersionCompany versionCompany);
	Boolean delete(int id);
}
