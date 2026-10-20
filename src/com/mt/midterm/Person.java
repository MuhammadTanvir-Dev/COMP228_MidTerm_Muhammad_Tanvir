package com.mt.midterm;

public abstract class Person {
	protected final int personId;
	protected String name;
	protected String phoneNumber;
	protected static int personCount = 0;
	
	
	public Person(int personId, String name, String phoneNumber) {
		
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		
		if (phoneNumber == null) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
		
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		
		personCount++;
	}

	public static int getPersonCount() {
		return personCount;
	}
	
	public void displayBasicDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
	
	abstract String getRoleDescription();

	@Override
	public String toString() {
		return "Person Id = " + personId + ", Name = " + name + ", Phone Number = " + phoneNumber + ", Role: " + getRoleDescription();
	}
}
