package loops;
import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter Your Number =");
		int a=num.nextInt();
		int result=1;
		
//		for(int i=1;i<=a;i++) {
//			result=result+i;
//		}
//		
//		System.out.println("Enter Answer =" + result);
		for(int i=1;i<=a;i++) {
			result=result*i;
		}
//		
		System.out.println("Enter Answer =" + result);
		
		
		
		}

}
