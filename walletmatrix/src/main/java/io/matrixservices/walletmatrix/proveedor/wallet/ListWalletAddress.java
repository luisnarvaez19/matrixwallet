package io.matrixservices.walletmatrix.proveedor.wallet;

import java.io.Serializable;
import java.util.List;

public class ListWalletAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7471530296880997433L;
	private Integer limit;
	private String coin;
	private List<WalletAddress> addresses;
	private Integer count;
	private Integer pendingAddressCount;
	private Integer totalAddressCount;
	
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public String getCoin() {
		return coin;
	}
	public void setCoin(String coin) {
		this.coin = coin;
	}
	public List<WalletAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<WalletAddress> addresses) {
		this.addresses = addresses;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getPendingAddressCount() {
		return pendingAddressCount;
	}
	public void setPendingAddressCount(Integer pendingAddressCount) {
		this.pendingAddressCount = pendingAddressCount;
	}
	public Integer getTotalAddressCount() {
		return totalAddressCount;
	}
	public void setTotalAddressCount(Integer totalAddressCount) {
		this.totalAddressCount = totalAddressCount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer addressesLista=new StringBuffer("");
		for (WalletAddress walletAddress : addresses) {
			addressesLista.append(walletAddress.toString());
		}
		return "{ limit: "+limit+", coin: "+coin+", addresses: "+addressesLista+", count:"+count+
				", pendingAddressCount: "+pendingAddressCount+", totalAddressCount: "+totalAddressCount+"}";
	}
}
