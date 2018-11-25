package io.matrixservices.walletmatrix.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableWebSecurity
// @Order(1)
@Order(6)
@ComponentScan({ "io.matrixservices.core", "io.matrixservices.logic" })
@EnableTransactionManagement
@EnableJpaRepositories({"io.matrixservices.core.general.repository","io.matrixservices.core.exchange.repository"})
@EntityScan({ "io.matrixservices.core.general.model", "io.matrixservices.core.exchange.model" })
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Resource(name = "userService")
	private UserDetailsService userDetailsService;

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder) throws Exception {
		builder.userDetailsService(userDetailsService);
	}
	
	@Autowired
    public void configureGlobal(final AuthenticationManagerBuilder auth) throws Exception {
        //auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("ROLE");
		auth.userDetailsService(userDetailsService);
		 auth.authenticationProvider(authenticationProvider());
    }

	 @Bean
	    public DaoAuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
	        authenticationProvider.setUserDetailsService(userDetailsService);
	        authenticationProvider.setPasswordEncoder(passwordEncoder());
	        return authenticationProvider;
	    }
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	/*
	 * @Autowired public void globalUserDetails(AuthenticationManagerBuilder auth)
	 * throws Exception { //
	 * auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
	 * auth.inMemoryAuthentication().withUser("user").password("{noop}password").
	 * roles("USER"); }
	 */

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/webjars/**", "/images/**", "/oauth/uncache_approvals", "/oauth/cache_approvals");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable() // .anonymous().disable()
				.authorizeRequests().antMatchers("/oauth/token").permitAll().antMatchers("/api-docs/**").permitAll();
	}

	@Bean
	public TokenStore tokenStore() {
		return new InMemoryTokenStore();
	}

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
/*	@Autowired
    Environment env;
	
	 @Bean
		public DataSource getDataSource() {
		    BasicDataSource dataSource = new BasicDataSource();
		    dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		    dataSource.setUrl(env.getProperty("spring.datasource.url"));
		    dataSource.setUsername(env.getProperty("spring.datasource.username"));
		    dataSource.setPassword(env.getProperty("spring.datasource.password="));
		    return dataSource;
		}*/
/*
	@Configuration
	protected static class DefaultUsersAuthConfiguration extends GlobalAuthenticationConfigurerAdapter {

		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("admin").password("{bcrypt}admin1234").roles("ADMIN").and()
					.withUser("guest").password("guest").roles("USER");
		}

	}*/

	
	  /*public static void main(String[] args) { String passwdLuis =
	  "passwd+=Matrix";
	  
	  String resulta = new BCryptPasswordEncoder().encode(passwdLuis);
	  System.out.println("Se encripto: " + passwdLuis + " resultado: " + resulta);
	  
	  }*/
	 
	/**
	  http .authorizeRequests() .antMatchers("/login.jsp").permitAll()
	  .anyRequest().hasRole("USER") .and() .exceptionHandling()
	  .accessDeniedPage("/login.jsp?authorization_error=true") .and() // TODO: put
	  CSRF protection back into this endpoint .csrf()
	  .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize"))
	  .disable() .logout() .logoutUrl("/logout") .logoutSuccessUrl("/login.jsp")
	  .and() .formLogin() .loginProcessingUrl("/login")
	  .failureUrl("/login.jsp?authentication_error=true") .loginPage("/login.jsp");
	  // @formatter:on
	   * Se encripto: $2a$10$qiTXtMlCFsKSC7sgApqM/uku/jrps4CxE2eb.dsbZ8/lTiv.ozpxy 
	   * resultado: $2a$10$vpDB07C1zNdzRCDu0aKswO3dsAcCQ/zPth7jOVCRtjjcJvUfexNLO
	   * e encripto: passwd+=Matrix resultado: $2a$10$euebX50WPdz0F2qnwGu1rec3IXbZgXXiMK6vaQHbVn3k0GHFOCuOC

	 **/
}
