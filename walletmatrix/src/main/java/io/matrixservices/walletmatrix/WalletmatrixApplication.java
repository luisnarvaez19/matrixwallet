package io.matrixservices.walletmatrix;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WalletmatrixApplication {

	// private static final Logger log =
	// LoggerFactory.getLogger(WalletmatrixApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WalletmatrixApplication.class, args);
	}

	/*
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	 * builder.build(); } }
	 
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

		};

	}*/
}
