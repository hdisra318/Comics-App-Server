package siniestros.diu.apicomic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiComicsApplication {
    public static final String LOG = "ApiComicsApplication";

	public static void main(String[] args) {
		SpringApplication.run(ApiComicsApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
        final String log = "restTemplate";
		return new RestTemplate();
	}

}
