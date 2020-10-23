package array;
import java.util.Scanner;
public class Array {
 public static void main(String[] agrs) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Entter number of rows and columns");
	 int rows=sc.nextInt();
	 int cols=sc.nextInt();
	 
	 int a[][]=new int[rows][cols];
	 int b[][]=new int[rows][cols];
	 int c[][]=new int[rows][cols];
	 System.out.println("Entter Array A");

	 for(int i=0;i<rows;i++) {
		 for(int j=0;j<cols;j++) {
			 a[i][j] = sc.nextInt();		 
			 }
		  }
	 System.out.println("Entter Array B");

	 
	 for(int i=0;i<rows;i++) {
		 for(int j=0;j<cols;j++) {
			 b[i][j] = sc.nextInt();		 
			 }
		  }
	 System.out.println("Resule Array c");


	 for(int i=0;i<rows;i++) {
		 for(int j=0;j<cols;j++) {
			 c[i][j] =a[i][j]+b[i][j];
			 System.out.print(c[i][j]+" ");
			 }
		 System.out.println();
		  }
	 
	 
	 

}
}
