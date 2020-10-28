package addressBookPojo1;

public class AddressBookPojo {
	
	private String firstName,lastName,address,city,state,zip,phone,email;

	public AddressBookPojo(String firstName, String lastName, String address, String city, String state, String zip,String phone, String email) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	@Override
    public String toString() {
        return "First Name = "+ firstName +", Last Name = "+lastName+", Address = "+address+", City = "+city+", State = "+state+", ZIP = "+zip+", Phone = "+phone+", Email = "+email;          
    }
}
