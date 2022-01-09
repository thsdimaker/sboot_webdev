package jpa.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setData("Hello");
		String data = hello.getData();

		System.out.println("data = " + data);

		SpringApplication.run(WebserviceApplication.class, args);
	}

}
