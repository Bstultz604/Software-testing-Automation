
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String homeAddress;
//-----------------------------------------------------------------------------------------------------------	
	//Default Constructor
	Contact(){
	    contactID = "N/A";
		firstName = "N/A";
		lastName = "N/A";
		phoneNum = "N/A";
		homeAddress = "N/A";
	}
//--------------------------------------------------------------------------------------------------------------------------	
	Contact(String contactID, String firstName, String lastName, String phoneNum, String homeAddress) {
		
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last Name");
		}
		if(phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if(homeAddress == null || homeAddress.length() > 30) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.homeAddress = homeAddress;
	}
//--------------------------------------------------------------------------------------------------------------------------
//Getter and Setter methods
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
//--------------------------------------------------------------------------------------------------------------------------	
}
