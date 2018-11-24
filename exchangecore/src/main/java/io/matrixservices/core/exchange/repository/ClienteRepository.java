package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.exchange.model.Cliente;


@Repository
@Transactional(readOnly = true)
public interface ClienteRepository extends JpaRepository<Cliente, Long> { 

}
