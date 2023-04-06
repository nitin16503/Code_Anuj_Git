import java.util.Scanner;

import java.util.Arrays;
import java.util.Arrays;
public class e_SORTs {

	public static void main(String[] args) {
		
		Scanner hemlo = new Scanner(System.in);

//		                  ## S O R T ##
		
//		System.out.println("Enter no of element in Array");
//		int x = hemlo.nextInt();
//        System.out.println("Enter a Array");               		
//		int Marks[] = new int[x];
//		for (int i =0; i<x ; i++) {
//			Marks[i] = hemlo.nextInt();
//		}       
//		
//		Arrays.sort(Marks);  //  first we have import Arrays class -> import java.util.Arrays; 
//		
//		for(int i =0; i<x; i++) {                                                                       		       
//			  System.out.print(Marks[i] + ", ");               
//			}         
	
		
		
//                          ## BUBBLE SORT  ##
		
		//1st --> increasing order
		
//		System.out.println("Enter no of element in Array");
//		int e = hemlo.nextInt();
//      System.out.println("Enter a Array");               		
//		int A[] = new int[e];
//		for (int i =0; i<e ; i++) {
//			A[i] = hemlo.nextInt();
//		}
//		
//		for (int i= 0; i<e-1; i++) {
//		boolean sorted = true;
//			for (int n =0; n<e-1-i; n++) {
//				if(A[n]>A[n+1]) {
//					int B = A[n];
//					A[n]=A[n+1];
//					A[n+1]= B;
//		            sorted = false;
//				}
//			}if(sorted) break;
//		}System.out.print("result --> ");
//		for(int i =0; i<e; i++) {                                                                       		       
//		  System.out.print(A[i] + ", ");               
//		}                                                 
		
		
		 //2nd --> decreasing order 
		
//		System.out.println("enter no. of element");
//		int n = hemlo.nextInt();
//		System.out.println("enter array");
//		int b[] = new int[n];
//		for (int i =0; i<n; i++) {
//			b[i] = hemlo.nextInt();
//		}
//		 
//		for (int i = 0; i<n-1; i++) {
//			boolean sorted = true;
//			for (int f= 0; f<n-1-i ; f++) {
//				if (b[f]<b[f+1]) {
//					int temp = b[f+1];
//					b[f+1] = b[f];
//					b[f] = temp;
//					sorted = false;
//				}
//			}if (sorted) break;
//		}
//		System.out.print("result --> ");
//		for(int i =0; i<n; i++) {                                                                       		       
//			  System.out.print(b[i] + ", ");  
//		}
			
		
		
//                    ##  SELECTIVE SORT  ##	
		
		//1st --> increasing order
		
//		System.out.println("Enter no. of elements ");
//		int n = hemlo.nextInt();
//		System.out.println("enter Array");
//		int a[] = new int[n];
//		for (int i =0; i<n; i++) {
//			a[i] = hemlo.nextInt();
//		}
//		for (int i = 0 ; i<n-1; i++) {
//			int minimum_index = i;
//			for (int p = i+1; p<n; p++) {
//				if (a[minimum_index]>a[p]) {
//					minimum_index= p;
//				}
//			}
//			int temp = a[i];
//			a[i] =  a[minimum_index];
//			a[minimum_index] = temp ;
//		}
//		 System.out.print("result --> ");
//		 for(int i =0; i<n; i++) { 
//		     System.out.print(a[i] + ", ");
//	        }
		
		
		//2nd --> decreasing order
		
//		System.out.println("write no. of elemnt");
//		int n = hemlo.nextInt();
//		System.out.println("write Array ");
//		int c[] = new int[n];
//		for (int i =0 ; i<n; i++) {
//			c[i] = hemlo.nextInt();
//		}
//		  
//		for (int i = 0 ; i< n-1 ; i++) {
//			int maximum_index = i;
//			for (int j = i+1 ; j<n; j++) {
//				if(c[maximum_index]<c[j]) {
//					maximum_index = j;
//				}
//			}
//			int temp = c[i] ;
//			c[i] = c[maximum_index];
//			c[maximum_index] = temp;
//		}
//		System.out.print("result --> ");
//		for(int i =0; i<n; i++) {                                                                       		       
//			  System.out.print(c[i] + ", ");  
//		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
