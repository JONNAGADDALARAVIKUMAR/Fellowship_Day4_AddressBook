package addressBookPojo1;

import java.util.Scanner;


public class AddressBookMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		AddressBookDAO addressBookDAO = new  AddressBookDAO();
		int choice=1;
		final int one=1,two=2,three=3,four=4;
		
		while(choice == one)//Adds Multiple contacts based on user choice
		{
			addressBookDAO.getDetails();
			System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\t3.Edit Contact\n\t4.Delete Contact\n\nChoice : ");
			choice = scan.nextInt();
			
			switch (choice)
			{
			case two:
				addressBookDAO.displayContacts();//displays the contacts in address book and terminates the loop
				System.out.println("\n\tProgram Terminated");
				break;
			case three:
				addressBookDAO.editContact();//Edits the contacts in address book
				System.out.println("\nContact Edited Successfully");
				addressBookDAO.displayContacts();//displays the Edited contacts in address book and terminates the loop
				break;
			case four:
				addressBookDAO.deleteContact();//Deletes the contacts in address book
				addressBookDAO.displayContacts();//displays the Remaining contacts in address book and terminates the loop
				break;
			}
		}
	}
}
