package com.example.List;

public class LinkedListUtilImpl implements LinkedListUtil {

   private LinkedList current;
   
	
	@Override
	public int length(LinkedList head) {
		int length = 0;
		current = head;
     	while(current != null) {
     		current = current.getNext();
			length++;
		}
		return length;
	}

	@Override
	public void display(LinkedList head) {
		current = head;
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		
	}

	@Override
	public int search(LinkedList head, int data) {
		current = head;
		int position = 0;
		
		while(current != null) {
		   if(current.getData() == data) {
			   return position;
		   }
		   current = current.getNext();
		   position++;
		   
		}
		
		return position;
	}

	@Override
	public LinkedList insert(LinkedList head, int data, int position) {
		int k = 0;
		LinkedList previousNode = null, nextNode = null;
		LinkedList newElement = new LinkedList(data, null, null);
		if(head == null || (length(head) == 0)) {
			return newElement;
		}
		
		if(position == 1 ){
			newElement.setNext(head);
			head.setPrevious(newElement);
			return newElement;
		}
		
		current = head;
		
		while(current != null && k < position-1) {
			current = current.getNext();
		    k++;
		}
		
		current = current.getNext();
		current.setNext(newElement);
		
		if(current.getNext() == null) {
			newElement.setPrevious(current);
		}
		else {
			newElement.setNext(current.getNext());
		}
		
		return null;
		
		
	}

	@Override
	public LinkedList delete(LinkedList head, int data, int position) {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public boolean isCyclic(LinkedList head) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LinkedList merge(LinkedList a, LinkedList b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList sort(LinkedList a, LinkedList b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList lengthofCycle(LinkedList head) {
		// TODO Auto-generated method stub
		return null;
	}

}
