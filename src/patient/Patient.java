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

public class Patient {
 
	// Fields
    	String firstName;
		String middleName;
		String lastName;
		
		String StreetAddress;
		String city;
		String state;
		String ZipCode;
		
		String PhoneNumber;
		 
		String emergencyContactName;
		String emergencyContactPhone;
		
	// no-arg constructor
	public  Patient() {
			firstName = "";
			middleName = "";
			lastName= "";
			
			StreetAddress = "";
			city = "";
			state = "";
			ZipCode = "";
			
			PhoneNumber = "";
			
			emergencyContactName = "";
			emergencyContactPhone = "";
					
		}
		
		// Parameterized constructor
		
		public Patient(String first, String middle, String last){
		       firstName = first;
		       middleName = middle;
		       lastName = last;
		            
		       StreetAddress = "";
				city = "";
				state = "";
				ZipCode = "";
				
				PhoneNumber = "";
				
				emergencyContactName = "";
				emergencyContactPhone = "";
	}
		 
		// constructor all attributes
		public Patient(String first, String middle, String last,
		         String street, String city, String state, String zip,
		         String phone, String emergencyName, String emergencyPhone) {
			 firstName = first;
			 middleName = middle;
			 lastName = last; 
			 StreetAddress = street;
			 this.city = city;
			 this.state = state;
			 ZipCode = zip;
			 PhoneNumber = phone;
			 emergencyContactName = emergencyName;
			 emergencyContactPhone = emergencyPhone;
		 }
		 // Accessor  (getters)
		
		public String getFirstName() { return firstName; }
		public String getMiddleName() { return middleName; }
		public String getLastName() { return lastName; }
		public String getStreetAddress() { return StreetAddress; }
		public String getCity() { return city; }
		public String getState() { return state; }
		public String getZipCode() { return ZipCode;}
		public String getPhoneNumber() { return PhoneNumber; }
		public String getemergencyContactName() { return emergencyContactName; }
		public String getemergencyContactPhone() { return emergencyContactPhone; }
		 
		// mutator (setters)
		
		public void setFirstName(String first) { firstName = first;}
		public void setMiddleName(String middle) { middleName = middle;}
		public void setLastName(String last) { lastName = last;}
		public void setStreetAddress(String Street) { StreetAddress = Street; }
		public void setCity(String city) { this.city = city; }
		public void setState(String state) { this.state = state;}
		public void setZipCode(String Zip) { ZipCode = Zip; }
		public void setPhoneNumber(String Phone) { PhoneNumber = Phone; }
		public void setEmergencyContactName(String emergencyName ) { emergencyContactName = emergencyName;}
		public void setEmergencyContactPhone(String emergencyPhone ) { emergencyContactPhone = emergencyPhone; }
		
		// buildFullName method 
		public String buildFullName() {
			return firstName + " " + middleName + " " + lastName;
		}
		
		// buildAddress method 
		
		public String buildAddress() {
			return StreetAddress + " " + city + " " + state + " " + ZipCode;
		}
		// buildEmergencyContact 
		
		public String buildEmergencyContact() {
			return emergencyContactName + " " + emergencyContactPhone;
		}
		
		// Display all information 
		@Override
		public String toString() {
			return "Patient Information:\n" + 
		           "Full Name: " + buildFullName() + "\n" +
					"Address: " + buildAddress() + "\n" +
		           "Phone Number: " + PhoneNumber + "\n" +
					"Emergency Contact: " + buildEmergencyContact();
		}		
}
