package patterns;
import java.util.Scanner;
public class Pateerns {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number =");
		int n=sc.nextInt();
//		pattern for n*n box
//		for(int i=0;i<=n;i++) {
//			
//			for(int j=0;j<=n;j++) {
//			System.out.print("* ");
//			}
//		 }
		
		
//		pattern for triangle
//		for(int i=0;i<=n;i++) {
////			
//			for(int j=0;j<=i;j++) {
//			System.out.print("* ");
//			}
//		System.out.println();
//		}
		
		
		for(int i=1;i<=n;i++) {
////		
		for(int j=1;j<=i-1;j++) {
		System.out.print("  ");
		}
		for(int j=1;j<=n-i+1;j++) {
			System.out.print("* ");
			}
		 System.out.println();
		}
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i+1;j++) {
//				System.out.print("* ");
//				}
//////		
//		for(int j=1;j<=i-1;j++) {
//		System.out.print("  ");
//		}
//		
//		 System.out.println();
//		}
//	  
//	  

		
		
		

}
}