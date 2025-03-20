package com.affortMedi.drive.numberAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
	public List<Integer> fibo(int n) {
		List<Integer> series = new ArrayList<>();
		
		series.add(0);
		series.add(1);
		
		int a = 0;
		int b = 1;
	
		
		for (int i = 2; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
			
			series.add(b);
		}
		
		return series;
		
	}
	
	public List<Integer> evenNumbers(int start, int end) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = start; i <= end; i += 2) {
			list.add(i);
		}
		
		return list;
	}
}
