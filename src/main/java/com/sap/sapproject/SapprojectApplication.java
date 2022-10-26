package com.sap.sapproject;

import com.fasterxml.jackson.databind.JsonNode;
import com.sap.sapproject.tax.Tax;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class SapprojectApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SapprojectApplication.class, args);

	}

}
