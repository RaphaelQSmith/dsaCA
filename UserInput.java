package cct.dsa.ca1;

import java.util.Scanner;

public class UserInput {
	
	    public UserInput() {
	    	
	    }
	    
	    public String inputName() {
	        Scanner userInput = new Scanner (System.in);
	        System.out.println("Enter a name:");
	        String enteredName = userInput.nextLine();
	        userInput.close();
	      return enteredName;
	      
	    }
	    
	    public String mainMenu() {
	    	System.out.println("############ IMIGRATION SYSTEM ############## \n");
	        Scanner userInput = new Scanner (System.in);
	        String optionSelected = null;
	        do {
	        System.out.println("Please choose an option below: ");
	        System.out.println(
	        		  "(1) Add \n"
	        		+ "(2) Search \n"
	        		+ "(3) Remove from queue \n"
	        		+ "(4) Change priority \n"
	        		+ "(5) Change details \n")
	        			;
	        optionSelected = userInput.nextLine();
	        }while(optionSelected == null || 
	        		!optionSelected.equals("1") &&
	        		!optionSelected.equals("2") &&
	        		!optionSelected.equals("3") &&
	        		!optionSelected.equals("4") &&
	        		!optionSelected.equals("5") 
	        		);
	        
	      return optionSelected;
	        }
	    
	    public Person createPerson() {
	    	Person p = new Person();
	    	Scanner userInput = new Scanner (System.in);
	    	System.out.println("Please enter first name: ");
	    	p.setName(userInput.nextLine());
	    	System.out.println("Please enter last name: ");
	    	p.setLastName(userInput.nextLine());
	    	System.out.println("Please enter date of Arrival: ");
	    	p.setDateOfArrival(userInput.nextLine());
	    	System.out.println("Please enter passport number: ");
	    	p.setPassport(userInput.nextLine());
	    	System.out.println("Please enter priority level(low, medium or high): ");
	    	p.setPriority(userInput.nextLine());	    	
	    	return p;
	    }
	}

