package com.stark.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.stark"})
public class InventorywebappApplication  {
	public static void main(String[] args)  {
		SpringApplication.run(InventorywebappApplication.class, args);
		System.out.println("Spring boot app started");
	}	
}

	