package BS5Logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LogginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogginApplication.class, args);
		log.info("Hola soy un log");
		log.debug("Hola soy un log debug");/* No aparecen */
		log.trace("Hola soy un log trace");/* No aparecen */
		log.warn("Hola soy un log warn");
		log.error("Hola soy un log error");
	}

}
