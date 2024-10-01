package com.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Employee> employees=new ArrayList<Employee>();
        
        employees.add(new Employee(1,"A",12,1500));
  
        employees.add(new Employee(2,"B",13,1000));
        
        employees.add(new Employee(3,"C",10,5500));
        
        employees.add(new Employee(4,"D",11,8500));
        
        employees.add(new Employee(5,"E",12,7800));
        
        Collections.sort(employees, new Mysort());
        
        System.out.println(employees);
        
        Collections.sort(employees, new MysortDesc());
        
        System.out.println(employees);
        
        Collections.sort(employees,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getSalary() - o2.getSalary());
			}
        	
        });
        System.out.println(employees);
        Collections.sort(employees,(obj1,obj2)-> (int)(obj2.getSalary() - obj1.getSalary()));
        System.out.println(employees);
        Collections.sort(employees,(obj1,obj2)-> (int)(obj2.getName().compareTo(obj1.getName())));
        System.out.println(employees);
	}

}

class Mysort implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getSalary() - o2.getSalary());
	}
	
	
}
class MysortDesc implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)(o2.getSalary() - o1.getSalary());
	}
	
}