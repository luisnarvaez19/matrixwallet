package io.matrixservices.walletmatrix.proveedor.wallet.accesory;

import java.io.Serializable;
import java.util.List;

public class Bkeys implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4132486742332539446L;

	/*private List<String> listKeys;

	public List<String> getListKeys() {
		return listKeys;
	}

	public void setListKeys(List<String> listKeys) {
		this.listKeys = listKeys;
	}*/
	private String listKeys;
	
	@Override
	public String toString() {
		/*StringBuilder resulta = new StringBuilder();
		resulta.append("[");
		listKeys.forEach(item->resulta.append(item).append(","));
		resulta.append("]");
		return resulta.toString();*/
		return "Hola Luis";
	}

	public String getListKeys() {
		return listKeys;
	}

	public void setListKeys(String listKeys) {
		this.listKeys = listKeys;
	}
}
