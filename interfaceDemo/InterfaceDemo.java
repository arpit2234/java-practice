package interfaceDemo;

interface Abc{
	void write();
	
}
class implimentor implements Abc {
	public  void write() {
		System.out.println("Implementor");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj=new implimentor();
		obj.write();

	}

}
