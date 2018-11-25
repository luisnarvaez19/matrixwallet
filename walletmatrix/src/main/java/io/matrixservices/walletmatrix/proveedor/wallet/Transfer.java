package io.matrixservices.walletmatrix.proveedor.wallet;

import java.io.Serializable;
import java.util.List;

import io.matrixservices.walletmatrix.proveedor.wallet.accesory.Bhistory;
import io.matrixservices.walletmatrix.proveedor.wallet.accesory.Binputsoutputs;

public class Transfer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7325884138131702522L;
	private String id;
	private String coin;
	private String wallet;
	private String txid;
	private String normalizedTxHash;
	private String height;
	private String date;
	private String confirmations;
	private String type;
	private Float value;
	private Float bitgoFee;
	private Float usd;
	private Float usdRate;
	private String state;
	private Float vSize;
	private Float nSegwitInputs;
	private List<String> tags;
	private String sequenceId;
	private List<Bhistory> history;
	private List<Binputsoutputs> outputs;
	private List<Binputsoutputs> inputs;
	private String confirmedTime;
	private String createdTime;
	
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
	public String getWallet() {
		return wallet;
	}
	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public String getNormalizedTxHash() {
		return normalizedTxHash;
	}
	public void setNormalizedTxHash(String normalizedTxHash) {
		this.normalizedTxHash = normalizedTxHash;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getConfirmations() {
		return confirmations;
	}
	public void setConfirmations(String confirmations) {
		this.confirmations = confirmations;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public Float getBitgoFee() {
		return bitgoFee;
	}
	public void setBitgoFee(Float bitgoFee) {
		this.bitgoFee = bitgoFee;
	}
	public Float getUsd() {
		return usd;
	}
	public void setUsd(Float usd) {
		this.usd = usd;
	}
	public Float getUsdRate() {
		return usdRate;
	}
	public void setUsdRate(Float usdRate) {
		this.usdRate = usdRate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Float getvSize() {
		return vSize;
	}
	public void setvSize(Float vSize) {
		this.vSize = vSize;
	}
	public Float getnSegwitInputs() {
		return nSegwitInputs;
	}
	public void setnSegwitInputs(Float nSegwitInputs) {
		this.nSegwitInputs = nSegwitInputs;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getSequenceId() {
		return sequenceId;
	}
	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}
	public List<Bhistory> getHistory() {
		return history;
	}
	public void setHistory(List<Bhistory> history) {
		this.history = history;
	}
	public List<Binputsoutputs> getOutputs() {
		return outputs;
	}
	public void setOutputs(List<Binputsoutputs> outputs) {
		this.outputs = outputs;
	}
	public List<Binputsoutputs> getInputs() {
		return inputs;
	}
	public void setInputs(List<Binputsoutputs> inputs) {
		this.inputs = inputs;
	}
	public String getConfirmedTime() {
		return confirmedTime;
	}
	public void setConfirmedTime(String confirmedTime) {
		this.confirmedTime = confirmedTime;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ id:"+id+", coin:"+coin+"'wallet:"+ wallet+ ", txid:"+txid+", date:"+date+"type:"+
				type+", value: "+value;
				
	}
	
}
