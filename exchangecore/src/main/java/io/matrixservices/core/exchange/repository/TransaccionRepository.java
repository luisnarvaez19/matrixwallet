package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.exchange.model.Transaccion;

@Transactional(readOnly = true)
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> { 
	
}
