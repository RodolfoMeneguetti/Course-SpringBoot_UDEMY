package com.goodyear.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goodyear.entities.User;

// para definir uma classe que sera a controlladora é informado a seguinte annotation

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// criar um endpoint
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999", "12345"); 
		return ResponseEntity.ok().body(u);
	}
	
}
