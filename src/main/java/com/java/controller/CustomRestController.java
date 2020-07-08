package com.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {

	@Value("${custom.val}")
	private String val;

	@GetMapping("/get")
	public ResponseEntity<String> print() {

		return ResponseEntity.ok().body(val);
	}
}
