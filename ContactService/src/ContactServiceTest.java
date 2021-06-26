import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	/*Tests the add contact method by ensuring that when it is called the object is added to the hashmap
	 * resulting in a hasmap size of 1 rather than the 0 we start with*/
	@Test
	void testAddContact() {
		ContactService.addContact("1111","John","Doe","8018675309","Mullberry Lane");
			assertEquals(ContactService.contactMap.size(),1);
	}
	
	/*Tests the delete method by ensuring after an object is added to the hashmap a call to the delete
	 * method will remove that object from memory resulting in a hasmap size of zero again*/
	@Test
	void testDeleteContact() {
		ContactService.addContact("1111","John","Doe","8018675309","Mullberry Lane");
		ContactService.deleteContact("1111");
			assertEquals(ContactService.contactMap.size(),0);
	}
	
	/*Tests the update contact method by asserting that it is true that the changed info is equal to the input 
	 * provided when the update method was called, if the values weren't equal than that would mean the info
	 * never got updated */
	@Test
	void testUpdateContact() {
		ContactService.addContact("1111","John","Doe","8018675309","Mullberry Lane");
		ContactService.updateContact("1111", "first name", "William");
			assertTrue(ContactService.contactMap.get("1111").getFirstName().equals("William"));
	}

}
