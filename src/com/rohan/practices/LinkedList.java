package com.rohan.practices;


class Node
{
	String data;
	Node next;
	
	public Node(String data)
	{
		this.data=data;
		this.next =null;
	}
	
}
public class LinkedList{

   Node head;
   public void add(String data)
   {
	   Node n = head;
	   Node n1 = new Node(data);
	   if(this.head == null)
	   {
		   this.head= n1;
		   return;
	   }
	
	 while(n.next != null)
	 {
		n = n.next; 
	 }
	 n.next = n1;
	 
   }
   
   private void insertAtStart(String data)
   {
	   Node n = new Node(data);
	   if(head == null)
	   {
		   head=n;
		   return;
	   }
	   n.next=head;
	   head=n;
   }
   
   private void insertAtEnd(String data)
   {
	   Node n = new Node(data);
	   if(head ==  null )
	   {
		   head = n;
		   return;
	   }
	   Node temp =head;
	   while(temp.next != null)
	   {
		   temp = temp.next;
	   }
	   temp.next = n;
	   
   }
   private void fetchAllData()
   {
	   Node temp = this.head;
	   while(temp != null)
	   {
		   System.out.print(temp.data+" ");
		   temp = temp.next;
	   }
	   System.out.println();
   }
   public static void main(String[] args)
   {
	   LinkedList list = new LinkedList();
	   list.add("rohan");
	   list.add("rohan1");
	   list.add("rohan2");
	   list.add("rohan3");

	   list.fetchAllData();
	   
	   list.insertAtStart("adddep");
	   list.fetchAllData();
	   
	   list.insertAtEnd("rihan");
	   list.fetchAllData();
	   
	   
   }
}
