package loops;
import java.util.Scanner;

public class PrimeNumbers {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number=");
		
		int a=sc.nextInt();
		boolean prime=true;
		
		for(int i=2;i*i<a;i++) {
			if(a%i==0) {
				prime=false;
				break;
				
				
			}
		}
//		System.out.println("Number is"+ prime);
		if(prime==true) {
			System.out.println("Number is Prime");
		}
		else {

			System.out.println("Number is not Prime");
		}
}
}
