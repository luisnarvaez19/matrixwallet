package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.exchange.model.Moneda;

@Transactional(readOnly = true)
public interface MonedaRepository extends JpaRepository<Moneda, Long> { 
	
}
