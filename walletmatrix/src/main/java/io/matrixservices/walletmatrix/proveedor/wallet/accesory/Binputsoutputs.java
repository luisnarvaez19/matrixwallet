package io.matrixservices.walletmatrix.proveedor.wallet.accesory;

import java.io.Serializable;

public class Binputsoutputs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -304805096987405701L;
	private String id;
	private String address;
	private String value;
	private String valueString;
	private String wallet;
	private String chain;
	private String index;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValueString() {
		return valueString;
	}
	public void setValueString(String valueString) {
		this.valueString = valueString;
	}
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
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
	
	
}
