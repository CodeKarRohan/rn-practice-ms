package com.rohan.practices;

class DoubleNode 
{
	String data;
	DoubleNode prev;
	DoubleNode next;
	
	public DoubleNode(String data)
	{
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}


public class DoubleLinkedList {
	DoubleNode head;
	
	private void createList(String data)
	{
		DoubleNode n = new DoubleNode(data);
		
		if(head == null)
		{
			head = new DoubleNode(data);
			return;
		}
		DoubleNode temp = head;
		while( temp.next != null )
		{
			temp = temp.next;
		}
		temp.next = n;
		n.prev = temp;
		
	}
	
	private void fetchAllDataForward()
	{
		DoubleNode temp = head;
		while(temp != null )
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	private void insertAtPoint(String data, int index)
	{
		if(index < 0)
		{
			return;
		}
	    DoubleNode temp = head;
	    DoubleNode nNode = new DoubleNode(data);
	    
	    if( head ==  null )
	    {
	    	if(index > 1)
	    	{
	    		return;
	    	}
	    	head = nNode;
	    	return;
	    }
	    
	    if(index == 0)
	    {
	    	nNode.next = head;
	    	nNode.prev = null;
	    	head.prev =nNode;
	    	
	    	head = nNode;
	    }
	    while( temp != null)
	    {
	    	
	    	index--;
	    	if(index == 0)
	    	{
	    		nNode.prev = temp;
	    		nNode.next = temp.next;
	    		temp.next = nNode;
	    		break;
	    	}
	    	temp = temp.next;
	    }
	    
	}
	
	private void fetchAllDataReverse()
	{
		DoubleNode temp = head;
		while(temp != null )
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		DoubleLinkedList list =  new DoubleLinkedList();
		list.createList("rohan");
		list.createList("adeep");
		list.createList("rohit");
		list.createList("amul");
		list.fetchAllDataForward();
		
		list.insertAtPoint("xxx", 1);
		list.fetchAllDataForward();
	}

}
