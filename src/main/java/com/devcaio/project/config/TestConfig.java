package com.devcaio.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devcaio.project.entities.Category;
import com.devcaio.project.entities.Order;
import com.devcaio.project.entities.Product;
import com.devcaio.project.entities.User;
import com.devcaio.project.entities.enums.OrderStatus;
import com.devcaio.project.repositories.CategoryRepository;
import com.devcaio.project.repositories.OrderRepository;
import com.devcaio.project.repositories.ProductRepository;
import com.devcaio.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

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
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		Category cat4 = new Category(null, "Home Appliances");
		Category cat5 = new Category(null, "Clothing");
		Category cat6 = new Category(null, "Toys");
		Category cat7 = new Category(null, "Sports");
		Category cat8 = new Category(null, "Beauty");
		Category cat9 = new Category(null, "Health");
		Category cat10 = new Category(null, "Automotive");
		Category cat11 = new Category(null, "Garden");
		Category cat12 = new Category(null, "Music");
		Category cat13 = new Category(null, "Movies");
		Category cat14 = new Category(null, "Groceries");
		Category cat15 = new Category(null, "Office Supplies");
		Category cat16 = new Category(null, "Tools");
		Category cat17 = new Category(null, "Jewelry");
		Category cat18 = new Category(null, "Pets");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		Product p6 = new Product(null, "Wireless Mouse", "Ergonomic and silent mouse with Bluetooth connectivity.", 50.0, "");
		Product p7 = new Product(null, "Gaming Chair", "High-quality chair with lumbar support for long gaming sessions.", 350.0, "");
		Product p8 = new Product(null, "Noise-Cancelling Headphones", "Over-ear headphones with active noise cancellation and long battery life.", 200.0, "");
		Product p9 = new Product(null, "Smartphone", "Latest generation smartphone with 128GB storage and 5G support.", 800.0, "");
		Product p10 = new Product(null, "Electric Kettle", "Fast-boiling kettle with auto shut-off and 1.7L capacity.", 45.0, "");
		Product p11 = new Product(null, "Mechanical Keyboard", "RGB backlit keyboard with customizable keys.", 100.0, "");
		Product p12 = new Product(null, "4K Monitor", "27-inch monitor with ultra-HD resolution and HDR support.", 400.0, "");
		Product p13 = new Product(null, "Drone with Camera", "Compact drone with 4K camera and 30-minute flight time.", 600.0, "");
		Product p14 = new Product(null, "Fitness Tracker", "Waterproof fitness tracker with heart rate and sleep monitoring.", 70.0, "");
		Product p15 = new Product(null, "Electric Scooter", "Foldable scooter with 25 km range and 20 km/h speed.", 500.0, "");
		Product p16 = new Product(null, "Instant Pot", "7-in-1 multi-use cooker for pressure cooking, slow cooking, and more.", 120.0, "");
		Product p17 = new Product(null, "External SSD", "1TB portable SSD with USB-C connectivity and fast transfer speeds.", 150.0, "");
		Product p18 = new Product(null, "Portable Projector", "Mini projector with Wi-Fi and full HD support.", 300.0, "");

		categoryRepository.saveAll(Arrays.asList(
			    cat1, cat2, cat3, cat4, cat5, 
			    cat6, cat7, cat8, cat9, cat10, 
			    cat11, cat12, cat13, cat14, cat15, 
			    cat16, cat17, cat18
			));
		productRepository.saveAll(Arrays.asList(
			    p1, p2, p3, p4, p5, 
			    p6, p7, p8, p9, p10, 
			    p11, p12, p13, p14, p15, 
			    p16, p17, p18
			));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p3.getCategories().add(cat1);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat1);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		p6.getCategories().add(cat1);
		p7.getCategories().add(cat1);
		p7.getCategories().add(cat3);
		p8.getCategories().add(cat2);
		p9.getCategories().add(cat3);
		p10.getCategories().add(cat1);
		p11.getCategories().add(cat3);
		p12.getCategories().add(cat1);
		p13.getCategories().add(cat2);
		p14.getCategories().add(cat1);
		p14.getCategories().add(cat3);
		p15.getCategories().add(cat2);
		p16.getCategories().add(cat1);
		p17.getCategories().add(cat2);
		p18.getCategories().add(cat2);
		
		productRepository.saveAll(Arrays.asList(
			    p1, p2, p3, p4, p5, 
			    p6, p7, p8, p9, p10, 
			    p11, p12, p13, p14, p15, 
			    p16, p17, p18
			));
		
	}

}
