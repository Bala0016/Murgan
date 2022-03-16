package org.task;

import java.util.LinkedList;
import java.util.List;

public class Ari {public static void main(String[] args) {
	List<Integer>li=new LinkedList<Integer>();
	li.add(2);
	li.add(1);
	li.add(4);
	li.add(3);
	li.add(5);

	for (int i = 0; i < li.size();i=i+2) {
		
		System.out.println(li.get(1));
		System.out.println(li.get(i));
		System.out.println("conflict");
		System.out.println("conflict resoled");
		System.out.println(li.get(i));
		System.out.println(li.get(i));
		System.out.println("alagu");
		System.out.println("rajesh");
}
}
}
