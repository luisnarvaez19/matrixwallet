package io.matrixservices.walletmatrix.proveedor.user.accessory;

import java.io.Serializable;

public class Bname implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7892265847238314501L;
	private String full;
	private String first;
	private String last;
	
	public String getFull() {
		return full;
	}
	public void setFull(String full) {
		this.full = full;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
}
