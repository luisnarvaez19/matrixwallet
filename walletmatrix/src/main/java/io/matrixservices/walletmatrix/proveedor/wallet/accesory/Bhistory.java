package io.matrixservices.walletmatrix.proveedor.wallet.accesory;

import java.io.Serializable;

public class Bhistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9145041241612148464L;
	private String date;
	private String action;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
}
