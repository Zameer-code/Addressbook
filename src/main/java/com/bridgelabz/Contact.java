package com.bridgelabz;

/*************************************************************************************************************** 
 * Purpose: This Class Implemented to Record and Display the Contacts Of the Person
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 23-06-2021 *****************************************************************************************
 */

public class Contact {
	public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public int pinCode;
    public long phoneNumber;
    public String emailId;

    public Contact(String firstName, String lastName, String address, String city, String state, int pinCode, long mobileNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.phoneNumber = mobileNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + " \nLast Name: " + lastName + "\nAddress :" + address + "\nCity: " + city + "\nPincode: " + pinCode + "\nState: " + state + "\nPhoneNumber: " + phoneNumber + "\nEmail ID: " + emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

