package io.matrixservices.walletauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAuthorizationServer
@EnableWebSecurity
public class WalletauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletauthApplication.class, args);
	}
}
