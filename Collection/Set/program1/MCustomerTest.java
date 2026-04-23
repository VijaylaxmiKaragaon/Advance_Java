package Advance_Java.Collection.Set.program1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MCustomerTest {

	public static void main(String[] args) {
		ArrayList<MCustomer> seatinglist = new ArrayList<MCustomer>();
		ArrayList<MCustomer> waitinglist = new ArrayList<MCustomer>();
		
		Set<Integer> bookingstatus = new TreeSet<>();
		int capacity = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer details..");
		
		
		for(int i=1;i<=10;i++) {
			System.out.println("Enter the customer id and name");
			int id=sc.nextInt();
			
			String name = sc.next();
			if(bookingstatus.contains(id)) {
				System.out.println("Already booked..");
			} 
			bookingstatus.add(id);
			if(seatinglist.size()<capacity) {
			    seatinglist.add( new MCustomer(id,name));
			    System.out.println("seat is confirmed");
		    } 
			else {
				waitinglist.add(new MCustomer(id,name));
			    System.out.println("Added to waiting list");
				}
		} 
		
	}

}
