package io.matrixservices.logic.exchange.service;


import io.matrixservices.core.exchange.model.UsuarioToken;

public interface IUsuarioTokenService {
	
	UsuarioToken getUsuarioTokenByTokenlabel(String tokenlabel);
}

