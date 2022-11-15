package com.velocity.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("Ram");
		arrayList.add("Shyam");
		arrayList.add("Gopal");
		arrayList.add("Arjun");
		
		System.out.println("ArryList contains :"+arrayList);
		
		Iterator itr = arrayList.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("***End of program***");
		for(Object obj:arrayList) {
			System.out.println(obj);
		}
	}

}
