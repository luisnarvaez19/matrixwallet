package io.matrixservices.core.general.model;
// default package
// Generated Oct 25, 2018 3:02:48 PM by Hibernate Tools 5.3.6.Final

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Pais generated by hbm2java
 */
@Entity
public class Pais implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4841130664856744523L;
	private UUID paisid;
	private String nombre;
	private String comentario;
	private short activo;
	//private Set<Ciudad> ciudads = new HashSet<Ciudad>(0);

	public Pais() {
	}

	public Pais(UUID paisid, String nombre, short activo) {
		this.paisid = paisid;
		this.nombre = nombre;
		this.activo = activo;
	}

	public Pais(UUID paisid, String nombre, String comentario, short activo) { //, Set<Ciudad> ciudads) {
		this.paisid = paisid;
		this.nombre = nombre;
		this.comentario = comentario;
		this.activo = activo;
		//this.setCiudads(ciudads);
	}

	@Id
	@Column(name = "paisid", nullable = false)
	public UUID getPaisid() {
		return this.paisid;
	}

	public void setPaisid(UUID paisid) {
		this.paisid = paisid;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public short getActivo() {
		return this.activo;
	}

	public void setActivo(short activo) {
		this.activo = activo;
	}
/*
	public Set<Ciudad> getCiudads() {
		return ciudads;
	}

	public void setCiudads(Set<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}
*/


}