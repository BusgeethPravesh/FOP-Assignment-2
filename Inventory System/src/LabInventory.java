/**
 * 
 */
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 * @author Busgeeth Pravesh Kumar
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myScanner = new Scanner(System.in);
		String password = "DitProg123";
		
		/**
		 * creating variables
		 */
		String itemID;
		String name;
		String description;
		String category;
		String supplierName;
		int supplierContacts;
		double price;
		double availableQty;
		
		
		System.out.println("Welcome to Lab Inventory Systems\n");
		
		//creating an empty array and asking the user for its size
		int size;
		System.out.print("Enter the max number of items to store:");
		size= myScanner.nextInt();
		
		Item[] itemDatabase = new Item[size];
		System.out.println("Max items that can be stored:"+size+" items\n");	
		
			
		
		boolean valid = false;
		int option = 0;
		
		while(!valid) {
			//Displaying the menu
		
			System.out.println("Welcome back to Lab Inventory Systems\n");
			
			System.out.println("What do you want to do?\n");
			System.out.println("1. Enter a new Item to the inventory (password required)\n"
					+ "2. Change information of an existing Item (password required)\n"
					+ "3. Display all the Items with the specified category\n"
					+ "4. Display all Items to be re-ordered\n"
					+ "5. Number of Items currently in store\n"
					+ "6. Quit\n");
		
			//prompt the user to input his choice
			//it should be between 1 and 5 else it will display the menu again
		
			System.out.print("Enter your choice:");
			option = myScanner.nextInt();
			if (1<=option && option <=6) {
			valid = true;
			}
			else {	
			System.out.println("Invalid Input. Enter between 1 and 6.");
			}
			
		if (option ==1) {
			String inputpass; 
			int count = 0 ;
			
		    for (count = 0 ;count <= 3 ;count += 1) 
		    {
			System.out.println("Enter password:");
			inputpass= myScanner.next();
			
			if (inputpass.equalsIgnoreCase(password)){
			
				int items = 0;
				System.out.print("How many items you wish to enter:");
				items=myScanner.nextInt();
			
				//check if theres space in the database
				if (items>size) {
					System.out.println("There is not enough space in the database");
					}
				else{
					for (int i =0; (i<itemDatabase.length & i<items); i++) {
				
						System.out.println("Please enter details for item " + (i+1) + ":");
						
						System.out.print("ItemID:");
						itemID= myScanner.next();
				
						System.out.print("Name:");
						name= myScanner.next();	
			
						System.out.print("Description:");
						description= myScanner.next();
				
						System.out.print("Category:");
						category= myScanner.next();
				
						System.out.print("Supplier Name:");
						supplierName= myScanner.next();
				
						System.out.print("Supplier Contact:");
						supplierContacts=myScanner.nextInt();
				
						System.out.print("Price:");
						price=myScanner.nextDouble();
				
						System.out.print("Available Quantity:");
						availableQty=myScanner.nextDouble();
			
						itemDatabase[i]= new Item(itemID, name, description,category, supplierName, supplierContacts, price, availableQty);
						itemDatabase[i].setItemID(itemID);
						itemDatabase[i].setName(name);
						itemDatabase[i].setDescription(description);
						itemDatabase[i].setCategory(category);
						itemDatabase[i].setSupplierName(supplierName);
						itemDatabase[i].setSupplierContacts(supplierContacts);
						itemDatabase[i].setPrice(price);
						itemDatabase[i].setAvailableQty(availableQty);
				
						System.out.println(itemDatabase[i]);
						}
				
				//indicates user how much space is left in the array
				System.out.println("\nSpace left in database:" + (size-items) + "\n");
			
				}
				while(valid) {
					//Displaying the menu
					System.out.println(" ");
					System.out.println("Welcome to Lab Inventory Systems\n");
					System.out.println("What do you want to do?\n");
					System.out.println("1. Enter a new Item to the inventory (password required)\n"
							+ "2. Change information of an existing Item (password required)\n"
							+ "3. Display all the Items with the specified category\n"
							+ "4. Display all Items to be re-ordered\n"
							+ "5. Number of Items currently in store\n"
							+ "6. Quit\n");
			
					//prompt the user to input his choice
					//it should be between 1 and 6 else it will display the menu again
			
					System.out.print("Enter your choice:");
					option = myScanner.nextInt();
					if (1<=option && option <=6) {
						valid = false;
						}
						else {	
							System.out.println("Invalid Input. Enter between 1 and 6.");
						}
			}	
		   }
		   else if (!inputpass.equalsIgnoreCase(password)){
					System.out.println("Incorrect password. You have: " +(3 - (count)) + " chances left." ); 
					
					if (count == 2) {
						continue;
					}
					
				   	else if (count == 3) {
				   		System.out.println("Program detected suspicious activity and is terminating!");				
				   		break;
				   	}
					
					
		  }
		    }
		}
		
		if (option ==2) {
			
			String inputpass; 
			int count = 0 ;
			
		    for (count = 0 ;count <= 3 ;count += 1) {
		    	System.out.println("Enter password:");
		    	inputpass= myScanner.next();
			
			if (inputpass.equalsIgnoreCase(password)){
			
				System.out.println("Enter the Item ID you want to update : ");
				String id_input = myScanner.next();
			
				for (int i=0 ; i <size; i++ ) {
					String q = itemDatabase[i].getItemID();
					if(id_input.equalsIgnoreCase(q)) {

						System.out.println("Your selected item details :");
		
						System.out.println("Item ID : " + itemDatabase[i].getItemID());
						System.out.println("Name : " + itemDatabase[i].getName());
						System.out.println("Description : " + itemDatabase[i].getDescription());
						System.out.println("Category : " + itemDatabase[i].getCategory());
						System.out.println("Supplier Name : " + itemDatabase[i].getSupplierName());
						System.out.println("Supplier Contact : " + itemDatabase[i].getSupplierContacts());
						System.out.println("Price : " + itemDatabase[i].getPrice());
						System.out.println("Quantity : " + itemDatabase[i].getAvailableQty());
			
						System.out.println(" ");
				
	     	     			System.out.println("What information you want to change?\n");
			
	     	     			System.out.println("1.Name\n"
	     	     					+ "2.Description\n"
	     	     					+ "3.Category\n"
	     	     					+ "4.Suplier Name\n"
	     	     					+ "5.Supplier Contacts\n"
	     	     					+ "6.Price\n"
	     	     					+ "7.Available Qty\n"
	     	     					+ "8.Quit\n");	
			
	     	     		int decision = 0;
	     	     		System.out.print("Enter your decision");
	     	     		decision = myScanner.nextInt();
			
	     	     			if (decision == 1) {
	     	     				System.out.print("New Name : ");
	     	     				name = myScanner.next();
	     	     				itemDatabase[i].setName(name);
	     	     				System.out.println(itemDatabase[i]);
	     	     				}
	     	     			else if (decision == 2 ){
	     	     				System.out.print("New Description : ");
	     	     				description = myScanner.next();
	     	     				itemDatabase[i].setDescription(description);
	     	     				System.out.println(itemDatabase[i]);
	     	     				}
	     	     			else if (decision == 3){
	     	     				System.out.print("New Category : ");
	     	     				category = myScanner.next();
	     	     				itemDatabase[i].setCategory(category);
	     	     				System.out.println(itemDatabase[i]);
	     	     				}	
	     	     			else if (decision == 4){
	     	     				System.out.print("New Supplier Name : ");
	     	     				supplierName = myScanner.next();
	     	     				itemDatabase[i].setSupplierName(supplierName);
	     	     				System.out.println(itemDatabase[i]);
	     	     				}
	     	     			else if(decision == 5){
	     	     				System.out.print("New Supplier Contact : ");
	     	     				supplierContacts = myScanner.nextInt();
	     	     				itemDatabase[i].setSupplierContacts(supplierContacts);
	     	     				System.out.println(itemDatabase[i]);
	     	     				}
	     	     			else if(decision == 6){
	     	     				System.out.print("New Price : ");
	     	     				price = myScanner.nextDouble();
	     	     				itemDatabase[i].setPrice(price);
	     	     				System.out.println(itemDatabase[i]);										
	     	     				}
	     	     			else if(decision == 7) {
	     	     				System.out.print("New Available quantity : ");
	     	     				availableQty = myScanner.nextDouble();
	     	     				itemDatabase[i].setAvailableQty(availableQty);
	     	     				System.out.println(itemDatabase[i]);
	     	     				}
	     	     			else if(decision == 8){
	     	     				System.out.print("You exited the update option.");
	     	     				continue;
	     	     				}
	     	     			else {
	     	     				System.out.println("Invalid input. Enter only between 1 to 8.");
	     	     			}
					}
				else {System.out.println("The Item ID has not been found.");}
				} // closing for loop 
				} //closing password if statement
				
			else if (!inputpass.equalsIgnoreCase(password)){
					System.out.println("Incorrect password. You have: " +(3 - (count)) + " chances left." ); 
					
					if (count == 2) {
						continue;
					}
					
				   	else if (count == 3) {
				   		while(valid) {
							//Displaying the menu
							
							System.out.println(" ");
							System.out.println("Welcome to Lab Inventory Systems\n");
							System.out.println("What do you want to do?\n");
							System.out.println("1. Enter a new Item to the inventory (password required)\n"
									+ "2. Change information of an existing Item (password required)\n"
									+ "3. Display all the Items with the specified category\n"
									+ "4. Display all Items to be re-ordered\n"
									+ "5. Number of Items currently in store\n"
									+ "6. Quit\n");
					
							//prompt the user to input his choice
							//it should be between 1 and 6 else it will display the menu again
					
							System.out.print("Enter your choice:");
							option = myScanner.nextInt();
							if (1<=option && option <=6) {
								valid = false;
							}
							else {	
								System.out.println("Invalid Input. Enter between 1 and 6.");
							}
					
						}	//end of while loop
				   	} //end of else if count loop
				   		
				   	} //end of else if password loop
				
			} //end of for loop
			while(valid) {
				//Displaying the menu
				
				System.out.println(" ");
				System.out.println("Welcome to Lab Inventory Systems\n");
				System.out.println("What do you want to do?\n");
				System.out.println("1. Enter a new Item to the inventory (password required)\n"
						+ "2. Change information of an existing Item (password required)\n"
						+ "3. Display all the Items with the specified category\n"
						+ "4. Display all Items to be re-ordered\n"
						+ "5. Number of Items currently in store\n"
						+ "6. Quit\n");
		
				//prompt the user to input his choice
				//it should be between 1 and 6 else it will display the menu again
		
				System.out.print("Enter your choice:");
				option = myScanner.nextInt();
				if (1<=option && option <=6) {
					valid = false;
				}
				else {	
					System.out.println("Invalid Input. Enter between 1 and 6.");
				}
		
			}	
			
		} // end of option 2 if statement
		
		if (option == 3){
			System.out.print("Please insert Category of items :" );
			String input_cat = myScanner.next();
			
			for (int i=0; i <size; i++) {
				String k = itemDatabase[i].getCategory();
				if(input_cat.equalsIgnoreCase(k)) {
					System.out.println(itemDatabase[i].findItemByCat());						
				}
				else  {
					System.out.println("This category of items is not in the database.");
					System.out.println("Try another option. Thank you");
				}
			}
			
			while(valid) {
				//Displaying the menu
				
				System.out.println(" ");
				System.out.println("Welcome to Lab Inventory Systems\n");
				System.out.println("What do you want to do?\n");
				System.out.println("1. Enter a new Item to the inventory (password required)\n"
						+ "2. Change information of an existing Item (password required)\n"
						+ "3. Display all the Items with the specified category\n"
						+ "4. Display all Items to be re-ordered\n"
						+ "5. Number of Items currently in store\n"
						+ "6. Quit\n");
		
				//prompt the user to input his choice
				//it should be between 1 and 6 else it will display the menu again
		
				System.out.print("Enter your choice:");
				option = myScanner.nextInt();
				if (1<=option && option <=6) {
					valid = false;
				}
				else {	
					System.out.println("Invalid Input. Enter between 1 and 6.");
				}
		
			}	
		} //end of option 3 if statement
		
		
		//check what item item has less quantity 
		//display all items that are less than 5 therefore need to be reordered
		if (option == 4) {
			for (int i=0; i <size; i++) 
			{
				System.out.println("Items that need to be re-ordered:");
				String u = itemDatabase[i].getItemID();
				String n = itemDatabase[i].getName();
				double z = itemDatabase[i].getAvailableQty(); 
						if (z<5) {
				System.out.println("Item ID: " + u +" Name: "+ n + " Available Quantity: " + z);
							}
			}
		}
		
		
		if (option == 5) {
			System.out.println("The total number of items that has been created so far is: "); Item.totalItems1();
		
			while(valid) {
				//Displaying the menu
				
				System.out.println(" ");
				System.out.println("Welcome to Lab Inventory Systems\n");
				System.out.println("What do you want to do?\n");
				System.out.println("1. Enter a new Item to the inventory (password required)\n"
						+ "2. Change information of an existing Item (password required)\n"
						+ "3. Display all the Items with the specified category\n"
						+ "4. Display all Items to be re-ordered\n"
						+ "5. Number of Items currently in store\n"
						+ "6. Quit\n");
		
				//prompt the user to input his choice
				//it should be between 1 and 6 else it will display the menu again
		
				System.out.print("Enter your choice:");
				option = myScanner.nextInt();
				if (1<=option && option <=6) {
					valid = false;
				}
				else {	
					System.out.println("Invalid Input. Enter between 1 and 6.");
				}
		
			}
			
		} //end of option 5 if statement  
		
		
		if(option == 6) 
		{
			System.out.println(" ");
			System.out.println("       T H E     P R O G R A M     H A S     B E E N     S H U T     D O W N        ");
			System.out.println(" ");
			System.out.println("        	                  T H A N K     Y O U !                                 ");
			System.out.println("        	                  ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅                                  ");
			break;
		} //end of option 6 if statement 
		
	}	
	
	}
}
