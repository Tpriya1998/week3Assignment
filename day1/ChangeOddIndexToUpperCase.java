package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		int length = test.length();
		System.out.println("Length of String :" +length);
		
		
		//Convert into CharArray
		
		//char[] charArray = test.toCharArray();
		//System.out.println(charArray[0]);
		//System.out.println(charArray[1]);
		//System.out.println(charArray[2]);
		//System.out.println(charArray[3]);
		//System.out.println(charArray[4]);
		//System.out.println(charArray[5]);
		//System.out.println(charArray[6]);
		//System.out.println(charArray[7]);
	for( int i =1 ; i< length; i +=1) {
		//if(i%2!=0)
		 
	
		System.out.println(test.charAt(i)+ " ");
	}
	  String test1 = "h a n g e m  e" ;
	  String upperCase = test1.toUpperCase();
	  System.out.println(upperCase);
	}
	}


