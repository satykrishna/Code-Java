package com.example.List;

public interface LinkedListUtil {
	
	public int length(LinkedList head);
	
	public void display(LinkedList head);
	
	public int search(LinkedList head, int data);
	
	public LinkedList insert(LinkedList head, int data, int position); 
	
	public LinkedList delete(LinkedList head, int data, int position);
	
	public boolean isCyclic(LinkedList head);
	
	public LinkedList merge(LinkedList a, LinkedList b);
	
	public LinkedList sort(LinkedList a, LinkedList b);
	
	public LinkedList lengthofCycle(LinkedList head);


}
