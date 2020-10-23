package anonymousClass;

class A{
	public void show() {
		System.out.println("Showed");
	}
	
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		A obj=new A() {
			public void show () {
				System.out.println("Showed by Anonymous class");
			}
		};
		obj.show();
		
	}

}
