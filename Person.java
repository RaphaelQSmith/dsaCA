package cct.dsa.ca1;

public class Person {
	
	private String name;
	private String lastName;
	private int dateOfArrival;
	private int passport;
	private String priority;
	private int ID;
	
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(int dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}

	public int getPassport() {
		return passport;
	}

	public void setPassport(int passport) {
		this.passport = passport;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	


	


}
