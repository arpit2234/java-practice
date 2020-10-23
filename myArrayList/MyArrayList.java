package myArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList fruits=new ArrayList();
		
//		Arraylist extend List class
		List<String> Vegitable=new ArrayList();
		
		
		fruits.add("Custard Apple");
		fruits.add(" Apple");
		fruits.add("Oranges");
		System.out.println(fruits);
		
		
		Vegitable.add("Potato");
		Vegitable.add("Onions");
		Vegitable.add("Tomato");
		System.out.println(Vegitable);
		
		Vegitable.addAll(fruits);
		System.out.println(Vegitable);
		
		System.out.println(Vegitable.get(2)); 
		Vegitable.set(2, "Tameta");
//		set at particular index
		
		Vegitable.remove(2);
		
		
//		Vegitable.removeAll(toremove)------- to remove is arraylist to remove
//		Vegitable.size ------------return size of array
//		Vegitable.contains(potato)/isEmpty()----------------check contains or not-return boolean
		
		
		
		System.out.println(Vegitable);
		
		
		String temp[]=new String[fruits.size()];
		fruits.toArray(temp);
		
		for(String e:temp) {
			System.out.println(e);
			
		}
		

		
//		Pair <String,Integer> p1=new Pair("Arpit",22);
//		Pair<String,Boolean> p2=new Pair("Arpit",true);
//	    p1.getDescription();
//	    p2.getDescription();

	    


		

	}

}
