package cct.dsa.ca1;

public class Test {
	
	Test(){
		System.out.println("############## TESTING ############ \n");
		Person p1 = new Person();
		Person p2=  new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		Person p6 = new Person();
		Person p7 = new Person();
		Person p8 = new Person();
		Person p9 = new Person();
		Person p10 = new Person();
		
		p1.setName("Mary");		p1.setPriority("low");
		p2.setName("William");	p2.setPriority("med");
		p3.setName("Hans");		p3.setPriority("high");
		p4.setName("Bjorn");	p4.setPriority("high");
		p5.setName("Lagertha");	p5.setPriority("low");
		p6.setName("Ragnar");	p6.setPriority("high");
		p7.setName("Rollo");	p7.setPriority("low");
		p8.setName("Loki");		p8.setPriority("med");
		p9.setName("Egbert");	p9.setPriority("med");
		p10.setName("Athelstan");p10.setPriority("high");
		
		DoubleLinkedList gnibList = new DoubleLinkedList();
		
		gnibList.addToList(p1);
		gnibList.addToList(p2);
		gnibList.addToList(p3);
		gnibList.addToList(p4);
		gnibList.addToList(p5);
		gnibList.addToList(p6);
		gnibList.addToList(p7);
		gnibList.addToList(p8);
		gnibList.addToList(p9);
		gnibList.addToList(p10);
		gnibList.getSize();
		
		System.out.println(gnibList);

	}

	public static void main(String[] args) {
		new Test();
		
	}

}
