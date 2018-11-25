package io.matrixservices.logic.exchange.service;

import io.matrixservices.core.exchange.model.Transferencia;

public interface ITransferenciaService {
	Transferencia getTransferenciaById(long transferenciaId);
	boolean agregaTransferencia(Transferencia transferencia);
	void actualizaTransferencia(Transferencia transferencia);
	void borraTransferencia(long transferenciaId);
}

