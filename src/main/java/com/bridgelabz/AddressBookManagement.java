package com.bridgelabz;

/*************************************************************************************************************** 
 * Purpose: This Class Implemented to manage The Main class of AddressBook
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 23-06-2021 *****************************************************************************************
 */

import java.util.Scanner;
import java.util.*;

public class AddressBookManagement {
	
	 static Scanner sc = new Scanner(System.in);
	    public static Map<String, AddressBookMain> nameToAddressBookMap = new TreeMap<>();
	    public static Map<String, Contact> contactCityMap = new TreeMap<>();
	    public static Map<String, Contact> contactStateMap = new TreeMap<>();

	    /**
	     * Adding New AddressBook
	     */
	    public static void addNewAddressBook() {
	        AddressBookMain object = new AddressBookMain();
	        System.out.println("Enter a unique name");
	        String name = sc.next();
	        object.maintainAddressBook();
	        nameToAddressBookMap.put(name, object);
	    }

	    /**
	     * Searching multiple Persons in AddressBook
	     *
	     * @param search
	     */
	    public static void searchPersonInBook(String search) {
	        int numberOfPerson = 0;
	        for (Map.Entry<String, AddressBookMain> stringAddressBookMainEntry : nameToAddressBookMap.entrySet()) {
	            Map.Entry entry = (Map.Entry) stringAddressBookMainEntry;
	            AddressBookMain a = (AddressBookMain) entry.getValue();
	            List<Contact> list = a.getContactArray();
	            for (Contact contact : list) {
	                if (contact.getCity().equals(search) || contact.getState().equals(search)) {
	                    System.out.println(contact);
	                    numberOfPerson++;
	                }
	            }
	            if (numberOfPerson == 0)
	                System.out.println("No Person was found");
	        }
	    }

	    /**
	     * Searching the person by Name of the City 
	     */
	    private static void showContactGroupedByCity() {
	        Set<String> listOfCity = contactCityMap.keySet();
	        for (String cityName : listOfCity) {
	            System.out.println("Contact Entries for CITY: " + cityName);
	            searchPersonInBook(cityName);
	        }
	    }

	    /**
	     * Searching the Person by the Name of the State
	     */
	    private static void showContactGroupedByState() {
	        Set<String> listOfState = contactStateMap.keySet();
	        for (String stateName : listOfState) {
	            System.out.println("Contact Entries for STATE: " + stateName);
	            searchPersonInBook(stateName);
	        }
	    }

	    /**
	     * Main String argument Of the AddressBook
	     *
	     * @param args
	     */
	    public static void main(String args[]) {
	        AddressBookManagement aBookManager = new AddressBookManagement();
	        while (true) {
	            System.out.println("\n1. Add a new Address Book");
	            System.out.println("\n2. Search person across all address books");
	            System.out.println("\n3. Show contact  by city");
	            System.out.println("\n4. Show contacts by state");
	            System.out.println("\n5. Exit");
	            System.out.println("\n Please Enter your choice");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    while (true) {
	                        AddressBookMain m = new AddressBookMain();
	                        System.out.println("Enter the name of address Book");
	                        String name = sc.next();
	                        if (aBookManager.nameToAddressBookMap.containsKey(name)) {
	                            System.out.println("\nAddress Book already exists !!!\n");
	                            continue;
	                        } else {
	                            aBookManager.nameToAddressBookMap.put(name, m);
	                            System.out.println("\n In Address Book : " + name);
	                            m.maintainAddressBook();
	                            break;
	                        }
	                    }
	                    break;

	                case 2:
	                    System.out.println("Enter the Person's City or State");
	                    String search = sc.next();
	                    aBookManager.searchPersonInBook(search);
	                    break;
	                case 3:
	                    showContactGroupedByCity();
	                    break;
	                case 4:
	                    showContactGroupedByState();
	                    break;
	                case 5:
	                    System.exit(0);
	                    break;
	            }
	        }
	    }

}
