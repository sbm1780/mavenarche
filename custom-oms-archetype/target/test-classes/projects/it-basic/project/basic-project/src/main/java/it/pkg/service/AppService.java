package it.pkg.service;

import java.util.List;

import it.pkg.model.App;

public interface AppService {

	public List<App> findAll();
	
	public App findById(int theId);
	
	public void save(App theEmployee);
	
	public void deleteById(int theId);
	
}
