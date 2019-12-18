/*	Raphael Smith 
	Student #2017327 */

package cct.dsa.ca1;

public class Person {
	// Personal info
	private String name;
	private String lastName;
	private String dateOfArrival;
	private String passport;
	private String priority;
	private int ID;
	
	// method used to print person (used in Test class)
	@Override
	public String toString() {
		return "Name: " + this.name;
	}
	// getters and setters
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
	public String getDateOfArrival() {
		return dateOfArrival;
	}
	public void setDateOfArrival(String dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
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
