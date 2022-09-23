package com.bridgelabz;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("amit");
		list.add("jadhav");
		list.add("xyz");
		list.add("50");
		list.add("100");
		System.out.println("First LinkedList:" + list);
		LinkedList sec_list = new LinkedList();
		sec_list = (LinkedList) list.clone();
		System.out.println("Second LinkedList is:" + sec_list);
		
	}

}
