package com.arraylist.next.emty;
import java.util.*;

public class ArrayListEmtyChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> topProgrammingLanguages=new ArrayList<String>();
      
      topProgrammingLanguages.add("PHP");
      topProgrammingLanguages.add("Java");
      topProgrammingLanguages.add("JavaScript");
      topProgrammingLanguages.add("Python");
      topProgrammingLanguages.add("Wordpress");
      topProgrammingLanguages.add("CI");
      topProgrammingLanguages.add("Laravel");
      topProgrammingLanguages.add("NodeJS");
      
      System.out.println("The first eheck the array List is emty or not =>"+topProgrammingLanguages.isEmpty());
      
      String firstTopLanguage=topProgrammingLanguages.get(0);
      
      System.out.println("The first Top Programming Language =>"+firstTopLanguage);
      
      topProgrammingLanguages.set(3, "C++");
      
      System.out.println(topProgrammingLanguages);
      
      System.out.println("The Size of ArrayList is => "+topProgrammingLanguages.size());
      
      topProgrammingLanguages.remove(0);
      
      System.out.println("The Remove elemet by index => "+topProgrammingLanguages);
      
      topProgrammingLanguages.remove("CI");
      
      System.out.println("The Remove elemet by object => "+topProgrammingLanguages);
      
      List<String> removable=new ArrayList<String>();
      removable.add("PHP");
      removable.add("NodeJS");
      topProgrammingLanguages.removeAll(removable);
      System.out.println("The Remove all method calling  => "+topProgrammingLanguages);
      
      topProgrammingLanguages.clear();
      
      System.out.println("The clear the list  => "+topProgrammingLanguages);
      
      
      
      List<String> checkable=new ArrayList<String>();
      checkable.add("ExpressJS");
      checkable.add("ReactJS");
      checkable.add("Jquery");
      
      topProgrammingLanguages.addAll(checkable);
      topProgrammingLanguages.add("");
      
      System.out.println("is contain ExpressJS  => "+topProgrammingLanguages.contains("ExpressJS"));
      System.out.println("is contain Jquery   => "+topProgrammingLanguages.contains("Jquery"));
      System.out.println("the size of array  => "+topProgrammingLanguages.size());
      System.out.println("the last index null   => "+topProgrammingLanguages.get(1).isEmpty());
      System.out.println("the last index null   => "+topProgrammingLanguages.get(3).isEmpty());
	}

}
