package com.example.RaiseTechTask6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class RaiseTechTask6Application {

	public static void main(String[] args) {
		SpringApplication.run(RaiseTechTask6Application.class, args);
	}

	@GetMapping("/hello")
	public List hello(@RequestParam(value = "country", defaultValue = "World") String country) {
		List<String> country_list = new ArrayList<>(Arrays.asList("Japan", "USA", "China", "UK"));
		return country_list;
	}
}
