package io.matrixservices.walletmatrix.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//public class AuthorizationServerConfig extends OAuth2AuthorizationServerConfiguration {

	/*@Autowired
	private TokenStore tokenStore;*/

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()")
                .allowFormAuthenticationForClients();
    }
 
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    	String password = "{bcrypt}"
				+ passwordEncoder().encode("$2a$10$C3J3846khvYSR4ajlHNyiOJnkJyJXIa3kbAZzsJdQKWQmfJK4sSmO");
    	clients.inMemory().withClient("luis")
              //  .authorizedGrantTypes("client_credentials", "password","refresh_token")
                .authorities("ROLE_CLIENT", "ROLE_ADMIN","ROLE")
                .scopes("read", "write", "trust")
                .authorizedGrantTypes("password","client_credentials")
                .resourceIds("oauth2-resource")
                .accessTokenValiditySeconds(5000)
                .secret(password).refreshTokenValiditySeconds(50000);
    }
 

	@Autowired
	private AuthenticationManager authenticationManager;

	/*@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager).allowedTokenEndpointRequestMethods(HttpMethod.GET,
				HttpMethod.POST);
	}*/
	
		
	@Override
    public void configure(final AuthorizationServerEndpointsConfigurer endpoints) {
		endpoints.tokenStore(tokenStore())
			.authenticationManager(authenticationManager);
    }
	
	
	@Bean
	public TokenStore tokenStore() {
		return new InMemoryTokenStore();
	}
	/*
	 * @Override
	public void configure(final ClientDetailsServiceConfigurer clients) throws Exception {
		String password = "{bcrypt}"
				+ passwordEncoder().encode("$2a$10$C3J3846khvYSR4ajlHNyiOJnkJyJXIa3kbAZzsJdQKWQmfJK4sSmO");
		clients.inMemory().withClient("luis").secret(password)
				.authorizedGrantTypes("password", "refresh_token", "client_credentials", "authorization_code")
				.accessTokenValiditySeconds(3600).scopes("read", "write", "openid").autoApprove(true);
	}
	 * 
	 * 
	 * 
	 * @Override public void configure(AuthorizationServerEndpointsConfigurer
	 * endpoints) throws Exception { endpoints.tokenStore(tokenStore); }
	 * 
	 * 
	 * 
	 * @Override public void configure(AuthorizationServerEndpointsConfigurer
	 * endpoints) throws Exception {
	 * endpoints.tokenServices(this.customTokenServices()); }
	 * 
	 * @Bean public TokenStore tokenStore() { return new InMemoryTokenStore(); }
	 * 
	 * @Autowired private ClientDetailsService clientDetailsService;
	 * 
	 * 
	 * 
	 * @Override public void configure(final AuthorizationServerEndpointsConfigurer
	 * endpoints) { endpoints.tokenStore(tokenStore())
	 * .authenticationManager(authenticationManager); }
	 * 
	 * 
	 * private DefaultTokenServices customTokenServices() { DefaultTokenServices
	 * tokenServices = new CustomTokenServices(); tokenServices.setTokenStore(new
	 * InMemoryTokenStore()); tokenServices.setSupportRefreshToken(true);
	 * tokenServices.setReuseRefreshToken(true);
	 * tokenServices.setClientDetailsService(this.clientDetailsService); return
	 * tokenServices; }
	 * 
	 * private static class CustomTokenServices extends DefaultTokenServices {
	 * private TokenStore tokenStore;
	 * 
	 * @Override public OAuth2AccessToken refreshAccessToken(String
	 * refreshTokenValue, TokenRequest tokenRequest) throws AuthenticationException
	 * { OAuth2RefreshToken refreshToken =
	 * this.tokenStore.readRefreshToken(refreshTokenValue); OAuth2Authentication
	 * authentication =
	 * this.tokenStore.readAuthenticationForRefreshToken(refreshToken);
	 * 
	 * // Check attributes in the authentication and // decide whether to grant the
	 * refresh token boolean allowRefresh = true;
	 * 
	 * if (!allowRefresh) { // throw UnauthorizedClientException or something
	 * similar
	 * 
	 * }
	 * 
	 * return super.refreshAccessToken(refreshTokenValue, tokenRequest); }
	 * 
	 * @Override public void setTokenStore(TokenStore tokenStore) {
	 * super.setTokenStore(tokenStore); this.tokenStore = tokenStore; } }
	 */

}
