package com.example.List;

import java.io.Serializable;

public class LinkedList implements Serializable, Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7180062308001331600L;
	private LinkedList next, previous;
	private int data;
	
	public LinkedList() {
		this.setData(0);
		this.setNext(null);
		this.setPrevious(null);
	}
	
	public LinkedList(int data, LinkedList next, LinkedList previous) {
		this.setData(data);
		this.setNext(next);
		this.setPrevious(previous);
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public LinkedList getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(LinkedList next) {
		this.next = next;
	}

	/**
	 * @return the previous
	 */
	public LinkedList getPrevious() {
		return previous;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(LinkedList previous) {
		this.previous = previous;
	}
	
    
	@Override
	protected LinkedList clone() throws CloneNotSupportedException {
	     LinkedList previousNodeLink =  previous.clone();
	     LinkedList nextNodeLink = next.clone();
	     return new LinkedList(data, nextNodeLink, previousNodeLink);
	}
	
	
	
}
