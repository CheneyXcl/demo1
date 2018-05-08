package com.example.demo1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		//SpringApplication.run(Demo1Application.class, args);

		SpringApplication app=new SpringApplication(Demo1Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);

	}
}
