import java.util.*;


class SLL{
 Node head;
 
 static class Node{
	 int data;
	 Node next;
	 
	Node(int d){
		data=d;
		next=null;
	}
 }
 
 
 
Node reverse(int data ){
	Node nd = new Node(data);	 
	 nd.next=head;
	 head=nd;
	return head;
 }
 

 void display(){
	 Node n=head;
	 while(n !=null){
		 System.out.print(n.data+" ");
		 n=n.next;
	 }
 }
 
 
 public static void main(String[] args){
	 Scanner sc= new Scanner(System.in);
	
	 int Testcase=sc.nextInt();
	 int n=sc.nextInt();
	 
	 SLL L = new  SLL();	
	 /*
	 for(int i=0;i<n;i++){
		int n1=sc.nextInt();
		L.insert(n1);
	 }
	 L.display();
	 */
	 for(int i=0;i<n;i++){
		int n1=sc.nextInt();
		L.reverse(n1);
		 
	 }
	L.display();
		 
	 
	 
 }

 
}
		