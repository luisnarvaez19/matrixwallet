package io.matrixservices.walletmatrix;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class Application {

	//private static final Logger log = LoggerFactory.getLogger(Application.class);

	/*public static void main(String args[]) {
		//SpringApplication.run(Application.class);
		try {
			UserApplication.userClient();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			UserApplication.userClient();
			//WalletApplication.walletClient();
			//ConexionRest.restClient();
		};
	}
}