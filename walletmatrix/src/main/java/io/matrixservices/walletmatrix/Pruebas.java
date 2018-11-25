package io.matrixservices.walletmatrix;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import io.matrixservices.walletmatrix.proveedor.user.UserMe;
import io.matrixservices.walletmatrix.proveedor.user.UserSession;
import io.matrixservices.walletmatrix.proveedor.wallet.Wallet;

public class Pruebas {
	void pruebas() {
		String token = "v2x0a6681e59a403421b85164cf0084b4179611e89078b5c56de0f0fc61ef6bd34e";
		String url = "https://test.bitgo.com/api/v2/user/session";
		String urlme = "https://test.bitgo.com/api/v2/user/me";
		String urlwallet = "http://Zeus:3080/api/v2/tbtc/wallet/generate";
		// String urlwallet="http://Zeus:3080/api/v2/tbtc/wallet/generate?label=\"Mi
		// Prueba\"&passphrase=\"secretpassphrase1a5df8380e0e30\"";
		// String urllo = "https://test.bitgo.com/api/v2/user/lock";
		// String urlun = "https://test.bitgo.com/api/v2/user/unlock";
		// Use the access token for authentication
		HttpHeaders headers1 = new HttpHeaders();
		headers1.add("Authorization", "Bearer " + token);
		HttpHeaders headerspost = new HttpHeaders();
		headerspost.set("Content-Type", "application/json");
		// headerspost.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		// headerspost.setContentType(MediaType.MULTIPART_FORM_DATA);
		headerspost.add("Authorization", "Bearer " + token);

		JSONObject json = new JSONObject();
		json.put("label", "Wallet de Prueba");
		json.put("passphrase", "secretpassphrase1a5df8380e0e30");

		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("label", "Wallet de Prueba");
		map.add("passphrase", "secretpassphrase1a5df8380e0e30");
		HttpEntity<String> entity = new HttpEntity<String>(headers1);
		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(map,
				headerspost);
		HttpEntity<String> httpEntity = new HttpEntity<String>(json.toString(), headerspost);

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<UserSession> usession = restTemplate.exchange(url, HttpMethod.GET, entity, UserSession.class);
		ResponseEntity<UserMe> userme = restTemplate.exchange(urlme, HttpMethod.GET, entity, UserMe.class);
		// Wallet wallet = restTemplate.postForObject(urlwallet, requestEntity,
		// Wallet.class);
		Wallet wallet = restTemplate.postForObject(urlwallet, httpEntity, Wallet.class);
		// ResponseEntity<Wallet> wallet =
		// restTemplate.exchange(urlwallet,HttpMethod.POST,requestEntity,Wallet.class);

		// ResponseEntity<Wallet> wallet = restTemplate.postForObject( urlwallet,
		// request , Wallet.class );
		// ResponseEntity<UserLock> userlock = restTemplate.exchange(urllo,
		// HttpMethod.GET, entity, UserLock.class);
		// ResponseEntity<UserUnlock> userunlock = restTemplate.exchange(urlun,
		// HttpMethod.GET, entity, UserUnlock.class);
		//log.info(usession.toString());
		//log.info(userme.toString());
		//log.info(wallet.toString());
		// log.info(userlock.toString());
		// log.info(userunlock.toString());
	}
}

/**
 *   Esto funciona es con GET:
 *   
 *   UriComponentsBuilder builder = UriComponentsBuilder
				    .fromUriString(urlwallet)
				    // Add query parameter
				    .queryParam("label", "Wallet de Prueba")
				    .queryParam("passphrase", "secretpassphrase1a5df8380e0e30");
				    
	ResponseEntity<Wallet> wallet = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, Wallet.class);				    
 */
