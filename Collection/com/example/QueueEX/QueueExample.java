package com.example.QueueEX;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
	
	
	public static void main(String[] args) {
		
		PriorityQueue queue = new PriorityQueue();
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		
		Iterator queueIterator = queue.iterator();
		
		while(queueIterator.hasNext()) {
			System.out.println(queueIterator.next());
		}
		
		PriorityQueue q = new PriorityQueue(15, new MyComparator());
		
		q.offer("a");
		q.offer("b");
		q.offer("Z");
		q.offer("e");
		System.out.println(q);
		
		
		
	}

}


class MyComparator implements Comparator{
	
	@Override
	public int compare(Object a, Object b) {
	    String s1 = a.toString();
	    String s2 = b.toString();
		return -s1.compareTo(s2);
	}
}