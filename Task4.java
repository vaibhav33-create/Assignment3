package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<Integer>();
		ar.add(33);
		ar.add(44);
		ar.add(55);
		ar.add(66);
		ar.add(77);
		ar.add(88);
		
		System.out.println(ar.remove(2));
		System.out.println(ar);
		
		System.out.println();
		
	ar.add(3, 90);
	System.out.println(ar);
	
	System.out.println(ar.size());
	
	  int[] namesArray = new int[ar.size()];  
    
      for (int i = 0; i < ar.size(); i++)  
          namesArray[i] = ar.get(i);  
    
      System.out.println("After converting List into an Array");  
      for (int j = 0; j < namesArray.length; j++) {  
          System.out.println((j+1)+" element of the array is "+namesArray[j]);  
      }  
	
		
		
	}

}
