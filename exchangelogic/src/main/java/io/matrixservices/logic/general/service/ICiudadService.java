package io.matrixservices.logic.general.service;

import java.util.List;

import io.matrixservices.core.general.model.Ciudad;
import io.matrixservices.core.general.model.Pais;


public interface ICiudadService {
	List<Ciudad> listaCiudadByPais(Pais pais);
	
}

