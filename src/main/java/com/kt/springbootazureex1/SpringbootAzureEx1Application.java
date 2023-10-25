package com.kt.springbootazureex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureEx1Application {


	@GetMapping("/message")
	public String  message(){
		return "welcome to azure...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureEx1Application.class, args);
	}

}
