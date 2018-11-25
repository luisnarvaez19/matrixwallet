package io.matrixservices.logic.exchange.service;

import io.matrixservices.core.exchange.model.Monedacambio;

public interface IMonedacambioService {
	Monedacambio getMonedacambiocambioById(long monedacambioId);
	boolean agregaMonedacambio(Monedacambio monedacambio);
	void actualizaMonedacambio(Monedacambio monedacambio);
	void borraMonedacambio(long monedacambioId);
}

