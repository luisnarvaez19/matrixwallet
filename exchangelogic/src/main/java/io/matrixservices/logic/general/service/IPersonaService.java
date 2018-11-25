package io.matrixservices.logic.general.service;

import io.matrixservices.core.general.model.Persona;

public interface IPersonaService {
	Persona getPersonaById(long personaId);
	boolean agregaPersona(Persona persona);
	void actualizaPersona(Persona persona);
	void borraPersona(long personaId);
}

