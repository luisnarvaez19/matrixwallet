package io.matrixservices.core.exchange.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.exchange.model.UsuarioToken;


@Repository
@Transactional(readOnly = true)
public interface UsuarioTokenRepository extends JpaRepository<UsuarioToken, Long> { 
	UsuarioToken findByTokenlabel(String tokenlabel);
}
