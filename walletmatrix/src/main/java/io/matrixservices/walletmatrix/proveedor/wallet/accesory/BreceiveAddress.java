package io.matrixservices.walletmatrix.proveedor.wallet.accesory;

import java.io.Serializable;

public class BreceiveAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6460434467345806745L;
	private String address;
	private String chain;
	private String index;
	private String coin;
	private String wallet;
	private BcoinSpecific coinSpecific; 

	

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getChain() {
		return chain;
	}
	public void setChain(String chain) {
		this.chain = chain;
	}
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getCoin() {
		return coin;
	}
	public void setCoin(String coin) {
		this.coin = coin;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}

	public BcoinSpecific getCoinSpecific() {
		return coinSpecific;
	}

	public void setCoinSpecific(BcoinSpecific coinSpecific) {
		this.coinSpecific = coinSpecific;
	}
}
