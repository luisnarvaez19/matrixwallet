package io.matrixservices.logic.general.service;

import java.util.List;

import io.matrixservices.core.general.model.Usuario;

public interface IUsuarioService {
	Usuario getUsuarioById(long usuarioId);
	Usuario agregaUsuario(Usuario usuario);
	void actualizaUsuario(Usuario usuario);
	void borraUsuario(long usuarioId);
	Usuario getUsuarioByUsername(String username);
	List<Usuario> getAll();
}

