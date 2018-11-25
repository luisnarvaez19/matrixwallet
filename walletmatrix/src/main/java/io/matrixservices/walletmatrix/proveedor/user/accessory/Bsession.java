
package io.matrixservices.walletmatrix.proveedor.user.accessory;

import java.io.Serializable;

public class Bsession implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 928257994894629412L;
	private String id;
	private String user;
	private String created;
	private String expires;
	private String ip;
	
	
	public Bsession() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getExpires() {
		return expires;
	}
	public void setExpires(String expires) {
		this.expires = expires;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

}