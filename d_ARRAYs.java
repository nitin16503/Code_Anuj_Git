import java.util.Scanner;
public class d_ARRAYs {

	public static void main(String[] args) {
		
		
		
		Scanner hemlo = new Scanner(System.in);
		
		
//                    A R R A Y
	//1st  --> 1D
		
//		int Roll_no[] = new int[5];
//		Roll_no[0] = 1;
//		Roll_no[1] = 2;               // O R        int Roll_no[] = { 1,2,3,4,5}; 
//		Roll_no[2] = 3;
//		Roll_no[3] = 4;
//		Roll_no[4] = 5;
//		System.out.println(Roll_no[2]);
//		
//		System.out.println(Roll_no.length);
//		
//		for (int i = 0 ; i<Roll_no.length; i++) {
//		System.out.print(Roll_no[i]+ " , ");}
		
		
//                      ##   E x a m p l e     ##   
		
		
//           ## Average Marks of Student ##
		
//		System.out.println("enter number of students :");
//		int S = hemlo.nextInt();
//		System.out.println("enter marks of students");	
//		
//		int M[] = new int[S];
//		int sum_of_marks = 0;
//		for (int i = 0; i<S; i++ ) {
//			 M[i] = hemlo.nextInt();
//			sum_of_marks+=M[i];
//		}
//		float average_marks= 0;
//		average_marks=sum_of_marks/S;
//		System.out.println("average marks : "+average_marks);
		
		
//		                         OR
		
		
//		System.out.println("enter number of student :");
//		int S = hemlo.nextInt();
//		System.out.println("enter marks of students");
//		int sum_of_marks = 0;
//		for (int i = 0; i<S; i++ ) {
//			int M = hemlo.nextInt();
//			sum_of_marks+=M;
//		}
//		float average_marks=0;
//		average_marks=sum_of_marks/S;
//		System.out.println("average marks : "+ average_marks);
		
		
		
//                 ## Sum of 1-D Array  ##
		
// 		int N = hemlo.nextInt();
//        int sum = 0;
//        int arr[] = new int[N];
//        for (int i = 0; i<N ; i++){
//            int M = hemlo.nextInt();
//            sum += M;
//        } 
//        System.out.println(sum);
		

		
//               ## Minimum and Maximum of 1-D Array  ##	
		
//	      int N = hemlo.nextInt();
//	      int A[] = new int[N]; 
//	      int max = 0;
//	      int min = 0;
//	      for(int i =0; i<N ; i++){
//	    	  A[i] = hemlo.nextInt();
//	      }
//	      for (int i = 0; i<N-1 ; i++){
//	          if (A[i]>A[i+1]){
//	              max = A[i];
//	              int temp = A[i+1];
//	              A[i+1] = A[i];
//	              A[i] = temp;
//	              min = A[0];
//	          }else {
//	        	  max= A[N-1];}
//	      }
//	       System.out.println("min = "+ min);
//	       System.out.println("max = "+ max);
		
		
		
		
		
	//2nd --> 2D
		
		
//		int a[][] = { {_,_,_,_,_} , {_,_,_} };      //      C1       C2       C3       
//	                                   
////		        OR                        //    R1   a[0][0]   a[0][1]   a[0][2]
//             
//		int a[][] = new int[5][3];            //    R2   a[1][0]   a[1][1]   a[1][2]
//	                                           
//		                                      //    R3   a[2][0]   a[2][1]   a[2][2]
//		
//	
//		int a[][] =       {
//				{1,2,3},
//				{4,5,6},
//				{7,8}     };
//		
//		for (int i = 0; i<3 ; i++) {
//			for (int n = 0; n<3 ; n++) {
//				System.out.print(a[i][n]+ ",  ");
//			}System.out.println();
//		}
//	
////		System.out.println(a[2][2]);   --> ! SHOW ERROR  !
//		System.out.println(a[0][0]);
//		System.out.println(a[2][1]);
//		System.out.println(a[1][1]);

		
		
		
		
//               ##  S U M   O F   M A T R I X S ##		
		
		
//		System.out.println("write no. of rows ");
//		int r = hemlo.nextInt();
//		System.out.println("write no. of column");
//		int c = hemlo.nextInt();
//		int a[][] = new int [r][c];
//		int b[][] = new int [r][c];
//		
//		System.out.println("First matrix --> a");
//		
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				System.out.print(i+1 + " row  ");
//				System.out.println(n+1 +" column");
//				a[i][n] = hemlo.nextInt();
//			}
//		}
//		
//		System.out.println();
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				System.out.print(a[i][n]+ ",  ");
//			}System.out.println();
//		}
//	   System.out.println();
//	   System.out.println();
//		
//       System.out.println("second matrix --> b");
//		
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				System.out.print(i+1 + " row  ");
//				System.out.println(n+1 +" column");
//				b[i][n] = hemlo.nextInt();
//			}
//			}
//		System.out.println();
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				System.out.print(b[i][n]+ ",  ");
//			}System.out.println();
//		}
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("Sum of matrix");
//		
//		int s[][] = new int[r][c];
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				s[i][n] = a[i][n] + b[i][n];
//			}
//			}
//		System.out.println();
//		System.out.println();
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				System.out.print(s[i][n]+ ",  ");
//			}System.out.println();
//		}
		
		
		
		
		
		
		
		
//           ##  M U L T I P L I C A T I O N   of   Matrices  ##		
		
		
//		System.out.println("write no. of rows of 1st matrix ");
//		int r = hemlo.nextInt();
//		System.out.println("write no. of column of 1st matrix");
//		int c = hemlo.nextInt();
//		int r1 = c;
//		System.out.println("no. of column of 1st matrix = no. of row of 2nd matrix");
//		System.out.println("write no. of column of 2nd matrix");
//		int c1 = hemlo.nextInt();
//		int a[][] = new int [r][c];
//		int b[][] = new int [r1][c1];
//		
//		System.out.println("First matrix --> a");
//		
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				System.out.print(i+1 + " row  ");
//				System.out.println(n+1 +" column");
//				a[i][n] = hemlo.nextInt();
//			}
//		}
//		
//		System.out.println();
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c ; n++) {
//				System.out.print(a[i][n]+ ",  ");
//			}System.out.println();
//		}
//	   System.out.println();
//	   System.out.println();
//       System.out.println("second matrix --> b");
//		for (int i = 0; i<r1 ; i++) {
//			for (int n = 0; n<c1 ; n++) {
//				System.out.print(i+1 + " row  ");
//				System.out.println(n+1 +" column");
//				b[i][n] = hemlo.nextInt();
//			}
//			}
//		System.out.println();
//		for (int i = 0; i<r1 ; i++) {
//			for (int n = 0; n<c1 ; n++) {
//				System.out.print(b[i][n]+ ",  ");
//			}System.out.println();
//		}
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("Multiplication  of matrix");
//		
//		int s[][] = new int[r][c1];
//		int x = 0;
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c1 ; n++) {
//				for (int j = 0; j<c  ; j++) {                       
//				x= a[i][j] * b[j][n];            // MOST IMPORTANT PART :)               
//		    	s[i][n]+= x;
//			    	}	
//		     	}
//			}
//		System.out.println();
//		System.out.println();
//		for (int i = 0; i<r ; i++) {
//			for (int n = 0; n<c1 ; n++) {
//				System.out.print(s[i][n]+ ",  ");
//			}System.out.println();
//		}

		
		
		
		

			
		
		
	}

}
