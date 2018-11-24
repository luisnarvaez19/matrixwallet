package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.exchange.model.Transferencia;

@Transactional(readOnly = true)
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> { 
	
}
