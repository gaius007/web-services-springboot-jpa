package com.devcaio.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devcaio.project.entities.User;
import com.devcaio.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User u3 = new User(null, "Bob Grey", "bob@gmail.com", "966666666", "123456");
		User u4 = new User(null, "Anna White", "anna@gmail.com", "955555555", "123456");
		User u5 = new User(null, "John Black", "john@gmail.com", "944444444", "123456");
		User u6 = new User(null, "Carol Red", "carol@gmail.com", "933333333", "123456");
		User u7 = new User(null, "Peter Blue", "peter@gmail.com", "922222222", "123456");
		User u8 = new User(null, "Sophia Gold", "sophia@gmail.com", "911111111", "123456");
		User u9 = new User(null, "Michael Silver", "michael@gmail.com", "900000000", "123456");
		User u10 = new User(null, "Laura Purple", "laura@gmail.com", "989898989", "123456");
		User u11 = new User(null, "Thomas Brown", "thomas@gmail.com", "978787878", "123456");
		User u12 = new User(null, "Emily Green", "emily@gmail.com", "967676767", "123456");
		User u13 = new User(null, "Lucas Yellow", "lucas@gmail.com", "956565656", "123456");
		User u14 = new User(null, "Olivia Pink", "olivia@gmail.com", "945454545", "123456");
		User u15 = new User(null, "James Orange", "james@gmail.com", "934343434", "123456");
		User u16 = new User(null, "Isabella Cyan", "isabella@gmail.com", "923232323", "123456");
		User u17 = new User(null, "Henry Indigo", "henry@gmail.com", "912121212", "123456");
		User u18 = new User(null, "Emma Violet", "emma@gmail.com", "901010101", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18));
	}

}
