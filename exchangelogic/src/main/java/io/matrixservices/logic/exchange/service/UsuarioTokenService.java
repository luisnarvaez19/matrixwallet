package io.matrixservices.logic.exchange.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.matrixservices.core.exchange.model.UsuarioToken;
import io.matrixservices.core.exchange.repository.UsuarioTokenRepository;

@Service
public class UsuarioTokenService implements IUsuarioTokenService{

	@Autowired
	private UsuarioTokenRepository usuarioTokenRepository;

	public UsuarioToken getUsuarioTokenByTokenlabel(String tokenlabel) {
		// TODO Auto-generated method stub
		return usuarioTokenRepository.findByTokenlabel(tokenlabel);
	}

	
}
