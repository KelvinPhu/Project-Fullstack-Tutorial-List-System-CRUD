package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProjectFullstackCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFullstackCrudApplication.class, args);
	}

}
