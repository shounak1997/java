package lamdaexp;

import java.util.*;
public class Source {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = sc.nextLine().split(" ");
		Double arr1[] = new Double[arr.length];
		for (int i=0; i<arr.length; i++) {
			arr1[i] = Double.parseDouble(arr[i]);
		}
		
		//Power lambda = (n1,n2) -> Math.pow(n1, n2);
		Power lambda = Math :: pow;
		System.out.println(lambda.pow(arr1[0], arr1[1]));
		
		

	}

}
