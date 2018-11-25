package io.matrixservices.walletmatrix.proveedor.wallet;

import java.io.Serializable;
import java.util.List;

import io.matrixservices.walletmatrix.proveedor.wallet.accesory.BreceiveAddress;


public class Wallet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2583780207099797060L;
	
	private String id;
	private String coin;
	private String label;
	private List<String> keys;
	private Float balance;
	private Float confirmedBalance;
	private Float spendableBalance;
	private Float balanceString;
	private BreceiveAddress receiveAddress;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
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
	
	public List<String> getKeys() {
		return keys;
	}
	public void setKeys(List<String> keys) {
		this.keys = keys;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public Float getConfirmedBalance() {
		return confirmedBalance;
	}
	public void setConfirmedBalance(Float confirmedBalance) {
		this.confirmedBalance = confirmedBalance;
	}
	public Float getSpendableBalance() {
		return spendableBalance;
	}
	public void setSpendableBalance(Float spendableBalance) {
		this.spendableBalance = spendableBalance;
	}
	public Float getBalanceString() {
		return balanceString;
	}
	public void setBalanceString(Float balanceString) {
		this.balanceString = balanceString;
	}
	
	public BreceiveAddress getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(BreceiveAddress receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	@Override
	public String toString() {
		return "wallet: { _wallet: { id: "+id+", coin: "+
				coin+", label:"+label+",keys: "+keys.toString()+", balance: "+balance;
		// Cuando es por put no muestra el receiveAddress
	}
	
	public String toStringCompleta() {
		return "wallet: { _wallet: { id: "+id+", coin: "+
				coin+", label:"+label+",keys: "+keys.toString()+", balance: "+balance+", receiveAddress: { address: "
				+receiveAddress.getAddress()+", coin: "+receiveAddress.getCoin()+"} } }\n\n";
	}
	
}
