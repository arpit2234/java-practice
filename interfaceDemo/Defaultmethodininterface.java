package interfaceDemo;

interface A{
	void abc();
	default void show() {
		System.out.println("Default method");
	}
}
class demoImp implements A{
	public void abc() {
		System.out.println("in abc");
	}
	
	
	public void show() {
		System.out.println("in DemoImp");
	}
}

public class Defaultmethodininterface {
	public static void main(String[] args) {
		
		A obj=new demoImp();
		obj.abc();
		obj.show();
		
		
		
	}

}
