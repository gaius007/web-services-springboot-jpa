package com.devcaio.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcaio.project.entities.User;

@RestController	
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Caio", "c.oliveira2005@outlook.com", "(17)98844-4497", "1234567");
		return ResponseEntity.ok().body(user);
	}
	
}
