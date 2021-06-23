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

}
