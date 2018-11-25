package io.matrixservices.walletmatrix.proveedor.wallet;

import java.io.Serializable;
import java.util.List;

public class ListWalletTransfer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5698792112614696917L;
	private String coin;
	private List<Transfer> transfers;
	private String count;
	
	
	public String getCoin() {
		return coin;
	}
	public void setCoin(String coin) {
		this.coin = coin;
	}
	public List<Transfer> getTransfers() {
		return transfers;
	}
	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String transferencias="";
		for (Transfer transfer : transfers) {
			transferencias+=transfer.toString();
		}
		return "{ coin: "+coin+", size: "+transfers.size()+", transfers: [ "+ transferencias +"]"+"}";
	}
	
}
