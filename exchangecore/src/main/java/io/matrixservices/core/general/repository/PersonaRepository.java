package io.matrixservices.core.general.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.general.model.Persona;

@Transactional(readOnly = true)
public interface PersonaRepository extends JpaRepository<Persona, Long> { 
	
}
