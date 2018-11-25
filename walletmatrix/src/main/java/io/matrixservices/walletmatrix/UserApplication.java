package io.matrixservices.walletmatrix;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.matrixservices.walletmatrix.proveedor.user.UserMe;
import io.matrixservices.walletmatrix.proveedor.user.UserSession;
import io.matrixservices.core.constant.MatrixConstant;

public class UserApplication {

	private static final Logger log = LoggerFactory.getLogger(WalletmatrixApplication.class);

	public static void userClient() throws UnsupportedEncodingException {
		
		//  LLAMADAS A USER ME Y A USER SESSION
		/*String url = "https://test.bitgo.com/api/v2/user/session";
		String urlme = "https://test.bitgo.com/api/v2/user/me";
		//String url = "https://testnet.manu.backend.hamburg/faucet/api/v2/user/session";
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers1 = new HttpHeaders();
		headers1.add("Authorization", "Bearer " + TOKEN_CLIENTE1);
	
		HttpEntity <String> entity = new HttpEntity <String> (headers1);
		
		ResponseEntity<UserSession> usession = restTemplate.exchange(url, HttpMethod.GET, entity, UserSession.class);
		ResponseEntity<UserMe> userme = restTemplate.exchange(urlme, HttpMethod.GET, entity, UserMe.class);
		
		log.info(usession.toString());
		log.info(userme.toString());
		
		OTRA FORMA DE HACERLO
		HttpHeaders headers = new HttpHeaders();
			headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
			        .queryParam("msisdn", msisdn)
			        .queryParam("email", email)
			        .queryParam("clientVersion", clientVersion)
			        .queryParam("clientType", clientType)
			        .queryParam("issuerName", issuerName)
			        .queryParam("applicationName", applicationName);
			
			HttpEntity<?> entity = new HttpEntity<>(headers);
			
			HttpEntity<String> response = restTemplate.exchange(
			        builder.toUriString(), 
			        HttpMethod.GET, 
			        entity, 
			        String.class);
		*/
		
		/*String userssion=UserSession.getUserSession(MatrixConstant.TEST_BITGO_HOST, MatrixConstant.TOKEN_CLIENTE1);
		log.info(userssion);*/
		/*//  LLAMADA A ADDACCESSTOKEN  186.89.163.161
		//  scope: ["user_manage", "openid", "profile", "wallet_create", "wallet_freeze_all", "wallet_manage_all", 
		//			"wallet_approve_all","wallet_spend_all","wallet_edit_all","wallet_view_all"]
		
		
		HttpHeaders headerspost = new HttpHeaders();
		headerspost.set("Content-Type", "application/json");
		
		headerspost.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		JSONObject json = new JSONObject();
		json.put("label", "tokenprueba");
		json.put("otp", "912125");
		json.put("ipRestrict", "[\"186.89.163.161\",\"192.168.1.102\"]");
		json.put("scope", "[\"user_manage\", \"openid\", \"profile\"]");
		

		HttpEntity<String> httpEntity = new HttpEntity<String>(json.toString(), headerspost);
		String urlgetwallet = "http://"+BITGO_EXPRESS_HOST+":3080/api/v2/addAccessToken";
		ResponseEntity<String> tokens = restTemplate.exchange(urlgetwallet, HttpMethod.POST, httpEntity, String.class);
		log.info(tokens.toString());*/
		
	}
	
	
	
}
