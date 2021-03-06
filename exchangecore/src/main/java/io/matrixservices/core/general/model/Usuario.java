package io.matrixservices.core.general.model;
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

import io.matrixservices.core.exchange.model.Moneda;
import io.matrixservices.core.exchange.model.Monedacambio;
import io.matrixservices.core.exchange.model.Transferencia;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;

/**
 * Usuario generated by hbm2java
 */
@Entity
@DynamicUpdate
public class Usuario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5806778977835507507L;
	private UUID usuarioid;
	private Persona persona;
	private String username;
	private String password;
	//private Object authorities;
	private short activo;
	//private Set<Transferencia> transferencias = new HashSet<Transferencia>(0);
	//private Set<Moneda> monedasForUsuarioact = new HashSet<Moneda>(0);
	//private Set<Moneda> monedasForUsuariocambio = new HashSet<Moneda>(0);
	//private Set<Moneda> monedasForUsuarioins = new HashSet<Moneda>(0);
	//private Set<Monedacambio> monedacambios = new HashSet<Monedacambio>(0);
	private Set<UsuarioRol> usuarioRols = new HashSet<UsuarioRol>(0);

	public Usuario() {
	}

	public Usuario(UUID usuarioid,  Persona persona, String username,
			String password, short activo) {
		this.usuarioid = usuarioid;
		this.persona = persona;
		this.username = username;
		this.password = password;
		this.activo = activo;
	}

	public Usuario(UUID usuarioid,  Persona persona, String username,
			String password, short activo, Set<Transferencia> transferencias, Set<Moneda> monedasForUsuarioact, Set<Moneda> monedasForUsuariocambio,
			 Set<Moneda> monedasForUsuarioins, Set<Monedacambio> monedacambios, Set<UsuarioRol> usuarioRols) {
		this.usuarioid = usuarioid;
		this.persona = persona;
		this.username = username;
		this.password = password;
		this.activo = activo;
		//this.transferencias = transferencias;
		//this.monedasForUsuarioact = monedasForUsuarioact;
		//this.monedasForUsuariocambio = monedasForUsuariocambio;
		//this.monedasForUsuarioins = monedasForUsuarioins;
		//this.monedacambios = monedacambios;
		this.usuarioRols = usuarioRols;
	}

	@Id
	@Column(name = "usuarioid", nullable = false)
	public UUID getUsuarioid() {
		return this.usuarioid;
	}

	public void setUsuarioid(UUID usuarioid) {
		this.usuarioid = usuarioid;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personaid", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getActivo() {
		return this.activo;
	}

	public void setActivo(short activo) {
		this.activo = activo;
	}

	/*@OneToMany(mappedBy = "usuarioByAutorizacionid")
	public Set<Transferencia> getTransferencias() {
		return this.transferencias;
	}

	public void setTransferencias(Set<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	@OneToMany(mappedBy = "usuarioByUsuarioact")
	public Set<Moneda> getMonedasForUsuarioact() {
		return this.monedasForUsuarioact;
	}

	public void setMonedasForUsuarioact(Set<Moneda> monedasForUsuarioact) {
		this.monedasForUsuarioact = monedasForUsuarioact;
	}

	@OneToMany(mappedBy = "usuarioByUsuariocambio")
	public Set<Moneda> getMonedasForUsuariocambio() {
		return this.monedasForUsuariocambio;
	}

	public void setMonedasForUsuariocambio(Set<Moneda> monedasForUsuariocambio) {
		this.monedasForUsuariocambio = monedasForUsuariocambio;
	}
*/
	
	/*@OneToMany(mappedBy = "usuarioByUsuarioins")
	public Set<Moneda> getMonedasForUsuarioins() {
		return this.monedasForUsuarioins;
	}

	public void setMonedasForUsuarioins(Set<Moneda> monedasForUsuarioins) {
		this.monedasForUsuarioins = monedasForUsuarioins;
	}
*/
	/*@OneToMany(mappedBy = "usuario")
	public Set<Monedacambio> getMonedacambios() {
		return this.monedacambios;
	}

	public void setMonedacambios(Set<Monedacambio> monedacambios) {
		this.monedacambios = monedacambios;
	}*/

	@OneToMany(mappedBy = "usuario")
	public Set<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	public void setUsuarioRols(Set<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}
/*
	public Object getAuthorities() {
		// TODO Auto-generated method stub
		this.authorities=Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
		return this.authorities;
	}

	public void setAuthorities(Object authorities) {
		this.authorities = authorities;
	}*/

}
