package io.matrixservices.walletmatrix.proveedor.wallet;

import java.io.Serializable;
import java.util.List;

public class ListWallet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3541579129818657552L;
	
	private List<Wallet> wallets;
	private Integer size;

	public List<Wallet> getWallets() {
		return wallets;
	}

	public void setWallets(List<Wallet> wallets) {
		this.wallets = wallets;
	}
	
	public Integer getSize() {
		size=wallets.size();
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder resulta = new StringBuilder();
		resulta.append("[");
		wallets.forEach(item->resulta.append(item.toString()));
		resulta.append("]");
		resulta.append("\nSon en total: "+getSize()+" wallets");
		return resulta.toString();
	}
	
}
