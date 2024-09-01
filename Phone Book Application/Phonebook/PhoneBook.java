package Phonebook;
import java.util.*;
public class PhoneBook {

	public static void main(String[] args) {

		SLList newList = new SLList();
		InputOutput newIO = new InputOutput();
		Scanner in = new Scanner(System.in); 
		String fileName = "";

		String menu;
		boolean done = false;

		do {
			System.out.println();
			System.out.format(" SELECT THE OPTION YOU WANT TO PROCEED%n");
			System.out.format("---------------------------------------%n");
			System.out.format("(A)-add a contact  \n(D)-delete a contact \n(E)-Email Search \n(P)-Print all the contacts \n(R)-Restore from database \n(S)-Search contacts \n(W)-Write to Disk \n(Q)-Quit%n");	
			System.out.format("----------------------------------------%n");
			System.out.format("Please Enter a command: ");
			menu = in.nextLine().toUpperCase();

			switch (menu) {
				case "A": 
					System.out.println("Follow the Procedure");
					
					System.out.print("Step1 : Enter a FIRST and LAST Name: ");
					String name = in.nextLine();

					System.out.print("Step2 : Enter an EMAIL ADDRESS: ");
					String email = in.nextLine();

					System.out.print("Step3 : Enter a PHONE NUMBER: ");
					String phoneNumber = in.nextLine();
	
					newList.add(name, email, phoneNumber); 
					System.out.print("Your required contact has been created!");
					System.out.println();
					break;
				case "D": 
					System.out.print("Enter contact number to delete: ");
					int delete = in.nextInt();
					newList.delete(delete);
					break;
				case "E": 
					System.out.print("Enter an E-mail to search for: ");
					String sEmail = in.nextLine();
					newList.emailSearch(sEmail);
					break; 
				case "P": 
					System.out.println("Print Phonebook");
					newList.printList();
					break; 
				case "R": 
					System.out.println("Restore from disk");
					if(fileName.equals("")){
						fileName = "pages";
					}
					newIO.readFile(fileName); 
					break; 
				case "S": 
					System.out.print("Enter a Name to search for contact: ");
					String sName = in.nextLine();
					newList.nameSearch(sName);
					break; 
				case "W": 
					System.out.println("Write to disk\n");
					if(fileName.equals("")){
						System.out.print("Name of file: ");
						fileName = in.nextLine();
					}else{
						System.out.print("Use existing file " + fileName + " ? (Y/N): ");
						String yn = in.nextLine();
						switch(yn.toLowerCase()){
						case "y":
							break;
						case "n":
							System.out.print("New file name: ");
							fileName = in.nextLine();
						}
					}
					newIO.writeFile(fileName, newList);
					break; 
				case "Q": 
					System.out.println("Exiting!");
					done = true;
					break;
				default: 
					System.out.println("Unknown entry");
			}
		}  while (!done);
		System.out.println("Thanks for using phone book Directory");
	}
}