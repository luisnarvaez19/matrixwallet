package io.matrixservices.walletmatrix.proveedor.user;

import java.io.Serializable;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import io.matrixservices.walletmatrix.proveedor.user.accessory.Bsession;

public class UserSession implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3516250774768416753L;
	private Bsession session;

	public UserSession() {

	}

	public Bsession getSession() {
		return session;
	}

	public void setSession(Bsession session) {
		this.session = session;
	}

	public static String getUserSession(String host, String token) {
		String urlme = "https://" + host + "/api/v2/user/session";

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers1 = new HttpHeaders();
		headers1.add("Authorization", "Bearer " + token);

		HttpEntity<String> entity = new HttpEntity<String>(headers1);
		ResponseEntity<UserSession> usersession = restTemplate.exchange(urlme, HttpMethod.GET, entity,
				UserSession.class);

		return usersession.getBody().toString();
	}

	@Override
	public String toString() {
		return "{" + "id:" + session.getId() + ", user:" + session.getUser() + ", created:"
				+ session.getCreated() + ", expires:" + session.getExpires() + ", ip:" + session.getIp() + "} ";
	}

	/**
	 * <200,session: {id:5bec433da3898ae1038b0c4324d1cf42, user:5bd72fdc4f3f88aa034cfdd72baf94a3, 
	 * created:2018-11-14T15:46:05.360Z, expires:2028-11-11T15:46:05.360Z, ip:186.89.163.161},
	 * {Access-Control-Allow-Headers=[content-type, authorization, signature, timestamp, auth-timestamp, 
	 * bitgo-auth-version, hmac, bitgo-sdk-version, if-modified-since], Access-Control-Allow-Methods=[GET, POST, PUT, DELETE, OPTIONS], Access-Control-Allow-Origin=[*], Access-Control-Expose-Headers=[timestamp, hmac], Cache-Control=[private, no-cache, no-store, must-revalidate], Content-Type=[application/json; charset=utf-8], Date=[Wed, 14 Nov 2018 17:54:27 GMT], Expires=[-1], Pragma=[no-cache], Request-ID=[cjohgtgyx5ax9q3rwh2va9xu5], Server=[nginx], Strict-Transport-Security=[max-age=31536000], Vary=[Accept-Encoding], X-Content-Type-Options=[nosniff], X-Frame-Options=[deny], X-XSS-Protection=[1; mode=block; report=/xss/report], Content-Length=[413], Connection=[keep-alive]}>
	 * 
	 * <200,{"session":{"id":"5bec433da3898ae1038b0c4324d1cf42","client":"bitgo","user":"5bd72fdc4f3f88aa034cfdd72baf94a3",
	 * "scope":["wallet_view_all","wallet_spend_all","wallet_manage_all","wallet_create","openid","profile"],
	 * "created":"2018-11-14T15:46:05.360Z","expires":"2028-11-11T15:46:05.360Z","ip":"186.89.163.161","ipRestrict":["186.89.163.161"],
	 * "origin":"test.bitgo.com","label":"Cliente1Mat+=","isExtensible":false}},{Access-Control-Allow-Headers=[content-type, authorization, signature, timestamp, auth-timestamp, bitgo-auth-version, hmac, bitgo-sdk-version, if-modified-since], Access-Control-Allow-Methods=[GET, POST, PUT, DELETE, OPTIONS], Access-Control-Allow-Origin=[*], Access-Control-Expose-Headers=[timestamp, hmac], Cache-Control=[private, no-cache, no-store, must-revalidate], Content-Type=[application/json; charset=utf-8], Date=[Wed, 14 Nov 2018 17:56:53 GMT], Expires=[-1], Pragma=[no-cache], Request-ID=[cjohgwllo5b95q9rw8rh5dmz8], Server=[nginx], Strict-Transport-Security=[max-age=31536000], Vary=[Accept-Encoding], X-Content-Type-Options=[nosniff], X-Frame-Options=[deny], X-XSS-Protection=[1; mode=block; report=/xss/report], Content-Length=[413], Connection=[keep-alive]}>
	 */
}