package com.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System!");
		// Adding new contacts to address book
        List<Object> a1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of contacts you would like to enter?");
        int numberOfContacts = scanner.nextInt();
        
        for (int i = 1; i <= numberOfContacts; i++) {
            Contacts cs1 = new Contacts();
            System.out.println("Please enter the first name: ");
            cs1.setFirstName(scanner.next());
            System.out.println("Please enter the last name: ");
            cs1.setLastName(scanner.next());
            System.out.println("Please enter the Address: ");
            cs1.setAddress(scanner.next());
            System.out.println("Please enter the city: ");
            cs1.setCity(scanner.next());
            System.out.println("Please enter the state: ");
            cs1.setState(scanner.next());
            System.out.println("Please enter the zip: ");
            cs1.setZip(scanner.nextInt());
            System.out.println("Please enter the Phone Number: ");
            cs1.setPhoneNumber(scanner.nextLong());
            System.out.println("Please enter the email: ");
            cs1.setEmail(scanner.next());
            
            // adding the contact in the array list
            a1.add(cs1);
            System.out.println(i + " contact are added successfully!");
        }
        System.out.println("All the contacts are added successfully as follows!");
        for (Object object : a1) {
            System.out.println(object);
        }
        scanner.close();
	}
}
