//                         ## C O N S T R U C T O R ##  
// 1. Constructor are like methods but having no return type. 
// 2. Also their name and class name should be same.

  class boy {
		static long SalaryPerMonth;
		static String name;
	 boy(){ 
			SalaryPerMonth = 100000l;
			name = "Tapu ke Papa";	}
       }
  
  
  class girl {
		static long SalaryPerMonth;
	    static String name;
	 girl(String Name){
			SalaryPerMonth = 100000l;
			name = Name ;	}
     }
	 
	 
  
  
public class h_MyConstructor {
	
	h_MyConstructor() {
		System.out.println("Constructor is working");
		 	}
	
		public static void main(String[] args) {
		
		h_MyConstructor object_name = new h_MyConstructor();
		
		
		boy b1 = new boy();
	    System.out.println(boy.name);    
	    System.out.println(boy.SalaryPerMonth);
	    
	    girl g1 = new girl("Dhaya bahen");
	    System.out.println(girl.name);
	     
	    

	}

}
