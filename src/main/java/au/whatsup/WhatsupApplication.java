package au.whatsup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WhatsupApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(WhatsupApplication.class, args);
		if (applicationContext != null) {
			SpringApplication.exit(applicationContext);
		}
	}

}
