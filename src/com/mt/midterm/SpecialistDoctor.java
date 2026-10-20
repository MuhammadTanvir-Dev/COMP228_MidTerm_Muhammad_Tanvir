package com.mt.midterm;

//Multilevel inheritance: Person → MedicalStaff → Doctor → SpecialistDoctor
//Hybrid inheritance: extends Doctor and implements Report and Schedule
public class SpecialistDoctor extends Doctor implements Report, Schedule{ 
	protected final String specialization;
	protected final double specialistSurcharge;
	
	public SpecialistDoctor(int personId, String name, String phoneNumber, int staffId, String department,
			double monthlySalary, double consultationFee, int patientsSeen, String specialization,
			double specialistSurcharge) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary, consultationFee, patientsSeen);
		this.specialization = specialization;
		this.specialistSurcharge = specialistSurcharge;
	}
	
	//overriding
	public double calculateConsultationFee() {
		return consultationFee + specialistSurcharge;
	}
	
	//overriding
	public void displayStaffDetails() {
		System.out.println("Doctor Details  ");
		System.out.println("Name : " + name);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("Department :" + department);
		System.out.println("Monthly Salary : " + monthlySalary);
      System.out.println("Specialization: " + specialization);
      System.out.println("Specialist Surcharge: " + specialistSurcharge);
  }
	
	//overriding from interface
	public void generateReport() {
      System.out.println("Specialist Doctor Report");
      displayStaffDetails();
  }
	//overriding from interface
  public void scheduleAppointment(String appointmentDate) {
      System.out.println("Appointment Date: " + appointmentDate);
  }
}
