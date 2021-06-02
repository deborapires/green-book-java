package com.olxbr.greenbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreenBookApplication {

	public static void main(String[] args) {

		SpringApplication.run(GreenBookApplication.class, args);

		Authors authors;
		authors = new Authors();

		authors.first_name = "William";
		authors.last_name = "Shakespeare";
		authors.code = 123;
		authors.nationality = "English";

		authors.first_name = "Guido";
		authors.last_name = "van Rossum";
		authors.code = 124;
		authors.nationality = "Dutch";
	}

}
