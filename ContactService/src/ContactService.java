import java.util.HashMap;

public class ContactService {
	
	//hashmap that holds newly created objects with their contactID as a key reference the rest of the object
	static HashMap <String, Contact> contactMap = new HashMap<String, Contact>();
	
	//Method adds contact to hashmap using ID as reference key 
	 public static void addContact(String ID, String fName, String lName, String phone, String add) { 
		 Contact newContact = new Contact(ID,fName,lName,phone,add);
		 
		 contactMap.put(ID, newContact);
	 }
	 
	 //Method deletes contact by removing the reference key, which removes the entire object from memory
	 public static void deleteContact(String key) {
		 contactMap.remove(key);
	 }
	 
	 /*Method updates contact objects by using the ID key to clarify which object is to be updated, than you
	  * pass a phrase corresponding to the desired attribute you wish to change, and finally enter the 
	  * information you wish to replace the old info. */
	 public static void updateContact(String key, String oldInfo, String newInfo) {
		 oldInfo.toLowerCase();
		 if (oldInfo == "first name") {
			 contactMap.get(key).setFirstName(newInfo);
		 }
		 if (oldInfo == "last name") {
			 contactMap.get(key).setLastName(newInfo);
		 }
		 if (oldInfo == "phone number") {
			 contactMap.get(key).setPhoneNum(newInfo);
		 }
		 if (oldInfo == "address") {
			 contactMap.get(key).setHomeAddress(newInfo);
		 }
		 else {
			 System.out.println("Please enter a valid information source you wish to change.");
			 return;
		 }
	 }
	 

	public static void main(String[] args) {
		
	}
}
