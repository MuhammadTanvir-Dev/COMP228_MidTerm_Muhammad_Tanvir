package com.mt.midterm;

public class Patient extends Person {
	protected final int patientNumber;
	protected int age;
	protected String medicalDepartment;
	protected double consultationFee;
	protected static int patientCount = 0;
	
	public Patient(int personId, String name, String phoneNumber, int patientNumber, int age, String medicalDepartment,
			double consultationFee) {
		super(personId, name, phoneNumber);
		
		this.patientNumber = patientNumber;
		this.age = age;
		this.medicalDepartment = medicalDepartment;
		this.consultationFee = consultationFee;
	}
	
	//Overriding , method from person
	public String getRoleDescription() {
		return "Patient";
	}
	
	public void displayPatientDetails() {
	    System.out.println("Patient name: " + name);
	    System.out.println("Patient ID: " + patientNumber);
	    System.out.println("Age: " + age);
	    System.out.println("Medical Department: " + medicalDepartment);
	    System.out.println("Consultation Fee: " + consultationFee);
	}
	
	public void registerPatient(String name, int age) {
		if (name == null) { throw new IllegalArgumentException("Patient name cannot be empty."); }
		if (age <= 0 || age > 120) { throw new IllegalArgumentException("Invalid patient age."); }
		
		patientCount++;
		System.out.println("Registration successful for " + name);
	}
	
	
	public void registerPatient(String name, int age, String department) {
		if (name == null) { throw new IllegalArgumentException("Patient name cannot be empty."); }
		if (age <= 0 || age > 120) { throw new IllegalArgumentException("Invalid patient age."); }
		if (department == null) { throw new IllegalArgumentException("Medical department cannot be empty."); }

		patientCount++;
		System.out.println("Registration successful for " + name);
	}
	
	public static int getPatientCount() {
	    return patientCount;
	}
}