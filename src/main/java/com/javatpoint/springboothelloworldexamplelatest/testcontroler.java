package com.javatpoint.springboothelloworldexamplelatest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroler {

@RequestMapping ("/hello")
public String test() {
	return "this is my first maven project";
}
	
}

