package cct.dsa.ca1;

public interface InterfaceLinkedList <E>{
	
	public void addLast(E element);
	
	public E get(int index);
	
	public void remove(int index);
	
	public int size();
	
	public void addFirst(E element);
	
	public E removeFirst();
	
	public E removeLast();
	
	public E getFirst();
	
	public E getLast();
	
	public void add(int index, E element);
	
	public boolean isEmpty();
	

}
