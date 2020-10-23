package super1;

public class Parent {
	Parent(){
		System.out.println("Constructor of Parent");
	}
	static int a;
	static  final int b=4;
	int def;
	private int priv;
	protected int prot;
	
	void getMul() {
		System.out.println("GetMul of Parent");
	}
	
	private void getAdd() {
		System.out.println("getadd of Parent");
	}
	protected void getsub() {
		System.out.println("Get of Parent");
	}
	
}
