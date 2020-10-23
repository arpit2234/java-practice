package recursion;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(sum(6));
System.out.println(pow(3,6));
System.out.println(fastpow(3,6));
System.out.println(path(35,2));


	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}
	static int pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a*pow(a,b-1);
	}
	static int fastpow(int a,int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return pow(a*a,b/2);
		}
		return  a*pow(a,b-1);
	}
static int path(int n,int m) {
	if(n==1 || m==1) {
		return 1;	
	}
	return path(n,m-1)+path(n-1,m);
}

}
