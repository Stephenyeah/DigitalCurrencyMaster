package haagahelia.zhenyu.DigitalCurrencyMaster;

import haagahelia.zhenyu.DigitalCurrencyMaster.model.BuyingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.SellingQuestion;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.BuyingQuestionRepository;
import haagahelia.zhenyu.DigitalCurrencyMaster.model.repository.SellingQuestionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "haagahelia.zhenyu.DigitalCurrencyMaster")
public class DigitalCurrencyMasterApplication {

	private static final Logger logger = LoggerFactory.getLogger(DigitalCurrencyMasterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DigitalCurrencyMasterApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(BuyingQuestionRepository buyingQuestionRepository, SellingQuestionRepository sellingQuestionRepository) {
		return (args) -> {
			// Check if initial data exists
			if (buyingQuestionRepository.count() == 0 && sellingQuestionRepository.count() == 0) {
				// Initialize sample buying questions
				BuyingQuestion buyingQuestion1 = new BuyingQuestion(/* initialize properties */);
				BuyingQuestion buyingQuestion2 = new BuyingQuestion(/* initialize properties */);

				// Save sample buying questions to the repository
				buyingQuestionRepository.save(buyingQuestion1);
				buyingQuestionRepository.save(buyingQuestion2);

				// Initialize sample selling questions
				SellingQuestion sellingQuestion1 = new SellingQuestion(/* initialize properties */);
				SellingQuestion sellingQuestion2 = new SellingQuestion(/* initialize properties */);

				// Save sample selling questions to the repository
				sellingQuestionRepository.save(sellingQuestion1);
				sellingQuestionRepository.save(sellingQuestion2);

				// Log initialization message
				logger.info("Initialized sample buying and selling questions");
			} else {
				// Log message if initial data already exists
				logger.info("Sample buying and selling questions already exist, skipping initialization");
			}
		};
	}
}
