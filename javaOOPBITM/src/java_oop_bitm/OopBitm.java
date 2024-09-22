package java_oop_bitm;

import java.util.ArrayList;

public class OopBitm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Allah Akbar");
        String[] names=new String[2];
        names[0]="Touhidul";
        names[1]="islam";
        System.out.println(names[0]);
        
        int[] numbeers= {1};
        
        System.out.println(numbeers[0]);
        ArrayList<Student> students=new ArrayList<Student>();
        
        students.add(new Student("A","B",1));
        students.add(new Student("E","F",2));
        students.add(new Student("C","D",3));
        
        students.forEach( (n) -> { System.out.println(n.getFirstName()); } );
	}

}
