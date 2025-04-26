package week3.day1;

import java.util.Arrays;

public class AnagramWord {

	public static void main(String[] args) {

     String text1 = "stops" ;
     String  text2= "potss";
     
     if (text1.length()==text2.length()) {
    	 System.out.println("Length is equal ");
    	 
     } else {
    	 System.out.println("Length is not equal");
     }
     System.out.println("------");
     
     char [] charArray= text1 .toCharArray();
     System.out.println(charArray[0]);
     System.out.println(charArray[1]);
     System.out.println(charArray[2]);
     System.out.println(charArray[3]);
     System.out.println(charArray[4]);
     
     System.out.println("-----");
     
     char [] charArray1 = text2.toCharArray();
     System.out.println(charArray1[0]);
     System.out.println(charArray1[1]);
     System.out.println(charArray1[2]);
     System.out.println(charArray1[3]);
     System.out.println(charArray1[4]);
     
     Arrays.sort(charArray);
     Arrays.sort(charArray1);
     
     charArray1 .equals(charArray1);
     
     if ((charArray)==(charArray1)) {
    	 System.out.println(" the sorted arrays are equal ");
    	 
     } else {
    	 System.out.println(" the sorted arrays are not equal");
     }

     System.out.println( "The given strings are not an Anagram.");
	
	}
}
