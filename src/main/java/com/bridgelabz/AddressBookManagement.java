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

	   
	    }

}
