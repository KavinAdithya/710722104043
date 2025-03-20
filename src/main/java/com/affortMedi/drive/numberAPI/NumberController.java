package com.affortMedi.drive.numberAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class NumberController {
	
	@Autowired
	private NumberService num;
	
	@GetMapping("/fibo/{n}")
	public List<Integer> fiboNumber(@PathVariable Integer n) {
		return num.fibo(n);
	}
	
	@GetMapping("/even/{start}/{end}")
	public List<Integer> evenNumbers(@PathVariable Integer start, @PathVariable Integer end) {
		return num.evenNumbers(start, end);
	}
	
	
	@GetMapping("/rand/{n}")
	public List<Integer> randomNumberGeneration(@PathVariable Integer n) {
		return num.randomNumber(n);
	}
}
