package snmaddula.quicktrick.tls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootTlsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTlsApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello TLS / SSL";
	}
}
