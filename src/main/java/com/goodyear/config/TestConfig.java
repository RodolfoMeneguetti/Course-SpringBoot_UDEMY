package com.goodyear.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.goodyear.entities.User;
import com.goodyear.repositories.UserRepository;

//anotação para informar que a classe sera de configuração! 

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	// O Spring resolve a dependencia com baixo acoplamento !!!
	@Autowired
	private UserRepository userRepository;

	/* Função autoimplementada que ao estartar o projeto é inserindo os dados 
	 * no banco de dados utilizando os paramentros da função!
	 */
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		// é possivel salvar mais de uma função em sequencia! 
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	

}
