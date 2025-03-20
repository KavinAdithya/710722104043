package com.affortMedi.drive.numberAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Map<String, List<Integer>> fiboNumber(@PathVariable Integer n) {
		Map<String, List<Integer>> fibo = new HashMap<>();
		fibo.put("numbers", num.fibo(n));
		return fibo;
	}
	
	@GetMapping("/even/{start}/{end}")
	public Map<String, List<Integer>> evenNumbers(@PathVariable Integer start, @PathVariable Integer end) {
		Map<String, List<Integer>> even = new HashMap<>();
		even.put("numbers", num.evenNumbers(start, end));
		return even;
	}
	
	
	@GetMapping("/rand/{n}")
	public Map<String, List<Integer>> randomNumberGeneration(@PathVariable Integer n) {
		Map<String, List<Integer>> rand = new HashMap<>();
		rand.put("numbers", num.randomNumber(n));
		return rand;
	}
}
