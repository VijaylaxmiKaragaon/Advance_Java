package Advance_Java.Collection.ArrayList.program5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {

    public static void main(String[] args) {

        ArrayList<String> bus = new ArrayList<>();
        ArrayList<String> waiting = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int capacity = 10;

        System.out.print("Enter number of passengers: ");
        int passenger = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= passenger; i++) {
            System.out.print("Enter passenger " + i + " name: ");
            String name = sc.nextLine();

            if (bus.size() < capacity) {
                bus.add(name);
                System.out.println("Added to bus ");
            } else {
                waiting.add(name);
                System.out.println("Added to waiting list");
            }
        }

        System.out.println("Bus list: " + bus);
        System.out.println("Waiting list: " + waiting);
    }
}
