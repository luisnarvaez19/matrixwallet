package io.matrixservices.core.general.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.general.model.UsuarioRol;

@Transactional(readOnly = true)
public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, Long> { 
	
}
