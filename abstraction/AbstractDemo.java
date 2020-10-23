package abstraction;



 abstract class Human{
	public abstract void eat() ;
	public void walk() {
		
	}
	}
 class men extends Human {
	 public void eat() {
		 System.out.println("in human class");
		 
	 }
 }
 
 
 
 
public class AbstractDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human obj=new men();
		obj.eat();
		
     
	}

}
