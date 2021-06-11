package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
		
	 private static Scanner scan = new Scanner(System.in);
	    ArrayList<Person> personList = new ArrayList<>();
	    static HashMap<String, ArrayList<Person>> personMap = new HashMap<String, ArrayList<Person>>();


	    /**
	     * Adding new Contact to Address book 
	     * 
	     */
	    public void addNewContact() {
	        Person person = new Person();
	        System.out.println("Enter address book name");
	        String addressBook = scan.next();

	        System.out.println("Enter First Name");
	        person.setFirstname(scan.next());
	        System.out.println("Enter last Name");
	        person.setLastName(scan.next());
	        System.out.println("Enter Address");
	        person.setAddress(scan.next());
	        System.out.println("Enter State");
	        person.setState(scan.next());
	        System.out.println("Enter City");
	        person.setCity(scan.next());
	        System.out.println("Enter Zip");
	        person.setZip(scan.nextInt());
	        System.out.println("Enter Phone");
	        person.setPhone(scan.nextInt());
	        System.out.println("Enter Email1");
	        person.setEmail(scan.next());
	        System.out.println("-------------");

	        personList.add(person);
	        personMap.put(addressBook, personList);
	        System.out.println(personList);
	        System.out.println(personMap);
	    }

	    /**
	     * Edit existing contact 
	     */
	    public void edit() {
	        System.out.println("Enter the record to edit");
	        String name = scan.next();
	        if (personList.isEmpty()) {
	            System.out.println("Record not found");
	            return;
	        }

	        for (int i = 0; i < personList.size(); i++) {
	            if (personList.get(i).getFirstname().equals(name)) {
	                Person person = new Person();
	                System.out.println("Enter First Name ");
	                person.setFirstname(scan.nextLine());
	                System.out.println("Enter last Name ");
	                person.setLastName(scan.nextLine());
	                System.out.println("Enter Address ");
	                person.setAddress(scan.nextLine());
	                System.out.println("Enter State ");
	                person.setState(scan.nextLine());
	                System.out.println("Enter City");
	                person.setCity(scan.nextLine());
	                System.out.println("Enter Zip");
	                person.setZip(scan.nextInt());
	                System.out.println("Enter Phone");
	                person.setPhone(scan.nextInt());
	                System.out.println("Enter Email");
	                person.setEmail(scan.nextLine());

	                personList.remove(i);
	                personList.add(i, person);
	                System.out.println(personList);
	            }
	        }
	    }

	    /**
	     * Delete contact details 
	     */
	    private void delete() {
	        System.out.println("Enter first name of the person to delete ");
	        String firstName = scan.next();
	        for (int i = 0; i < personList.size(); i++) {
	            if (personList.get(i).getFirstname().equalsIgnoreCase(firstName)) {
	                personList.remove(i);
	                System.out.println("Deleted Successfully");
	            } else {
	                System.out.println("Record not found");
	            }
	        }
	    }

	    /**
	     * Adding multiple address book
	     * Each Address book has unique name
	     */
	    public static void main(String[] args) {
	        AddressBook book = new AddressBook();

	        boolean isExit = false;
	        while (!isExit) {
	            System.out.println("Enter option 1.AddNewContact\n2.Edit\n3.Delete\n4.Exit\n");
	            int userInput = scan.nextInt();
	            switch (userInput) {
	                case 1:
	                    book.addNewContact();
	                    break;
	                case 2:
	                    book.edit();
	                    break;
	                case 3:
	                    book.delete();
	                    break;
	                case 4:
	                    isExit = true;
	                    break;
	                default:
	                    System.out.println("Invalid input");
	                    break;
	            }
	        }
	    }
    }

