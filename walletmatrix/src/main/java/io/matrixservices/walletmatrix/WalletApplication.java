package io.matrixservices.walletmatrix;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import io.matrixservices.walletmatrix.proveedor.wallet.ListWallet;
import io.matrixservices.walletmatrix.proveedor.wallet.ListWalletAddress;
import io.matrixservices.walletmatrix.proveedor.wallet.Wallet;
import io.matrixservices.walletmatrix.proveedor.wallet.WalletAddress;
import io.matrixservices.walletmatrix.proveedor.wallet.ListWalletTransfer;
import io.matrixservices.walletmatrix.proveedor.wallet.TotalBalances;

public class WalletApplication {
	private static final Logger log = LoggerFactory.getLogger(WalletmatrixApplication.class);

	public static void walletClient() {
		String token = "v2x0a6681e59a403421b85164cf0084b4179611e89078b5c56de0f0fc61ef6bd34e";
		String urlwallet="http://Zeus:3080/api/v2/tbtc/wallet/generate";
		
		HttpHeaders headerspost = new HttpHeaders();
		headerspost.set("Content-Type", "application/json");
		headerspost.add("Authorization", "Bearer " + token);
		
		JSONObject json = new JSONObject();
		json.put("label", "Wallet de Prueba");
		json.put("passphrase", "secretpassphrase1a5df8380e0e30");
		
		HttpEntity <String> httpEntity = new HttpEntity <String> (json.toString(), headerspost);
		
		RestTemplate restTemplate = new RestTemplate();
		/*Wallet wallet = restTemplate.postForObject(urlwallet, httpEntity, Wallet.class);
		log.info(wallet.toString());*/
		
		//    LISTA DE WALLETS
		
		String urllistwallets="http://Zeus:3080/api/v2/tbtc/wallet";
		
		HttpEntity <String> entity = new HttpEntity <String> (headerspost);
		//ResponseEntity<ListWallet> listwallets = restTemplate.exchange(urllistwallets, HttpMethod.GET, entity, ListWallet.class);
		//log.info(listwallets.toString());
		
		//   GET WALLET

		String walletid="5bda19c35eb084e7038489929b5b7abb";
		String urlgetwallet="https://test.bitgo.com/api/v2/tbtc/wallet/"+walletid;
		ResponseEntity<Wallet> getwallet = restTemplate.exchange(urlgetwallet, HttpMethod.GET, entity, Wallet.class);
		log.info(getwallet.getBody().toStringCompleta());
		
		log.info("UPDATE WALLET");
		
		//  UPDATE WALLET
		
		walletid="5bda244b6b7184000431ef297cdb76e4";
		urlgetwallet="https://test.bitgo.com/api/v2/tbtc/wallet/"+walletid;
		json = new JSONObject();
		json.put("label", "Wallet de Cambio");
		
		httpEntity = new HttpEntity <String> (json.toString(), headerspost);

		getwallet = restTemplate.exchange(urlgetwallet, HttpMethod.PUT, httpEntity, Wallet.class);
		log.info(getwallet.toString());
		
		// GET WALLET BY ADDRESS
		
		String walletaddress="2NAJWhVoeC5TMpbBirRPqxT93zKAKHW98tE";
		urlgetwallet="https://test.bitgo.com/api/v2/tbtc/wallet/address/"+walletaddress;
		getwallet = restTemplate.exchange(urlgetwallet, HttpMethod.GET, entity, Wallet.class);
		log.info(getwallet.getBody().toStringCompleta());
		
		// LIST WALLET TRANSFER
		
		walletid="5bda19c35eb084e7038489929b5b7abb";
		urlgetwallet="https://test.bitgo.com/api/v2/tbtc/wallet/"+walletid+"/transfer";
		ResponseEntity<ListWalletTransfer> gettransfers= restTemplate.exchange(urlgetwallet, HttpMethod.GET, entity, ListWalletTransfer.class);
		log.info(gettransfers.toString());
		
		// GET WALLET ADDRESS
		
		urlgetwallet="https://test.bitgo.com/api/v2/tbtc/wallet/"+walletid+"/address/"+walletaddress;
		ResponseEntity<WalletAddress> waddress= restTemplate.exchange(urlgetwallet, HttpMethod.GET, entity, WalletAddress.class);
		log.info(waddress.toString());
		
		// LIST WALLET ADDRESS
		
		urlgetwallet="https://test.bitgo.com/api/v2/tbtc/wallet/"+walletid+"/addresses";
		ResponseEntity<ListWalletAddress> lwaddress= restTemplate.exchange(urlgetwallet, HttpMethod.GET, entity, ListWalletAddress.class);
		log.info(lwaddress.toString());
		
		// TOTAL BALANCES
		
		urlgetwallet="https://test.bitgo.com/api/v2/tbtc/wallet/balances";
		ResponseEntity<TotalBalances> balances= restTemplate.exchange(urlgetwallet, HttpMethod.GET, entity, TotalBalances.class);
		log.info(balances.toString());
		
		
		
		/*headerspost = new HttpHeaders();
		headerspost.set("Content-Type", "application/json");
		headerspost.add("Authorization", "Basic Y2xpZW50OnNlY3JldA=="  );
		headerspost.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		json = new JSONObject();
		json.put("username", "user");
		json.put("password", "1b4300f4-2869-4e79-9fd5-ff2ff09f6b21");
		json.put("grant_type", "password");
		
		httpEntity = new HttpEntity <String> (json.toString(), headerspost);
		
		urlgetwallet="http://localhost:8080/oauth/token";
		ResponseEntity<String> tokens= restTemplate.exchange(urlgetwallet, HttpMethod.POST, httpEntity, String.class);
		log.info(tokens.toString());*/
		
		// 2MvoV2WnbWMYhVw457MTAQhGU4YoCCPfkz6  5bda185fc04c76d303442dd21e2aaf8d
		
		
		
	}
	
}
