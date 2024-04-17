package com.Geko.Prueba.Services;


import com.Geko.Prueba.Models.Version;

public interface versionService {
	java.util.List<Version> List();
	Version get(int id);
	Version Save(Version version);
	Version Update(Version version);
	Boolean delete(int id);
}
