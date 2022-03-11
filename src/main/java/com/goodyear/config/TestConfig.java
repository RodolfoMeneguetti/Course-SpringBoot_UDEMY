 package com.goodyear.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.goodyear.entities.Order;
import com.goodyear.entities.User;
import com.goodyear.entities.enums.OrderStatus;
import com.goodyear.repositories.OrderRepository;
import com.goodyear.repositories.UserRepository;

//anotação para informar que a classe sera de configuração! 

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	// O Spring resolve a dependencia com baixo acoplamento !!!
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	/* Função autoimplementada que ao estartar o projeto é inserindo os dados 
	 * no banco de dados utilizando os paramentros da função!
	 */
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1); 
		
		// é possivel salvar mais de uma função em sequencia! 
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}
	
	

}
