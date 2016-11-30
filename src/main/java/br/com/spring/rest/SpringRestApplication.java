package br.com.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@Import(RepositoryRestMvcAutoConfiguration.class)
public class SpringRestApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

}
