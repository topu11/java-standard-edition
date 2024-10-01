package com.collectionApi;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //System.out.println("Allah Akbar");
		
		   Collection<String> fruit1=new ArrayList<String>();
           ArrayList<String> fruits=new ArrayList<String>();
           fruits.add("mango");
           fruits.add("banana");
           fruits.add("apple");
           
           fruit1.add("1a");
           fruit1.add("2a");
           fruit1.add("3a");
           fruit1.add("4a");
           
           System.out.println(fruits);
           if(!fruits.contains("orange"))
           {
        	   fruits.add("orange");
           }
           fruits.remove("mango");
           
           System.out.println(fruits);
           
           fruits.forEach((element)->{
        	   System.out.println(element);
           });
           //fruits.clear();
           System.out.println(((ArrayList<String>) fruit1).get(2));
           System.out.println( fruits.get(2));
           fruits.add("guava");
           System.out.println(fruits.size());
           System.out.println("Before removing by index "+fruits);
           fruits.remove(1);
           System.out.println("after removing by index "+fruits);
	}

}
