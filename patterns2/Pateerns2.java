package patterns2;
import java.util.Scanner;

public class Pateerns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number=");
		int n=sc.nextInt();
		
		
		
		
//		===========================================================================
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//				
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*  ");
//				
//			}
//			System.out.println();
//			}
//	
		
		
//		=============================================================================================
//	int num=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");
//				
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(num++ +"  ");
//				
//			}
//			System.out.println();
//			=============================================================================================
//	
//	
		int rows=2*n-1;
	for(int i=1;i<=rows;i++) {
		if(i<=n) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		}
		else {
			for(int j=1;j<=rows-i+1;j++) {
				System.out.print("* ");
			}
			
		}
		System.out.println();
	}
	
	
	}
	}


