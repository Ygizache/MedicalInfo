package patient;
/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Yihune Gizachew
*/

    import java.util.Scanner;
	import java.text.DecimalFormat;

	public class PatientDriverApp {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        //   patient info
	        System.out.println("patient info:");

	        System.out.print("First Name: ");
	        String first = input.nextLine();

	        System.out.print("Middle Name: ");
	        String middle = input.nextLine();

	        System.out.print("Last Name: ");
	        String last = input.nextLine();

	        System.out.print("Street Address: ");
	        String street = input.nextLine();

	        System.out.print("city: ");
	        String city = input.nextLine();

	        System.out.print("State: ");
	        String state = input.nextLine();

	        System.out.print("Zip Code: ");
	        String zip = input.nextLine();

	        System.out.print("Phone Number (e.g. 301-123-4567): ");
	        String phone = input.nextLine();

	        System.out.print("Emergency Contact Name: ");
	        String emergencyName = input.nextLine();

	        System.out.print("Emergency Contact Phone: ");
	        String emergencyPhone = input.nextLine();

	        // Create Patient object using full constructor
	        Patient patient = new Patient(first, middle, last, street, city, state, zip, phone, emergencyName, emergencyPhone);

	        // Create 3 Procedure objects using different constructors

	        // 1. Using full constructor
	        Procedure proc1 = new Procedure("X-ray", "06/12/2023", "Dr. Amanul",3000.43);
	        Procedure proc2 = new Procedure("X-ray", "07/20/2019", "Dr. Samson", 5500.43);
	        Procedure proc3 = new Procedure("Blood Test", "07/20/2019", "Dr. Meron", 1400.75);

	        // Display Patient info
	        System.out.println("\nPatient info:");
	        System.out.println("Name: " + patient.buildFullName());
	        System.out.println("Address: " + patient.buildAddress());
	        System.out.println("EmergencyContact: " + patient.buildEmergencyContact());

	        // Display Procedures
	        displayProcedure(proc1);
	        displayProcedure(proc2);
	        displayProcedure(proc3);

	        // Calculate total charges
	        double total = calculateTotalCharges(proc1, proc2, proc3);
	        DecimalFormat df = new DecimalFormat("#,##0.00");
	        System.out.println("\nTotal Charges: $" + df.format(total));

	        // Footer
	        System.out.println("\nStudent Name: Yihune Gizachew");
	        System.out.println("MC#: MC7277777");
	        System.out.println("Due Date: 06/12/2023");

	        input.close();
	    }

	    // Displays one procedure with correct formatting
	    public static void displayProcedure(Procedure proc) {
	        System.out.println("\nProcedure: " + proc.getProcedureName());
	        System.out.println("ProcedureDate=" + proc.getProcedureDate());
	        System.out.println("Practitioner=" + proc.getPractitionerName());
	        System.out.println("Charge=" + proc.getCharge());
	    }

	    // Calculates total charges
	    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
	        return p1.getCharge() + p2.getCharge() + p3.getCharge();
	    }
	}
	        

	    
