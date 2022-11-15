package com.velocity.collection.demo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(40);
		linkedlist.add(50);
		
		System.out.println(linkedlist);
		
		System.out.println("***************************************");

		for(Object obj :linkedlist)
		{
			System.out.println(obj);
		}
	}

}
