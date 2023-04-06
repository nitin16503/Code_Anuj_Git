import java.util.Scanner;
public class f_STRINGs {

	public static void main(String[] args) {
		
		Scanner hemlo = new Scanner(System.in); 

		
		

//                        ## S T R I N G --> immutable ## 	
		
//		String name = "  nitin  " ;                   // nitin save in  reusable box. 
//		String surname = "mehta";
//		String Name = new String("nitin");        // nitin is store in both special box and reusable box.
//		String naMe = new String("nitin");        // nitin is store in special box and reuse value of "name" in reusable box.
//  	String namE = "nitin";		              // "namE"  will reuse value of  "name"
//	    String full_name = name + surname;
//	    
//		System.out.println(name == Name);          // name & Name are different.
//		System.out.println(Name == naMe);          // Name & naMe are different. 
//		System.out.println(name == namE);         // name & namE are same.
//		
//		
//		System.out.println(name.charAt(2));
//		System.out.println(name.length());
//		System.out.println(name.substring(2,4));
//	    System.out.println(name.contains("t"));
//	    System.out.println(name.equals(Name));         // check values 
//	    System.out.println(name.isEmpty());
//	    System.out.println(name.concat(" Smarty "));
//	    System.out.println(name.replace('n', 'N'));
//	    System.out.println(name.toLowerCase());
//	    System.out.println(name.toUpperCase());
//	    System.out.println(name.trim());
//	    System.out.println(name.indexOf('t'));        // if there is no character so it will return -1 
//	                                                  //also it will return value of first 't'.
//	    
//	    
//	    String cars = "H,M,S,B";
//	    String car_sep[] = cars.split(",");
//	    for (String car: car_sep) {
//	    	System.out.println(car);}	    		 
	    	    	
	    	
      // Anagram --> 2 strings having same letter. (silent-listen, hmsbh-bsmhh, vsvx-svxv)
	    	
//	    System.out.println("write 1st string");
//	    String word_1 = hemlo.nextLine();	    	
//	    System.out.println("write 2nd string");
//	    String word_2 = hemlo.nextLine();	
//	    boolean isAnagram = false;
//	    boolean used[] = new boolean[word_2.length()];   // boolean name = new boolean[length];
//	                                               //by default boolean store all false value
//	    
//	    if (word_1.length() == word_2.length()) {
//	    	
//	    		 for (int a=0; a<word_1.length(); a++) {
//	    			 word_1.charAt(a); 
//	    			 isAnagram = false;
//	    			 for (int b=0; b<word_2.length(); b++) {
//	    				 if (word_1.charAt(a) == word_2.charAt(b) && !used[b] ) {
//	    					 isAnagram = true;
//	    					 used[b] = true;
//	    					 break;
//	    				 }
//	    			 }if (!isAnagram) break;
//	    		 } 
//	    	}	
//	    	if (isAnagram) {
//	    		System.out.println("is Anagram");
//	    	}else {
//	    		System.out.println("is not Anagram");
//	    	}
	    	
		
	
		                            // OR 
		
		
		
//		System.out.println("write 1st string");
//	    String word_1 = hemlo.nextLine();	
//	    int array1[] = new int[256];                    //By default all 256 space has zero value.
//      System.out.println("write 2nd string");
//	    String word_2 = hemlo.nextLine();
//	    int array2[] = new int[256];
//	  
//       boolean anagram = false;
//	    
//	    for(char i: word_1.toCharArray()) {            // toCharArray --> convert string into character and store in array
//	    	int index = (int)i;
//	    	array1[index]++;
//	    	}
//	    
//	    for(char i: word_2.toCharArray()) {            // toCharArray --> convert string into character and store in array
//	    	int index = (int)i;
//	    	array2[index]++;
//	    	}
//	    
//	   for(int i = 1; i < 256; i++) {
//		   if(array1[i]==array2[i]) anagram = true;
//		   if (!anagram) break;
//	   }
//	   
//	   if (anagram) {
//   		 System.out.println("is Anagram");
//    	}else {
//   		 System.out.println("is not Anagram");
//   	}
		
		
		
		
//	                	## REVERSE WORD IN GIVEN STRING ## 
//	    System.out.println("Write a line or words ");
//		String line = hemlo.nextLine();
//		String reverse_line[] = line.split(" "); 
//		
//		for (int i = reverse_line.length-1; i >=0; i--) {
//			System.out.print(reverse_line[i]+" ");
//		}
//		
//		System.out.println(reverse_line.length);
		
		
		
		
		
		
		
		
		
		//Scanner hemlo = new Scanner(System.in);
		int p = hemlo.nextInt();
		for(int w =0;w<p;w++){
			int  v =0;
		    String s = hemlo.nextLine();
	
		        for(int i =2;i<s.length();i++){
		            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		                if(s.charAt(i-1)=='a'||s.charAt(i-1)=='e'||s.charAt(i-1)=='i'||s.charAt(i-1)=='o'||s.charAt(i-1)=='u'){
		                    if(s.charAt(i-2)=='a'||s.charAt(i-2)=='e'||s.charAt(i-2)=='i'||s.charAt(i-2)=='o'||s.charAt(i-2)=='u'){
		                          v=-1;
		                    }
		                }
		            }
		        }
//		    if(v==0) {
//		    	System.out.println("Sad");
//		    }else {
//		    	System.out.println("Happy");
//		    }
		}
		
		
		
		
		
	    }	
	}


