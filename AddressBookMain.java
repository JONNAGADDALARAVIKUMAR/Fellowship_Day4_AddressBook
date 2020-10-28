package addressBookPojo1;

import java.util.Scanner;


public class AddressBookMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		AddressBookDAO addressBookDAO = new  AddressBookDAO();
		int choice=1,one=1,two=2;
		
		while(choice == one)//Adds Multiple contacts based on user choice
		{
			addressBookDAO.getDetails();
			System.out.print("\nEnter   1.Create new Contact\n\t2.Display Contacts\n\nChoice : ");
			choice = scan.nextInt();
			
			if(choice==two)
			{
				addressBookDAO.display();//displays the contacts in address book and terminates the loop
				System.out.println("\n\tProgram Terminated");
			}
		}
	}
}
