package io.matrixservices.walletmatrix.proveedor.user;

import static io.matrixservices.core.constant.MatrixConstant.TOKEN_CLIENTE1;

import java.io.Serializable;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.matrixservices.walletmatrix.proveedor.user.accessory.Buser;

public class UserMe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2408504333394014345L;

	public UserMe() {

	}

	Buser user;

	public Buser getUser() {
		return user;
	}

	public void setUser(Buser user) {
		this.user = user;
	}

	public static String getUserMe(String host,String token) {
		String urlme = "https://"+host+"/api/v2/user/me";

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers1 = new HttpHeaders();
		headers1.add("Authorization", "Bearer " + token);

		HttpEntity<String> entity = new HttpEntity<String>(headers1);
		ResponseEntity<UserMe> userme = restTemplate.exchange(urlme, HttpMethod.GET, entity, UserMe.class);

		return userme.getBody().toString();
	}

	@Override
	public String toString() {
		return "user: {" + "id:" + user.getId() + ", username:" + user.getUsername() + ", name: {"
				+ user.getName().getFull() + ", first: " + user.getName().getFirst() + ", last: "
				+ user.getName().getLast() + "}," + "}";
	}
}
