package io.matrixservices.walletmatrix;

import java.io.IOException;
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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConexionRest {

	private static final Logger log = LoggerFactory.getLogger(WalletmatrixApplication.class);

	public static void restClient() throws IOException {
		HttpHeaders headerspost = new HttpHeaders();
		headerspost.set("Content-Type", "application/json");
		String credentials = "luis:2a$10$C3J3846khvYSR4ajlHNyiOJnkJyJXIa3kbAZzsJdQKWQmfJK4sSmO";
		String encodedCredentials = Base64.getUrlEncoder().encodeToString(credentials.getBytes("utf-8"));

		headerspost.add("Authorization",
				"Basic bHVpczokMmEkMTAkQzNKMzg0NmtodllTUjRhamxITnlpT0pua0p5SlhJYTNrYkFaenNKZFFLV1FtZkpLNHNTbU8");
		//headerspost.add("Authorization", "Basic "+encodedCredentials);

		headerspost.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		JSONObject json = new JSONObject();
		json.put("username", "admin");
		json.put("password", "$2a$10$qiTXtMlCFsKSC7sgApqM/uku/jrps4CxE2eb.dsbZ8/lTiv.ozpxy");
		json.put("grant_type", "password");
		json.put("client-id", "luis");

		HttpEntity<String> httpEntity = new HttpEntity<String>(json.toString(), headerspost);
		RestTemplate restTemplate = new RestTemplate();

		String urlgetwallet = "http://localhost:8080/oauth/token";
		urlgetwallet += "?grant_type=client_credentials";
		ResponseEntity<String> tokens = restTemplate.exchange(urlgetwallet, HttpMethod.POST, httpEntity, String.class);
		log.info(tokens.toString());
		// Get the Access Token From the recieved JSON response
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(tokens.getBody());
		String token = node.path("access_token").asText();
		System.out.println("El token es: " + token);
		
		HttpHeaders headersget = new HttpHeaders();
		headersget.set("Content-Type", "application/json");
		headersget.add("Authorization","Bearer "+token);
		urlgetwallet = "http://localhost:8080/products";
		HttpEntity <String> entity = new HttpEntity <String> (headersget);
		tokens = restTemplate.exchange(urlgetwallet, HttpMethod.GET, entity, String.class);
		log.info(tokens.toString());
	}
}
