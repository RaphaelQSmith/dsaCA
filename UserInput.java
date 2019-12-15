package cct.dsa.ca1;

import java.util.Scanner;
		
public class UserInput {
	
			Person p = new Person();
			Node node = new Node(p);
			Scanner userInput = new Scanner (System.in);
			
	    public Person createPerson() {
//	    	Handle user input
	    	Person p = new Person();
	    	
	    	System.out.println("Please enter first name: ");
	    	p.setName(userInput.nextLine());
	    	
//	    	System.out.println("Please enter last name: ");
//	    	p.setLastName(userInput.nextLine());
	    	
//	    	System.out.println("Please enter date of Arrival (DD/MM/YY): ");
//	    	p.setDateOfArrival(userInput.nextLine());
//	    
//	    	System.out.println("Please enter passport number: ");
//	    	p.setPassport(userInput.nextLine());
	    	
//	    	VALIDATE 'PRIORITY' INPUT
	    	String priority;
			do {
				System.out.println("Please enter priority level(low, med or high): ");
				priority = userInput.nextLine();
			} while (!priority.equals("low") && !priority.equals("med") && !priority.equals("high"));
	    	p.setPriority(priority);
			return p;	
	    }
	    
	    public String changeDetails() {
	    	System.out.println("Choose a person to change details: ");
	    	
	    	String optionSelected = null;
	    	
	    	do {
		    	System.out.println("Which details do you want to change?: ");
		    	System.out.println(
		        		  "(1) Name \n"
		        		+ "(2) Last name \n"
		        		+ "(3) Date of arrival \n"
		        		+ "(4) Passport \n"
		        		+ "(5) Go back \n"
		        		)
		        			;
		    	optionSelected = userInput.nextLine();
		        }while(optionSelected == null || 
		        		!optionSelected.equals("1") &&
		        		!optionSelected.equals("2") &&
		        		!optionSelected.equals("3") &&
		        		!optionSelected.equals("4") &&
		        		!optionSelected.equals("5") 
		        		);
	    	
	    	 if(optionSelected.equals("1")) {
	         	System.out.println("Enter new first name: ");	
	         	optionSelected = userInput.nextLine();
		         	         	
	         }else if(optionSelected.equals("2")) {
	         	System.out.println("Enter new last name: ");
	         	optionSelected = userInput.nextLine();
	         
	         }else if(optionSelected.equals("3")) {
	         	System.out.println("Enter new Date of Arrival: ");
	         	optionSelected = userInput.nextLine();
	         	
	         }else if(optionSelected.equals("4")) {
	        	 System.out.println("Enter new Passport: ");
	        	 optionSelected = userInput.nextLine();
		     }else if(optionSelected.equals("5")) {
		    	return "Going back...";
	         }
	    	 	
	    	return null;
	    }
	    
	}

