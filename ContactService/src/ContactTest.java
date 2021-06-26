
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	//Tests if the inputed contactID is to long 
	@Test
	void testContactIdToLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("11111111111","John","Doe","8018675309","Mulberry ave");
		});    
	}
	
	//Tests if inputed ContactID is null
	@Test
	void testContactIdNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact(null,"John","Doe","8018675309","Mulberry ave");
		});    
	}
	
	//Tests if the inputed first name is to long
	@Test
	void testContactFirstNameToLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("1111111111","MyNameIsToLong","Doe","8018675309","Mulberry ave");
		});    
	}
	
	//Tests if inputed first name is null
	@Test
	void testContactFirstNameNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("1111111111",null,"Doe","8018675309","Mulberry ave");
		});    
	}
	
	//Tests if the inputed last name is to long.
	@Test
	void testContactLastNameToLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("1111111111","John","SirNameToLong","8018675309","Mulberry ave");
		});    
	}
	
	//Tests if the inputed last name is null
	void testContactLastNameNull() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("1111111111","John",null,"8018675309","Mulberry ave");
		});    
	}
	//Tests if the inputed phone number is to long 
	@Test
	void testContactPhoneNumToLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("1111111111","John","Doe","18018675309","Mulberry ave");
		});    
	}
	
	//Tests if the inputed phone number is to short
	@Test
	void testContactPhoneNumToShort() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("1111111111","John","Doe","8675309","Mulberry ave");
		});    
	}
	
	//Tests if the inputed phone number is null
		@Test
	void testContactPhoneNumNull() {
			
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			    Contact newContact = new Contact("1111111111","John","Doe",null,"Mulberry ave");
		});    
	}
	
	//Tests if inputed address is to long 
	@Test
	void testContactAddressToLong() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    	Contact newContact = new Contact("1111111111","John","Doe","8018675309","Mulberry ave is the address of my home");
		});    
	}
	
	//Tests if inputed address is null
	@Test
	void testContactAddressNull() {
			
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			    Contact newContact = new Contact("1111111111","John","Doe","8018675309",null);
		});    
	}
		
}


