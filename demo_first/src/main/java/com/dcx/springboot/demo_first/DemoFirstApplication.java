package com.dcx.springboot.demo_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@AutoConfigurationPackage
@ComponentScan(basePackages="com.dcx.springboot.demo_first")
public class DemoFirstApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoFirstApplication.class, args);
	}
}
