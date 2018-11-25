package io.matrixservices.walletmatrix.proveedor.wallet.accesory;

import java.io.Serializable;

public class B_wallet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1243068668549498052L;
	private String id;
	private String coin;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCoin() {
		return coin;
	}
	public void setCoin(String coin) {
		this.coin = coin;
	}
	
}
