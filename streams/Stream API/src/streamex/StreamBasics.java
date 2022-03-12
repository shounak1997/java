package streamex;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StreamBasics {
    public static void main(String[] args) {
    	//1.Printing a stream of Integers in range
    	IntStream.range(1,10).forEach(i -> System.out.print((i) + " "));  //NOTE: forEach does the same operation on each element stored in temp stream
    	System.out.println();
    	//2.Skipping values
    	IntStream.rangeClosed(1,10).skip(5).forEach(System.out :: print); //Skips first 5 elements NOTE: rangeClosed includes both. Range include ony start index 
    	System.out.println();
    	
    	//3. Printing only sum
    	int product =  IntStream.range(1, 5).sum();                          
    	System.out.println("Sum of stream " + product);
    	
    	//4. Factorial using stream
    	int fact = IntStream.rangeClosed(1, 5).reduce(1, (x,y) -> x*y);
    	System.out.println(fact);
    	
    	//5. Stream from Array , sort, filter and print.
    	String[] names = {"Alan", "Charlie", "Sheldon", "Sampa", "Shounak"};
    	Arrays.stream(names) //similar to Stream.of
    	       .filter( string -> string.startsWith("S"))
    	       .sorted()
    	       .forEach(System.out :: println);
    	
    	//6. Average of squares of integer array *ifPresent
    	int []arr = {1,2,5,6};
    	Arrays.stream(arr)
    	       .map(i -> i*i)
    	       .average()
    	       .ifPresent(System.out ::println);  // Used to store values such as sum(), average(), sum() as streamStr

    	}
    		
	}
    	


class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if (o1.compareTo(o2) == 0)
		    return 0;
		else if ((o1.compareTo(o2) < 0))
			return 1;
		return -1 ;
			
	}	
}


