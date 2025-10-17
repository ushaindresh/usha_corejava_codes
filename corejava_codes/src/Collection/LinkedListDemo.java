package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> fruits=new LinkedList<>();
		fruits.add("grapes");
		fruits.add("banana");
		fruits.add("pomograte");
		
		System.out.println("First fruit : "+fruits.get(0));
		
		fruits.set(2, "cherry");//modify ele
		
		if(fruits.contains("apple"));
		{
			System.out.println("Apple is in the list");
		}
		
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
 
		fruits.remove(2);
		
		fruits.clear();
		System.out.println("list cleared no of fruits :"+fruits.size());
		System.out.println(fruits);

	}

}