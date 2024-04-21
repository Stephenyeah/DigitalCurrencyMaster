package haagahelia.zhenyu.DigitalCurrencyMaster;


import haagahelia.zhenyu.DigitalCurrencyMaster.model.User;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = "haagahelia.zhenyu.DigitalCurrencyMaster")
public class DigitalCurrencyMasterApplication {

	private static final Logger logger = LoggerFactory.getLogger(DigitalCurrencyMasterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DigitalCurrencyMasterApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(UserRepository urepository) {
		return (args) -> {
			if(urepository.count() == 0) {
				User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "arogon217@gmail.com", "USER");
				User user2 = new User("admin", "$2a$08$bCCcGjB03eulCWt3CY0AZew2rVzXFyouUolL5dkL/pBgFkUH9O4J2","arogon21@gmail.com", "ADMIN");
				urepository.saveAll(Arrays.asList(user1, user2));
			}

		};
	}
}
