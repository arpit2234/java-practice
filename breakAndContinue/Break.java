package breakAndContinue;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=100;i++) {
//			if(i>=40 && i<=50) {
//				continue;
//			}
//			
//			System.out.println(i);
//			
//				}
//		for(int j=1;j<=5;j++) {
//		for(int i=0;i<=10;i++) {
//			System.out.print(i+" " );
//		}
//		System.out.println();
//		}
		int result =1;
		for(int j=1;j<=10;j++) {
		for(int i=1;i<=20;i++) {
			result=i*j;
			System.out.print("  "+result+"  ");
			}
		System.out.println();
		}
		
	}

}
