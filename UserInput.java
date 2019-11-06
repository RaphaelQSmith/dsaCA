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
	    	System.out.println("############");
	        Scanner userInput = new Scanner (System.in);
	        System.out.println("Please choose an option below: ");
	        System.out.println(
	        		  "(1) \n"
	        		+ "(2) \n"
	        		+ "(3) \n"
	        		+ "(4) \n"
	        		+ "(5) \n"
	        		+ "(6) \n");
	        String optionSelected = userInput.nextLine();
	        userInput.close();
	      return optionSelected;
	        }
	}

