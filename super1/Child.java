package super1;

public class Child extends Parent {
	Child(){
		System.out.println("Constructor of Child");
	}
	int abc;
	
	void getAbc(){
		System.out.println("ChiILD abc="+abc);
		System.out.println("ChiILD def="+def);
		System.out.println("ChiILD prot="+prot);
		
		
	}
	void print() {
		System.out.println(prot);
	}
 void getAdd() {
	 System.out.println("GetAdd of Child");
	}
 void getMul() {
//	 super.getMul();
	 System.out.println("GetMul of Child");
	}
	

}
