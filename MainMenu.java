package cct.dsa.ca1;

import java.util.Scanner;

public class MainMenu {
	
	DoubleLinkedList immigrationList = new DoubleLinkedList();
	Person newPerson = new Person();
	
	public MainMenu() {
		mainMenu();		
	}
	
	public void mainMenu() {
		
    	System.out.println("############ IMIGRATION SYSTEM ############## \n");
        Scanner input = new Scanner (System.in);
        String optionSelected = null;
        do {
        System.out.println("Please choose an option below: ");
        System.out.println(
        		  "(1) Add \n"
        		+ "(2) Search person \n"
        		+ "(3) Remove from queue \n"
        		+ "(4) Change priority \n"
        		+ "(5) Change details \n")
        			;
        optionSelected = input.nextLine();
        }while(optionSelected == null || 
        		!optionSelected.equals("1") &&
        		!optionSelected.equals("2") &&
        		!optionSelected.equals("3") &&
        		!optionSelected.equals("4") &&
        		!optionSelected.equals("5") 
        		);
        
        UserInput testOption = new UserInput();
        if(optionSelected.equals("1")) {
        	newPerson = testOption.createPerson();
        	immigrationList.addToList(newPerson);
        	System.out.println("\t #### LIST ####");
        	System.out.println(immigrationList);
        }else if(optionSelected.equals("2")) {
        	System.out.println("Enter the ID of the person you want to find: ");
        	optionSelected = input.nextLine();
        	System.out.println(immigrationList.findNode(optionSelected));
        }else if(optionSelected.equals("3")) {
        	System.out.println("Enter ID of person to be removed? ");
        	optionSelected = input.nextLine();
        	immigrationList.findToRemove(optionSelected);
        	System.out.println(immigrationList);
        }else if(optionSelected.equals("4")) {
        	
        }else if(optionSelected.equals("5")) {
        	testOption.changeDetails();
        }
        mainMenu();
        input.close();
	}
	
	public static void main(String[] args) {
		new MainMenu();
	}

}
