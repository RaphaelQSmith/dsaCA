package cct.dsa.ca1;

public class DoubleLinkedList {
	
	private Node first;
	private Node last;
	private Node lastHigh;
	private Node lastMed;
	private int size;
	int id;
		
	public DoubleLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
		this.lastHigh = null;
		this.lastMed = null;
		this.id = 1;
	}
	
	public boolean listIsEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void addFirst(Node newPerson) {
		
		if(listIsEmpty()) {
			last = newPerson;
		}else {
			first.previous = newPerson;
		}
		newPerson.next = first;
		first = newPerson;
		size++;
	}
	
	public void addLast(Node newPerson) {
		if(listIsEmpty()) {
			first = newPerson;
		}else {
			last.next = newPerson;
		}		
		newPerson.previous = last;
		last = newPerson;
		size++;
	}
	
	public void addAfter(Node target, Node newNode) {	
		
		if(target != null && target.next!= null) {
			target.next.previous = newNode;
			newNode.next = target.next;
			target.next = newNode;
			newNode.previous = target;
			size++;
		}else {
			newNode.next = target.next;
			target.next = newNode;
			newNode.previous = target;
			last = newNode;
			size++;
		}
	}
	public String findNode(String ID){
		int searchID = Integer.parseInt(ID);
		
//        VALIDATE INPUT BEFORE ITERATION
        if (first == null || ID == null) { 
            return "\n List is empty! \n"; 
        }
        Node current = first; 
        int i; 
//  	  CHECK EVERY POSITION ON LIST AND RETURN RESULT
        for (i = 1; current != null && i < size; i++) { 
            if(current.data.getID() == searchID) {
            	return "This person is number " + Integer.toString(i)+ " in the queue.\n";
            }else {
        	current = current.next;
            }
        } 
//          IF PERSON NOT FOUND
        if (current == null) 
            return "\n Person not found! \n";
//		   IF THE PERSON IS ON THE LAST POSITION        
		return "This person is the last in the queue."; 
    } 
	
	public void findToRemove(String ID) {
		int searchID = Integer.parseInt(ID);
		
		if (first == null || ID == null) { 
        	System.out.println("No such ID found.");
			return; 
        }
		Node current = first; 
        int i; 
		for (i = 1; current != null && i < size; i++) { 
            if(current.data.getID() == searchID) {
            	removeNode(current);
            	return;
            }else {
        	current = current.next;
            }
        } 
		return;
		
	}
		
	public void removeNode(Node node) { 
//		###################  ADD REMOVE CONFIRMATION MESSAGE ##################
        if (first == null || node == null) { 
            return; 
        } 
      
        if (first == node) { 
            first = node.next; 
            if(!first.data.getPriority().equals("high")) {
            	lastHigh = null;
            }
        } 
 
        if (node.next != null) { 
        	if(node == lastMed 
        			&& node.previous.data.getPriority().equals("med")) {
            	lastMed = node.previous;
            }else if(node == lastMed && node.previous == lastHigh){
            	lastMed = null;
            }
        	node.next.previous = node.previous; 
        } 

        if (node.previous != null) { 
        	node.previous.next = node.next;
        } 
    	System.out.println("Person removed from queue");
        size--;
        return; 
    } 
	
	public void addToList(Person newPerson) {
		
		if(newPerson !=null) {
			newPerson.setID(id);
			id++;
			
			Node newNode = new Node(newPerson);	
	//		Check priority and decide when to add to front, mid  
	//		or back depending on the priority level
			if(lastHigh == null && newPerson.getPriority().equals("high")) {
				addFirst(newNode);
				lastHigh = newNode;
			}else if(newPerson.getPriority().equals("low")) {
				addLast(newNode);
			}else if(lastHigh != null && newPerson.getPriority().equals("high")) {
				addAfter(lastHigh, newNode);
				lastHigh = newNode;
			}else if(lastMed != null && newPerson.getPriority().equals("med")) {
				addAfter(lastMed, newNode);
				lastMed = newNode;
			}else if(lastMed == null && newPerson.getPriority().equals("med") && lastHigh!=null) {
				 addAfter(lastHigh, newNode);
				lastMed = newNode;
			}else if(lastMed == null && newPerson.getPriority().equals("med") && lastHigh == null) {
				addFirst(newNode);
				lastMed = newNode;
			}
		}
	}	

	@Override
	public String toString() {
		Node temp = first;
		while(temp != null) {
			System.out.println(
					"\n Person -> "+ 
					temp.data.getName()+
					". Priority: "+
					temp.data.getPriority() + " ID =>" +
					temp.data.getID());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			temp = temp.next;
		}
		return "\n Size is: " + size + "\n";
	}
}
