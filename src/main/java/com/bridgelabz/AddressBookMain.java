package com.bridgelabz;

/*************************************************************************************************************** 
 * Purpose: This Class Implemented as Main class of AddressBook
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 23-06-2021 *****************************************************************************************
 */


import java.util.*;
import java.util.Scanner;

public class AddressBookMain {
	 static Scanner sc = new Scanner(System.in);
	    static ArrayList<Contact> contactArrayList;
	    private Map<String, Contact> nameToContactMap;

	    public AddressBookMain() {
	        contactArrayList = new ArrayList<>();
	        this.nameToContactMap = new LinkedHashMap<String, Contact>();
	    }

	    public List<Contact> getContactArray() {
	        return contactArrayList;
	    }

	    /**
	     * Adding New Contact to the AddressBook according to the Name
	     */
	    public void addNewContact() {
	        String firstName = "";
	        String lastName = "";
	        while (true) {
	            System.out.println("Enter First Name");
	            firstName = sc.next();
	            System.out.println("Enter last Name");
	            lastName = sc.next();
	            if (checkForDuplicate(firstName, lastName))
	                continue;
	            else
	                break;
	        }
	        System.out.println("Enter the Address");
	        String address = sc.next();
	        System.out.println("Enter the City");
	        String city = sc.next();
	        System.out.println("Enter the State");
	        String state = sc.next();
	        System.out.println("Enter the PinCode");
	        int pinCode = sc.nextInt();
	        System.out.println("Enter the Phone Number");
	        long phoneNumber = sc.nextLong();
	        System.out.println("Enter the Email");
	        String emailId = sc.next();
	        Contact newContact = new Contact(firstName, lastName, address, city, state, pinCode, phoneNumber, emailId);
	        this.contactArrayList.add(newContact);
	        String name = firstName + " " + lastName;
	        this.nameToContactMap.put(name, newContact);
	    }

	    
	    public void printContacts() {
	        System.out.println(contactArrayList);
	    }

	    /**
	     * Editing the Existing Contacts By their Name
	     */
	    public void editContact() {
	        System.out.println("Enter The First Name to edit the contact details");
	        String firstName = sc.next();
	        System.out.println("Enter The last Name to edit the contact details");
	        String lastName = sc.next();
	        String name = firstName + " " + lastName;
	        Contact editedObject = nameToContactMap.get(name);
	        System.out.print("Enter address,city,state,pinCode,phoneNumber,email");
	        String address = sc.next();
	        editedObject.setAddress(address);
	        String city = sc.next();
	        editedObject.setCity(city);
	        String state = sc.next();
	        editedObject.setState(state);
	        int pinCode = sc.nextInt();
	        editedObject.setPinCode(pinCode);
	        long phoneNumber = sc.nextLong();
	        editedObject.setPhoneNumber(phoneNumber);
	        String email = sc.next();
	        editedObject.setEmailId(email);
	    }

	    /**
	     * Deleting the Contacts 
	     */
	    public void deleteContactDetails() {
	        System.out.println("Enter The First Name to delete the contact details");
	        String firstName = sc.next();
	        System.out.println("Enter The last Name to delete the contact details");
	        String lastName = sc.next();
	        String name = firstName + " " + lastName;
	        Contact object = nameToContactMap.get(name);
	        contactArrayList.remove(object);
	        nameToContactMap.remove(name);
	        System.out.println("Contact deleted");

	    }

	    /**
	     * Checking of Duplicate Contacts if any...
	     *
	     * @param firstname of the person
	     * @param lastname  of the person
	     */
	    public boolean checkForDuplicate(String firstname, String lastname) {
	        if (contactArrayList.stream().anyMatch(obj -> obj.getFirstName().equals(firstname))
	                && contactArrayList.stream().anyMatch(obj -> obj.getLastName().equals(lastname))) {
	            System.out.println("This contact already exists, try again!!");
	            return true;
	        } else
	            return false;
	    }

	    /**
	     * maintaing of the AddressBook.
	     */
	    public void maintainAddressBook() {
	        boolean check = true;
	        while (check == true) {
	            System.out.println("\n1. Add Contact Details");
	            System.out.println("\n2. Edit Contact Details");
	            System.out.println("\n3. Delete Contact Details");
	            System.out.println("\n4. Show Contact details");
	            System.out.println("\n5. Exit");
	            System.out.println("\nEnter your choice");
	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    addNewContact();
	                    break;
	                case 2:
	                    if (contactArrayList.size() == 0)
	                        System.out.println("Enter contacts");
	                    else
	                        editContact();
	                    break;
	                case 3:
	                    if (contactArrayList.size() == 0)
	                        System.out.println("Enter contacts");
	                    else
	                        deleteContactDetails();
	                    break;
	                case 4:
	                    printContacts();
	                    break;
	                case 5:
	                    System.out.println("Exit");
	                    check = false;
	                    break;
	            }
	        }
	    }
	
}
