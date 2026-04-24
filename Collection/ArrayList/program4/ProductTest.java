package Advance_Java.Collection.ArrayList.program4;

import java.util.ArrayList;
import java.util.Iterator;
public class ProductTest {


	public static void main(String[] args) {
		ArrayList<Product> prod  = new ArrayList<Product>(); 
		
		prod.add(new Product(1,"Kitkat",100));
		prod.add(new Product(2,"DairyMilk",150));
		prod.add(new Product(3,"MilkyBar",50));
		
		System.out.println(prod.size());
		
		for(int i=1;i<=prod.size();i++) {
			System.out.println(prod);
		}
		for(Product p :  prod) {
			if(p.name == "Kitkat") {
				System.out.println(prod.indexOf(p));
			}
			System.out.println(p.id +" " + p.name+" "+p.price);
		}
	
		Iterator<Product> pr = prod.iterator();	
		while(pr.hasNext()) {
			Product p = pr.next();
		    System.out.println(p.id +" " + p.name+" "+p.price);	
		}
		
		prod.forEach(System.out::println);
	}

}
