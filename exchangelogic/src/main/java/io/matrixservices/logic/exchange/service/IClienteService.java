package io.matrixservices.logic.exchange.service;

import io.matrixservices.core.exchange.model.Cliente;

public interface IClienteService {
	Cliente getClienteById(long clienteId);
	boolean agregaCliente(Cliente cliente);
	void actualizaCliente(Cliente cliente);
	void borracliente(long clienteId);
}

