package io.matrixservices.walletmatrix.proveedor.user.accessory;

import java.io.Serializable;

public class Bemail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1411241730197174284L;
	private String email;
	private String verified;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVerified() {
		return verified;
	}
	public void setVerified(String verified) {
		this.verified = verified;
	}
	
}
