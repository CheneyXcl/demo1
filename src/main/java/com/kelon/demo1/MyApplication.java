package com.kelon.demo1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {

		//SpringApplication.run(Demo1Application.class, args);
		SpringApplication app=new SpringApplication(MyApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);

	}
}
