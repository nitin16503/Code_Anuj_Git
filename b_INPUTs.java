import java.util.Scanner;

public class b_INPUTs {

	public static void main(String[] args) {
	
		
		
		Scanner hemlo = new Scanner(System.in);  // Primitive Data type (which values are fix ) --> int,long,float...       
//      * input *                               // Non Primitive Data Type (which values are user define)--> Scanner,...
	
	
		
		
// For making statement user friendly we have to import " java.util.Scanner; "  first . (see at the top)
	
		
		
		
     // Taking user  input 
	
         	
//         	System.out.println("Enter your Name-->");
//         	String name = hemlo.nextLine();
//         	System.out.println(name);
// 
//         
//         	System.out.println("Enter Your Age --");
//         	int age = hemlo.nextInt();
//         	System.out.println(age); 
//         	
//         
//         	System.out.println("enter your marks ->");
//         	float marks = hemlo.nextFloat();
//         	System.out.println(marks);
		     
//<!------------------------------------------IMPORTANT AND RARE---------------------------------------------------->		
//                           (use when we are taking integer and string input consecutively)   
//		   System.out.println("enter no.");
//		   int n = Integer.parseInt(hemlo.nextLine());
//		   System.out.println("enter name");
//		   String name = hemlo.nextLine();
//		   System.out.println("Dear " + name + " here is your counting");
//		   for (int i = 0; i<=n  ;i++) {
//			   System.out.println(i);
//		   }
		                             //#ERROR 
//		System.out.println("enter no.");
//		int n= hemlo.nextInt();
//		System.out.println("enter name");
//		String name = hemlo.nextLine();
//		System.out.println("Dear "+ name + " here is your counting -:");
//		for(int i=0; i<=n; i++) {
//			System.out.println(i);
//		}
		   
//<---------------------------------------------------------------------------------------------------------------------->		
		
		
		
      // C O N D I T I O N A L       S T A T E M E N T      
      
       //1st
         	
//        	System.out.println("Enter Your Age --");
//         	int Age = hemlo.nextInt();
//         	if (Age > 18) {
//         		System.out.println("u can vote");}
//         	else if (Age < 16 ) {
//         		System.out.println(" u can not  vote");}
//         	else {
//        	    System.out.println("Next year");}
         	
         	
       //2nd
         	
//         	System.out.println("enter your grade");
//         	String Grade = hemlo.nextLine() ; 
//          	if (Grade == "A") {
//          		System.out.println("Good");
//          	}else if (Grade == "B") {
//          		System.out.println("Nice");
//          	}else if (Grade == "C") {
//          		System.out.println("wow");
//          	}else {
//          		System.out.println("pass");
//          	}
	                 	
  
		

          	
          	
 //                    N E S T E D       L O O P
          	
     //1st -->  maximum of three number
          	
//		    System.out.println("Enter No_1");
//          int No_1 = hemlo.nextInt();
//        	System.out.println("Enter No_2");
//         	int No_2 = hemlo.nextInt();
//        	System.out.println("Enter No_3");
//         	int No_3 = hemlo.nextInt();
//          	if (No_1 > No_2) {
//          		if (No_1 > No_3) {
//          			System.out.println("No_1 is max number");}
//          		else {
//          			System.out.println("No_3 is max number");}
//          		}
//          	else {
//          		if (No_2 > No_3) {
//          			System.out.println("No_2 is max number");}
//          		else {
//          			System.out.println("No_3 is max number");}
//          		}
          	
                                
//          	                 OR
          	                 
     
//           System.out.println("Enter No_1");
//           int a = hemlo.nextInt();
//           System.out.println("Enter No_2");
//           int b = hemlo.nextInt();
//           System.out.println("Enter No_3");
//           int c = hemlo.nextInt();                      
//           
//           int result = 0 ;
//           
//           result = a>b ? a>c ? a : c : b>c ? b : c ; 
////                      ? = if  ,  : = else  
//           System.out.println("max number = " + result);
          	                 
          	                 
   
           
           
          
//             S W I T C H      C A S E       	
       
       //1st
          	
//          System.out.println("Enter your grade (Capital letter)");
//          String grade = hemlo.nextLine();
//         	switch(grade) {
//         	case "A":
//         		System.out.println("good");
//         		break;
//         	case "B":
//         		System.out.println("Nice");
//         		break;
//         	case "C":
//         		System.out.println("Wow");
//         		break;
//         	default:
//         		System.out.println("Pass");
//         		}
         	
         	
        //2nd
          	
//          	System.out.println("Enter your KD(Pubg)");
//          	int KD = hemlo.nextInt();
//          	switch (KD) {
//          	case 1 :
//          		System.out.println("Camper");
//                break; 	
//          	case 2:
//          		System.out.println("Player");
//          	    break;
//          	default:
//          		System.out.println("Pro");
//             }
          		
        
          	
          	  
//   	     L O G I C A L    O P E R A T O R S
   	    
   	    //   &&   ,    ||   
   	   //   AND   ,    OR   
   
    //1st
         
//   	    System.out.println("Enter Your Age");
//   	    int Umar = hemlo.nextInt();
//   	    System.out.println("Enter your Roll_no ");
//   	    int Roll_no = hemlo.nextInt();
//   	    if (Umar>18 && Roll_no > 5 ) {
//   	    	System.out.println("You can play pubg");
//   	    }else {
//   	    	System.out.println("You can not play pubg");
//   	    }
   	    	
   	    
   	    
   	    
   	//2nd
   	    
//   	    System.out.println("Enter Your Age");
// 	    int umar = hemlo.nextInt();
// 	    System.out.println("Enter your Roll_no ");
// 	    int roll_no = hemlo.nextInt();
// 	    if (umar>18 || roll_no > 5 ) {
// 	    	System.out.println("You an play pubg");
// 	    }else {
// 	    	System.out.println("You can not play pubg");
// 	    }
   	     
         //                         ROOTS OF QUADRATIC EQUATION	
		
//	quadratic equation - a x^2 + b x + c
		
//		int a = hemlo.nextInt();
//		int b = hemlo.nextInt();
//		int c = hemlo.nextInt();
//		
//		int d = (b*b) - 4*a*c;
//		
//		if(d>=0) {
//			double sqrt_d =  Math.sqrt((d));
//			double x1 = (-b + sqrt_d)/ 2*a;
//			double x2 = (-b - sqrt_d)/ 2*a;
//			System.out.println(x1);
//			System.out.println(x2);
//		}else {
//			d= -d;
//			double sqrt_d =  Math.sqrt(d);
//			//add i
//			System.out.print("( ");
//			System.out.print( "-"+b + "+" +sqrt_d+"i"  );
//			System.out.print(")/"+2*a);
//			
//			System.out.println();
//			
//			System.out.print("( ");
//			System.out.print( "-"+b + "-" +sqrt_d+"i"  );
//			System.out.print(")/" +2*a );
//		
//		}
 	
		
         	
         	
		
//		System.out.println("Enter your marks");
//	    int sub1 = hemlo.nextInt();
//	    int sub2 = hemlo.nextInt();
//	    int sub3 = hemlo.nextInt();
//	    int sub4 = hemlo.nextInt();
//	    int sub5 = hemlo.nextInt();
//	    int sum = sub1 + sub2 + sub3 + sub4 + sub5 ;
//        double percentage = (double)sum/500 * 100 ;
//        System.out.println(sum);
//        System.out.println(percentage);
         	
		        

         	
         	
         	
         	
         	
         	
         	
         	
}
}