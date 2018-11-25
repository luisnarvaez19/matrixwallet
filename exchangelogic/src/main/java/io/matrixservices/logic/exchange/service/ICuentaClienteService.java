package io.matrixservices.logic.exchange.service;

import io.matrixservices.core.exchange.model.CuentaCliente;

public interface ICuentaClienteService {
	CuentaCliente getCuentaClienteById(long cuentaClienteId);
	boolean agregaCuentaCliente(CuentaCliente cuentaCliente);
	void actualizaCuentaCliente(CuentaCliente cuentaCliente);
	void borraCuentaCliente(long cuentaClienteId);
}

