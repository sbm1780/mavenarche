package it.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pkg.model.App;

public interface AppRepository extends JpaRepository<App, Integer> {

	// that's it ... no need to write any code LOL!
	
}
