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

public class Procedure {
   
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double charge;
	
	// No-arg constructor
	public Procedure() {
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		charge = 0.0;
	}
	
	// Parameterized constructor 
	public Procedure(String procedureName, String procedureDate, String Name, double charge) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = Name;
		this.charge = charge;
	}
	// an accessor (getters)
	public String getProcedureName() {
		return procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public String getPractitionerName() {
		return practitionerName;
	}
	public double getCharge() {
		return charge;
	}
	
	//Mutators (setters)
	
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	//toString method 
	public String toString() {
		return "Procedure Name: " + procedureName + "\n" + "Procedure Date: " + procedureDate + "\n"
	           + "Practitioner Name: " + practitionerName;    
	}
}
