package cct.dsa.ca1;

public class DoubleLinkedList {
	
	private Node first;
	private Node last;
	private int size;
		
	public DoubleLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public boolean listIsEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void addFirst(Person person) {
		Node newPerson = new Node(person); 
		if(listIsEmpty()) {
			last = newPerson;
		}else {
			first.previous = newPerson;
		}
		newPerson.next = first;
		first = newPerson;
		size++;
	}
	
	private void addLast(Person person) {
		Node newPerson = new Node(person); 
		if(listIsEmpty()) {
			first = newPerson;
		}else {
			last.next = newPerson;
		}		
		newPerson.previous = last;
		last = newPerson;
	}

	@Override
	public String toString() {
		Node temp = first;
		while(temp != null) {
			System.out.println("This is the data: " + temp.data);
			temp = temp.next;
		}
		return "Size is: " + size;

	}
	public static void main(String[] args) {
		Person p2 = new Person();
		p2.setName("Obladi");
		Person p1 = new Person();
		p1.setName("Oblada");
		Person p3 = new Person();
		p3.setName("Life goes on");
		Person p4 = new Person();
		UserInput input = new UserInput();
		String option = input.mainMenu();
		p4.setName(input.inputName());
		
		
		DoubleLinkedList gnibList = new DoubleLinkedList();
		gnibList.addFirst(p2);
		gnibList.addFirst(p1);

		gnibList.addLast(p3);
				
		gnibList.addFirst(p4);
		
		
		System.out.println(gnibList);
		
		
		
	}

}