package it.pkg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pkg.repository.AppRepository;
import it.pkg.model.App;

@Service
public class AppServiceImpl implements AppService {

	private AppRepository employeeRepository;
	
	@Autowired
	public AppServiceImpl(AppRepository theAppRepository) {
		employeeRepository = theAppRepository;
	}
	
	@Override
	public List<App> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public App findById(int theId) {
		Optional<App> result = employeeRepository.findById(theId);
		
		App theApp = null;
		
		if (result.isPresent()) {
			theApp = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theApp;
	}

	@Override
	public void save(App theApp) {
		employeeRepository.save(theApp);
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}

}






