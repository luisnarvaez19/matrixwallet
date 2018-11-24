package io.matrixservices.core.exchange.model;
// default package
// Generated Oct 25, 2018 3:02:48 PM by Hibernate Tools 5.3.6.Final

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CuentaCliente generated by hbm2java
 */
@Entity
@Table(name = "cuenta_cliente")
public class CuentaCliente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -116493398961046762L;
	private UUID cuentaclienteid;
	private Banco banco;
	private Cliente cliente;
	private TipoCuenta tipoCuenta;
	private String numerocuenta;
	private short activo;
	private Set<Transaccion> transaccions = new HashSet<Transaccion>(0);
	private Set<Transferencia> transferencias = new HashSet<Transferencia>(0);

	public CuentaCliente() {
	}

	public CuentaCliente(UUID cuentaclienteid, Banco banco, Cliente cliente, TipoCuenta tipoCuenta,
			String numerocuenta, short activo) {
		this.cuentaclienteid = cuentaclienteid;
		this.banco = banco;
		this.cliente = cliente;
		this.tipoCuenta = tipoCuenta;
		this.numerocuenta = numerocuenta;
		this.activo = activo;
	}

	public CuentaCliente(UUID cuentaclienteid, Banco banco, Cliente cliente, TipoCuenta tipoCuenta,
			String numerocuenta, short activo, Set<Transaccion> transaccions, Set<Transferencia> transferencias) {
		this.cuentaclienteid = cuentaclienteid;
		this.banco = banco;
		this.cliente = cliente;
		this.tipoCuenta = tipoCuenta;
		this.numerocuenta = numerocuenta;
		this.activo = activo;
		this.transaccions = transaccions;
		this.transferencias = transferencias;
	}

	@Id
	@Column(name = "cuentaclienteid", nullable = false)
	public UUID getCuentaclienteid() {
		return this.cuentaclienteid;
	}

	public void setCuentaclienteid(UUID cuentaclienteid) {
		this.cuentaclienteid = cuentaclienteid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bancoid", nullable = false)
	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clienteid", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipocuentaid", nullable = false)
	public TipoCuenta getTipoCuenta() {
		return this.tipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Column(name = "numerocuenta", nullable = false, length = 25)
	public String getNumerocuenta() {
		return this.numerocuenta;
	}

	public void setNumerocuenta(String numerocuenta) {
		this.numerocuenta = numerocuenta;
	}

	@Column(name = "activo", nullable = false)
	public short getActivo() {
		return this.activo;
	}

	public void setActivo(short activo) {
		this.activo = activo;
	}

	@OneToMany(mappedBy = "cuentaCliente")
	public Set<Transaccion> getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(Set<Transaccion> transaccions) {
		this.transaccions = transaccions;
	}

	@OneToMany(mappedBy = "cuentaCliente")
	public Set<Transferencia> getTransferencias() {
		return this.transferencias;
	}

	public void setTransferencias(Set<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

}
