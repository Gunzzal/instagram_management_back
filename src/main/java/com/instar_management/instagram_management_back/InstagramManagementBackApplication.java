package com.instar_management.instagram_management_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class InstagramManagementBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstagramManagementBackApplication.class, args);
	}

}
