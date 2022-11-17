package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.entities.Livre;

@SpringBootApplication
public class BooksProjectVersionFinalApplication implements CommandLineRunner  {
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(BooksProjectVersionFinalApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Livre.class);
	}

}
