package io.matrixservices.walletmatrix.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.matrixservices.core.general.model.Usuario;
import io.matrixservices.logic.general.service.IUsuarioService;
import io.matrixservices.walletmatrix.WalletmatrixApplication;

@Service(value = "userService")
public class UserDetailsServiceImpl implements UserDetailsService {
	private static final Logger log = LoggerFactory.getLogger(WalletmatrixApplication.class);

	@Autowired
	private IUsuarioService userService;

	@Override
	// @Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = userService.getUsuarioByUsername(username);
		log.info("Entre a verificar usuario: "+username);
		if (user != null) {
			log.info("Dentro if verificar usuario: "+user.getUsername()+" password: "+user.getPassword());
			String password="{bcrypt}"+user.getPassword();
			return new org.springframework.security.core.userdetails.User(user.getUsername(),
					password, getAuthority());
		} 
		throw new UsernameNotFoundException(username);
	}

	private List getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
	/*
	 * private Set<grantedauthority> getAuthorities(User user){
	 * Set<grantedauthority> authorities = new HashSet<grantedauthority>(); for(Role
	 * role : user.getRoles()) { GrantedAuthority grantedAuthority = new
	 * SimpleGrantedAuthority(role.getRole()); authorities.add(grantedAuthority); }
	 * LOGGER.debug("user authorities are " + authorities.toString()); return
	 * authorities; }
	 * 
	 *  private List<GrantedAuthority> getGrantedAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
         
        for(UserProfile userProfile : user.getUserProfiles()){
            System.out.println("UserProfile : "+userProfile);
            authorities.add(new SimpleGrantedAuthority("ROLE_"+userProfile.getType()));
        }
        System.out.print("authorities :"+authorities);
        return authorities;
    }
	 */

}