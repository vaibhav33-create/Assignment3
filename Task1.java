package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(11);
		ar.add(12);
		ar.add(13);
		ar.add(14);
		ar.add(15);
		
		System.out.println("using for loop");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("using for each loop");
		for(Integer aa: ar) {
			System.out.println(aa);
		}
		
		System.out.println("using iterator");
		Iterator<Integer> it =  ar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
