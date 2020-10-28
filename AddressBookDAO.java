package addressBookPojo1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class AddressBookDAO {
	
	HashSet <AddressBookPojo> addressBook = new HashSet <AddressBookPojo>();
    //HashMap <String , AddressBookPojo> addressBook = new HashMap<String, AddressBookPojo>();
    
    Scanner scan = new Scanner(System.in);
    
    public void getDetails() {
        System.out.print("\n\tCreate new Address\n\nFirst Name : ");
        String firstName=scan.next();
        System.out.print("Last Name : ");
        String lastName=scan.next();
        System.out.print("Address : ");
        String address=scan.next();
        System.out.print("City : ");
        String city=scan.next();
        System.out.print("State : ");
        String state=scan.next();
        System.out.print("ZIP : ");
        String zip=scan.next();
        System.out.print("Phone Number : ");
        String phone = scan.next();
        System.out.print("Email Id : ");
        String email=scan.next();
        
        AddressBookPojo newAddressBookPojo=new AddressBookPojo(firstName,lastName,address,city,state,zip,phone,email);
        addressBook.add(newAddressBookPojo);
        System.out.println("\n\nAdded Successfully\n\n"+addressBook);

      }
    
}
