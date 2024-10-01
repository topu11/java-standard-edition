package com.iterationonlist;

import java.util.*;

public class ListItemIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> courses=Arrays.asList("A","B","C","D");
         
         for(int i=0; i<courses.size();i++)
         {
        	 System.out.println(courses.get(i));
         }
         System.out.println("Break");
         for(String item:courses)
         {
        	 System.out.println(item);
         }
         
         System.out.println("Break");
         
         for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
        
         System.out.println("Break");
         
         Iterator<String> iterator = courses.iterator();
         
         while (iterator.hasNext()) {
        	 String course = (String) iterator.next();
        	 System.out.println(course);
		}
        
         System.out.println("Break");
         
         courses.stream().forEach(item->System.out.println(item));
         
         System.out.println("Break");
         
         courses.forEach(item->System.out.println(item));
	}

}
