package io.matrixservices.walletcliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.matrixservices.core.general.model.Usuario;
import io.matrixservices.core.general.repository.UsuarioRepository;
import io.matrixservices.logic.general.service.IUsuarioService;
import io.matrixservices.logic.general.service.UsuarioService;

import org.bouncycastle.util.encoders.Base64;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.json.JSONObject;

@SpringBootApplication
@EnableJpaRepositories("io.matrixservices.core.general.repository")
public class AuthTokenApp {

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ResponseEntity<String> response = null;
		//System.out.println("Authorization Ccode------" + code);

		RestTemplate restTemplate = new RestTemplate();

		String password ="{bcrypt}"+ passwordEncoder().encode("$2a$10$C3J3846khvYSR4ajlHNyiOJnkJyJXIa3kbAZzsJdQKWQmfJK4sSmO");
		String credentials="luis:2a$10$C3J3846khvYSR4ajlHNyiOJnkJyJXIa3kbAZzsJdQKWQmfJK4sSmO";
		//String encodedCredentials = Base64.getUrlEncoder().encodeToString(credentials.getBytes("utf-8"));
		//String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes(),false,true))+"";
		String encodedCredentials = new String(Base64.toBase64String(credentials.getBytes("utf-8")));		
		//String encodedCredentials = "luis"+password;

		HttpHeaders headerspost = new HttpHeaders();
		//headerspost.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headerspost.add("Authorization", "Basic " + "bHVpczokMmEkMTAkQzNKMzg0NmtodllTUjRhamxITnlpT0pua0p5SlhJYTNrYkFaenNKZFFLV1FtZkpLNHNTbU8=");
		//headerspost.add("Authorization", "Basic " + password);
		System.out.println("Encodedcre: "+encodedCredentials);
		//headerspost.add("Authorization", "Basic "+encodedCredentials);
		
		headerspost.set("Content-Type", "application/json");
		headerspost.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		JSONObject json = new JSONObject();
		json.put("username", "user");
		json.put("password", "e3cc65fb-c2fa-4baa-a912-4794a33b0ec4");
		json.put("grant_type", "password");
		json.put("client-id", "luis");
		json.put("client_secret", "$2a$10$C3J3846khvYSR4ajlHNyiOJnkJyJXIa3kbAZzsJdQKWQmfJK4sSmO");
		
		
		HttpEntity<String> httpEntity = new HttpEntity <String> (json.toString(), headerspost);
		
		String urlgetwallet="http://localhost:8080/oauth/token";
		urlgetwallet += "?grant_type=password";
		ResponseEntity<String> tokens= restTemplate.exchange(urlgetwallet, HttpMethod.POST, httpEntity, String.class);
		System.out.println(tokens.toString());
		
		
		String access_token_url = "http://localhost:8080/oauth/token";
		//access_token_url += "?code=" + code;
		access_token_url += "&grant_type=authorization_code";
		//access_token_url += "&redirect_uri=http://localhost:8090/showEmployees";

		response = restTemplate.exchange(access_token_url, HttpMethod.POST, request, String.class);

		System.out.println("Access Token Response ---------" + response.getBody());

		// Get the Access Token From the recieved JSON response
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(response.getBody());
		String token = node.path("access_token").asText();
		System.out.println("El token es: "+token);
	}*/


	@Autowired
	private static IUsuarioService userService;
	
	protected SessionFactory newSessionFactory() {
	    Properties properties = new Properties();
	    properties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
	    //log settings
	    properties.put("hibernate.hbm2ddl.auto", "update");
	    properties.put("hibernate.show_sql", "true");
	    //driver settings
	    properties.put("hibernate.connection.driver_class", "org.hsqldb.jdbcDriver");
	    properties.put("hibernate.connection.url", "jdbc:hsqldb:mem:test");
	    properties.put("hibernate.connection.username", "sa");
	    properties.put("hibernate.connection.password", "");
	 
	    return new Configuration()
	            .addProperties(properties)
	            .addAnnotatedClass(Usuario.class)
	            .buildSessionFactory(
	                    new StandardServiceRegistryBuilder()
	                            .applySettings(properties)
	                            .build()
	    );
	}
	
	@Autowired
	static
	SessionFactory sf;
	
	/*public static void main(String[] args) {
				
		
		System.out.println("Testeando la BD...");
		Session session = null;
	    Transaction txn = null;
	    try {
	         
	        Usuario user = userService.getUsuarioByUsername("admin");
			System.out.println("Entre a verificar usuario: admin");
			if (user != null) {
				System.out.println("Dentro if verificar usuario: "+user.getUsername());
			} else System.out.println("Usuario null");
			
	    }catch (RuntimeException e) {
	        if ( txn != null && txn.isActive() ) txn.rollback();
	        throw e;
	    } finally {
	        if (session != null) {
	            session.close();
	        }
	    }
		
	}
	*/
	@Bean
	public static PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	
}
