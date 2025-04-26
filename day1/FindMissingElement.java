package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a [] = { 1,4,3,2,8,6,7};
		
		System.out.println("Length is :" + a.length);
		Arrays.sort(a); 
		//1,2,3,4,6,7,8
		 				  //0,1,2,3,4,5,6
		
		for(int i = 0; i<a.length; i++) {
			//a [0] =1
			if(a[i]!=i+1) {
				System.out.println("Missing number :" + (i+1));
				break;
			}
				
		}		
	}
}
