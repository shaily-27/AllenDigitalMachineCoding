package com.shaily.allenDigital.demo;

import com.shaily.allenDigital.demo.entity.Driver;
import com.shaily.allenDigital.demo.service.OnBoardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		System.out.println("Hello world!");
		Map<String, String> driverDetails = new HashMap<>();
		driverDetails.put("phone", "6387452540");
		Driver driver1 = new Driver("Shaily", driverDetails, "DL_01");


	}

}
