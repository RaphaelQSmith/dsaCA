/*	Raphael Smith 
	Student #2017327 */

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
	
	//check if queue is empty
	public boolean listIsEmpty() {
		return size == 0;
	}
	//return size of queue
	public int getSize() {
		return size;
	}
	//add to first position of the queue
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
	//add to the last position of the queue
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
	//take a target node and adds after it
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
		// 	find node and print its current position in queue
	public String findNode(String ID){
		int searchID = Integer.parseInt(ID);
		
		//  check if queue is populated
        if (listIsEmpty()) { 
            return "\n List is empty! \n"; 
        }
     // iterate through queue and return its position
        Node current = first;  
        for (int i = 1; current != null && i < size; i++) { 
            if(current.data.getID() == searchID) {
            	return "This person is number " + Integer.toString(i)+ " in the queue.\n";
            }else {
        	current = current.next;
            }
        } 
        //   if person not found
        if (current == null) 
            return "\n Person not found! \n";
        //  if person is last in queue        
		return "This person is the last in the queue."; 
    } 
		//	find person to be removed
	public void findToRemove(String ID) {
		int searchID = Integer.parseInt(ID);
		
		if (first == null || ID == null) { 
        	System.out.println("No such ID found.");
			return; 
        }
		//	go through queue and remove person matching by ID
		Node current = first; 
        for (int i = 1; current != null && i < size; i++) { 
            if(current.data.getID() == searchID) {
            	removeNode(current);
            	return;
            }else {
        	current = current.next;
            }
        } 
		return;
	}
	//	remove person from queue and connect its previous with its next
	public void removeNode(Node node) { 

        if (first == null || node == null) { 
            return; 
        } 
        if (first == node) { 
            first = node.next; 
            if(!first.data.getPriority().equals("high")) {
            	lastHigh = null;
            }
        } 
        if(node == last) {
        	last = node.previous;
        	node.previous.next= null;
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
	/*	receive a number from the user and delete as many as selected 
		from the back of the queue */
	public void deleteBatch(int count) {
		if(count > 0) {
		for(int i = 1; i<=count;i++ ) {
			removeNode(last);
			}
		};
	}
	
	/*  check priority level from the person to be added to list
	    and call the corresponding method */
	public void addToList(Person newPerson) {
		
		if(newPerson !=null) {
			newPerson.setID(id);
			id++;
			
			Node newNode = new Node(newPerson);	
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

	/* Print queue and its size after any insertion */
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
