package queue;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq= new PriorityQueue<>();
                  pq.add("Banana");
                  pq.add("Mango");
                  pq.add("Apple");
                  pq.add("Kiwi");
                  pq.add("Sapodilla");
                  System.out.println(pq);
                  System.out.println(pq.remove());
	}

}
