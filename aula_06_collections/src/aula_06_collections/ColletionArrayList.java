package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ColletionArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		numberList.add(1);
		numberList.add(3);
		numberList.add(5);
		numberList.add(7);
		numberList.add(9);
		
		for(int i: numberList)
			System.out.println(i);
		
		System.out.println("O objeto que esta presente no indice 4: " + numberList.get(4));
		System.out.println("O objeto 3 esta no indice: " + numberList.indexOf(3));
		
		
		numberList.set(3, 25);
		
		numberList.remove(0);
		
		for(int i: numberList)
			System.out.println(i);
		
		numberList.sort(null);
		
		numberList.sort(Comparator.reverseOrder());
		
		for(int i: numberList)
			System.out.println(i);
	
	}
}
