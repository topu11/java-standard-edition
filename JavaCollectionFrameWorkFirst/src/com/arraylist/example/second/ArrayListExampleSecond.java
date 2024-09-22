package com.arraylist.example.second;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExampleSecond {
	public static void main(String[] args) {
		
		List<Integer> firstNumbers=new ArrayList<Integer>();
		firstNumbers.add(1);
		firstNumbers.add(2);
		firstNumbers.add(3);
		
		List<Integer> secondNumbers=new ArrayList<Integer>(firstNumbers);
		secondNumbers.add(4);
		System.out.println(secondNumbers);
		
		List<Integer> thirdNumbers=new ArrayList<Integer>();
		thirdNumbers.add(10);
		thirdNumbers.add(21);
		thirdNumbers.add(30); 
		
		secondNumbers.addAll(thirdNumbers);
		System.out.println(secondNumbers);
	}
    
}
