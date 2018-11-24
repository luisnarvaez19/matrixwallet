package io.matrixservices.core.general.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.matrixservices.core.general.model.Usuario;


//@Transactional(readOnly = true)
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { // https://docs.spring.io/spring-data/jpa/docs/1.6.0.RELEASE/reference/html/jpa.repositories.html
	// List<Usuario> findByEmailAddressAndLastname(String emailAddress, String
	// lastname); // translate to select u from
	// User u where u.emailAddress =
	// ?1 and u.lastname = ?2
	// @Query("select u from User u where u.firstname like %?1") o se declara aqui o
	// en el NamedQuery en la clase

	// Usuario findByEmailAddress(String emailAddress); // La que se declaro aparte

	// @Query("select u from User u where u.firstname = :firstname or u.lastname =
	// :lastname") // Con parametros
	// Usuario findByLastnameOrFirstname(@Param("lastname") String lastname, @Param("firstname") String firstname);

	// @Modifying
	// @Transactional
	// @Query("delete from Usuario u where u.activo = false")
	// void deleteInactiveUsers();

	//Usuario findByLogin(String login);

	/*@Query("SELECT user FROM Usuario user WHERE user.username = :username")
	Usuario findByUsername(@Param("username") String username);*/
	
	//@Query("SELECT u FROM Usuario u WHERE u.username = ?1")
	Usuario findByUsername(String username);
}
