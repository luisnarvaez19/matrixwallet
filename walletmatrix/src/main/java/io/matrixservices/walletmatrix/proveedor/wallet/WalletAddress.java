package io.matrixservices.walletmatrix.proveedor.wallet;

import java.io.Serializable;

import io.matrixservices.walletmatrix.proveedor.wallet.accesory.BcoinSpecific;

public class WalletAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 333852423151975653L;
	private String address;
	private Integer chain;
	private Integer index;
	private String coin;
	private String label;
	private String wallet;
	private BcoinSpecific coinSpecific;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCoin() {
		return coin;
	}
	public void setCoin(String coin) {
		this.coin = coin;
	}
	public Integer getChain() {
		return chain;
	}
	public void setChain(Integer chain) {
		this.chain = chain;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ address: "+address+", chain: "+chain+", index: "+index+", coin: "+coin+", label: "+label+
				", wallet: "+wallet+", coinSpecific: "+coinSpecific.toString();
	}
	 
}
