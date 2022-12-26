package com.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static List<Contacts> a1 = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	static {
        System.out.println("Welcome to Address Book Program");
    }
	public static void main(String[] args) {

		// UC5: Adding Multiple Contacts with the User Input
        boolean stopper = true;
        while (stopper) {
            System.out.println("""
                    Please enter any number to select\s
                     1. Add Contact\s
                     2. Edit Contact\s
                     3. Delete Contact\s
                     4. Display Contact\s
                     5. Exit from the program""");
            int selectOption = scanner.nextInt();
            System.out.println("Input checker: " + selectOption);
            switch (selectOption) {
                case 1: {
                    // Adding new contacts to address book
                    System.out.println("Enter the number of contacts you would like to enter?");
                    int numberOfContacts = scanner.nextInt();
                    addingContacts(numberOfContacts);
                    System.out.println("All the contacts are added successfully!");
                    System.out.println("----------------------------------------------------------");
                    break;

                }
                case 2: {
                    // UC3: Editing the contacts which you have added
                    System.out.println("Please enter the first name of the added contact to edit: ");
                    String firstNameToEdit = scanner.next();
                    editContacts(firstNameToEdit);
                    System.out.println("----------------------------------------------------------");
                    break;
                }
                case 3: {
                    // UC4: Deleting the Record with the First name
                    System.out.println("Please enter the first name of the added contact to Delete: ");
                    String firstNameToEdit1 = scanner.next();
                    deleteContacts(firstNameToEdit1);
                    System.out.println("----------------------------------------------------------");
                    break;

                }
                case 4: {
                    // Displaying added contacts
                    if (a1.isEmpty()) {
                        System.out.println("No contacts are added in the Address Book! \n "
                                + "please enter the the contacts in the Address Book");

                    }
                    else {
                        for (Object object : a1) {
                            System.out.println("Below are your added contact:");
                            System.out.println(object);
                        }
                    }
                    System.out.println("----------------------------------------------------------");
                    break;
                }
                case 5: {
                    stopper = false;
                    System.out.println("Thank you for using Address Book Program!");
                    System.exit(selectOption);
                }

                default:
                    System.out.println("Thank you for using Address Book Program!");
                    stopper = false;
                    throw new IllegalArgumentException("Unexpected value: " + selectOption);
            }
        }
        scanner.close();
    }

    private static void addingContacts(int numberOfContacts) {
        for (int i = 1; i <= numberOfContacts; i++) {
            Contacts contactObj = new Contacts();
            System.out.println("Please enter the first name: ");
            contactObj.setFirstName(scanner.next());
            System.out.println("Please enter the last name: ");
            contactObj.setLastName(scanner.next());
            System.out.println("Please enter the Address: ");
            contactObj.setAddress(scanner.next());
            System.out.println("Please enter the city: ");
            contactObj.setCity(scanner.next());
            System.out.println("Please enter the state: ");
            contactObj.setState(scanner.next());
            System.out.println("Please enter the zip: ");
            contactObj.setZip(scanner.nextInt());
            System.out.println("Please enter the Phone Number: ");
            contactObj.setPhoneNumber(scanner.nextLong());
            System.out.println("Please enter the email: ");
            contactObj.setEmail(scanner.next());
            // adding the contact in the array list
            a1.add(contactObj);
            System.out.println(i + " contact are added successfully!");
        }

    }
    // I/P:First Name
    // O/P: editing all the details of the contact

    private static void editContacts(String firstNameToEdit) {
        boolean isContactFound = true;
        for (Contacts object : a1) {
            if (firstNameToEdit.equals(object.getFirstName())) {
                System.out.println("Lets edit the contacts: ");
                object.editingContact();
                isContactFound = false;
                break;
            }
        }
        if (isContactFound) {
            System.out.println("Sorry there is no contact with this first name");
        }

    }
    private static void deleteContacts(String firstNameToEdit1) {
        boolean isContactFound = true;
        for (Contacts object : a1) {
            if (firstNameToEdit1.equals(object.getFirstName())) {
                a1.remove(object);
                System.out.println("Contact is deleted successfully!");
                isContactFound = false;
                break;
            }
        }
        if (isContactFound) {
            System.out.println("Sorry there is no contact with this First Name");
        }
    }

}