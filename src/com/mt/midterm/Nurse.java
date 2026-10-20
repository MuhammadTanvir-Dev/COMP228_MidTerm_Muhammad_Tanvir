package com.mt.midterm;

public class Nurse extends MedicalStaff {
	protected final String shiftType;
	protected final double shiftAllowance;
	
	public Nurse(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary,
			String shiftType, double shiftAllowance) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	
	//overriding
	public double calculateMonthlyCompensation() {
        return monthlySalary + shiftAllowance;
    }
	
	//overriding
    public void displayStaffDetails() {
        System.out.println("Nurse Details");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Shift Type: " + shiftType);
        System.out.println("Shift Allowance: " + shiftAllowance);
    }

  //overriding
    public String getRoleDescription() {
        return "Nurse";
    }
}
