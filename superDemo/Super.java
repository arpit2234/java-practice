package superDemo;

class A
{
	public A() {
		System.out.println("In A");
	}
	public A(int i) {
		System.out.println("In int A");
	}
	
}
class B extends A
{
	public B() {
		System.out.println("In B");
	}
	public B(int i) {
		super(i);
		System.out.println("In int B");
	}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		B b=new B();                  //output -In A   In B
//		B b=new B(5);                //output -   In A  In int B
		B b=new B(5);


		

	}

}
