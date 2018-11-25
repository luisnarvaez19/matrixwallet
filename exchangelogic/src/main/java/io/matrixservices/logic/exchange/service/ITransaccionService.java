package io.matrixservices.logic.exchange.service;

import io.matrixservices.core.exchange.model.Transaccion;

public interface ITransaccionService {
	Transaccion getTransaccionById(long transaccionId);
	boolean agregaTransaccion(Transaccion transaccion);
	void actualizaTransaccion(Transaccion transaccion);
	void borraTransaccion(long transaccionId);
}

