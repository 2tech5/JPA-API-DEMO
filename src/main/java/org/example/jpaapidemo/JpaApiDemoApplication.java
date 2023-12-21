package org.example.jpaapidemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {
		"com.aegisep.api",
		"org.example.jpaapidemo"
})
@Slf4j
public class JpaApiDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JpaApiDemoApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(org.example.jpaapidemo.JpaApiDemoApplication.class);
	}
}
