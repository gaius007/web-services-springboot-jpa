package com.devcaio.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devcaio.project.entities.Order;
import com.devcaio.project.entities.User;
import com.devcaio.project.entities.enums.OrderStatus;
import com.devcaio.project.repositories.OrderRepository;
import com.devcaio.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

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
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
		Order o4 = new Order(null, Instant.parse("2019-08-15T10:15:30Z"), OrderStatus.DELIVERED, u4);
		Order o5 = new Order(null, Instant.parse("2019-09-10T18:45:00Z"), OrderStatus.CANCELED, u5);
		Order o6 = new Order(null, Instant.parse("2019-10-05T14:30:15Z"), OrderStatus.PAID, u6);
		Order o7 = new Order(null, Instant.parse("2019-11-01T20:50:40Z"), OrderStatus.WAITING_PAYMENT, u7);
		Order o8 = new Order(null, Instant.parse("2019-12-25T08:10:05Z"), OrderStatus.SHIPPED, u8);
		Order o9 = new Order(null, Instant.parse("2020-01-01T12:00:00Z"), OrderStatus.DELIVERED, u9);
		Order o10 = new Order(null, Instant.parse("2020-02-14T16:20:25Z"), OrderStatus.CANCELED, u10);
		Order o11 = new Order(null, Instant.parse("2020-03-10T09:15:50Z"), OrderStatus.PAID, u11);
		Order o12 = new Order(null, Instant.parse("2020-04-22T22:30:10Z"), OrderStatus.WAITING_PAYMENT, u12);
		Order o13 = new Order(null, Instant.parse("2020-05-01T06:45:30Z"), OrderStatus.SHIPPED, u13);
		Order o14 = new Order(null, Instant.parse("2020-06-15T13:40:00Z"), OrderStatus.DELIVERED, u14);
		Order o15 = new Order(null, Instant.parse("2020-07-04T18:25:15Z"), OrderStatus.CANCELED, u15);
		Order o16 = new Order(null, Instant.parse("2020-08-19T21:55:45Z"), OrderStatus.PAID, u16);
		Order o17 = new Order(null, Instant.parse("2020-09-30T07:30:20Z"), OrderStatus.WAITING_PAYMENT, u17);
		Order o18 = new Order(null, Instant.parse("2020-10-12T15:10:00Z"), OrderStatus.SHIPPED, u18);
		Order o19 = new Order(null, Instant.parse("2020-11-03T11:25:35Z"), OrderStatus.DELIVERED, u1);
		Order o20 = new Order(null, Instant.parse("2020-12-31T23:59:59Z"), OrderStatus.CANCELED, u2);


		
		
		userRepository.saveAll(Arrays.asList(
				u1, u2, u3, u4, u5, u6, u7, 
				u8, u9, u10, u11, u12, u13, 
				u14, u15, u16, u17, u18
			));
		
		orderRepository.saveAll(Arrays.asList(
			    o1, o2, o3, o4, o5, o6, o7, 
			    o8, o9, o10, o11, o12, o13, 
			    o14, o15, o16, o17, o18, o19, 
			    o20
			));

	}

}
