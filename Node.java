/*	Raphael Smith 
	Student #2017327 */

package cct.dsa.ca1;

public class Node{
	
	//	create node carrying data and pointing to neighbours 
	protected Person data;
	protected Node next;
	protected Node previous;
	
	public Node(Person person) {
		this.data = person;
	}	
}
