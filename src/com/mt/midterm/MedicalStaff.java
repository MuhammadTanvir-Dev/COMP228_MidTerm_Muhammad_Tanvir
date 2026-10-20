package com.mt.midterm;

abstract class MedicalStaff extends Person{
	protected final int staffId;
	protected String department;
	protected double monthlySalary;
	protected static int staffCount = 0;
	
	public MedicalStaff(int personId, String name, String phoneNumber, int staffId, String department,
			double monthlySalary) {
		super(personId, name, phoneNumber);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
	}
	
	abstract double calculateMonthlyCompensation();
	
	public void displayStaffDetails() {
	    System.out.println("Staff ID: " + staffId);
	    System.out.println("Name: " + name);
	    System.out.println("Phone Number: " + phoneNumber);
	    System.out.println("Department: " + department);
	    System.out.println("Monthly Salary: " + monthlySalary);
	}
	
	public String getRoleDescription() {
		return "Medical Staff";
	}
	
	public static int getStaffCount() {
	    return staffCount;
	}
}
