package com.mt.midterm;

public class Doctor extends MedicalStaff{
	protected final double consultationFee;
	protected double patientsSeen;
	protected double compentation;
	
	
	public Doctor(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary,
			double consultationFee, int patientsSeen) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.consultationFee = consultationFee;
		this.patientsSeen = patientsSeen;
	}


	public double calculateMonthlyCompensation() {
		return (monthlySalary + (100 * patientsSeen));
	}

	public void displayStaffDetails() {
		System.out.println("Doctor Details  ");
		System.out.println("Name : " + name);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("Department :" + department);
		System.out.println("Monthly Salary : " + monthlySalary);
		System.out.println("Number of seen patients: " + patientsSeen);
	}
	
	public double calculateConsultationFee() {
	    return consultationFee;
	}

	public double calculateConsultationFee(double discount) {
	    return consultationFee - discount;
	}

	public double calculateConsultationFee(double discount, double additionalCharge) {
	    return consultationFee - discount + additionalCharge;
	}
}
