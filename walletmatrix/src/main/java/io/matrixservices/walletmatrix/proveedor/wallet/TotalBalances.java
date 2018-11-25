package io.matrixservices.walletmatrix.proveedor.wallet;

import java.io.Serializable;

public class TotalBalances implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3139388723753302662L;

	private Float balance;
	private String balanceString;
	private Float confirmedBalance;
	private String confirmedBalanceString;
	private Float spendableBalance;
	private String spendableBalanceString;
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public String getBalanceString() {
		return balanceString;
	}
	public void setBalanceString(String balanceString) {
		this.balanceString = balanceString;
	}
	public Float getConfirmedBalance() {
		return confirmedBalance;
	}
	public void setConfirmedBalance(Float confirmedBalance) {
		this.confirmedBalance = confirmedBalance;
	}
	public String getConfirmedBalanceString() {
		return confirmedBalanceString;
	}
	public void setConfirmedBalanceString(String confirmedBalanceString) {
		this.confirmedBalanceString = confirmedBalanceString;
	}
	public Float getSpendableBalance() {
		return spendableBalance;
	}
	public void setSpendableBalance(Float spendableBalance) {
		this.spendableBalance = spendableBalance;
	}
	public String getSpendableBalanceString() {
		return spendableBalanceString;
	}
	public void setSpendableBalanceString(String spendableBalanceString) {
		this.spendableBalanceString = spendableBalanceString;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ balance: "+balance+", balanceString: "+balanceString+", confirmedBalance: "+confirmedBalance+
				", confirmedBalanceString: "+confirmedBalanceString+",  spendableBalance: "+spendableBalance+
				", spendableBalanceString: "+spendableBalanceString+"}";
	}
}
