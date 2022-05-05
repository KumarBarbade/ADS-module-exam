import java.util.*;
class LinkedList{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			 data=d;
			 next=null;
		}
	}
	
	void insert(int data){
	
		Node new_node= new Node(data);
		if(head == null){
			head = new_node;
		}
		
		
		if(head !=null){
			Node n= head;
	
		while(n.next != null){
			
			n=n.next;
			
			}
		n.next = new_node;
		return;
		
	}
	/*
		void reverse(){
			Node n=head;
			
		while(n.next!=null){
			n=n.next;
		}
		*/
			
			
		
		
		
	void display(){
	
	Node n= head;
	while(n != null){
		System.out.print(n.data+" ");
		n=n.next;
		}
	}
	

   public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt(); //1
	int n1= sc.nextInt(); //5

	Sorting s1= new Sorting(1);
	
	for(int i=2;i<=n1;i++){
		a1[i]=sc.nextInt();
	}
	for(int i=2;i<=n1;i++){
		s1.insert(a1[i]);
	}
	
	s1.display();
	
	int n= sc.nextInt(); //1
	int n1= sc.nextInt(); //5

	Sorting s2= new Sorting(3);
	
	for(int i=2;i<=n1;i++){
		a1[i]=sc.nextInt();
	}
	for(int i=2;i<=n1;i++){
		s1.insert(a1[i]);
	}
	
	s1.display();
	
	}
}