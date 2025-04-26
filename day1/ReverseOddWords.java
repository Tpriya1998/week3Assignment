package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String word = "I am a software tester";
		int length = word.length();
		System.out.println("Length is :" + length );
		 String[] split = word.split(" ");
		 System.out.println(split[0]);
		 System.out.println(split[1]);
		 System.out.println(split[2]);
		 System.out.println(split[3]);
		 System.out.println(split[4]);
		 System.out.println("---");
		 
		 
		 char charAtIndex2=word.charAt(3);
         System.out.println(charAtIndex2);
         char charAtIndex3 = word.charAt(4);
         System.out.println(charAtIndex3);
         char charAtIndex1 = word.charAt(5);
         System.out.println(charAtIndex1);
         
         System.out.println("---");
         
		 
		 for(int  i=0 ; i<word.length(); i++) {
			 if (i % 2 != 0) {
				
			 System.out.println(word.charAt(i));
			 }			
			 
		 }
			 
		 
		 System.out.println();
		 System.out.println("----");
		 
		 char[] charArray = word.toCharArray();
		 System.out.println(charArray[0]);
		 System.out.println(charArray[1]);
		 System.out.println(charArray[2]);
		 System.out.println(charArray[3]);
		 System.out.println(charArray[4]); 
		 System.out.println(charArray[5]);
		 System.out.println(charArray[6]);
		 
		 System.out.println("----");
		 		 
		 for(int  j =0;j <= word.length();j++) {
			 if(j % 2==0) {
				 System.out.println(word.charAt(j));
				 
			 }
		 }
	}
		 }
