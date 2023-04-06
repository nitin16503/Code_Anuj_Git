//import java.util.Scanner;
public class g_OOPs {

	public static void main(String[] args) {
		
//		Scanner hemlo = new Scanner(System.in);
		
		
//                            ## O O P s ##
		
		
		
		                //1st -- Class and Object
		
		  
//		   //** There should be only one *public class* (g_OOPs) in a file (g_OOPs) of same name .
//		   //** We can make multiple classes(except public class) in a public class. 
//		
////a.		
////	class person {
////		String name;
////		int age;
////	}
////b. 
////	class animal{
////		String name;
////		String type;
////	}
//		   //**Class does not contains any space but its object and behavior contains space. 
//	       //** Each class has multiple objects.
//	       //**For making objects in a class we need constructors.(by default java give constructor-->person() )   
//	
////a.1                                        //|   //b.1
////	person p1 = new person();              //|       animal a1 = new animal();
////	p1.name = "Nitin";                     //|       a1.name = "dog";
////	p1.age = 18 ;                          //|       a1.type = "omnivor0us"
////a.2                                        //|   //b.2
////	person p2 = new person();              //|       animal a2 = new animal();
////	p2.name = "Mehta";                     //|       a2.name = "cow";
////	p2.age = 0 ;                           //|       a2.type = "herbivorous";
//	
//	
//	      //** Each class have multiple behavior.
//	    	
//	class person{
//		String name;
//		int age;
//		
//		void eat() {
//			System.out.println(name + " is eating");
//		}
//		void sleep() {
//			System.out.println(age + " is sleeping");
//		}
//	}
//	person p2 = new person();              
//	p2.name = "Mehta";                     
//	p2.age = 0 ;
//	person p1 = new person();              
//	p1.name = "Nitin";                     
//	p1.age = 18 ;
//	System.out.println(p1.name);
//	System.out.println(p2.age);
//	p1.eat();
//	p2.sleep();
//	
//		
//	        //**How to check whether default constructor is working or not. 
		
//	class class12{
//		String name;
//		int roll_no;
//		int Marks ;
//	
//		public class12() {
//			System.out.println("Constructor is working ");
//		}
//		
//		public void behaviour() {
//			System.out.println(name + " is good .");
//		}
//		public void gf() {
//			System.out.println(name + " have no gf .");
//		}
//		public void age() {
//			System.out.println(name + " is more than 16 years old  ");
//		}	
//		void age(int number) {
//			System.out.println(name + " age is  " + number );
//		}
//	}
//	
//	class12 std1 = new class12();
//	std1.name = "Nitin";
//	class12 std2 = new class12();
//	std1.roll_no = 29;
//	std1.Marks = 111;
//	class12 std3 = new class12();
//	System.out.println(std1.name);
//	System.out.println(std1.roll_no);
//	System.out.println(std1.Marks);
//	std1.behaviour();
//	std1.gf();
//  std1.age();
//  std1.age(18);
    
//                                 ** M E T H O D S ** 
	
	
	    int result = max_of(9,8);
	    System.out.println(result);
	    
	    sayhi("nitin");
			
	    int Result = max_of(10,4,11);
	    System.out.println(Result);	
			}
	
	//#1
		 static int  max_of(int a, int b) {
			System.out.print("The greater number is :  ");
			return a>b? a : b;
//			      or
//			if(a>b)  return a;
//			else return b;	
		}
	//#2	 	
		static void sayhi(String name){
			System.out.println("good morning : " + name);
			System.out.println("i hope u are good,");
			System.out.println("how may i help u :)");
		}
    //#3
        static int max_of(int a, int b, int c) {
        	if (a>b) {
        		if(a>c) return a;
        		else return c;
        	}
        	else {
        		if(b>c) return b;
        		else return c;
        	}
                   // #OR#     
        	//return a>b ? a>c ? a : c : b>c ? b : c;
        }

// #1 and #3 are example of 'METHOD OVERLOADING' ---> when  a class has two or more methods having same name but different parameters. 
// JAVA is pass by value type .		
		
        

		
        
        
        
        
        
        
        
		
		
		
		
	

}
