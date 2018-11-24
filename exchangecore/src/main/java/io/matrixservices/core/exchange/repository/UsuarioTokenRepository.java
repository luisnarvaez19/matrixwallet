package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.matrixservices.core.exchange.model.UsuarioToken;


//@Transactional(readOnly = true)
@Repository
public interface UsuarioTokenRepository extends JpaRepository<UsuarioToken, Long> { 
	UsuarioToken findByTokenlabel(String tokenlabel);
}
