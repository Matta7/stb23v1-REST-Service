package fr.univrouen.stb23v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Stb23v1Application {

	public static void main(String[] args) {
		// http://localhost:8100/
		// System.getProperties().put("server.port", 8100);
		SpringApplication.run(Stb23v1Application.class, args);
	}

}
