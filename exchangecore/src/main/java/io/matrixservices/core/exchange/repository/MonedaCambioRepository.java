package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.exchange.model.Monedacambio;

@Transactional(readOnly = true)
public interface MonedaCambioRepository extends JpaRepository<Monedacambio, Long> { 
	
}
