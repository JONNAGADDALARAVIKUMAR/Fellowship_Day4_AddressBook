package addressBookPojo1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class AddressBookDAO {
	
	HashSet<AddressBookPojo> addressBook = new HashSet <AddressBookPojo>();
    HashMap <String , String> multipleAddressBook = new HashMap<String, String>();
    
    Scanner scan = new Scanner(System.in);
    
    public void getDetails() //Gets all details from user and Stores as a Contact
    {	
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
        
        AddressBookPojo newAddressBookPojo = new AddressBookPojo(firstName,lastName,address,city,state,zip,phone,email);//Calling POJO class Constructor
        addressBook.add(newAddressBookPojo);//Saving Contact i.e Saving Data Which is Returned From POJO class
        System.out.println("\nAdded Successfully");
      }
    
    public void displayContacts()//Displays All Contacts in Address Book
    {
    	for(AddressBookPojo details : addressBook)
    	{
    		System.out.println(details);
    	}
    }
    
    public void editContact()//Edits a Contact in Address Book
    {
    	String editWith,contactDetails;
    	System.out.print("\n\tEnter Email or Phone Number : ");
    	editWith=scan.next();
    	
    	for(AddressBookPojo details : addressBook)
    	{
    		contactDetails=details.toString();
    		boolean contains = contactDetails.contains(editWith);
    		if(contains == true)
    		{
    			addressBook.remove(details);
    			getDetails();
    			System.out.println("\nContact Edited Successfully");
    			break;
    		}
    		else if(contains == false)
    		{
    			System.out.println("Opps : Details you Entered are not Matched");
    		}
    	}
    }
    
    public void deleteContact()//Deletes a Contact
    {
    	String deleteWith,contactDetails;
    	System.out.print("\n\tEnter Email or Phone Number : ");
    	deleteWith=scan.next();
    	for(AddressBookPojo details : addressBook)
    	{
    		contactDetails=details.toString();
    		if(contactDetails.contains(deleteWith))
    		{
    			addressBook.remove(details);
    			System.out.println("\n\tDeleted Successfully\n");
    			break;
    		}
    		else
    		{
    			System.out.println("Opps : Details you Entered are not Matched");
    		}
    	}
    }
    
    public void addressBook()//Creates a Separate AddressBook with Unique Key(Unique Name)
    {
    	String multipleContacts="";
    	System.out.print("\n\n\tEnter a Unique Name for Current AddressBook\n\n\tUnique Name : ");
    	String uniqueKey = scan.next();
    	for(AddressBookPojo details : addressBook)
    	{
    		multipleContacts += details.toString()+"   ";
    	}
    	multipleAddressBook.put(uniqueKey, multipleContacts);
    	addressBook.clear();
    	System.out.println("\n\tSeparate Address Book Created Successfully");
    }
    
    public void displayAllAddressBooks()//Displays All the Contacts in Each Address Book
    {
    	for(Entry<String, String> singleAddressBook : multipleAddressBook.entrySet())
    	{
    		System.out.println(singleAddressBook.getKey()+" :");
    		String singleAddressBookValues = singleAddressBook.getValue().toString();
    		String[] contacts = singleAddressBookValues.split("   ");
    		
    		for(int i=0;i<contacts.length;i++)
    			System.out.println(contacts[i]);
    	}
    }
}
