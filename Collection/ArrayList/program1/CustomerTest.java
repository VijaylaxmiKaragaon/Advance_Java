package Advance_Java.Collection.ArrayList.program1;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customer =  new ArrayList<Customer>();
		
//		List<E> list = new List();
		//add customer
		customer.add(new Customer(1,"Vijaylamxi","AC"));
		customer.add(new Customer(2,"Ananya","non-AC"));
		customer.add(new Customer(3,"Vinutha","SL"));
		customer.add(new Customer(4,"Yoga","Normal"));
		customer.add(new Customer(5,"Vijju","ACC"));
		
        //System.out.println();
		for(Customer c:customer) {
			System.out.println(c);
		}
	}

}
