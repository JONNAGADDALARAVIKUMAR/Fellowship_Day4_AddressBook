package addressBookPojo1;

import java.util.Scanner;


public class AddressBookMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		AddressBookDAO addressBookDAO = new  AddressBookDAO();
		
		int choice=1;
		final int one=1,two=2,three=3,four=4,five=5,six=6,seven=7;
		
		while(choice != six)//Adds Multiple contacts based on user choice
		{
	
			switch (choice)
			{
			case one:
				addressBookDAO.getDetails();//Creates a Contact
				System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\t5.Create Separate Address Book\n\t6.Exit\n\nChoice : ");
				choice = scan.nextInt();
				break;
			case two:
				addressBookDAO.displayContacts();//displays the contacts in address book
				System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\t5.Create Separate Address Book\n\t6.Exit\n\nChoice : ");
				choice = scan.nextInt();
				break;
			case three:
				addressBookDAO.editContact();//Edits the contacts in address book
				addressBookDAO.displayContacts();//displays the Edited contacts in address book
				System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\t5.Create Separate Address Book\n\t6.Exit\n\nChoice : ");
				choice = scan.nextInt();
				break;
			case four:
				addressBookDAO.deleteContact();//Deletes the contacts in address book
				addressBookDAO.displayContacts();//displays the Remaining contacts in address book
				System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\t5.Create Separate Address Book\n\t6.Exit\n\nChoice : ");
				choice = scan.nextInt();
				break;
			case five:
				addressBookDAO.addressBook();//Converts Current Contacts into a Separate Address Book
				System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\t5.Create Separate Address Book\n\t6.Exit\n\t7.Display all Address Books\n\nChoice : ");
				choice = scan.nextInt();
				break;
			case seven:
				addressBookDAO.displayAllAddressBooks();//Displays Contacts in All Address Books
				System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\t5.Create Separate Address Book\n\t6.Exit\n\nChoice : ");
				choice = scan.nextInt();
				break;
			default:
				System.out.println("\nWrong Choice\n");
				System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\t5.Create Separate Address Book\n\t6.Exit\n\nChoice : ");
				choice = scan.nextInt();
				break;
			}
		}
		System.out.println("\n\n\tProgramme Terminated");
	}
}
