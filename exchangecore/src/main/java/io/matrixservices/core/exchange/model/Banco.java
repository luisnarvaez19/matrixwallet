package io.matrixservices.core.exchange.model;
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
 * Banco generated by hbm2java
 */
@Entity
@Table(name = "banco")
public class Banco implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2189225521623399224L;
	private UUID bancoid;
	private TipoSocio tipoSocio;
	private short activo;
	private Set<CuentaCliente> cuentaClientes = new HashSet<CuentaCliente>(0);

	public Banco() {
	}

	public Banco(UUID bancoid, TipoSocio tipoSocio, short activo) {
		this.bancoid = bancoid;
		this.tipoSocio = tipoSocio;
		this.activo = activo;
	}

	public Banco(UUID bancoid, TipoSocio tipoSocio, short activo,
			Set<CuentaCliente> cuentaClientes) {
		this.bancoid = bancoid;
		this.tipoSocio = tipoSocio;
		this.activo = activo;
		this.cuentaClientes = cuentaClientes;
	}

	@Id
	@Column(name = "bancoid", nullable = false)
	public UUID getBancoid() {
		return this.bancoid;
	}

	public void setBancoid(UUID bancoid) {
		this.bancoid = bancoid;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipoSocioid", nullable = false)
	public TipoSocio getTipoSocio() {
		return this.tipoSocio;
	}

	public void setTipoSocio(TipoSocio tipoSocio) {
		this.tipoSocio = tipoSocio;
	}

	@Column(name = "activo", nullable = false)
	public short getActivo() {
		return this.activo;
	}

	public void setActivo(short activo) {
		this.activo = activo;
	}

	@OneToMany(mappedBy = "banco")
	public Set<CuentaCliente> getCuentaClientes() {
		return this.cuentaClientes;
	}

	public void setCuentaClientes(Set<CuentaCliente> cuentaClientes) {
		this.cuentaClientes = cuentaClientes;
	}

}
