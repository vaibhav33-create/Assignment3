package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(11);
		ar.add(12);
		ar.add(13);
		ar.add(14);
		ar.add(15);
		
		
		int sum = 0;
		
		for(int i=0;i<ar.size();i++) {
			sum = sum +ar.get(i);
			
			
		}
		System.out.println(sum);
	}

}
