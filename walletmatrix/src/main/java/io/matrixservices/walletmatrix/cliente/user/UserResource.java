package io.matrixservices.walletmatrix.cliente.user;

import static io.matrixservices.core.constant.MatrixConstant.TOKEN_CLIENTE1;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.matrixservices.core.constant.MatrixConstant;
import io.matrixservices.walletmatrix.proveedor.user.UserMe;
import io.matrixservices.walletmatrix.proveedor.user.UserSession;

/*import io.matrixservices.walletmatrix.proveedor.user.UserMe;
import io.matrixservices.walletmatrix.proveedor.user.UserSession;*/

@RestController
public class UserResource {

	@RequestMapping(value = { "/matrixwallet/UserMe/{userid}" }, method = RequestMethod.GET)
	public String userMe(@PathVariable("userid") String userid) {
		System.out.println("Entre al recurso: "+userid);
		
		return UserMe.getUserMe(MatrixConstant.TEST_BITGO_HOST, MatrixConstant.TOKEN_CLIENTE1);
	}
	
	@RequestMapping(value = { "/matrixwallet/UserSession/{userid}" }, method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public String userSession(@PathVariable("userid") String userid) {
		String respuesta=UserSession.getUserSession(MatrixConstant.TEST_BITGO_HOST, MatrixConstant.TOKEN_CLIENTE1);
		System.out.println("Entre al recurso: Session "+userid+" respuesta: "+respuesta);
		return respuesta; 
	}

}
