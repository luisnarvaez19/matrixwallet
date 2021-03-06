package io.matrixservices.core.general.model;
// default package
// Generated Oct 25, 2018 3:02:48 PM by Hibernate Tools 5.3.6.Final

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Rol generated by hbm2java
 */
@Entity
public class Rol implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -122755061025196427L;
	private UUID rolid;
	private String rol;
	private String descripcion;
	private Set<UsuarioRol> usuarioRols = new HashSet<UsuarioRol>(0);

	public Rol() {
	}

	public Rol(UUID rolid, String rol) {
		this.rolid = rolid;
		this.rol = rol;
	}

	public Rol(UUID rolid, String rol, String descripcion, Set<UsuarioRol> usuarioRols) {
		this.rolid = rolid;
		this.rol = rol;
		this.descripcion = descripcion;
		this.usuarioRols = usuarioRols;
	}
	
	@Id
	@Column(name = "rolid", nullable = false)
	public UUID getRolid() {
		return this.rolid;
	}

	public void setRolid(UUID rolid) {
		this.rolid = rolid;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(mappedBy = "rol")
	public Set<UsuarioRol> getUsuarioRols() {
		return this.usuarioRols;
	}

	public void setUsuarioRols(Set<UsuarioRol> usuarioRols) {
		this.usuarioRols = usuarioRols;
	}

}
