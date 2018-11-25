package io.matrixservices.walletmatrix.proveedor.wallet.accesory;

import java.io.Serializable;

public class BcoinSpecific implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 633856520930998177L;
	
	private Integer chain;
	private Integer index;
	private String redeemScript;
	
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
	public String getRedeemScript() {
		return redeemScript;
	}
	public void setRedeemScript(String redeemScript) {
		this.redeemScript = redeemScript;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "{ redeemScript: "+redeemScript+"}";
		return "{ redeemScript: "+redeemScript+", index: "+index+", chain: "+chain+"}";
	}
}
