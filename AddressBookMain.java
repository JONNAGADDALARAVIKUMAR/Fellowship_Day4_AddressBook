package addressBookPojo1;

import addressBookPojo.AddressBookDAO;

public class AddressBookMain {

	public static void main(String[] args) {
		
		AddressBookDAO addressBookDAO = new  AddressBookDAO();
		
		addressBookDAO.getDetails();
	}
}
