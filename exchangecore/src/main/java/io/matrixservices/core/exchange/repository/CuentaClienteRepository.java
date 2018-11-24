package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.exchange.model.CuentaCliente;

@Transactional(readOnly = true)
public interface CuentaClienteRepository extends JpaRepository<CuentaCliente, Long> { 
	
}
