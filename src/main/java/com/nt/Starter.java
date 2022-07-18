package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.nt.cntrl","com.nt.Service","com.nt.Dao","com.nt.Entity"})
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}

}
