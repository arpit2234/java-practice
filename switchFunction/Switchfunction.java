package switchFunction;
import java.util.Scanner;
public class Switchfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
		System.out.println("Enter Your First Number=");
		int a =num.nextInt();
		
//		System.out.println("Yoour Number is ="+a);
		System.out.println("Enter Your Second Number=");
		int b =num.nextInt();
		System.out.println("Enter Your Operation=");
		num.nextLine();
		char operation=num.nextLine().charAt(0);
		int result=0;
		
		switch(operation) {
		case '+':
			result =a+b;
			break;
		case '-':
			result =a-b;
			break;
		case '*':
			result =a*b;
			break;
		case '/':
			result =a/b;
			break;
		default:
			System.out.println("Enter  Value Are Invalid");
		}
		System.out.println("Answer For Your Operation "+ result);

				
				
				
	}

}
