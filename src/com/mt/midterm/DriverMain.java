package com.mt.midterm;

public class DriverMain {

	public static void main(String[] args) {

		// 1: Register at least two patients
		System.out.println("HOSPITAL PATIENT ADMISSIONS");
		System.out.println();
		
		// Initialize an array pool of active hospital patients directly
		Patient[] dynamicRegistry = {
			new Patient(401, "Ethan Caldwell", "416-555-0112", 9021, 34, "Heart Care Clinic", 145.0),
			new Patient(402, "Miriam Vance", "905-555-0188", 9022, 61, "Brain Injury Unit", 215.0)
		};
		Patient patient1 = dynamicRegistry[0];
		Patient patient2 = dynamicRegistry[1];
		
		// Run direct patient onboarding registrations using plain string literals
		patient1.registerPatient("Ethan Caldwell", 34);
		patient2.registerPatient("Miriam Vance", 61, "Brain Injury Unit");

		// 2. one doctor, one spe_doctorm and one nurse objects
		Doctor doctor = new Doctor(701, "Dr. Alistair Ross", "647-555-0143", 301, "General Family Medicine", 6200.0, 110.0, (int) 45.0);
		SpecialistDoctor spe_doct = new SpecialistDoctor(702, "Dr. Linnea Sterling", "416-555-0195", 302, "Brain Surgery Department", 8900.0,
				195.0, (int) 60.0, "Nerve Surgery", 75.0);
		Nurse nurse = new Nurse(703, "Nurse Sullivan", "905-555-0121", 501, "Emergency Room Staff", 4600.0, "Night Shift", 450.0);

		// runtime polymorphism
		// Upcast concrete personnel objects to generic MedicalStaff for runtime polymorphism
		MedicalStaff staff1 = doctor;
		MedicalStaff staff2 = spe_doct;
		MedicalStaff staff3 = nurse;

		// 3 patient and staff details
		// Loop through the arrays directly to display complete profile datasets
		for (Patient p : dynamicRegistry) {
			p.displayPatientDetails();
			System.out.println();
		}
		
		for (MedicalStaff s : new MedicalStaff[]{staff1, staff2, staff3}) {
			s.displayStaffDetails();
			System.out.println();
		}

		// 4: overloading consultation fee methods
		System.out.println("DOCTOR VISIT PRICING AND FEES");
		// Calculate varied pricing values using overloaded checkup fee methods
		double baseCharge = doctor.calculateConsultationFee();
		double markdownCharge = doctor.calculateConsultationFee(20);
		double premiumCharge = doctor.calculateConsultationFee(20, 30);
		
		System.out.println("Standard Checkup Price: " + baseCharge);
		System.out.println("Price with Insurance Discount: " + markdownCharge);
		System.out.println("Weekend and Late Night Price: " + premiumCharge);
		System.out.println();

		// 5.monthly compensation for each staff
		System.out.println("STAFF MONTHLY SALARY REPORT");
		// Compile multi-variable string descriptions to build the payroll overview
		String outDoctor = "Family Doctor Total Monthly Pay: " + staff1.calculateMonthlyCompensation();
		String outSpecialist = "Expert Surgeon Total Monthly Pay: " + staff2.calculateMonthlyCompensation();
		String outNurse = "Clinic Nurse Total Monthly Pay: " + staff3.calculateMonthlyCompensation();
		
		System.out.println(outDoctor);
		System.out.println(outSpecialist);
		System.out.println(outNurse);
		System.out.println();

		// 6. Counts
		System.out.println("TOTAL HOSPITAL REGISTRATION COUNTS");
		// Output current static state trackings stored in the global classes
		System.out.println("Total People in System: " + Person.getPersonCount());
		System.out.println("Total Registered Patients: " + Patient.getPatientCount());
		System.out.println("Total Active Medical Staff: " + MedicalStaff.getStaffCount());
		System.out.println();

		// 7.runtime polymorphism
		System.out.println("MEDICAL ROLE AND PAY CHECK");
		// Iterate dynamic collection lists to trigger specific polymorphic methods
		java.util.Arrays.asList(staff1, staff2, staff3).forEach(activeStaff -> {
			System.out.println(activeStaff.getRoleDescription());
			System.out.println("Final Take-Home Salary: " + activeStaff.calculateMonthlyCompensation());
		});
		System.out.println();

		// 8 interfaces
		System.out.println("EXPERT DOCTOR INTERFACE TESTS");
		// Engage specific report generation and scheduling abstract interfaces
		spe_doct.generateReport();
		spe_doct.scheduleAppointment("2026-11-24");
		System.out.println();

		// 9. Display successful and unsuccessful messages
		System.out.println("Patient medical files created and saved successfully.");
		String appointmentDate = "";
		// Execute strict validation checks on appointment string parameters
		if (appointmentDate == null || appointmentDate.trim().length() == 0) {
			System.out.println("Booking Error: Appointment status is pending. Please wait for a confirmation call to finalize your clinic visit.");
			System.out.println();
		}
		

		
		// TEST CASES ACTIVATION SUITE
		System.out.println("HOSPITAL RULES SYSTEM TESTS");
		System.out.println();
		 
		// 1: patient registration is successful or not
//		System.out.println("Test 1: Normal Patient Signup Check");
//		patient1.registerPatient("Ethan Caldwell", 34);
//		System.out.println();
		 
//		// 2: Invalid patient age 
//		System.out.println("Test 2: Wrong Age Entry Error Check");
//		// Remove the try-catch block completely so the exception forces a real system crash
//		patient1.registerPatient("Ethan Caldwell", -5);
//		System.out.println();
		
//		// 3: Consultation fee with and without discount
//		System.out.println("Test 3: Checking Discount Prices");
//		System.out.println("Normal Visit Price: " + doctor.calculateConsultationFee());
//		System.out.println("Discount Visit Price: " + doctor.calculateConsultationFee(20));
//		System.out.println();
////		 
//		// 4: Monthly compensation for different staffs
//		System.out.println("Test 4: Staff Salary Totals Check");
//		System.out.println("Doctor Salary: " + staff1.calculateMonthlyCompensation());
//		System.out.println("Surgeon Salary: " + staff2.calculateMonthlyCompensation());
//		System.out.println("Nurse Salary: " + staff3.calculateMonthlyCompensation());
//		System.out.println();
		 
//		// 5: Static count
		System.out.println("Test 5: System Database Counters");
		System.out.println("Total People in System: " + Person.getPersonCount());
		System.out.println("Total Registered Patients: " + Patient.getPatientCount());
		System.out.println("Total Active Medical Staff: " + MedicalStaff.getStaffCount());

	}
}
