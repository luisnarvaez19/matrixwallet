package io.matrixservices.logic.general.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.matrixservices.core.general.model.Usuario;
import io.matrixservices.core.general.repository.UsuarioRepository;
import io.matrixservices.logic.general.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario getUsuarioById(long usuarioId) {
		// TODO Auto-generated method stub
		Usuario obj = usuarioRepository.findById(usuarioId).get();
		return obj;
	}

	public void borraUsuario(long usuarioId) {
		// TODO Auto-generated method stub

	}

	public Usuario agregaUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuario;
	}

	public void actualizaUsuario(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		List<Usuario> obj = (List<Usuario>) usuarioRepository.findAll();
		return obj;
	}

	public Usuario getUsuarioByUsername(String username) {
		// TODO Auto-generated method stub
		System.out.println("Entre por la implementacion: "+username);
		if (usuarioRepository==null) System.out.println("Errorrrrrrrrrrrrrrrrrrrr...usuarioRepository==null................");
		Usuario obj=usuarioRepository.findByUsername(username);
		if (obj==null) System.out.println("Errorrrrrrrrrrrrrrrrrrrr.......obj==null.......");
		return obj;
	}

	
}
