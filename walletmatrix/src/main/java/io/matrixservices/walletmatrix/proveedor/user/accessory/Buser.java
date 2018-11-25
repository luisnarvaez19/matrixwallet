package io.matrixservices.walletmatrix.proveedor.user.accessory;

import java.io.Serializable;

public class Buser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1053410773460496056L;
	
	public Buser() {
		
	}

	private String id;
	private String username;
	private Bname	name;
	private Bemail email;
	private String country;
	private String lastLogin;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Bname getName() {
		return name;
	}
	public void setName(Bname name) {
		this.name = name;
	}
	public Bemail getEmail() {
		return email;
	}
	public void setEmail(Bemail email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	
}
