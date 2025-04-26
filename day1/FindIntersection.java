package week3.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int a [] = { 3,2,11,4,6,7};
		int b [] = { 1,2,8,4,9,7};
		
		System.out.println(a[1]);
		
		int length = a.length;
		int length1 = b. length;
		
		
		
		System.out.println("The length is :" +length );
		System.out.println("The length is : " +length1);
		
		System.out.println("-----");		
		for(int i = 0; i< a.length; i ++) {
			
			System.out.println(a[i]);
			
		}
		System.out.println("------");
		for(int j = 0; j < b.length; j++) {
			System.out.println(b[j]);	
		}
		if(a[0]==b[0]) {
			System.out.println("number is match:" +b[0]);
		}
		else {
			System.out.println("number is not match:" +b[0]);
		}
		
		if(a[1]==b[1]) {
			System.out.println("number is match :" +a[1]);
		}
		else {
			System.out.println("number is not match" +a[1]);
	}
			
	}
	
	}
	


