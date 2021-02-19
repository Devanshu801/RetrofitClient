package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import gateway.Gateway;



@SpringBootApplication
public class ChannelApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChannelApplication.class, args);
	}
	@Bean
	public Gateway getRetrofirClient() {
		return new Gateway();
	}
}
