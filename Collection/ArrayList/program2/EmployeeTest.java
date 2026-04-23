package Advance_Java.Collection.ArrayList.program2;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> arr = new ArrayList<Employee>();
		
		arr.add(new Employee(1,"Vijaylaxmi",200000.00));
		arr.add(new Employee(2,"Vinutha",300000.00));
		arr.add(new Employee(3,"Ananya",400000.00));
		arr.add(new Employee(4,"Teju",500000.00));
		arr.add(new Employee(5,"Vijju",600000.00));
		
		Iterator<Employee> it = arr.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.id+" "+e.name+" "+e.salary);
		}
		
		for(int i=0;i<=arr.size();i++) {
			System.out.println(arr);
		}
		arr.forEach(System.out :: println);
	}

}
