package cct.dsa.ca1;

public class Node{
	protected Person data;
	protected Node next;
	protected Node previous;
	
	public Node(Person person) {
		this.data = person;
	}	
}
